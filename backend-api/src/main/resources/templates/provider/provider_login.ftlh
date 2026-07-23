<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Provider Login | HomeFix Now</title>

    <link rel="stylesheet" href="/style.css">
</head>

<body>

<nav>
    <ul class="main-nav">
        <li><a href="/">Home</a></li>
        <li><a href="/customer/login">Customer Login</a></li>
        <li><a href="/provider/provider_sign_up">Provider Sign Up</a></li>
    </ul>

    <header>
        <a href="/">HomeFix Now</a>
    </header>
</nav>

<div class="profile-banner">

    <div class="profile-card" style="max-width:500px; margin:auto;">

        <h1>Provider Login</h1>

        <p style="margin-bottom: 18px;">
            Sign in to manage your profile, services, and bookings.
        </p>

        <form action="/provider/provider_login" method="post">

            <div class="info-item" style="margin-top: 15px;">
    <strong>Email Address</strong>
    <input
        type="email"
        name="email"
        placeholder="Enter your email"
        required>
</div>

            <br>

            <div class="info-item">
                <strong>Password</strong>
                <input
                        type="password"
                        name="password"
                        placeholder="Enter your password"
                        required>
            </div>

            <br>

            <button type="submit">
                Login
            </button>

        </form>

        <br>

        <p style="text-align:center;">
            Don't have a provider account?
            <a href="/provider/provider_sign_up">
                Register Here
            </a>
        </p>

    </div>

</div>

</body>
</html>