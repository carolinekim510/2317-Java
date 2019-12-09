<%-- 
    Document   : readingCookies
    Created on : Dec 5, 2019, 5:04:05 PM
    Author     : carolinekim
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <title>Reading Cookies</title>
        <link rel="stylesheet" href="css/css-3.css">
    </head>
    <body>
        <div class="center">
            <h1>Reading Cookies</h1>
            <%
                Cookie cookies[] = null;
                cookies = request.getCookies();
                if (cookies != null) {
                    out.println("<h2 class=\blue_color\">"
                    + "Found Cookies: Name --- Vlaue</h2>");
                    for (int i = 0; i < cookies.length; i++) {
                        out.println("<h3>Name: " + cookies[i].getName() + " --- ");
                        out.println("Value: " + cookies[i].getValue() + "</h3>");
                    }
                }else {
                    out.println("<h2>No Cookies found</h2>");
                }
            %>
            <button onclick="location.href='sessionCreation.jsp'" class="coral_color">
                Create Sessions
            </button>
            </a>
        </div>
        
    </body>
</html>
