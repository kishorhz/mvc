<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<!DOCTYPE html>
<html>
<head>
	<meta charset="UTF-8">
		<title>Insert title here</title>
			<link type="text/css"
					rel="stylesheet"
					href="${pageContext.request.contextPath}/resources/css/style.css">
</head>
<body>
<div id="wrapper">
		<div id="header">
			<h1>CRM - Customer Relationship Manager</h1>
		</div>
</div>
<!--  add a search box -->
            <form:form action="search" method="GET">
                Search customer: <input type="text" name="theSearchName" />
                
                <input type="submit" value="Search" class="add-button" />
            </form:form>
<div id="container">
	
		<div id="content">
		
		<input type="button" value="Add Customer"
			onclick="window.location.href='showFormForAdd'; return false;"
			class="add-button"
		/>
				<table>
				
					<tr>
						<th>First Name</th>
						<th>Last Name</th>
						<th>Email</th>
					</tr>
					
					<!-- loop over to print the customers -->
					<c:forEach var = "tempCustomer" items = "${customers}"> 
					
					<!-- construct the update link with customer ID -->
					<c:url var="updateLink" value="/customer/showFormForUpdate">
						<c:param name="customerID" value="${tempCustomer.id}"/>
					</c:url>
					
					<!-- construct the update link with customer ID -->
					<c:url var="deleteLink" value="/customer/delete">
						<c:param name="customerID" value="${tempCustomer.id}"/>
					</c:url>
					
						<tr>
							<td>${tempCustomer.firstName}</td>
							<td>${tempCustomer.lastName}</td>
							<td>${tempCustomer.email}</td>
							<!-- display the update link -->
							<td><a href="${updateLink}">update</a></td>
							<td><a href="${deleteLink}"
									onClick = "if(!(confirm('Are you sure you want to delete this customer?'))) return false">delete</a></td>

						</tr>
						
					</c:forEach>
				
				</table>
		</div>
</div>
</body>
</html>