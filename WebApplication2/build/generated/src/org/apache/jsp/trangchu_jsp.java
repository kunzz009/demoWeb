package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class trangchu_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List<String> _jspx_dependants;

  static {
    _jspx_dependants = new java.util.ArrayList<String>(2);
    _jspx_dependants.add("/header.jsp");
    _jspx_dependants.add("/footer.jsp");
  }

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
      response.setContentType("text/html");
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
      out.write("        <link href=\"menu.css\" rel=\"stylesheet\" type=\"text/css\"/>\n");
      out.write("    </head>\n");
      out.write("    <style>\n");
      out.write("       \n");
      out.write("    </style>\n");
      out.write("    <body>\n");
      out.write("        <div id=\"main\">\n");
      out.write("            <div id=\"header\">\n");
      out.write("                <div id=\"banner\">\n");
      out.write("                    \n");
      out.write("                </div>\n");
      out.write("                <div class=\"wrapper\">\n");
      out.write("                    <div class=\"menu\">\n");
      out.write("                        <ul>\n");
      out.write("                            <li><a href=\"trangchu\">Trang chủ</a></li>\n");
      out.write("                            <li><a href=\"laptopDell\">Laptop Dell</a>\n");
      out.write("                                <ul>\n");
      out.write("                                    <li><a href=\"#\">Dell Inspirion</a></li>\n");
      out.write("                                    <li><a href=\"#\">Dell Latitude</a></li>\n");
      out.write("                                    <li><a href=\"#\">Dell  Precision</a></li>\n");
      out.write("                                    <li><a href=\"#\">Dell Vostro</a></li>\n");
      out.write("                                    <li><a href=\"#\">Dell XPS</a></li>\n");
      out.write("                                </ul>\n");
      out.write("                            </li>\n");
      out.write("                            <li><a href=\"laptopHP\">Laptop HP</a>\n");
      out.write("                                <ul>\n");
      out.write("                                    <li><a href=\"#\">HP Elitebook</a></li>\n");
      out.write("                                    <li><a href=\"#\">HP Probook</a></li>\n");
      out.write("                                    \n");
      out.write("                                </ul>\n");
      out.write("                            </li>\n");
      out.write("                            <li><a href=\"laptopLenovo\">Laptop Lenovo ThinkPad</a></li>\n");
      out.write("                            <li><a href=\"lienhe\">Liên hệ</a></li>\n");
      out.write("                            <li><a href=\"lienhe\">Giỏ hàng</a></li>\n");
      out.write("                            <li><a href=\"#\"><img src=\"image/user.jpg\" height=\"30px\" width=\"30px\"/></a>\n");
      out.write("                                <ul>\n");
      out.write("                                    <li><a href=\"dangnhap\">Đăng nhập</a></li>\n");
      out.write("                                    <li><a href=\"dangky\">Đăng ký</a></li>\n");
      out.write("                                </ul>\n");
      out.write("                            </li>\n");
      out.write("                        </ul>\n");
      out.write("                    \n");
      out.write("                    </div>\n");
      out.write("                </div>\n");
      out.write("            </div>\n");
      out.write("            <div id=\"content\">\n");
      out.write("                ");
      out.write("\n");
      out.write("Day la Trang Chu\n");
      out.write("\n");
      out.write("</div>\n");
      out.write("<div id=\"footer\"></div>\n");
      out.write("</div>\n");
      out.write("</body>\n");
      out.write("</html>\n");
      out.write("\n");
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
