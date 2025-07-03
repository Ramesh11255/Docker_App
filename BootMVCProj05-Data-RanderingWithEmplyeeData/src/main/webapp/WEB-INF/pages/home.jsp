<%@ page isELIgnored="false" import="java.util.*" %>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>

<h2 style="color: green;text-align: center;">Welcome to Spring MVC</h2>

<br><br>

<b>Employee Details are :: </b>
 <c:choose>
  <c:when test="${!empty emps}">
    <table bgcolor="green" align="center" border="2">
     <tr><th>id</th> <th>name</th> <th>address</th> <th>salary</th></tr>
      <c:forEach var="e" items="${emps}">
       <tr>
        <td>${e.id}</td>
        <td>${e.name}</td>
        <td>${e.address}</td>
        <td>${e.salary}</td>
      </tr>
     </c:forEach>
    </table> 
  </c:when>
</c:choose>

<%-- <c:forEach var="e" items="${emps}">
   ${e},
</c:forEach> --%>