<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
  <%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html >
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
				<th>IdWerk</th><th>VoorName</th><th>AchterName</th><th>GeboorteDatum</th><th>Functie</th><th>Email</th><th>Delete</th>
			</tr>
		</thead>
		<tbody>
		<c:forEach items="${listWerknemers}" var="d">
			<tr>
				<td>${d.idWerknemer}</td>
				<td>${d.voorNaam}</td>
				<td>${d.achterNaam}</td>
				<td>${d.geboorteDatum}</td>
				<td>${d.functie}</td>
				<td>${d.email}</td>								
				<td><a href="medwerkerServlet?action=remove&idWerknemer=${d.idWerknemer}">delete</a></td>		
			</tr>
		</c:forEach>
		</tbody>
	</table>
	<a href="Index.html">Index</a>
	
</body>
</html>