package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import domain.Student;
import java.util.List;
import domain.Department;
import dao.Activities;

public final class Student_005fReg_005fPage_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List<String> _jspx_dependants;

  private org.glassfish.jsp.api.ResourceInjector _jspx_resourceInjector;

  public java.util.List<String> getDependants() {
    return _jspx_dependants;
  }

  public void _jspService(HttpServletRequest request, HttpServletResponse response)
        throws java.io.IOException, ServletException {

    PageContext pageContext = null;
    HttpSession session = null;
    ServletContext application = null;
    ServletConfig config = null;
    JspWriter out = null;
    Object page = this;
    JspWriter _jspx_out = null;
    PageContext _jspx_page_context = null;

    try {
      response.setContentType("text/html;charset=UTF-8");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;
      _jspx_resourceInjector = (org.glassfish.jsp.api.ResourceInjector) application.getAttribute("com.sun.appserv.jsp.resource.injector");

      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        <link rel=\"stylesheet\" href=\"./bootstrap-4.4.1-dist/css/bootstrap.min.css\">\n");
      out.write("        <script src=\"./bootstrap-4.4.1-dist/js/bootstrap.min.js\"></script>\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("        <title> Registration Form Page</title>\n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("        <div class=\"card shadow\" style=\"background-color: graytext\">\n");
      out.write("            <u><h4><b> Registration form</b></h4></u>\n");
      out.write("\n");
      out.write("        </div><br>\n");
      out.write("\n");
      out.write("        <div class=\"card shadow\">\n");
      out.write("            <p><br> Here you have to complete all the blank space.... just put all the information needed please.</p>\n");
      out.write("\n");
      out.write("        </div><br><br>\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("        <form action=\"SaveStudent\" method=\"POST\">\n");
      out.write("\n");
      out.write("            <table border=\"0\">\n");
      out.write("\n");
      out.write("                <tbody>\n");
      out.write("                <div class=\"card shadow\">\n");
      out.write("\n");
      out.write("                    <tr>\n");
      out.write("                        <td>Department</td>\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("                        <td>\n");
      out.write("                            <select name=\"department\">\n");
      out.write("                                ");
 for (Department dep : new Activities<Department>().findAllStudent(Department.class)) {
      out.write("\n");
      out.write("                                <option value=\"");
      out.print( dep.getId());
      out.write('"');
      out.write('>');
      out.print( dep.getDepartmentName());
      out.write("</option>\n");
      out.write("                                ");
}
      out.write("\n");
      out.write("                            </select>\n");
      out.write("                        </td>\n");
      out.write("                    </tr>\n");
      out.write("\n");
      out.write("                    <tr>\n");
      out.write("                        <td>First_Name</td>\n");
      out.write("                        <td> <input type=\"text\" name=\"firstname\" value=\"\" /> </td>\n");
      out.write("\n");
      out.write("                    </tr>\n");
      out.write("                    <tr>\n");
      out.write("                        <td>Other_Name</td>\n");
      out.write("                        <td> <input type=\"text\" name=\"othername\" value=\"\" /> </td>\n");
      out.write("\n");
      out.write("                    </tr>\n");
      out.write("\n");
      out.write("\n");
      out.write("                    <tr>\n");
      out.write("                        <td>Date Of Birth</td>\n");
      out.write("                        <td> <input type=\"date\" name=\"date\" value=\"\" /> </td>\n");
      out.write("\n");
      out.write("                    </tr>\n");
      out.write("\n");
      out.write("                    <tr>\n");
      out.write("                        <td>Academic_Program</td>\n");
      out.write("                        <td>\n");
      out.write("                            <select name=\"academic\">\n");
      out.write("                                <option>Day</option>\n");
      out.write("                                <option>Evening</option>\n");
      out.write("                                <option>In_service</option>\n");
      out.write("\n");
      out.write("                            </select>\n");
      out.write("                        </td>\n");
      out.write("                    </tr>\n");
      out.write("                    <tr>\n");
      out.write("                        <td>Health_Status</td>\n");
      out.write("                        <td>\n");
      out.write("                            <select name=\"health\">\n");
      out.write("                                <option>Excellent</option>\n");
      out.write("                                <option>Good</option>\n");
      out.write("                                <option>Poor</option>\n");
      out.write("\n");
      out.write("                            </select>\n");
      out.write("                        </td>\n");
      out.write("\n");
      out.write("                    </tr>\n");
      out.write("                    <tr>\n");
      out.write("                        <td>Payment_Mode</td>\n");
      out.write("                        <td>\n");
      out.write("                            <select name=\"payment\">\n");
      out.write("                                <option>Check</option>\n");
      out.write("                                <option>VisaCard</option>\n");
      out.write("                                <option>Cash</option>\n");
      out.write("                                <option>OtherMode</option>\n");
      out.write("                            </select>\n");
      out.write("                        </td>\n");
      out.write("                    </tr>\n");
      out.write("                    <tr>\n");
      out.write("                        <td>GENDER</td>\n");
      out.write("                        <td>\n");
      out.write("                            <select name=\"gender\">\n");
      out.write("                                <option>MALE</option>\n");
      out.write("                                <option>FEMALE</option>\n");
      out.write("\n");
      out.write("                            </select>\n");
      out.write("                        </td>\n");
      out.write("\n");
      out.write("                    </tr>\n");
      out.write("\n");
      out.write("                    <tr>\n");
      out.write("                        <td>Email</td>\n");
      out.write("                        <td> <input type=\"text\" name=\"email\" value=\"\" /> </td>\n");
      out.write("\n");
      out.write("                    </tr>\n");
      out.write("\n");
      out.write("                    <tr>\n");
      out.write("                        <td>National_Id</td>\n");
      out.write("                        <td> <input type=\"text\" name=\"national\" value=\"\" /> </td>\n");
      out.write("                    </tr>\n");
      out.write("                <!--</div>-->\n");
      out.write("                <tr>\n");
      out.write("                    <td>\n");
      out.write("                        <input class=\"btn btn-success\" type=\"submit\" value=\"Register\" name=\"Register Here:\" />\n");
      out.write("                    </td>\n");
      out.write("\n");
      out.write("                    <td>\n");
      out.write("                        <input class=\"btn btn-primary\" type=\"  \"  value=\"Update\" name=\" update here\" />\n");
      out.write("\n");
      out.write("                    </td>\n");
      out.write("\n");
      out.write("                    <td>\n");
      out.write("                        <input class=\"btn btn-danger\" type=\"  \"  value=\"delete\" name=\" delete here\" />\n");
      out.write("\n");
      out.write("                    </td>\n");
      out.write("                </tr><br>\n");
      out.write("                <tbody>\n");
      out.write("\n");
      out.write("                    ");

                        Activities<Student> dao = new Activities<>();
                        List<Student> st = dao.findAllStudent(Student.class);

                        for (Student comp : st) {


                    
      out.write("\n");
      out.write("                    ");

                        }
                    
      out.write("\n");
      out.write("\n");
      out.write("                </tbody>\n");
      out.write("                </tbody>\n");
      out.write("            </table>\n");
      out.write("\n");
      out.write("            <div class=\"jumbotron text-center\">\n");
      out.write("                <marque> <h15> thanks  </h15></marque>\n");
      out.write("\n");
      out.write("            </div>\n");
      out.write("        </form>\n");
      out.write("\n");
      out.write("    </body>\n");
      out.write("</html>\n");
    } catch (Throwable t) {
      if (!(t instanceof SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          out.clearBuffer();
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
        else throw new ServletException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }
}
