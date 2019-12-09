<%-- 
    Document   : index
    Created on : Dec 5, 2019, 3:36:11 PM
    Author     : carolinekim
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <title>Enter Cookie Data</title>
        <link rel="stylesheet" href="css/css-3.css">
    </head>
    <body>
        <h1>Enter Cookie Data</h1>
        <form action="cookieCreator.jsp" method="GET">
            <table class="inline-block">
                <tr><th id="td-id1" colspan="2">Cookie Information</th></tr>
                <tr>
                    <td>Animal:</td>
                    <td><input type="text" name="animal"></td>
                </tr>
                <tr>
                    <td>Flower:</td>
                    <td><input type="text" name="flower"></td>
                </tr>                    
                <tr>
                    <td>Country:</td>
                    <td><input type="text" name="country"></td>
                </tr>  
                <tr>
                    <td></td>
                    <td><br><input type="submit" class="coral_color" value="Create Cookies"></td>
                </tr>
            </table>
        </form>
    </body>
</html>
