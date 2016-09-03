<%@ page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<html>
<head>
    <meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
    <title>${title}</title>
</head>
<body>
<H1>${title}</H1>
<br />
I am sorry but you (${user}) are not authorized to access this page
<a href="<c:url value="/logout.html" />">Logout</a>

<br />
<a href="index.html">Home</a>
<a href="about.html">About</a>
<a href="admin/home.html">Admin</a>
</body>
</html>