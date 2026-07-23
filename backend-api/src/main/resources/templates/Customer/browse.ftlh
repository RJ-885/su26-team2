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
            <a href="/customer/bookings">Bookings</a>
            <a href="/customer/profile">Profile</a>
            <a href="/customer/customer_login">Login</a>
            <a href="/customer/sign_up">Sign Up</a>
        </ul>

        <header>
            <a href="/customer/browse">HomeFix Now</a>
        </header>
    </nav>

    <!--This is for the Search Bar.-->
    <div class="search-section">
        <div class="search-container">
            <form style="width: 200%;" action="/providers/search/{specialty}" method="get">
                <input type="search" class="search-bar" id="specialty" name="specialty" placeholder="Search by Specialty">
                <button type="submit">Search</button>
            </form>
        </div>

        <div class="filter-buttons" style="align-items: center;">
            <a href="/customer/providers/search/Electrical"><button class="button-outline">Electrical</button></a>
            <a href="/customer/providers/search/Plumbing"><button class="button-outline">Plumbing</button></a>
            <a href="/customer/providers/search/Roofing"><button class="button-outline">Roofing</button></a>
            <a href="/customer/providers/search/Masonry"><button class="button-outline">Masonry</button></a>
        </div>
    </div>

    <!--This is for the Profile Cards-->
    <div class="cards">
        <#list providersList as provider>
            <a href="/customer/providers/${provider.providerId?c}">
                <article class="card">
                    <header>
                        <h2>${provider.firstName} ${provider.lastName}</h2>
                    </header>

                    <img src="/tradesman.jpg" alt="Profile Image" />

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