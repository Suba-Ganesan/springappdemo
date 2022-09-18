<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<h2>Hi welcome to spring MVC, Im from HelloController</h2>
<%	
	int Id=(Integer)request.getAttribute("id");
	String Name=(String)request.getAttribute("name");
	int Age=(Integer)request.getAttribute("age");
%>
<table>
<tr>
<th>Id</th> 
<th>Name</th>
<th>Age</th>
</tr>
</table>
<%
out.println(Id);
out.println(Name);
out.println(Age);
%>
</table>
</body>
</html>