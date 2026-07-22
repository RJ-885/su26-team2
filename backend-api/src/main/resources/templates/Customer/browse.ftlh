<!DOCTYPE html>
<html lang="en">

<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Browse Page</title>
    <link rel="stylesheet" href="/../style.css">
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
            <form action="/providers/search" method="get">
                <input type="search" class="search-bar" name="query" placeholder="Search by Specialty">
                <button type="submit">Search</button>
            </form>
        </div>

        <div class="filter-buttons">
            <a href="/providers/search"><button class="button-outline">Electrical</button></a>
            <a href="/providers/search"><button class="button-outline">Plumbing</button></a>
            <a href="/providers/search"><button class="button-outline">Roofing</button></a>
            <a href="/providers/search"><button class="button-outline">Masonry</button></a>
        </div>
    </div>

    <!--This is for the Profile Cards-->
    <div class="cards">
        <#list providersList as provider>
            <a href="/providers/${provider.providerId?c}">
                <article class="card">
                    <header>
                        <h2>${provider.firstName} ${provider.lastName}</h2>
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
            </a>
        </#list>
    </div>
</body>

<footer>

</footer>

</html>