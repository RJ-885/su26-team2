<!DOCTYPE html>
<html lang="en">

<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Provider Sign Up</title>
    <link rel="stylesheet" href="../style.css">
</head>

<body>

    <nav>
        <ul class="main-nav">
            <a href="provider_profile.html">Profile</a>
            <a href="provider_login.html">Login</a>
            <a href="provider_sign_up.html">Sign Up</a>
        </ul>

        <header>
            <a href="../browse.html">HomeFix Now</a>
        </header>
    </nav>

    <div class="provider-form">

        <h2>Create Provider Account</h2>

        <form action="submit-provider.php" method="POST">

            <label for="firstName">First Name</label>
            <input type="text" id="firstName" name="firstName" required>

            <label for="lastName">Last Name</label>
            <input type="text" id="lastName" name="lastName" required>

            <label for="businessName">Business Name</label>
            <input type="text" id="businessName" name="businessName" required>

            <label for="email">Email Address</label>
            <input type="email" id="email" name="email" required>

            <label for="phone">Phone Number</label>
            <input type="tel" id="phone" name="phone" required>

            <label for="service">Service Category</label>
            <select id="service" name="service" required>
                <option value="">Select a service</option>
                <option value="electrical">Electrical</option>
                <option value="plumbing">Plumbing</option>
                <option value="roofing">Roofing</option>
                <option value="masonry">Masonry</option>
            </select>

            <label for="experience">Years of Experience</label>
            <input type="number" id="experience" name="experience" min="0" required>

            <label for="StartingRate">Starting Rate ($/hr)</label>
            <input type="number" id="StartingRate" name="StartingRate" min="0" step="0.01" required>

            <label for="location">Service Area</label>
            <input type="text" id="location" name="location" placeholder="Greensboro, NC" required>

            <label for="bio">About Me</label>
            <textarea id="bio" name="bio" placeholder="Tell customers about yourself and your services..."></textarea>

            <label for="password">Password</label>
            <input type="password" id="password" name="password" required>

            <label for="confirmPassword">Confirm Password</label>
            <input type="password" id="confirmPassword" name="confirmPassword" required>

            <button type="submit">Create Provider Account</button>
        </form>
    </div>
</body>