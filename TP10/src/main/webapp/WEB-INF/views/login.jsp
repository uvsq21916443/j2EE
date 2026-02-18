<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <title>Login</title>
    <style>
        .container { text-align: center; margin-top: 50px; }
        .btn-register { background-color: #f0f0f0; margin-left: 10px; }
    </style>
</head>
<body>
    <div class="container">
        <h1>Login</h1>
        
        <form:form action="checkLogin" method="post" modelAttribute="customer">
            <p>
                Your id : <br/>
                <form:input path="id" placeholder="Entrez votre id" />
            </p>
            
            <div>
                <button type="submit">login</button>
                
                <%-- Bouton pour s'inscrire qui renvoie vers votre méthode d'accueil --%>
                <a href="new customer">
                    <button type="button" class="btn-register">register</button>
                </a>
            </div>
        </form:form>
    </div>
</body>
</html>