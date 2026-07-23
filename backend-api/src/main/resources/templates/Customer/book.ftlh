<!DOCTYPE html>
<html lang="en">

<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Make a Booking</title>
    <link rel="stylesheet" href="/style.css">
</head>

<body>

    <nav>
        <ul class="main-nav">
            <a href="/customer/customer_profile">Profile</a>
            <a href="/customer/customer_login">Login</a>
            <a href="/customer/sign_up">Sign Up</a>
        </ul>

        <header>
            <a href="/customer/browse">HomeFix Now</a>
        </header>
    </nav>

    <h3>Make a New Booking</h3>
    <form action="/customer/bookings/book" method="post">
        <input type="hidden" name="providerId" value="${provider.providerId}" />

        <label for="serviceId">Service Category</label>
        <select id="serviceId" name="serviceId" required>
            <#if home_services?has_content>
                <#list home_services as service>
                    <option value="${service.serviceId}">${service.serviceName}</option>
                </#list>
                <#else>
                    <option value="" disabled selected>No Services Available</option>
            </#if>
        </select>

        <label for="id">Available Timeslots</label>
        <select id="id" name="id" required>
            <#if timeslots?has_content>
                <#list timeslots as timeslot>
                    ${(session.timeslot.startTime?datetime.iso?string('yyyy-MM-dd HH:mm a'))!'TBD'}
                    <option value="${timeslot.id}">
                        ${(timeslot.startTime?datetime.iso?string('yyyy-MM-dd hh:mm a'))!'TBD'} to
                        ${(timeslot.endTime?datetime.iso?string('yyyy-MM-dd hh:mm a'))!'TBD'}
                    </option>
                </#list>
            <#else>
                <option value="" disabled selected>No Available Timeslots Right Now</option>
            </#if>
        </select>

        <div class="enter-name">
            <label for="notes">Notes for the Provider</label>
            <textarea id="notes" name="notes" rows="4" placeholder="Explain the Project to the Provider."></textarea>
        </div>

        <div class="create-button">
            <button type="submit">Book</button>
        </div>
    </form>


</body>

<footer>

</footer>

</html>