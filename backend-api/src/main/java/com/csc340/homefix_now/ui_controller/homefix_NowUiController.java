package com.csc340.homefix_now.ui_controller;

import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.ui.Model;
import org.springframework.web.multipart.MultipartFile;

import com.csc340.homefix_now.service.BookingService;
import com.csc340.homefix_now.service.CustomerService;
import com.csc340.homefix_now.service.ProviderService;
import com.csc340.homefix_now.service.ReplyService;
import com.csc340.homefix_now.service.ReviewService;
import com.csc340.homefix_now.service.ServiceService;
import com.csc340.homefix_now.service.TimeslotService;

import jakarta.servlet.http.HttpSession;

import com.csc340.homefix_now.entity.Provider;
import com.csc340.homefix_now.entity.Customer;
import com.csc340.homefix_now.entity.Booking;
import com.csc340.homefix_now.entity.Review;
import com.csc340.homefix_now.entity.Timeslot;
import com.csc340.homefix_now.entity.HomeService;

@Controller
@RequestMapping("/customer")
public class homefix_NowUiController {

    private final BookingService bookingService;
    private final CustomerService customerService;
    private final ProviderService providerService;
    private final ReplyService replyService;
    private final ReviewService reviewService;
    private final ServiceService serviceService;
    private final TimeslotService timeslotService;

    public homefix_NowUiController(BookingService bookingService, CustomerService customerService,
            ProviderService providerService, ReplyService replyService,
            ReviewService reviewService, ServiceService serviceService, TimeslotService timeslotService) {
        this.bookingService = bookingService;
        this.customerService = customerService;
        this.providerService = providerService;
        this.replyService = replyService;
        this.reviewService = reviewService;
        this.serviceService = serviceService;
        this.timeslotService = timeslotService;
    }


    @GetMapping("/sign_up")
    public String createCustomerForm(Model model) {
        model.addAttribute("customer", new Customer());
        return "sign_up";
    }

    @PostMapping("/sign_up")
    public String createCustomer(Customer customer, HttpSession session) {
        customer.setAccountStatus("active");
        Customer createdCustomer = customerService.createCustomer(customer);
        session.setAttribute("customerId", createdCustomer.getCustomerId());
        return "redirect:/customer/profile";
    }

    @GetMapping("/customer_login")
    public String customer_login() {
        return "Customer/customer_login";
    }

    @PostMapping("/customer_login")
    public String login(HttpSession session, String email, String password) {
        Customer customer = customerService.findByEmail(email);
        if (customer != null && password.equals(customer.getPassword())) {
            session.setAttribute("customerId", customer.getCustomerId());
            return "redirect:/customer/browse";
        }
        return "redirect:/customer/customer_login";
    }

    @GetMapping("/logout")
    public String logout(HttpSession session) {
        session.invalidate();
        return "redirect:/customer/customer_login";
    }

    @GetMapping("/profile")
    public String customer_profile(HttpSession session, Model model) {
        Long customerId = (Long) session.getAttribute("customerId");
        if (customerId ==  null) {
            return "redirect:/customer/customer_login";
        }

        customerService.getCustomerById(customerId).ifPresent(customer -> model.addAttribute("customer", customer));
        return "Customer/customer_profile";
    }

    @GetMapping("/profile/edit")
    public String editCustomerProfileForm(HttpSession session, Model model) {
        Long customerId = (Long) session.getAttribute("customerId");
        if (customerId == null) {
            return "redirect:/customer/customer_login";
        }

        model.addAttribute("section", "personal");
        customerService.getCustomerById(customerId).ifPresent(customer -> model.addAttribute("customer", customer));
        return "Customer/edit-details";
    }

    @PostMapping("/profile/edit")
    public String editCustomerProfile(@ModelAttribute Customer customer, HttpSession session) {
        Long customerId = (Long) session.getAttribute("customerId");
        if (customerId == null) {
            return "redirect:/customer_login";
        }

        customerService.updateCustomer(customerId, customer);
        return "redirect:/customer/customer_profile";
    }

    @GetMapping("/providers/{providerId}")
    public String getProviderById(@PathVariable Long providerId, Model model) {
        model.addAttribute("provider", providerService.getProvider(providerId));
        model.addAttribute("services", serviceService.getServicesByProvider(providerId));

        return "Customer/customer_view_provider_profile";
    }

    @GetMapping("/browse")
    public String getAllProviders(Model model) {
        model.addAttribute("providersList", providerService.getAllProviders());
        model.addAttribute("pageTitle", "All Providers");

        return "Customer/browse";
    }

    @GetMapping("/delete")
    public String deleteCustomer(HttpSession session) {
        Long customerId = (Long) session.getAttribute("customerId");
        if (customerId == null) {
            return "redirect:/customer/customer_login";
        }

        customerService.deleteCustomer(customerId);
        session.invalidate();
        return "redirect:/";
    }

    @PostMapping("/edit")
    public String updatePost(@PathVariable Long customerId, Customer updatedCustomer, MultipartFile thumbnailFile) {
        customerService.updateCustomer(customerId, updatedCustomer);

        return "redirect:/customer_profile/" + customerId;
    }

    @GetMapping("providers/search/{specialty}")
    public String searchProviders(@PathVariable String specialty, Model model) {
        model.addAttribute("providersList", providerService.getProviderBySpecialty(specialty));
        model.addAttribute("pageTitle", "Search Results for: " + specialty);

        return "Customer/browse";
    }

    @GetMapping("/providers/{providerId}/book")
    public String makeBookingPage(@PathVariable Long providerId, Model model, HttpSession booking) {
        Long customerId = (Long) booking.getAttribute("customerId");
        if (customerId == null) {
            return "redirect: /customer_login";
        }

        Provider provider = providerService.getProvider(providerId);
        if (provider == null) {
            return "redirect:/providers";
        }

        List<Timeslot> timeslots = timeslotService.getAvailableTimeslotsByProviderId(providerId);
        model.addAttribute("provider", provider);
        model.addAttribute("timeslots", timeslots);
        model.addAttribute("services", serviceService.getServicesByProvider(providerId));
        return "Customer/make-booking";
    }

    @PostMapping("/bookings/book")
    public String makeBooking(@RequestParam Long providerId, @RequestParam Long serviceId,
        @RequestParam Long timesotId, @RequestParam String notes, HttpSession session) {
            Long customerId = (Long) session.getAttribute("customerId");
            if (customerId == null) {
                return "redirect:/customer/customer_login";
            }

            Optional<Customer> customer = customerService.getCustomerById(customerId);
            Provider provider = providerService.getProvider(providerId);
            Timeslot timeslot = timeslotService.getTimeslotById(customerId);
            if (customer.isEmpty() || provider == null || timeslot == null || !Boolean.TRUE.equals(timeslot.getIsAvailable())) {
                return "redirect:/customer/providers/" + providerId + "/book";
            }

            HomeService selectedService = serviceService.getService(serviceId);
            if (selectedService == null || !providerId.equals(selectedService.getProvider().getProviderId())) {
                return "redirect:/customer/providers/" + providerId + "/book";
            }

            Booking newBooking = new Booking();
            newBooking.setCustomer(customer.get());
            newBooking.setHomeService(selectedService);
            newBooking.setTimeslot(timeslot);
            newBooking.setStatus("Scheduled");
            newBooking.setLocation("To Be Determined");
            newBooking.setNotes(notes);
            bookingService.createBooking(newBooking);
            timeslotService.assignTimeslotToSession(timesotId);

            return "redirect:/customer/bookings";
        }

        @GetMapping("/bookings") 
        public String bookingManagement(HttpSession session, Model model) {
            Long customerId = (Long) session.getAttribute("customerId");
            if (customerId == null) {
                return "redirect:/customer/customer_login";
            }

            model.addAttribute("bookings", bookingService.getBookingsByCustomerId(customerId));

            return "Customer/my-bookings";
        }

        @PostMapping("/bookings/{bookingId}/cancel")
        public String cancelBooking(@PathVariable Long bookingId) {
            bookingService.cancelBooking(bookingId);
            return "redirect:/customer/bookings";
        }
    
}
