<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<html>
<head><title>Nouveau Client</title></head>
<body>
    <div align="center">
        <h1>Nouveau</h1>
        <form:form action="save" method="post" modelAttribute="customer">
        <form:hidden path="id" />
            <table>
                <tr>
                    <td>Name:</td>
                    <td><form:input path="name" /></td>
                </tr>
                <tr>
                    <td>Email:</td>
                    <td><form:input path="email.email" /></td>
                </tr>
                <tr>
                    <td>Address:</td>
                    <td><form:input path="adresse.rue" /></td>
                </tr>
                <tr>
                    <td colspan="2"><button type="submit">Save</button></td>
                </tr>
            </table>
        </form:form>
    </div>
</body>
</html>