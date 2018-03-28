<%@ page import="org.springframework.web.context.WebApplicationContext" %>
<%@ page import="org.springframework.web.context.support.WebApplicationContextUtils" %>
<%@ page import="ioc.scpoe.People" %>
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

        People p3 = context.getBean("zwt", People.class);
        People p4 = context.getBean("zwt", People.class);
        out.println("<h2>");
        out.println(p3);
        out.println("<h2>");
        out.println("<h2>");
        out.println(p4);
        out.println("<h2>");


    %>

</body>
</html>
