<!DOCTYPE html>
<html lang="en">

<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Add Service</title>

    <link rel="stylesheet" href="/style.css">
</head>

<body>

<nav>
    <ul class="main-nav">
        <li><a href="/provider/profile">Profile</a></li>
        <li><a href="/provider/history">History</a></li>
        <li><a href="/provider/logout">Logout</a></li>
    </ul>

    <header>
        <a href="/customer/browse">HomeFix Now</a>
    </header>
</nav>

<div class="provider-form">

    <h2>Add a New Service</h2>

    <form action="/provider/add_service" method="post">

        <label for="serviceName">Service Name</label>
        <input
                type="text"
                id="serviceName"
                name="serviceName"
                required>

        <label for="description">Description</label>
        <textarea
                id="description"
                name="description"
                rows="5"
                placeholder="Describe the service you offer..."></textarea>

        <label for="price">Price ($)</label>
        <input
                type="number"
                id="price"
                name="price"
                step="0.01"
                min="0"
                required>

        <button type="submit">
            Add Service
        </button>

    </form>

    <br>

    <a href="/provider/profile">
        <button type="button">
            Cancel
        </button>
    </a>

</div>

</body>
</html>