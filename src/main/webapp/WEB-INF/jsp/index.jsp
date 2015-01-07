<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Home Page</title>
</head>
<body>
	This is just for nothing
	<a href="rest">Click Here</a>
	<br> Test the RequestBody
	<form action="request?nam=lala" method="post">
		<input type="text" name="nam" />
		<input type="text" name="var2" /> <input
			type="submit" />
	</form>
	<div>
		<h1>Validation Testing</h1>
		<form:form action="validation" commandName="person" method="post">
			<form:errors path="*" cssClass="errorblock" element="div" />
			<form:input path="name" type="text" name="nam" />
		Name: <form:input path="age" type="text" name="var2" />
			<br>
		Age: <input type="submit" />
		</form:form>
	</div>
</body>
</html>