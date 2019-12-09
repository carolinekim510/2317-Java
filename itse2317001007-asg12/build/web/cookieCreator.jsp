<%-- 
    Document   : cookieCreator
    Created on : Dec 5, 2019, 5:03:43 PM
    Author     : carolinekim
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Cookies that were Created</title>
        <link rel="stylesheet" href="css/css-3.css">
        <style type="text/css">
            ol {margin-left: 80px;}
            li {font-size: 2em; text-align: left;}
            p {font-size: 1em; line-height: 1;}
        </style>
    </head>
    <%@include file = "cookieCreatorProcessor.jsp" %>
    <body>
        <div class="center">
            <h1>Three Cookies Created</h1>
            <ol>
                <li><p><b>Animal:</b>
                    <%= request.getParameter("animal") %>
                    </p>
                </li>
               <li><p><b>Flower:</b>
                    <%= request.getParameter("flower") %>
                    </p>
                </li>
                <li><p><b>Country:</b>
                    <%= request.getParameter("country") %>
                    </p>
                </li>
            </ol>
                    <button onclick="location.href='readingCookies.jsp'" class="coral_color">Reading Cookies</button>
        </div>

    </body>
</html>
