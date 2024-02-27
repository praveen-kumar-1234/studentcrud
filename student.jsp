<body>
<h1 style="color:green">New Student Marks Register here</h1>
<table>
    <form action="/register">
        <tr>
            <td>Student Roll No</td>
            <td><input type="number" name="stdRollNo"></td>
        </tr>
        <tr>
            <td>Student Name:</td>
            <td><input type="text" name="name" required/></td>
        </tr>
        <tr>
            <td>Course:</td>
            <td><input type="text" name="course" required/></td>
        </tr>
        <tr>
            <td>Hibernate</td>
            <td><input type="number" name="hibernate" required/></td>
        </tr>
        <tr>
            <td>Spring:</td>
            <td><input type="number" name="spring" required/></td>
        </tr>
        <tr>
            <td>SpringBoot:</td>
            <td><input type="number" name="SpringBoot" required/></td>
        </tr>
        <tr>
            <td><input type="submit" value="saveMarks"/></td>
        </tr>
    </form>
</table>
</body>