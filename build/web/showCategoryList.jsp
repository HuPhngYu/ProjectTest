<%-- 
    Document   : showCategoryList
    Created on : Mar 21, 2018, 7:53:49 PM
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
        <h1>Category Tree List</h1>
        <a href="AddCategoryGETServlet">Create Category</a>
        <ul>
            <c:forEach items="${mainCategory}" var="mainCategory">
                <li>
                    ${mainCategory.categoryName}
                    <ul>
                        <c:forEach items="${mainCategory.categoryCollection}" var="subCategory">
                            <li>
                                ${subCategory.categoryName}
                            </li>
                        </c:forEach>
                    </ul>
                </li>
            </c:forEach>
        </ul>

        <h3>All Categories</h3>
        <table border="1" cellpadding="10px">
            <thead>
                <tr>
                    <th>Category ID</th>
                    <th>Category Name</th>
                    <th>Parent ID</th>
                </tr>
            </thead>
            <tbody>
                <c:forEach items="${allCategory}" var="cat">
                    <tr>
                        <td>${cat.categoryID}</td>
                        <td>${cat.categoryName}</td>
                        <td>${cat.parentID.categoryName}</td>
                    </tr>
                </c:forEach>
            </tbody>
        </table>
    </body>
</html>
