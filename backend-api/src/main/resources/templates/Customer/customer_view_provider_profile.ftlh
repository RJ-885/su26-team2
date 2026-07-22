<!DOCTYPE html>
<html lang="en">

<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Customer View Provider Proflie</title>
    <link rel="stylesheet" href="/style.css">
</head>

<body>

   <nav>
        <ul class="main-nav">
            <a href="/customer_profile">Profile</a>
            <a href="/customer_login">Login</a>
            <a href="/sign_up">Sign Up</a>
        </ul>

        <header>
            <a href="/providers">HomeFix Now</a>
        </header>
    </nav>

    <h2><button class="hire-button">Hire This Provider</button></h2>

    <div class="profile-banner">

        <div class="banner-text">
            <h1>${provider.firstName}'s Profile</h1>
        </div>

        <div class="profile-card">

            <h2>Personal Information</h2>

            <div class="info-grid">

                <div class="info-item">
                    <strong>First Name</strong>
                    <p>${provider.firstName}</p>
                </div>

                <div class="info-item">
                    <strong>Last Name</strong>
                    <p>${provider.lastName}</p>
                </div>

                <div class="info-item">
                    <strong>Email</strong>
                    <p>${provider.email}</p>
                </div>

                <div class="info-item">
                    <strong>Phone Number</strong>
                    <p>${provider.phone}</p>
                </div>

            </div>



        </div>

        <div class="profile-card">

            <h2>Professional Information</h2>

            <div class="info-grid">

                <div class="info-item">
                    <strong>Service Category</strong>

                    <span class="service-tag">
                        ${provider.specialty}
                    </span>
                </div>

                <div class="info-item">
                    <strong>Location</strong>

                    <p>${provider.location}</p>
                </div>

                <div class="info-item info-full">
                    <strong>About Me</strong>

                    <p>
                        ${provider.bio}
                    </p>
                </div>

            </div>



        </div>

        <div class="profile-card">

            <h2>Pricing & Services</h2>

            <div class="info-grid">

                <div class="info-item">
                    <strong>Starting Rate</strong>
                    <p>$85 / Hour</p>
                </div>

                <div class="info-item">
                    <strong>Free Estimates</strong>
                    <p>Yes</p>
                </div>

                <div class="info-item">
                    <strong>Insured</strong>
                    <p>Yes</p>
                </div>

                <div class="info-item info-full">

                    <strong>Services Offered</strong>

                    <ul class="services-list">
                        
                    </ul>

                </div>

            </div>

        </div>



    </div>

    <div class="profile-card">

        <h2>Availability</h2>

        <div class="info-grid">

            <div class="info-item">
                <strong>Monday - Friday</strong>
                <p>9:00 AM - 5:00 PM</p>
            </div>

            <div class="info-item">
                <strong>Saturday</strong>
                <p>9:00 AM - 2:00 PM</p>
            </div>

            <div class="info-item">
                <strong>Sunday</strong>
                <p>Closed</p>
            </div>

            <div class="info-item">
                <strong>Emergency Service</strong>
                <p>Available 24/7</p>
            </div>

        </div>

    </div>
</body>

<footer>

</footer>

</html>