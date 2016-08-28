<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
  <%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>HomeJspJstl</title>
</head>
<body>	
	<%-- <c:out value="Baddi"></c:out>
	<c:out value="${parhome1}"></c:out>
	<c:out value="${parhome2}"></c:out> --%>
	<table border="1">
		<thead>
			<tr>
				<th>IdWerk</th><th>Name</th><th>Delete</th>
			</tr>
		</thead>
		<tbody>
		<c:forEach items="${listWerknemers}" var="d">
			<tr>
				<td>${d.id}</td>
				<td>${d.voorNaam}</td>	
				<td><a href="domain?action=delete&id=${d.id}">delete</a></td>		
			</tr>
		</c:forEach>
		</tbody>
	</table>
</body>
</html>