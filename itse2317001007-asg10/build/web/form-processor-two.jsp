<%-- 
    Document   : form-processor-one
    Created on : Nov 21, 2019, 11:44:14 AM
    Author     : carolinekim
--%>
<%@page import="java.io.*, java.util.*" %>
<!DOCTYPE html>
<html>
    <head>
        <title>Display Student Favorites (Form II)</title>
        <link rel="stylesheet" href="css/css-1.css">
    </head>
    <body>
        <%-- Java code starts at here to get attributes from index.html--%>
        <%
            String favSport = request.getParameter("favSport");
            String favTeam = request.getParameter("favTeam");
            String favPlayer = request.getParameter("favPlayer");
            String resFav = request.getParameter("resFav");
        %>

        <div class="center">
            <h1>Thank you for entering information.</h1>
            <h2>This is the information you have entered:</h2>
            <table class="inline-block">
                <tr><th class="th-title2" colspan="2">Information Entered</th></tr>
                <tr>
                    <td>Favorite Sport:</td>
                    <td><%= favSport %></td>
                </tr>
                <tr>
                    <td>Favorite Team</td>
                    <td><%= favTeam %></td>
                </tr>
                <tr>
                    <td>Favorite Player:</td>
                    <td><%= favPlayer %></td>
                </tr>
                <tr>
                    <td>Reason Favorite?:</td>
                    <td><%= resFav %></td>
                </tr>
            </table>
        </div>
    </body>
</html>
