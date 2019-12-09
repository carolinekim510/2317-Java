<%-- 
    Document   : form-processor-one
    Created on : Nov 21, 2019, 11:44:14 AM
    Author     : carolinekim
--%>
<%@page import="autodata.*, java.io.*, java.util.*" %>
<!DOCTYPE html>
<html>
    <head>
        <title>Display Student Information (Form I)</title>
        <link rel="stylesheet" href="css/css-1.css">
    </head>
    <body>
        <%-- Java code starts at here to get attributes from index.html--%>
        <%
            String ar_maker = request.getParameter("ar_maker");
            String ar_year = request.getParameter("ar_year");
            String ar_model = request.getParameter("ar_model");
            String ar_capacity = request.getParameter("ar_capacity");
            
            String am_type = request.getParameter("am_type");
            String am_maker = request.getParameter("am_maker");
            String am_model = request.getParameter("am_model");
            String am_color = request.getParameter("am_color");
            
            Aircraft aircraft = new Aircraft(ar_maker, ar_year, ar_model, ar_capacity);
            Automobile automobile = new Automobile(am_type, am_maker, am_model, am_color);
        %>

        <div class="center">
            <h1>Thank you for entering information.</h1>
            <h2>This is the information you have entered:</h2>
            <table class="inline-block">
                <tr><th class="th-title2" colspan="2">Aircraft Information</th></tr>
                <tr>
                    <td>Maker:</td>
                    <td><%= aircraft.getMaker() %></td>
                </tr>
                <tr>
                    <td>Year:</td>
                    <td><%= aircraft.getYear() %></td>
                </tr>
                <tr>
                    <td>Model:</td>
                    <td><%= aircraft.getModel() %></td>
                </tr>
                <tr>
                    <td>Passenger:</td>
                    <td><%= aircraft.getCapacity() %></td>
                </tr>
                <tr></tr>
                <tr><th class="th-title2" colspan="2">Automobile Information</th></tr>
                <tr>
                    <td>Type:</td>
                    <td><%= automobile.getType() %></td>
                </tr>
                <tr>
                    <td>Maker:</td>
                    <td><%= automobile.getMaker() %></td>
                </tr>
                <tr>
                    <td>Model:</td>
                    <td><%= automobile.getModel() %></td>
                </tr>
                <tr>
                    <td>Color:</td>
                    <td><%= automobile.getColor() %></td>
                </tr>
                
            </table>
        </div>
    </body>
</html>
