<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <title>Title</title>
</head>
<body>
<h1>Add user</h1>
<form name="user" action="/updateUser" method="post">
    <#--    <p>Id</p>-->
    <#--    <input title = "Id" type="text" name="id">-->
    <p>First Name</p>
    <input title = "First name" type="text" name="firstName" value="${user.firstName}">
    <p>Last Name</p>
    <input title = "Last name" type="text" name="lastName" value="${user.lastName}">
    <p>Email</p>
    <input title = "Email" type="text" name="email" value="${user.email}">
    <input type="submit" value="OK">
</form>
</body>
</html>