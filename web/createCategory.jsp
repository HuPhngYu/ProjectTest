<%-- 
    Document   : createCategory
    Created on : Mar 26, 2018, 5:08:42 PM
    Author     : NATSAMA
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <h1>Add New Category</h1>
        <form action="AddCategoryServlet" method="POST">
            Category Name: <input type="text" name="catName"/><br/>
            Parent:<br/>
            <input type="radio" name="parent" value="0"/>None<br/>
            <c:forEach items="${mainCategory}" var="mainCat">
                <input type="radio" name="parent" value="${mainCat.categoryID}"/>${mainCat.categoryName}<br/>
            </c:forEach>
            <input type="submit" value="Add"/>
        </form>
    </body>
</html>
