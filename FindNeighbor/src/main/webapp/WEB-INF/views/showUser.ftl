<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <title>Title</title>
</head>
<body>
<h1>User info</h1>
<table>
    <tr>
        <th>Id</th>
        <td>${user.id}</td>
    </tr>
    <tr>
        <th>First Name</th>
        <td>${user.firstName}</td>
    </tr>
    <tr>
        <th>Last Name</th>
        <td>${user.lastName}</td>
    </tr>
    <tr>
        <th>Email</th>
        <td>${user.email}</td>
    </tr>
</table>
<a href="/users">Back</a>
</body>
</html>