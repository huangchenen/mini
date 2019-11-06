<%@ page language="java" contentType="text/html; charset=utf-8"
         pageEncoding="utf-8" isELIgnored="false" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<html>
<head>
    <title>Title</title>
</head>
<body>
    你好我是InternalViewResource资源,后台传入:+${name}
    <div>request中：${requestScope.msg}</div>-----:
    <%= request.getAttribute("msg")%>
    <div>::${msg}</div>
</body>
</html>
