<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head><title>Customer Manager</title></head>
<body>
    <div align="center">
        <h1>Customer Manager</h1>
        <h3><a href="new customer">New Customer</a></h3>
        <table border="1" cellpadding="5">
            <tr>
                <th>ID</th><th>Name</th><th>E-mail</th><th>Address</th><th>Action</th>
            </tr>
            <c:forEach var="c" items="${customers}">
                <tr>
                    <td>${c.id}</td>
                    <td>${c.name}</td>
                    <td>${c.email.email}</td>
                    <td>${c.adresse.rue}</td>
                    <td>
                        <a href="edit?id=${c.id}">Edit</a> &nbsp;
                        <a href="delete?id=${c.id}">Delete</a>
                    </td>
                </tr>
            </c:forEach>
        </table>
        <a href="${pageContext.request.contextPath}" 
       	onclick="return confirm('Voulez-vous vraiment vous déconnecter ?')">
       	Déconnexion</a>
    </div>
</body>
</html>