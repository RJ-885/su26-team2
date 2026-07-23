<!DOCTYPE html>
<html lang="en">

<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Browse Page</title>
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
            <a href="/browse">HomeFix Now</a>
        </header>
    </nav>

    <div class="container">
        <div class="user-details">
            <div class="row">
                <div class="description-header">
                    <h2>
                        ${booking.location}
                    </h2>
                </div>

                <div class="column-image">
                    <img src="home.jpg" alt="Profile Image" />
                </div>

                <div class="column-description">
                    <h3>
                        Notes
                    </h3>

                    <#if booking.notes??>
                        <p>
                            ${booking.notes}
                        </p>
                        <#else>
                            <p>

                            </p>
                    </#if>
                    <h3>
                        Status
                    </h3>
                    <h4>
                        ${booking.status}
                    </h4>

                    <h3>
                        Provider
                    </h3>

                    <#if booking.provider??>
                        <h4>
                            ${booking.provider}
                        </h4>
                        <#else>
                            <h4>

                            </h4>
                    </#if>

                    <a href="my-bookings.html">
                    <button class="cancel-booking-btn"
                        onclick="return confirm('Are you sure you want to cancel this booking?')">Cancel Booking</button>
                    </a>
                </div>


            </div>
        </div>
    </div>

</body>

<footer>

</footer>

</html>