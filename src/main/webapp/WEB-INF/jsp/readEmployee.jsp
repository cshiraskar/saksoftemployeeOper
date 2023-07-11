<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>

<h1>Read Employee</h1>
    <table border="2" width="70%" cellpadding="2">
        <tr>
            <th>Id</th>
            <th>First_Name</th>
            <th>Last_Name</th>
            <th>Email</th>
            <th>Age</th>
            <th>Update</th>
            <th>Delete</th>
        </tr>
        <c:forEach var="employee" items="${employee}">
            <tr>
                <td>${employee.id}</td>
                <td>${employee.firstName}</td>
                <td>${employee.lastName}</td>
                <td>${employee.email}</td>
                <td>${employee.age}</td>
                <td><a href="/Saksoft/update-employee/${employee.id}">Update</a></td>
                <td><a href="/Saksoft/delete-employee/${employee.id}">Delete</a></td>
            </tr>
        </c:forEach>
    </table>
<br/>
<a href="/Saksoft/create-employee">Create employee</a>