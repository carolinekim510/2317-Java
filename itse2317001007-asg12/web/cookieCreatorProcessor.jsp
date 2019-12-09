<%-- 
    Document   : cookieCreatorProcessor
    Created on : Dec 5, 2019, 5:03:56 PM
    Author     : carolinekim
--%>

<%
    //Crate three cookes from the form
    Cookie animal = new Cookie ("animal", request.getParameter("animal"));
    Cookie flower = new Cookie ("flower", request.getParameter("flower"));
    Cookie country = new Cookie ("country", request.getParameter("country"));
    
    //Set expiration dates to 2 hours
    animal.setMaxAge(60*60*2);
    flower.setMaxAge(60*60*2);
    country.setMaxAge(60*60*2);
    
    //Add cookies to response object - back to browser
    response.addCookie(animal);
    response.addCookie(flower);
    response.addCookie(country);
%>
