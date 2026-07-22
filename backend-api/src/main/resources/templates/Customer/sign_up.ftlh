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
            <a href="/customer_profile">Profile</a>
            <a href="/customer_login">Login</a>
            <a href="/sign_up">Sign Up</a>
        </ul>

        <header>
            <a href="/providers">HomeFix Now</a>
        </header>
    </nav>

    <div class="container">
        <div class="new-profile-form">
            <h3>Create a New Profile</h3>
            <form action="/sign_up/save" method="post">
                <div class="enter-name">
                    <label for="first_name">First Name:</label>
                    <input type="text" id="firstName" name="firstName" required>
                </div>

                <div class="enter-name">
                    <label for="last_name">Last Name:</label>
                    <input type="text" id="lastName" name="lastName" required>
                </div>

                <div class="enter-email">
                    <label for="email">Email:</label>
                    <input type="text" id="email" name="email" required>
                </div>

                <div class="create-button">
                    <button type="submit">Create</button>
                </div>
            </form>
        </div>

        <div>
            <a href="provider/provider_sign_up">Sign us as a Provider</a>
        </div>
    </div>
</body>

<footer>

</footer>

</html>