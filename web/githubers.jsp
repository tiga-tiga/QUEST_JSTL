<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page import="fr.wildcodeschool.githubtracker.model.Githuber" %><%--
  Created by IntelliJ IDEA.
  User: wilder
  Date: 30/05/18
  Time: 02:09
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <jsp:include page="header.jsp"/>
</head>
<body>
<ul>
        <c:forEach items="${requestScope.listValue}" var="currentValue">
            <li class="list-group-item"> name : ${currentValue.name} , pseudo : ${currentValue.login}, email : ${currentValue.email}</li>
        </c:forEach>

</ul>



<jsp:include page="footer.jsp"/>
</body>
</html>
