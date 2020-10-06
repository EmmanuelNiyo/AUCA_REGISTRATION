<%-- 
    Document   : Update_Page
    Created on : Sep 21, 2020, 9:32:17 AM
    Author     : kpeng Emmanuel
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page11</title>
    </head>
    <body>
        <h1>Hello World!</h1>
        
        <form method="POST" action=" ">
              
        <table border="0">
              
                <tbody>
                    <tr>
                        <td>DEPARTMENT</td>
                        <td><input type="text" name="department" placeholder="department" value="<%=request.getParameter("department")%>"></td>
                       
                    </tr>
                    <tr>
                        <td>FIRSTNAME</td>
                        <td><input type="text" name="firstname"placeholder="firstname"value="<%=request.getParameter("firstname")%>"></td>
                        
                    </tr>
                    
                     <tr>
                        <td>OTHERNAME</td>
                        <td><input type="text" name="othername"placeholder="othername"value="<%=request.getParameter("othername")%>"></td>
                        
                    </tr>
                    
                     <tr>
                        <td>DATE</td>
                        <td><input type="date" name="date"placeholder="date"value="<%=request.getParameter("date")%>"></td>
                        
                     </tr>
                    
                    <tr>
                        <td>ACADEMIC PROGRAM</td>
                        <td>
                            <select name="academic">
                                <option>Day</option>
                                <option>Evening</option>
                                <option>In_service</option>

                            </select>
                        </td>
                      
                        
                    </tr>
                    
                     <tr>
                        <td>HEALTH STATUS</td>
                        <td>
                            <select name="health">
                                <option>Excellent</option>
                                <option>Good</option>
                                <option>Poor</option>

                            </select>
                        </td>
                        
                        
                    </tr>
                    
                     <tr>
                        <td>PAYMENT MODE</td>
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
                        <td>EMAIL</td>
                        <td><input type="text" name="email"placeholder="email"value="<%=request.getParameter("email")%>"></td>
                        
                     </tr>
                     
                     <tr>
                        <td>NATIONAL ID</td>
                        <td><input type="text" name="national"placeholder="national"value="<%=request.getParameter("national")%>"></td>
                        
                     </tr>
                                
                    <tr>
                        <td><a href="Servlet_Update?department=<%=request.getParameter("department")%>&firstname=<%=request.getParameter("firstname")%>&othername=<%=request.getParameter("othername")%>&date=<%=request.getParameter("date")%>&email=<%=request.getParameter("email")%>&national=<%=request.getParameter("national")%> "></a></td>
                        <td><input class="btn btn-primary " type="Submit" value="Submit"</td>
                        
                    </tr>
                    
                    
                    
                </tbody>
            </table>
        </form>

    </body>
</html>
