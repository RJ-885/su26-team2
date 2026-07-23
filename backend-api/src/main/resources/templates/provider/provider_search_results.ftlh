<h1>${specialty} Providers</h1>

<#if providers?size == 0>

    <p>No providers found.</p>

<#else>

    <#list providers as provider>

        <div class="card">

            <h3>${provider.businessName}</h3>

            <p>${provider.firstName} ${provider.lastName}</p>

            <p>${provider.location}</p>

            <p>${provider.yearsExperience} years experience</p>

            <p>$${provider.hourlyRate}/hr</p>

        </div>

        <br>

    </#list>

</#if>