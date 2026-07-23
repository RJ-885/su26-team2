<!DOCTYPE html>
<html lang="en">

<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Customer Profile</title>
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
            <a href="/customer/browse">HomeFix Now</a>
        </header>
    </nav>

    <div class="container">
        <div class="user-details">
            <div class="row">
                <div class="description-header">
                    <h2>
                        ${customer.firstName} ${customer.lastName}
                    </h2>
                </div>

                <div class="column-image">
                    <img src="default.jpg" alt="Profile Image" />
                </div>
                <div class="column-description">
                    <h3>
                        About Me
                    </h3>

                    <#if customer.bio??>
                        <p>
                            ${customer.bio}
                        </p>
                    <#else>
                        <p>

                        </p>
                    </#if>
                    <h3>
                        Email
                    </h3>
                    <h4>
                        ${customer.email}
                    </h4>

                    <h3>
                        Phone Number
                    </h3>

                    <#if customer.phone??>
                        <h4>
                            ${customer.phone}
                        </h4>
                    <#else>
                        <h4>

                        </h4>
                    </#if>
                </div>
                <div class="profile-card">

                    <h2>Account Settings</h2>

                    <a href="edit/$"><button>Edit</button></a>

                    <a href="/delete">
                        <button class="delete-btn" onclick="return confirm('Are you sure you want to delete your account?')">Delete Account</button>
                    </a>

                </div>
            </div>
        </div>
    </div>
</body>

<footer>

</footer>

</html>