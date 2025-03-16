<%@ page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
    <title>Welcome JSP Page</title>
</head>
<body>
    <h1>BOOK data</h1>

    BookID : ${book.bookID} </br>
    BookName : ${book.bookName} </br>
    BookPrice : ${book.bookPrice} </br>

   <a href="/webapp/">Go Back</a>

</body>
</html>
