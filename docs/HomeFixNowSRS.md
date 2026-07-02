
# Requirements – Starter Template

**Project Name:** HomeFix Now \
**Team:** Ryan Johnson (Customer) \ Jacob Strider (Provider)
**Course:** CSC 340\
**Version:** 1.0\
**Date:** 2026-07-01

---

## 1. Overview
**Vision.** HomeFix Now is a web application that connects homeowners with trusted home service professionals. It helps customers quickly find qualified providers while giving contractors a platform to advertise their services and manage their work.

**Glossary** Terms used in the project
- **Term 1:** description.
- **Term 2:** description

**Primary Users / Roles.**
- **Customer (Homeowner)** — Find reliable contractors for home improvement projects.
- **Provider (Contractor/Tradesman)** — Create a professional profile to advertise services and communicate with clients.
- **SysAdmin (optional)** — 1 line goal statement.

**Scope (this semester).**
- Allowing Tradesmen to have profiles that offer services.
- Allow Users to view available Tradesmen for hire.
- Organization and communication between Providers and Customers.

**Out of scope (deferred).**
- <deferred 1> Online payment processing
- <deferred 2> GPS Tracking

> This document is **requirements‑level** and solution‑neutral; design decisions (UI layouts, API endpoints, schemas) are documented separately.

---

## 2. Functional Requirements (User Stories)
Write each story as: **As a `<role>`, I want `<capability>`, so that `<benefit>`.** Each story includes at least one **Given/When/Then** scenario.

### 2.1 Customer Stories
- **US‑1 — <short Profiles>**  
  _Story:_ As a customer, I want to have a profile so that I can easily communicate with my hires.  
  _Acceptance:_
  ```gherkin
  Scenario: <happy path>
    Given <I want to hire a contractor.>
    When  <I do not have a HomeFix Now Profile and meet all creation requirements.>
    Then  <I should be able to make an account.>
  ```

- **US‑2 — <short Filter>**  
  _Story:_ As a customer, I want to find the perfect hire so that my projects are handled by experts.  
  _Acceptance:_
  ```gherkin
  Scenario: <happy path>
    Given <I need to find a specific specilty type.>
    When  <Utilizing the Browse menu.>
    Then  <I can filter different labels in my search.>
  ```

### 2.2 Provider Stories
- **US-5 — <Tag>**  
  _Story:_ As a provider, I want to be able to label my profession. 
  _Acceptance:_
  ```gherkin
 Scenario: Successfully selecting a profession
  Given: I am creating or editing my provider profile
  When: I select a profession and save my profile
  Then: my selected profession should be displayed on my provider profile and visible to customers.
  ```

- **US-6 — <Provider Profile>**  
  _Story:_ As a provider, I want to be able to create a profile. 
  _Acceptance:_
  ```gherkin
 Scenario: Successfully creating a provider profile
  Given: I have created a provider account and am logged in
  When: I enter my profile information, including my name, profession, location, services, and pricing, and save my profile
  Then: my provider profile should be created and displayed for customers to view.
  ```

  - **US-7 — <Feedback>**  
  _Story:_ As a provider, I want to be able to view feedback. 
  _Acceptance:_
  ```gherkin
 Scenario: Viewing customer feedback
  Given: I am logged into my provider account
  When: I navigate to the Feedback section of my profile
  Then: I should be able to view customer ratings and comments for my completed services.
  ```

  - **US-8 — <History>**  
  _Story:_ As a provider, I want to be able to access history 
  _Acceptance:_
  ```gherkin
Scenario: Viewing work history
  Given: I am logged into my provider account
  When: I navigate to the History page
  Then: I should be able to view a list of completed jobs, including the customer name, location, services provided, and price charged.
  ```

### 2.3 SysAdmin Stories
- **US‑30 — <short title>**  
  _Story:_ As a sysadmin, I want … so that …  
  _Acceptance:_
  ```gherkin
  Scenario: <happy path>
    Given <preconditions>
    When  <action>
    Then  <observable outcome>
  ```

- **US‑31 — <short title>**  
  _Story:_ As a sysadmin, I want … so that …  
  _Acceptance:_
  ```gherkin
  Scenario: <happy path>
    Given <preconditions>
    When  <action>
    Then  <observable outcome>
  ```

---

## 3. Non‑Functional Requirements (make them measurable)
- **Performance:** - results should load within 2 seconds under normal conditions.
- **Availability/Reliability:** - the application should be available at least 99% of the time during the semester demonstration.
- **Security/Privacy:** - passwords should never be displayed in plain text. Only authenticated users may access and manage their own profile pages.
- **Usability:** - users should be able to complete their profile registration within 5 minutes. Navagation should be consistent throughout all pages. 

---

## 4. Assumptions, Constraints, and Policies
- Users have access to the internet.
- Users must provide valid account information.
---

## 5. Milestones (course‑aligned)
- **M1 Requirements** — this file + stories opened as issues. 
- **M2 High‑fidelity prototype** — core customer/provider flows fully interactive. 
- **M3 Design** — architecture, schema, API outline. 
- **M4 Backend API** — key endpoints + tests. 
- **M5 Increment** — ≥2 use cases end‑to‑end. 
- **M6 Final** — complete system & documentation. 

---

## 6. Change Management
- Stories are living artifacts; changes are tracked via repository issues and linked pull requests.  
- Major changes should update this SRS.