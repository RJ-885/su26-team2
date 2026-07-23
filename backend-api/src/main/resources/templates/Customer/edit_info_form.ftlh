<!DOCTYPE html>
<html lang="en">

<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Edit Customer Profile Information</title>
    <link rel="stylesheet" href="/style.css">
</head>

<body>

    <nav>
        <ul class="main-nav">
            <a href="/customer/bookings">Bookings</a>
            <a href="/customer/profile">Profile</a>
            <a href="/cutomer/customer_login">Login</a>
            <a href="/customer/sign_up">Sign Up</a>
        </ul>

        <header>
            <a href="/customer/browse">HomeFix Now</a>
        </header>
    </nav>

    <div class="container">
        <div class="login-form">
            <h3>Edit Your Profile</h3>
            <form class="form" action="/customer/profile/edit" method="post">

                <div class="enter-name">
                    <label for="first_name">First Name</label>
                    <input type="text" id="firstName" name="firstName" value="${customer.firstName}">
                </div>

                <div class="enter-name">
                    <label for="last_name">Last Name</label>
                    <input type="text" id="lastName" name="lastName" value="${customer.lastName}">
                </div>

                <div class="enter-name">
                    <label for="email">Email:</label>
                    <input type="text" id="email" name="email" value="${customer.email}">
                </div>

                <div class="enter-name">
                    <label for="phone">Phone</label>
                    <input type="text" id="phone" name="phone" value="${customer.phone!''}">
                </div>

                <div class="enter-name">
                    <label for="location">City</label>
                    <input type="text" id="location" name="location" value="${customer.location!''}">
                </div>

                <div class="login-button">
                    <button type="submit">Confirm</button>
                </div>
            </form>
            <div class="login-button">
                <a href="/customer/profile">Cancel</a>
            </div>
        </div>
    </div>
</body>

<footer>

</footer>

</html>