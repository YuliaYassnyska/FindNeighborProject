<html>
<head><title>ViralPatel.net - FreeMarker Spring MVC Hello World</title>
<body>
<div id="header">
    <H2>
        <a href="//www.viralpatel.net"><img height="37" width="236" border="0px" src="https://www.viralpatel.net/wp-content/themes/vp/images/logo.png" align="left"/></a>
        FreeMarker Spring MVC Hello World
    </H2>
</div>

<div id="content">

    <fieldset>
        <legend>Add Address</legend>
        <form name="address" action="addAddress" method="post">
            Country: <input type="text" name="country" />	<br/>
            City: <input type="text" name="city" />	<br/>
            Area: <input type="text" name="area" />	<br/>
            <input type="submit" value="   Save   " />
        </form>
    </fieldset>
    <br/>
<#--    <table class="datatable">-->
<#--        <tr>-->
<#--            <th>Country</th>  <th>City</th> <th>Area</th>-->
<#--        </tr>-->
<#--        <#list addresses as address>-->
<#--        <tr>-->
<#--            <td>${address.country}</td>-->
<#--            <td>${address.city}</td>-->
<#--            <td>${address.area}</td>-->
<#--        </tr>-->
<#--        </#list>-->
<#--    </table>-->

</div>
</body>
</html>