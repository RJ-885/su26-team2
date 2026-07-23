<!DOCTYPE html>
<html lang="en">

<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Provider History</title>

    <link rel="stylesheet" href="../style.css">
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

<div class="profile-banner">

    <h1>Service History</h1>

    <p>
        View your completed service requests and earnings.
    </p>

</div>

<div class="summary-card">

    <h2>Performance Summary</h2>

    <div class="summary-grid">

        <div>
            <strong>Completed Jobs</strong>
            <p>2</p>
        </div>

        <div>
            <strong>Total Earnings</strong>
            <p>$305</p>
        </div>

        <div>
            <strong>Average Rating</strong>
            <p>4.9</p>
        </div>

        <div>
            <strong>Response Rate</strong>
            <p>100%</p>
        </div>

    </div>

</div>

<div class="history-card">

    <h2>Completed Services</h2>

    <table class="history-table">

        <thead>
        <tr>
            <th>Customer</th>
            <th>Location</th>
            <th>Service</th>
            <th>Price</th>
            <th>Client Feedback</th>
            <th>Status</th>
        </tr>
        </thead>

        <tbody>

        <tr>
            <td>John Smith</td>
            <td>Greensboro, NC</td>
            <td>Kitchen Faucet Repair</td>
            <td>$125</td>
            <td>Great work! Very professional.</td>
            <td>
                <span class="completed">
                    Completed
                </span>
            </td>
        </tr>

        <tr>
            <td>Sarah Johnson</td>
            <td>High Point, NC</td>
            <td>Ceiling Fan Installation</td>
            <td>$180</td>
            <td>Fast service and excellent quality.</td>
            <td>
                <span class="completed">
                    Completed
                </span>
            </td>
        </tr>

        </tbody>

    </table>

</div>

</body>

</html>