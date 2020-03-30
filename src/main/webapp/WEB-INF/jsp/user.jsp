
<html>

<%@ include file="master/header.jsp"%>

<body>
	<table border="1">


		<tr>
			<td>ID</td>
			<td>Name</td>
			<td>Address</td>
			<td>Mobile</td>
			<td>Action</td>

		</tr>
		<c:forEach var="data" items="${users}">
			<tr>
				<td>${data.id}</td>
				<td>${data.name}</td>
				<td>${data.address}</td>
				<td>${data.mobile}</td>
				<td><a href="/edit-a-user/${data.id}"> Edit </a>| <a
					href="/delete-user/${data.id}"> Delete </a></td>
			</tr>
		</c:forEach>
	</table>

</body>
</html>