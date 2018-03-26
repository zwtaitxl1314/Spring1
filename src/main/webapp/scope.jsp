<%@ page import="org.springframework.web.context.WebApplicationContext" %>
<%@ page import="org.springframework.web.context.support.WebApplicationContextUtils" %>
<%@ page import="scpoe.People" %>
<%@ page language="java" pageEncoding= "UTF-8"%>
<%@ page contentType="text/html;charset=UTF-8" %>

<!DOCTYPE html>
<html>
<head>
    <title>Title</title>
</head>
<body>

    <%
        WebApplicationContext context = WebApplicationContextUtils.getWebApplicationContext(application);

        People p1 = context.getBean("hello", People.class);
        People p2 = context.getBean("hello", People.class);
        out.println("<h1>");
        out.println(p1);
        out.println("<h1>");
        out.println("<h1>");
        out.println(p2);
        out.println("<h1>");


    %>

</body>
</html>
