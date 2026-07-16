package com.csc340.homefix_now.ui_controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.ui.Model;
import org.springframework.web.multipart.MultipartFile;

import com.csc340.homefix_now.service.BookingService;
import com.csc340.homefix_now.service.CustomerService;
import com.csc340.homefix_now.service.ProviderService;
import com.csc340.homefix_now.service.ReplyService;
import com.csc340.homefix_now.service.ReviewService;
import com.csc340.homefix_now.service.ServiceService;
import com.csc340.homefix_now.service.TimeslotService;

import com.csc340.homefix_now.entity.Provider;
import com.csc340.homefix_now.entity.Customer;

@Controller
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
    public String sign_up() {
        return "Customer/sign_up";
    }

    @GetMapping("/customer_login")
    public String customer_login() {
        return "Customer/customer_login";
    }

    @GetMapping("/customer_profile/{customerId}")
    public String customer_profile(@PathVariable Long customerId, Model model) {
        Customer customer = customerService.getCustomerById(customerId);
        model.addAttribute("customer", customer);

        return "Customer/customer_profile";
    }

    @GetMapping("/providers/{providerId}")
    public String getProviderById(@PathVariable Long providerId, Model model) {
        Provider provider = providerService.getProvider(providerId);
        model.addAttribute("provider", provider);

        return "provider/provider_profile";
    }

    @GetMapping("/providers")
    public String getAllProviders(Model model) {
        model.addAttribute("providersList", providerService.getAllProviders());
        model.addAttribute("pageTitle", "All Providers");

        return "Customer/browse";
    }

    @GetMapping("customer_profile/delete/{customerId}")
    public String deleteCustomer(@PathVariable Long customerId) {
        customerService.deleteCustomer(customerId);

        return"redirect:/providers";
    }
}
