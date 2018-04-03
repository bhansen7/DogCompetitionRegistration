<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@taglib uri="http://www.springframework.org/tags/form" prefix="mvc"%>
<%@ page isELIgnored="false"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Spring MVC Form Handling</title>
</head>
<body>
	<h2>Dog Registration Form</h2>
	<mvc:form modelAttribute="entry" action="result.mvc">
		<table>
			<tr>
				<td><mvc:label path="competitionType">Competition Type</mvc:label></td>
				<td><mvc:input path="competitionType" /></td>
			</tr>
			<tr>
				<td><mvc:label path="competitionClass">Class</mvc:label></td>
				<td><mvc:input path="competitionClass" /></td>
			</tr>
			<tr>
				<td><mvc:label path="dogName">Dog Name</mvc:label></td>
				<td><mvc:input path="dogName" /></td>
			</tr>
			<tr>
				<td><mvc:label path="ownerName">Owner Name</mvc:label></td>
				<td><mvc:input path="ownerName" /></td>
			</tr>

			<tr>
				<td colspan="2"><input type="submit" value="Submit" /></td>
			</tr>
		</table>
	</mvc:form>
	<a href="viewAll.mvc">View all Entries</a>
</body>
</html>