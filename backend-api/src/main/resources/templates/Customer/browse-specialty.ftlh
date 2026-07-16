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
            <a href="/providers">HomeFix Now</a>
        </header>
    </nav>

    <!--This is for the Search Bar.-->
    <div class="search-section">
        <div class="search-container">
            <input type="text" class="search-bar" placeholder="Search by Specialty">
            <button>Search</button>
        </div>

        <div class="filter-buttons">
            <button class="button-outline">Electrical</button>
            <button class="button-outline">Plumbing</button>
            <button class="button-outline">Roofing</button>
            <button class="button-outline">Masonry</button>
        </div>
    </div>

    <!--This is for the Profile Cards-->
    <div class="cards">
            <#list providersList as provider>
                <article class="card">
                    <header>
                        <a href="/providers/${provider.providerId?c}">
                            <h2>Name</h2>
                        </a>
                    </header>

                    <img src="default.jpg" alt="Profile Image" />

                    <div class="content">
                        <p>
                            ${provider.bio}
                        </p>
                    </div>

                    <footer>
                        ${provider.specialty}
                    </footer>
                </article>
            </#list>
    </div>
</body>

<footer>

</footer>

</html>