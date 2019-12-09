<%-- 
    Document   : sessionCreation
    Created on : Dec 6, 2019, 8:57:47 AM
    Author     : carolinekim
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <title>Create Session Data</title>
        <link rel="stylesheet" href="css/css-3.css">
    </head>
    <body>
        <%
            if (request.getParameter("artist") != null && request.getParameter("color") != null) {
                session.setAttribute("Artist", request.getParameter("artist"));
                session.setAttribute("Color", request.getParameter("color"));
                pageContext.forward("viewSessionProcessor.jsp");
            }
        %>
        <h1>Enter Session Data</h1>
        <form action="sessionCreation.jsp" method="POST">
            <table class="inline-block">
                <tr><th id="td-id1" colspan="2">Session Information</th></tr>
                <tr>
                    <td>Artist:</td>
                    <td><input type="text" name="artist"></td>
                </tr>
                <tr>
                    <td>Color:</td>
                    <td><input type="text" name="color"></td>
                </tr>                     
                <tr>
                    <td></td>
                    <td><br><input type="submit" class="coral_color" value="Create Sessions"></td>
                </tr>
            </table>
        </form>
    </body>
</html>
