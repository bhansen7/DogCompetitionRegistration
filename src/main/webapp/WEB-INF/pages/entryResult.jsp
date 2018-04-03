<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
 <%@ taglib uri = "http://www.springframework.org/tags/form" prefix="mvc" %>
 <%@ page isELIgnored="false" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Spring MVC From Handling</title>
</head>
<body> <h2>Dog Registration Result</h2>
    <table>
        <tr>
            <td>Competition Type</td>
            <td>${u.competitionType}</td>
        </tr>
        <tr>
            <td>Competition Class</td>
            <td>${u.competitionClass}</td>
        </tr>
        <tr>
            <td>Dog Name</td>
            <td>${u.dogName}</td>
        </tr>
        <tr>
            <td>Owner Name</td>
            <td>${u.ownerName}</td>
        </tr>
        
        </table>
<a href = "viewAll.mvc">View all Entries</a>
</body>
</html>