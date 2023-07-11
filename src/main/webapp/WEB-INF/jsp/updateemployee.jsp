<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>

<h1>Update Employee</h1>
<form:form method="post" action="/Saksoft/update-employee/${id}">
    <table>
        <tr>
            <td>First_Name: </td>
            <td><form:input path="firstName"/></td>
        </tr>
        <tr>
            <td>Last_Name: </td>
            <td><form:input path="lastName"/></td>
        </tr>
        <tr>
            <td>Email: </td>
            <td><form:input path="email"/></td>
        </tr>
        <tr>
            <td>Age : </td>
            <td><form:input path="age"/></td>
        </tr>
        <tr>
            <td></td>
            <td><input type="submit" value="Update" /></td>
        </tr>
    </table>
</form:form>