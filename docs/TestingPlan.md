# Project Name: HomeFix Now
**Version:** 1.0  
**Date:** 2026-07-23  

## Purpose
Test plan for the HomeFix Now application.

---

# Actors

**Provider (P):** Home service professional (plumber, electrician, handyman, etc.)

**Customer (C):** User seeking home repair and maintenance services.
---

# Use Cases

## 1. Provider: US-6 — Register Provider Account, 
Provider P1 navigates to the Provider Sign Up page.

P1 enters personal and business information.

P1 creates a provider account.

P1 logs into the application.

P1 views and updates their provider profile with contact information, business details, availability, and biography.

P1 logs out.

---

## 2. Provider: US-5 — Add and Manage Tags

Provider P1 logs into the application.

P1 creates a profile

P1 creates a new tag S1 by entering the clicking the options provided.

P1 saves the tag.

The service S1 appears on the provider profile.

P1 logs out.

---

## 3. Customer: US — Browse Providers

Customer C1 opens the Browse Providers page.

C1 views the list of available providers.

C1 selects Provider P1.

C1 views Provider P1's profile, services, pricing, and availability.

---

## 4. Customer: US — Book a Service

Customer C1 browses available providers.

C1 selects Provider P1.

C1 chooses service S1.

C1 enters the booking location and preferred date.

C1 submits the booking request.

The booking request is stored in the database.

---

## 5. Provider: US-8 — View Booking History

Provider P1 logs into the application.

P1 navigates to the Service History page.

P1 views completed service requests, customer information, completed job statistics, and earnings.

P1 logs out.

---

# CROSS-CUTTING TEST SCENARIOS (Non-Functional Requirements)

## Performance Requirements

### Scenario P1: Browse Providers page response time < 2 seconds

**Setup:** Server under typical load.

**Steps:**

Measure response time for loading the Browse Providers page.

Repeat 10 times.

**Expected Outcome:**

95% of requests complete in **2 seconds or less**.

---

### Scenario P2: Provider Profile page response time < 1.5 seconds

**Setup:** Server under typical load.

**Steps:**

Measure response time for opening a provider profile containing multiple services.

Repeat 10 times.

**Expected Outcome:**

95% of requests complete in **1.5 seconds or less**.

---

# Security & Privacy Requirements

## Scenario S1: Unauthorized user cannot access provider pages

**Setup:** User is not logged in.

**Steps:**

Attempt to navigate directly to:

- `/provider/profile`
- `/provider/history`

**Expected Outcome:**

Access is denied.

User is redirected to the login page.

No provider information is displayed.

---

## Scenario S2: Customer cannot access provider management pages

**Setup:** Customer is logged in.

**Steps:**

Customer attempts to access provider-only pages such as:

- Provider Profile
- Add Service
- Provider History

**Expected Outcome:**

Access is denied.

Customer is redirected to an authorized page or login page.

Provider data cannot be modified.

---

# Usability Requirements

## Scenario U1: New provider creates an account and adds a service within 5 minutes

**Setup:** New provider uses the application for the first time.

**Steps:**

Provider registers a new account.

Provider logs in.

Provider completes their profile.

Provider adds a service.

**Expected Outcome:**

The entire process is completed in **5 minutes or less**.

---

## Scenario U2: Customer browses providers and books a service within 5 minutes

**Setup:** Customer uses the application for the first time.

**Steps:**

Customer opens the Browse Providers page.

Customer views a provider profile.

Customer selects a service.

Customer submits a booking request.

**Expected Outcome:**

The customer successfully books a service in **5 minutes or less**.