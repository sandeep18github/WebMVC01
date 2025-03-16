<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ page import="java.util.List" %>
<%@ page import="com.ssk.Bookbindings.BookStore" %>

<!DOCTYPE html>
<html>
<head>
    <meta charset="UTF-8">
    <title>Book List</title>
</head>
<body>
    <h1>Book Details</h1>

    <!-- Book List Table -->
    <table border="1">
        <thead>
            <tr>
                <th>Book ID</th>
                <th>Book Name</th>
                <th>Price ($)</th>
            </tr>
        </thead>
        <tbody>
            <!-- Iterating through the book list using scriptlets -->
            <%
                List<BookStore> books = (List<BookStore>) request.getAttribute("booklist");

                // Iterate through each book and display its details
                if (books != null) {
                    for (BookStore book : books) {
            %>
            <tr>
                <td><%= book.getBookID() %></td>
                <td><%= book.getBookName() %></td>
                <td><%= book.getBookPrice() %></td>
            </tr>
            <%
                    }
                } else {
            %>
            <tr>
                <td colspan="3">No books available.</td>
            </tr>
            <%
                }
            %>
        </tbody>
    </table>

    <br>
    <a href="/webapp">Go Back</a>
</body>
</html>
