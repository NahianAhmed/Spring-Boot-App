
<html>


<%@ include file="master/header.jsp"%>

<body class="container">

	<form method="POST" action="/update">

		<input type="hidden" name="id" value="${user.id}" /> Name : 
		<input type="text" name="name" value="${user.name}" /> <br> Address :
		<input type="text" name="address" value="${user.address}" /><br>
		Mobile <input type="text" name="mobile" value="${user.mobile}" /><br>

		<button type="submit">Update</button>



	</form>

</body>
</html>