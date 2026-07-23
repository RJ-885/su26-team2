package com.csc340.homefix_now.ui_controller;

import com.csc340.homefix_now.entity.HomeService;
import com.csc340.homefix_now.entity.Provider;
import com.csc340.homefix_now.service.BookingService;
import com.csc340.homefix_now.service.ProviderService;
import com.csc340.homefix_now.service.ServiceService;

import jakarta.servlet.http.HttpSession;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@Controller
@RequestMapping("/provider")
public class ProviderUiController {

    private final ProviderService providerService;
    private final BookingService bookingService;
    private final ServiceService serviceService;

    public ProviderUiController(ProviderService providerService,
            BookingService bookingService,
            ServiceService serviceService) {

        this.providerService = providerService;
        this.bookingService = bookingService;
        this.serviceService = serviceService;
    }

    /**
     * Provider Sign Up Page
     */
    @GetMapping("/sign_up")
    public String createProviderForm(Model model) {
        model.addAttribute("provider", new Provider());
        return "provider/provider_sign_up";
    }

    /**
     * Create Provider
     */
    @PostMapping("/sign_up")
    public String createProvider(@ModelAttribute Provider provider,
            HttpSession session) {

        Provider createdProvider = providerService.createProvider(provider);

        session.setAttribute("providerId",
                createdProvider.getProviderId());

        return "redirect:/provider/profile";
    }

    /**
     * Login Page
     */
    @GetMapping("/provider_login")
    public String loginPage() {
        return "provider/provider_login";
    }

    /**
     * Login
     */
    @PostMapping("/provider_login")
    public String login(@RequestParam String email,
            @RequestParam String password,
            HttpSession session,
            Model model) {

        Provider provider = providerService.findByEmail(email);

        if (provider == null ||
                !provider.getPassword().equals(password)) {

            model.addAttribute("error",
                    "Invalid email or password.");

            return "provider/provider_login";
        }

        session.setAttribute("providerId",
                provider.getProviderId());

        return "redirect:/provider/profile";
    }

    /**
     * Provider Profile
     */
    @GetMapping("/profile")
    public String providerProfile(HttpSession session,
            Model model) {

        Long providerId = (Long) session.getAttribute("providerId");

        if (providerId == null) {
            return "redirect:/provider/provider_login";
        }

        Provider provider = providerService.getProvider(providerId);

        model.addAttribute("provider", provider);
        model.addAttribute("services", provider.getServices());

        return "provider/provider_profile";
    }

    /**
     * Booking History
     */
    @GetMapping("/history")
    public String providerHistory(HttpSession session,
            Model model) {

        Long providerId = (Long) session.getAttribute("providerId");

        if (providerId == null) {
            return "redirect:/provider/provider_login";
        }

        model.addAttribute("bookings",
                bookingService.getBookingsByProviderId(providerId));

        return "provider/provider_client_history";
    }

    /**
     * Add Service Page
     */
    @GetMapping("/add_service")
    public String addServicePage(HttpSession session) {

        if (session.getAttribute("providerId") == null) {
            return "redirect:/provider/provider_login";
        }

        return "provider/provider_add_service";
    }

    /**
     * Save Service
     */
    @PostMapping("/add_service")
    public String addService(@ModelAttribute HomeService service,
            HttpSession session) {

        Long providerId = (Long) session.getAttribute("providerId");

        if (providerId == null) {
            return "redirect:/provider/provider_login";
        }

        serviceService.createService(providerId, service);

        return "redirect:/provider/profile";
    }

    /**
     * Logout
     */
    @GetMapping("/logout")
    public String logout(HttpSession session) {

        session.invalidate();

        return "redirect:/provider/provider_login";
    }
}