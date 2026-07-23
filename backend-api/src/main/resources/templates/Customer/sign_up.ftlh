<!DOCTYPE html>
<html lang="en">

<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Customer Login</title>

    <link rel="stylesheet" href="/style.css">
</head>

<body>

<nav>
    <ul class="main-nav">
        <li><a href="/customer/profile">Profile</a></li>
        <li><a href="/customer/customer_login">Login</a></li>
        <li><a href="/customer/sign_up">Customer Sign Up</a></li>
        <li><a href="/provider/sign_up">Provider Sign Up</a></li>
    </ul>

    <header>
        <a href="/customer/browse">HomeFix Now</a>
    </header>
</nav>

<div class="container">

    <div class="new-profile-form">

        <h3>Create a New Customer Account</h3>

        <form action="/customer/sign_up" method="post">

            <div class="enter-name">
                <label for="firstName">First Name:</label>
                <input
                        type="text"
                        id="firstName"
                        name="firstName"
                        required>
            </div>

            <div class="enter-name">
                <label for="lastName">Last Name:</label>
                <input
                        type="text"
                        id="lastName"
                        name="lastName"
                        required>
            </div>

            <div class="enter-email">
                <label for="email">Email:</label>
                <input
                        type="email"
                        id="email"
                        name="email"
                        required>
            </div>

            <div class="enter-password">
                <label for="password">Password:</label>
                <input
                        type="password"
                        id="password"
                        name="password"
                        required>
            </div>

            <div class="create-button">
                <button type="submit">
                    Create Account
                </button>
            </div>

        </form>

        <hr>

        <p>
            Want to offer services instead?
        </p>

        <a href="/provider/sign_up">
            Sign Up as a Provider
        </a>

    </div>

</div>

</body>

</html>