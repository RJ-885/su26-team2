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
        <div class="login-form">
            <h3>Login</h3>
            <form class="form" action="submit-profile.php" method="POST">
                <div class="enter-name">
                    <label for="name">Profile Name:</label>
                    <input type="text" id="name" name="name" required>
                </div>

                <div class="enter-password">
                    <label for="password">Password:</label>
                    <input type="password" id="password" name="password" required>
                </div>

                <div class="login-button">
                    <button type="submit">Login</button>
                </div>
                <div class="sign-up-button">
                    <a href="/sign_up">Don't have an account? Sign Up</a>
                </div>
            </form>
        </div>
    </div>
</body>

<footer>

</footer>

</html>