package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class index_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("        <title>JSP Page</title>\n");
      out.write("    </head>\n");
      out.write("    <body stlye=\"background-color:fuchsia;\">\n");
      out.write("        <h1>John Leeroy A. Gadiane</h1>\n");
      out.write("        <h2>BSCS - 3</h2>\n");
      out.write("        <h2>USJ-R</h2>\n");
      out.write("        <h2>About Myself:</h2>\n");
      out.write("        <h3 style=\"margin-left: 30px;\">I am a student taking up Bachelor of Science in Computer Science. I am also a house representative of the USJ-R Supreme\n");
      out.write("        Student Council.</h3>\n");
      out.write("        <h2>What I know about OOP:</h2>\n");
      out.write("        <h3 style=\"margin-left: 30px;\">OOP from the name itself uses objects. I have only experience OOP in Java. \n");
      out.write("        OOP is a programming language model organized around objects rather than \"actions\" and data rather than logic.</h3>\n");
      out.write("        <h2>What are my expectations:</h2>\n");
      out.write("        <ul>\n");
      out.write("            <li><h3>To learn more about J2EE</h3></li>\n");
      out.write("            <li><h3>To be able to apply my learnings in J2EE</h3></li>\n");
      out.write("            <li><h3>To successfully comply all the requirements given by Alliance</h3></li>\n");
      out.write("        </ul>\n");
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
