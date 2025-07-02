<%@ page isELIgnored="false"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>

<c:choose>
 <c:when test="${!empty empinfo}">
  <table border="1" bgcolor="cyan" align="center">
   <tr bgcolor="yellow">
     <th>ID</th> <th>NAME</th> <th>ADDRESS</th> <th>JOB</th> <th>SALARY</th> <th>OPERATIONS</th>
   </tr>
   <c:forEach var="emp" items="${empinfo}">
     <tr bgcolor="pink">
     <td>${emp.id}</td>
     <td>${emp.name}</td>
     <td>${emp.address}</td>
     <td>${emp.job}</td>
     <td>${emp.salary}</td>
     <td><a href="edit?id=${emp.id}"><img src="images/edit.png" height="30" width="30"></a>
         <a href="delete?id=${emp.id}"><img src="images/delete.png" height="30" width="30" onclick="return confirm('are you sure to delete this record?')"></a></td>
     </tr>
   </c:forEach>
  </table> 
 </c:when>
 <c:otherwise>
    <h1 style="color: red; text-align:center;">Records Not Found</h1>
 </c:otherwise>
</c:choose>

<h2 style="color: green;text-align: center;">${result}</h2>

<h1 style="color:red;text-align:center;"><a href="register"><img src="images/Add.png" width="50" height="50"></a> &nbsp;&nbsp;&nbsp;
                          <a href="./"><img src="images/home.png" width="50" height="50"></a></h1>


