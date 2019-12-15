<html>
<head><title>ViralPatel.net - FreeMarker Spring MVC Hello World</title>
<body>
<div id="header">
    <H2>
      Additional Info
    </H2>
</div>

<div id="content">

    <fieldset>
        <legend>Add Address</legend>
        <form name="additionalInfo" action="addAdditionalInfo" method="post">
            Age: <input type="text" name="age" />	<br/>
            Bad Habits: <input type="checkbox" name="basHabits" />Yes<br/>
                        <input type="checkbox" name="basHabits" />No<br/>
            Kind of activity: <input type="checkbox" name="kindOfActivity" />Student<br/>
                              <input type="checkbox" name="kindOfActivity" />Worker<br/>
            Marital Status: <input type="checkbox" name="maritalStatus" />Single<br/>
                            <input type="checkbox" name="maritalStatus" />Married<br/>
            More about yourself: <input type="text" name="moreAboutYourself" /> <br/>
            Number of neighbor: <input type="text" name="numberOfNeighbor" /><br/>
            Participating: <input type="checkbox" name="participating" />Yes<br/>
                            <input type="checkbox" name="participating" />No<br/>
            Pets: <input type="checkbox" name="pets" />Yes<br/>
                            <input type="checkbox" name="pets" />No<br/>
            Sex: <input type="checkbox" name="sex" />Men<br/>
                            <input type="checkbox" name="sex" />Woman<br/>

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