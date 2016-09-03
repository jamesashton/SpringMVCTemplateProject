<%--
  Created by IntelliJ IDEA.
  User: james
  Date: 28/08/2016
  Time: 23:35
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<html>
<head>
    <title>${title}</title>
</head>
<body>
<H1>${title}</H1>
Welcome ${user} to the admin home page.

<br />
<a href="<c:url value="/logout.html" />">Logout</a>



<a href="home.html">Admin Home</a>&nbsp;|&nbsp;
<a href="user.html">Users</a>
<br />
<a href="../index.html">Home</a>&nbsp;|&nbsp;
<a href="../about.html">About</a>&nbsp;|&nbsp;
<a href="../§admin/home.html">Admin</a>
</body>
</html>
