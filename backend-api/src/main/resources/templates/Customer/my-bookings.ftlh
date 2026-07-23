<!DOCTYPE html>
<html lang="en">

<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>My Bookings</title>
    <link rel="stylesheet" href="/style.css">
</head>

<body>

    <nav>
        <ul class="main-nav">
            <a href="/customer/profile">Profile</a>
            <a href="/customer/customer_login">Login</a>
            <a href="/customer/sign_up">Sign Up</a>
        </ul>

        <header>
            <a href="/customer/browse">HomeFix Now</a>
        </header>
    </nav>

    <div class="cards">
            <a href="/customer/booking-details">
                <article class="card">
                    <header>
                        <h2>{booking.location}</h2>
                    </header>

                    <div class="content">
                        <p>
                            {booking.notes}
                        </p>
                    </div>

                    <footer>
                        {booking.homeService}
                    </footer>
                </article>
            </a>
    </div>
</body>

<footer>

</footer>

</html>