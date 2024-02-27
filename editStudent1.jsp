<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<body bgcolor="pink">
<h1>Edit Student Details Here</h1>
<form:form method="GET" action="/editandsave">
    <table>
        <tr>
            <td>RollNo:</td>
            <td><form:input path="stdRollNo" type="number" /></td>
        </tr>
        <tr>
            <td>Name:</td>
            <td><form:input path="name" required="true"/></td>
        </tr>
        <tr>
            <td>Course:</td>
            <td><form:input path="course" required="true"/></td>
        </tr>
        <tr>
            <td>Hibernate:</td>
            <td><form:input path="hibernate" type="number" required="true"/></td>
        </tr>
        <tr>
            <td>Spring:</td>
            <td><form:input path="spring" type="number" required="true"/></td>
        </tr>
        <tr>
            <td>SpringBoot:</td>
            <td><form:input path="springBoot" type="number" required="true"/></td>
        </tr>
        <tr>
            <td></td>
            <td><input type="submit" value="editandsave"/></td>
        </tr>
    </table>
</form:form>
</body>
