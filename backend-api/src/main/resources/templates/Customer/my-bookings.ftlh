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
        <#list bookings as booking>
            <a href="/customer/bookings/${booking.bookingId?c}">
                <article class="card">
                    <header>
                        <h4>${booking.location}</h4>
                    </header>

                    <img src="/house.jpg" alt="House Image">

                    <div class="content">
                        <p>
                            ${booking.notes}
                        </p>
                    </div>

                    <footer>
                        
                    </footer>
                </article>
            </a>
        </#list>
    </div>
</body>

<footer>

</footer>

</html>