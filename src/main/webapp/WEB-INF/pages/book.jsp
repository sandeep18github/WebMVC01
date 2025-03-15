<%@ page contentType="text/html; charset=UTF-8" language="java" %>
<html>
<head>
    <title>Book Store List</title>
</head>
<body>
    <h2>Book Store List</h2>
    <table border="1">
        <thead>
            <tr>
                <th>Book ID</th>
                <th>Book Name</th>
                <th>Price</th>
            </tr>
        </thead>
        <tbody>
            <!-- Using EL to loop through the list of books -->
            <c:forEach var="book" items="${booklist}">
                <tr>
                    <td>${book.bookID}</td>
                    <td>${book.bookName}</td>
                    <td>${book.bookPrice}</td>
                </tr>
            </c:forEach>
        </tbody>
    </table>
</body>
</html>
