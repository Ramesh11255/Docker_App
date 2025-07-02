<%@ page isELIgnored="false"%>
<%@taglib uri="http://www.springframework.org/tags/form" prefix="form"%>

<h1 style="color: blue; text-align: center;">Employee Registration</h1>

<form:form modelAttribute="emp">
	<table border="0" align="center" bgcolor="cyan">
		<tr>
			<td>Employee Name::</td>
			<td><form:input path="name" /></td>
		</tr>
		<tr>
			<td>Employee Address::</td>
			<td><form:input path="address" /></td>
		</tr>
		<tr>
			<td>Employee Job::</td>
			<td><form:input path="job" /></td>
		</tr>
		<tr>
			<td>Employee Salary::</td>
			<td><form:input path="salary" /></td>
		</tr>
		<tr>
			<td><input type="submit" value="register"></td>
		</tr>

	</table>
</form:form>