<!DOCTYPE html>
<html lang="en">

<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Provider Profile</title>

    <link rel="stylesheet" href="/style.css">
</head>

<body>

<nav>
    <ul class="main-nav">
        <li><a href="/provider/profile">Profile</a></li>
        <li><a href="/provider/history">History</a></li>
        <li><a href="/provider/logout">Logout</a></li>
    </ul>

    <header>
        <a href="/customer/browse">HomeFix Now</a>
    </header>
</nav>

<div class="profile-banner">

    <div class="banner-text">

        <h1>My Provider Profile</h1>

        <p>
            Manage how customers see your profile.
        </p>

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
                <strong>Business Name</strong>
                <p>${provider.businessName}</p>
            </div>

            <div class="info-item">
                <strong>Service Category</strong>

                <span class="service-tag">
                    ${provider.specialty}
                </span>
            </div>

            <div class="info-item">
                <strong>Years of Experience</strong>
                <p>${provider.yearsExperience}</p>
            </div>

            <div class="info-item">
                <strong>Location</strong>
                <p>${provider.location}</p>
            </div>

            <div class="info-item">
                <strong>Starting Price</strong>
                <p>$${provider.hourlyRate}/hr</p>
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
                <p>$${provider.hourlyRate} / Hour</p>
            </div>

            <div class="info-item">
                <strong>Free Estimates</strong>

                <p>
                    <#if provider.freeEstimates?? && provider.freeEstimates>
                        Yes
                    <#else>
                        No
                    </#if>
                </p>
            </div>

            <div class="info-item">
                <strong>Insured</strong>

                <p>
                    <#if provider.insured?? && provider.insured>
                        Yes
                    <#else>
                        No
                    </#if>
                </p>
            </div>

            <div class="info-item info-full">

    <strong>Services Offered</strong>

    <ul class="services-list">

        <#if services?? && services?size gt 0>

            <#list services as service>

                <li>
                    ${service.serviceName}
                    <#if service.price??>
                        - $${service.price}
                    </#if>
                </li>

            </#list>

        <#else>

            <li>No services have been added yet.</li>

        </#if>

    </ul>

    <br>

    <a href="/provider/add_service">
        <button type="button">
            Add Service
        </button>
    </a>

</div>

        </div>

    </div>

</div>

<div class="profile-card">

    <h2>Availability</h2>

    <div class="info-grid">

        <div class="info-item">
            <strong>Availability</strong>
            <p>${provider.availability}</p>
        </div>

    </div>

</div>

<div class="profile-card">

    <h2>Account Settings</h2>

    <button type="button">
        Change Password
    </button>

    <button type="button" class="delete-btn">
        Delete Account
    </button>

</div>

</body>

</html>