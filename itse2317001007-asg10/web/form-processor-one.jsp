<%-- 
    Document   : form-processor-one
    Created on : Nov 21, 2019, 11:44:14 AM
    Author     : carolinekim
--%>
<%@page import="java.io.*, java.util.*" %>
<!DOCTYPE html>
<html>
    <head>
        <title>Display Student Information (Form I)</title>
        <link rel="stylesheet" href="css/css-1.css">
    </head>
    <body>
        <%-- Java code starts at here to get attributes from index.html--%>
        <%
            String firstName = request.getParameter("firstName");
            String lastName = request.getParameter("lastName");
            String collegeName = request.getParameter("collegeName");
            String phoneNumber = request.getParameter("phoneNumber");
        %>

        <div class="center">
            <h1>Thank you for entering information.</h1>
            <h2>This is the information you have entered:</h2>
            <table class="inline-block">
                <tr><th class="th-title2" colspan="2">Information Entered</th></tr>
                <tr>
                    <td>First Name:</td>
                    <td><%= firstName %></td>
                </tr>
                <tr>
                    <td>Last Name:</td>
                    <td><%= lastName %></td>
                </tr>
                <tr>
                    <td>College Name:</td>
                    <td><%= collegeName %></td>
                </tr>
                <tr>
                    <td>Phone Number:</td>
                    <td><%= phoneNumber %></td>
                </tr>
            </table>
        </div>
    </body>
</html>
