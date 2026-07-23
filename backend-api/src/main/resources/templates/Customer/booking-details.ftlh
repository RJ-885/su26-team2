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
            <a href="/customer/bookings">Bookings</a>
            <a href="/customer/profile">Profile</a>
            <a href="/customer/customer_login">Login</a>
            <a href="/customer/sign_up">Sign Up</a>
        </ul>

        <header>
            <a href="/customer/browse">HomeFix Now</a>
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

                <img src="/house.jpg" alt="House Image">

                <div class="column-description">
                    <h3>
                        ${booking.notes}
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

                    <a href="/customer/bookings/${booking.bookingId}/cancel">
                        <button class="delete-btn" onclick="return confirm('Are you sure you want to cancel this booking?')">Cancel Booking</button>
                    </a>
                </div>


            </div>
        </div>
    </div>

</body>

<footer>

</footer>

</html>