<!DOCTYPE html>
<html lang="en">

<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Provider Sign Up</title>

    <link rel="stylesheet" href="/style.css">
</head>

<body>

<nav>
    <ul class="main-nav">
        <li><a href="/provider/profile">Profile</a></li>
        <li><a href="/provider/provider_login">Login</a></li>
        <li><a href="/provider/sign_up">Sign Up</a></li>
    </ul>

    <header>
        <a href="/customer/browse">HomeFix Now</a>
    </header>
</nav>

<div class="provider-form">

    <h2>Create Provider Account</h2>

    <form action="/provider/sign_up" method="post">

        <label for="firstName">First Name</label>
        <input
                type="text"
                id="firstName"
                name="firstName"
                required>

        <label for="lastName">Last Name</label>
        <input
                type="text"
                id="lastName"
                name="lastName"
                required>

        <label for="businessName">Business Name</label>
        <input
                type="text"
                id="businessName"
                name="businessName"
                required>

        <label for="email">Email Address</label>
        <input
                type="email"
                id="email"
                name="email"
                required>

        <label for="phone">Phone Number</label>
        <input
                type="tel"
                id="phone"
                name="phone"
                required>

        <label for="specialty">Service Category</label>
        <select
                id="specialty"
                name="specialty"
                required>

            <option value="">Select a service</option>
            <option value="Electrical">Electrical</option>
            <option value="Plumbing">Plumbing</option>
            <option value="Roofing">Roofing</option>
            <option value="Masonry">Masonry</option>
        </select>

        <label for="yearsExperience">Years of Experience</label>
        <input
                type="number"
                id="yearsExperience"
                name="yearsExperience"
                min="0"
                required>

        <label for="hourlyRate">Hourly Rate ($/hr)</label>
        <input
                type="number"
                id="hourlyRate"
                name="hourlyRate"
                min="0"
                step="0.01"
                required>

        <label for="location">Service Area</label>
        <input
                type="text"
                id="location"
                name="location"
                placeholder="Greensboro, NC"
                required>

        <label for="bio">About Me</label>
        <textarea
                id="bio"
                name="bio"
                placeholder="Tell customers about yourself and your services..."></textarea>

        <label for="availability">Availability</label>
        <input
                type="text"
                id="availability"
                name="availability"
                placeholder="Mon-Fri 9AM-5PM">

        <label>
            <input
                    type="checkbox"
                    name="freeEstimates"
                    value="true">
            Free Estimates
        </label>

        <label>
            <input
                    type="checkbox"
                    name="insured"
                    value="true">
            Insured
        </label>

        <label for="password">Password</label>
        <input
                type="password"
                id="password"
                name="password"
                required>

        <label for="confirmPassword">Confirm Password</label>
        <input
                type="password"
                id="confirmPassword"
                name="confirmPassword"
                required>

        <button type="submit">
            Create Provider Account
        </button>

    </form>

</div>

</body>
</html>