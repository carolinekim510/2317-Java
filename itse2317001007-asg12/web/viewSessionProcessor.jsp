<%-- 
    Document   : viewSessionProcessor
    Created on : Dec 6, 2019, 9:33:33 AM
    Author     : carolinekim
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <title>Reading Cookies</title>
        <link rel="stylesheet" href="css/css-3.css">
    </head>
    <%@page import="java.util.*" %>
    <%@include file = "sessionCreatorProcessor.jsp" %>
    <body>

        <div class ="center">
            <h1>Reading Sessions</h1>
            <table class="inline-block">
                <tr>
                    <th id ="td-id1">Session Info</th>
                    <th id ="td-id1">Value</th>
                </tr>
                <tr>
                    <td>Artist</td>
                    <td><% out.print(artist); %></td>
                </tr>
                <tr>
                    <td>Color</td>
                    <td><% out.print(color); %></td>
                </tr>
            </table>
                <button onclick="location.href='index.jsp'" class="coral_color" style="margin-top: 20px;">
                    Back to Cookie & Session Main
                </button>
        </div>
    </body>
</html>