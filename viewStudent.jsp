<%@ page contentType="text/html;"%>
<%@page import="com.web.model.Student"%>
<%@ page import="java.util.List" %>
<h1>View All Student Result Table</h1><p></p>
<a href="/">home</a>
<table border="5">
    <tr>
        <th>ROLL NUMBER</th>
        <th>NAME</th>
        <th>COURSE</th>
        <th>HIBERNATE</th>
        <th>SPRING</th>
        <th>SPRINGBOOT</th>
        <th>TOTAL</th>
        <th>PERCENTAGE</th>
        <th>GRADE</th>
        <th>RESULT</th>
        <th>EDIT</th>
        <th>DELETE</th>
    </tr>
    <%
        List<Student> studentList = (List<Student>) request.getAttribute("students");
        for (Student student : studentList) {
    %>


        <tr>
            <td><%=student.getStdRollNo()%></td>
            <td><%=student.getName()%></td>
            <td><%=student.getCourse()%></td>
            <td><%=student.getHibernate()%></td>
            <td><%=student.getSpring()%></td>
            <td><%=student.getSpringBoot()%></td>
            <td><%=student.getTotal()%></td>
            <td><%=student.getPercentage()%></td>
            <td><%=student.getGrade()%></td>
            <td><%=student.getResult()%></td>
            <td>
                <a href="/edit/<%=student.getStdRollNo()%>">Edit</a>
            </td>
            <td>
                <a href="/delete/<%=student.getStdRollNo()%>">Delete</a>
            </td>
        </tr>
    <% } %>
</table>
