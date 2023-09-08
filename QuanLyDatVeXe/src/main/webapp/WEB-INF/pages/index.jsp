<%-- 
    Document   : index
    Created on : 6 thg 9, 2023, 09:28:51
    Author     : ADMIN
--%>

<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Trang chủ</title>
    </head>
    <body>
        <h1></h1>
        <c:forEach items="${Chuyenxe}" var="c">
            <h1>${c.tenCX}</h1>
        </c:forEach>
       
    </body>
</html>
