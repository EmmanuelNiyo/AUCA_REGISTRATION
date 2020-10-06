<%-- 
    Document   : Student_Reg_Page
    Created on : Aug 18, 2020, 1:53:57 PM
    Author     : kpeng Emmanuel
--%>

<%@page import="domain.Student"%>
<%@page import="java.util.List"%>
<%@page import="domain.Department"%>
<%@page import="dao.Activities"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <link rel="stylesheet" href="./bootstrap-4.4.1-dist/css/bootstrap.min.css">
        <script src="./bootstrap-4.4.1-dist/js/bootstrap.min.js"></script>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title> Registration Form Page</title>
    </head>
    <body>
        <div class="card shadow" style="background-color: graytext">
            <u><h4><b> Registration form</b></h4></u>

        </div><br>

        <div class="card shadow">
            <p><br> Here you have to complete all the blank space.... just put all the information needed please.</p>

        </div><br><br>





        <form action="SaveStudent" method="POST">

            <table border="0">

                <tbody>
                <div class="card shadow">

                    <tr>
                        <td>Department</td>



                        <td>
                            <select name="department">
                                <% for (Department dep : new Activities<Department>().findAllStudent(Department.class)) {%>
                                <option value="<%= dep.getId()%>"><%= dep.getDepartmentName()%></option>
                                <%}%>
                            </select>
                        </td>
                    </tr>

                    <tr>
                        <td>First_Name</td>
                        <td> <input type="text" name="firstname" value="" /> </td>

                    </tr>
                    <tr>
                        <td>Other_Name</td>
                        <td> <input type="text" name="othername" value="" /> </td>

                    </tr>


                    <tr>
                        <td>Date Of Birth</td>
                        <td> <input type="date" name="date" value="" /> </td>

                    </tr>

                    <tr>
                        <td>Academic_Program</td>
                        <td>
                            <select name="academic">
                                <option>Day</option>
                                <option>Evening</option>
                                <option>In_service</option>

                            </select>
                        </td>
                    </tr>
                    <tr>
                        <td>Health_Status</td>
                        <td>
                            <select name="health">
                                <option>Excellent</option>
                                <option>Good</option>
                                <option>Poor</option>

                            </select>
                        </td>

                    </tr>
                    <tr>
                        <td>Payment_Mode</td>
                        <td>
                            <select name="payment">
                                <option>Check</option>
                                <option>VisaCard</option>
                                <option>Cash</option>
                                <option>OtherMode</option>
                            </select>
                        </td>
                    </tr>
                    <tr>
                        <td>GENDER</td>
                        <td>
                            <select name="gender">
                                <option>MALE</option>
                                <option>FEMALE</option>

                            </select>
                        </td>

                    </tr>

                    <tr>
                        <td>Email</td>
                        <td> <input type="text" name="email" value="" /> </td>

                    </tr>

                    <tr>
                        <td>National_Id</td>
                        <td> <input type="text" name="national" value="" /> </td>
                    </tr>
                <!--</div>-->
                <tr>
                    <td>
                        <input class="btn btn-success" type="submit" value="Register" name="Register Here:" />
                    </td>

                    <td>
                        <input class="btn btn-primary" type="  "  value="Update" name=" update here" />

                    </td>

                    <td>
                        <input class="btn btn-danger" type="  "  value="delete" name=" delete here" />

                    </td>
                </tr><br>
                <tbody>

                    <%
                        Activities<Student> dao = new Activities<>();
                        List<Student> st = dao.findAllStudent(Student.class);

                        for (Student comp : st) {


                    %>
                    <%
                        }
                    %>

                </tbody>
                </tbody>
            </table>

            <div class="jumbotron text-center">
                <marque> <h15> thanks  </h15></marque>

            </div>
        </form>

    </body>
</html>
