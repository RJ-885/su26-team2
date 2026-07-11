# HomeFix Now Backend API

Base URL:

Local: http://localhost:8080
Production: https://su26-team2-3.onrender.com 

## Overview

The HomeFix Now Backend API is a Spring Boot application that provides RESTful services for the HomeFix Now platform. The API allows customers to browse services, book providers, leave reviews, and manage their profiles. Providers can create and manage services, respond to customer reviews, and view customer activity. The application is deployed using Docker and Render.

---

# UML Class Diagram

This is located in the docs folder.

# API Endpoints

## Provider Endpoints

### Create a provider

**POST** `/api/providers`

Creates a new provider profile.

### Get all providers

**GET** `/api/providers`

Returns a list of all registered providers.

### Get a provider by ID

**GET** `/api/providers/{providerId}`

Returns the provider associated with the specified ID.

### Update a provider

**PUT** `/api/providers/{providerId}`

Updates an existing provider profile.

### Delete a provider

**DELETE** `/api/providers/{providerId}`

Deletes the provider associated with a specific ID.

---

## Booking Endpoints

### Create a booking

**POST** `/api/bookings`

Creates a new booking between a customer and a provider.

### Get a booking by ID

**GET** `/api/bookings/{id}`

Returns the booking associated with a specific ID.

### Get bookings by customer

**GET** `/api/bookings/customer/{customerId}`

Returns all bookings for a specific customer.

---

## Review Endpoints

### Get all reviews

**GET** `/reviews`

Returns all reviews in the system.

### Get reviews for a service

**GET** `/reviews/service/{serviceId}`

Returns all reviews associated with the specific service.

### Get reviews for a provider

**GET** `/reviews/provider/{providerId}`

Returns all reviews associated with the specific provider.

### Create a review

**POST** `/reviews/service/{serviceId}`

Creates a new review for the specific service.

### Delete a review

**DELETE** `/reviews/{reviewId}`

Deletes the specific review.

---

## Reply Endpoints

### Create a reply

**POST** `/replies/review/{reviewId}`

Creates a reply to a specific review.

### Get a reply by ID

**GET** `/replies/{replyId}`

Returns the reply associated with the specified ID.

### Update a reply

**PUT** `/replies/{replyId}`

Updates an existing reply.

### Delete a reply

**DELETE** `/replies/{replyId}`

Deletes s specific reply.


## Providers

| Method | Endpoint          | Description                 |
| ------ | ----------------- | --------------------------- |
| GET    | `/providers`      | Retrieve all providers      |
| GET    | `/providers/{id}` | Retrieve a provider by ID   |
| POST   | `/providers`      | Create a new provider       |
| PUT    | `/providers/{id}` | Update an existing provider |
| DELETE | `/providers/{id}` | Delete a provider           |

---

## Customers

| Method | Endpoint          | Description               |
| ------ | ----------------- | ------------------------- |
| GET    | `/customers`      | Retrieve all customers    |
| GET    | `/customers/{id}` | Retrieve a customer by ID |
| POST   | `/customers`      | Create a customer profile |
| PUT    | `/customers/{id}` | Update a customer profile |
| DELETE | `/customers/{id}` | Delete a customer         |

---

## Services

| Method | Endpoint         | Description                     |
| ------ | ---------------- | ------------------------------- |
| GET    | `/services`      | Retrieve all available services |
| GET    | `/services/{id}` | Retrieve a service by ID        |
| POST   | `/services`      | Create a new service            |
| PUT    | `/services/{id}` | Update a service                |
| DELETE | `/services/{id}` | Delete a service                |

---

## Bookings

| Method | Endpoint         | Description              |
| ------ | ---------------- | ------------------------ |
| GET    | `/bookings`      | Retrieve all bookings    |
| GET    | `/bookings/{id}` | Retrieve a booking by ID |
| POST   | `/bookings`      | Create a booking         |
| PUT    | `/bookings/{id}` | Update a booking         |
| DELETE | `/bookings/{id}` | Delete a booking         |

---

## Reviews

| Method | Endpoint        | Description             |
| ------ | --------------- | ----------------------- |
| GET    | `/reviews`      | Retrieve all reviews    |
| GET    | `/reviews/{id}` | Retrieve a review by ID |
| POST   | `/reviews`      | Create a review         |
| PUT    | `/reviews/{id}` | Update a review         |
| DELETE | `/reviews/{id}` | Delete a review         |

---

## Replies

| Method | Endpoint        | Description                |
| ------ | --------------- | -------------------------- |
| GET    | `/replies`      | Retrieve all replies       |
| GET    | `/replies/{id}` | Retrieve a reply by ID     |
| POST   | `/replies`      | Reply to a customer review |
| PUT    | `/replies/{id}` | Update a reply             |
| DELETE | `/replies/{id}` | Delete a reply             |

---

# Use Case Mapping

## Customer

* Create a customer account.
* Update customer profile information.
* Browse available services.
* Book a provider.
* Submit reviews for completed services.

### Endpoints Used

* POST `/customers`
* PUT `/customers/{id}`
* GET `/services`
* POST `/bookings`
* POST `/reviews`

---

## Provider

* Create a provider profile.
* Update provider information.
* Create new services.
* Manage existing services.
* Respond to customer reviews.

### Endpoints Used

* POST `/providers`
* PUT `/providers/{id}`
* POST `/services`
* PUT `/services/{id}`
* POST `/replies`

```

