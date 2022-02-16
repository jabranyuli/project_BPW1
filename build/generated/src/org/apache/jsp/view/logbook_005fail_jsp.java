package org.apache.jsp.view;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.sql.*;

public final class logbook_005fail_jsp extends org.apache.jasper.runtime.HttpJspBase
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

    String host = "jdbc:mysql://localhost:3306/2tib_ganjil";
    String id = (String) session.getAttribute("id_logbook");
    String username = request.getParameter("username");
    String id_logbook = request.getParameter("id_logbook");
    try {
        Class.forName("com.mysql.jdbc.Driver");
        Connection conn = DriverManager.getConnection(host, "root", "");
        String query = "select*from logbook";
        Statement stmt = conn.createStatement();
        ResultSet rs = stmt.executeQuery(query);

      out.write("\n");
      out.write("<html lang=\"en\">\n");
      out.write("    <head>\n");
      out.write("        <!-- Required meta tags-->\n");
      out.write("        <meta charset=\"UTF-8\">\n");
      out.write("        <meta name=\"viewport\" content=\"width=device-width, initial-scale=1, shrink-to-fit=no\">\n");
      out.write("        <meta name=\"description\" content=\"au theme template\">\n");
      out.write("        <meta name=\"author\" content=\"Hau Nguyen\">\n");
      out.write("        <meta name=\"keywords\" content=\"au theme template\">\n");
      out.write("\n");
      out.write("        <!-- Title Page-->\n");
      out.write("        <title>Fasilitas</title>\n");
      out.write("        <!-- Fontfaces CSS-->\n");
      out.write("        <link href=\"../css/font-face.css\" rel=\"stylesheet\" media=\"all\">\n");
      out.write("        <link href=\"../vendor/font-awesome-4.7/css/font-awesome.min.css\" rel=\"stylesheet\" media=\"all\">\n");
      out.write("        <link href=\"../vendor/font-awesome-5/css/fontawesome-all.min.css\" rel=\"stylesheet\" media=\"all\">\n");
      out.write("        <link href=\"../vendor/mdi-font/css/material-design-iconic-font.min.css\" rel=\"stylesheet\" media=\"all\">\n");
      out.write("\n");
      out.write("        <!-- Bootstrap CSS-->\n");
      out.write("        <link href=\"../vendor/bootstrap-4.1/bootstrap.min.css\" rel=\"stylesheet\" media=\"all\">\n");
      out.write("\n");
      out.write("        <!-- Vendor CSS-->\n");
      out.write("        <link href=\"../vendor/animsition/animsition.min.css\" rel=\"stylesheet\" media=\"all\">\n");
      out.write("        <link href=\"../vendor/bootstrap-progressbar/bootstrap-progressbar-3.3.4.min.css\" rel=\"stylesheet\" media=\"all\">\n");
      out.write("        <link href=\"../vendor/wow/animate.css\" rel=\"stylesheet\" media=\"all\">\n");
      out.write("        <link href=\"../vendor/css-hamburgers/hamburgers.min.css\" rel=\"stylesheet\" media=\"all\">\n");
      out.write("        <link href=\"../vendor/slick/slick.css\" rel=\"stylesheet\" media=\"all\">\n");
      out.write("        <link href=\"../vendor/select2/select2.min.css\" rel=\"stylesheet\" media=\"all\">\n");
      out.write("        <link href=\"../vendor/perfect-scrollbar/perfect-scrollbar.css\" rel=\"stylesheet\" media=\"all\">\n");
      out.write("\n");
      out.write("        <!-- Main CSS-->\n");
      out.write("        <link href=\"../css/theme.css\" rel=\"stylesheet\" media=\"all\">\n");
      out.write("    </head>\n");
      out.write("    <body class=\"animsition\">\n");
      out.write("        <div class=\"page-wrapper\">\n");
      out.write("            <!-- MENU SIDEBAR-->\n");
      out.write("\n");
      out.write("            <aside class=\"menu-sidebar2\">\n");
      out.write("                <div class=\"logo\">\n");
      out.write("                    <a href=\"#\">\n");
      out.write("                        <img src=\"../asset/SIMLProjext.png\" width=\"200\" height=\"140\"/>\n");
      out.write("                    </a>\n");
      out.write("                </div>\n");
      out.write("                <div class=\"menu-sidebar2__content js-scrollbar1\">\n");
      out.write("                    <div class=\"account2\">\n");
      out.write("                        <h4 class=\"name\">Selamat datang</h4>\n");
      out.write("                        <a href=\"UIlogin.jsp\">Sign Out</a>\n");
      out.write("                    </div>\n");
      out.write("                    <nav class=\"navbar-sidebar2\">\n");
      out.write("                        <ul class=\"list-unstyled navbar__list\">\n");
      out.write("                            <li>\n");
      out.write("                                <a class=\"js-arrow\" href=\"#.jsp\">\n");
      out.write("                                    <i class=\"fas fa-tachometer-alt\"></i>Beranda\n");
      out.write("                                </a>\n");
      out.write("                            </li>\n");
      out.write("                            <li>\n");
      out.write("                                <a  href=\"peminjaman_ail.jsp\">\n");
      out.write("                                    <i class=\"fas  fa-chart-bar\"></i>Peminjaman\n");
      out.write("                                </a>                               \n");
      out.write("                            </li>\n");
      out.write("                            <li>\n");
      out.write("                                <a  href=\"penjadwalan_ail.jsp\">\n");
      out.write("                                    <i class=\"fas  fa-chart-bar\"></i>Penjadwalan Ruangan\n");
      out.write("                                </a>                               \n");
      out.write("                            </li>\n");
      out.write("                            <li>\n");
      out.write("                                <a  href=\"logbook_ail.jsp\">\n");
      out.write("                                    <i class=\"fas  fa-chart-bar\"></i>Logbook\n");
      out.write("                                </a>                               \n");
      out.write("                            </li>\n");
      out.write("                            <li>\n");
      out.write("                                <a  href=\"kontak.jsp\">\n");
      out.write("                                    <i class=\"fas  fa-chart-bar\"></i>Kontak\n");
      out.write("                                </a>                        \n");
      out.write("                            </li>\n");
      out.write("                        </ul>\n");
      out.write("                    </nav>\n");
      out.write("                </div>\n");
      out.write("            </aside>\n");
      out.write("            <!-- END MENU SIDEBAR-->\n");
      out.write("\n");
      out.write("            <!-- PAGE CONTAINER-->\n");
      out.write("            <div class=\"page-container2\">\n");
      out.write("                <!-- HEADER DESKTOP-->\n");
      out.write("                <header class=\"header-desktop2\">\n");
      out.write("                    <div class=\"section__content section__content--p30\">\n");
      out.write("                        <div class=\"container-fluid\">\n");
      out.write("                            <div class=\"header-wrap2\">\n");
      out.write("                                <div class=\"logo d-block d-lg-none\">\n");
      out.write("                                    <a href=\"#\">\n");
      out.write("                                        <img src=\"../images/icon/logo-white.png\"/>\n");
      out.write("                                    </a>\n");
      out.write("                                </div>\n");
      out.write("\n");
      out.write("                                </header>\n");
      out.write("                                <aside class=\"menu-sidebar2 js-right-sidebar d-block d-lg-none\">\n");
      out.write("                                    <div class=\"logo\">\n");
      out.write("                                        <a href=\"#\">\n");
      out.write("                                            <img src=\"../images/icon/logo-white.png\" alt=\"Cool Admin\" />\n");
      out.write("                                        </a>\n");
      out.write("                                    </div>\n");
      out.write("                                    <div class=\"menu-sidebar2__content js-scrollbar2\">\n");
      out.write("                                        <div class=\"account2\">\n");
      out.write("                                            <div class=\"image img-cir img-120\">\n");
      out.write("                                                <img src=\"../images/icon/avatar-big-01.jpg\" alt=\"John Doe\" />\n");
      out.write("                                            </div>\n");
      out.write("                                            <h4 class=\"name\">john doe</h4>\n");
      out.write("                                            <a href=\"../control/logout.jsp\">Sign out</a>\n");
      out.write("                                        </div>\n");
      out.write("                                        <nav class=\"navbar-sidebar2\">\n");
      out.write("                                            <ul class=\"list-unstyled navbar__list\">\n");
      out.write("                                                <li class=\"active has-sub\">\n");
      out.write("                                                    <a class=\"js-arrow\" href=\"#\">\n");
      out.write("                                                        <i class=\"fas fa-tachometer-alt\"></i>Dashboard\n");
      out.write("                                                        <span class=\"arrow\">\n");
      out.write("                                                            <i class=\"fas fa-angle-down\"></i>\n");
      out.write("                                                        </span>\n");
      out.write("                                                    </a>\n");
      out.write("\n");
      out.write("                                                </li>\n");
      out.write("                                            </ul>\n");
      out.write("                                        </nav>\n");
      out.write("                                    </div>\n");
      out.write("                                </aside>\n");
      out.write("                                <!-- END HEADER DESKTOP-->\n");
      out.write("\n");
      out.write("                                <!-- BREADCRUMB-->\n");
      out.write("                                <section class=\"au-breadcrumb m-t-75\">\n");
      out.write("                                    <div class=\"section__content section__content--p30\">\n");
      out.write("                                        <div class=\"container-fluid\">\n");
      out.write("                                            <div class=\"row\">\n");
      out.write("                                                <div class=\"col-md-12\">\n");
      out.write("                                                    <div class=\"au-breadcrumb-content\">\n");
      out.write("                                                        <div class=\"au-breadcrumb-left\">\n");
      out.write("                                                            <span class=\"au-breadcrumb-span\">You are here:</span>\n");
      out.write("                                                            <ul class=\"list-unstyled list-inline au-breadcrumb__list\">\n");
      out.write("                                                                <li class=\"list-inline-item active\">\n");
      out.write("                                                                    <a href=\"#\">Home</a>\n");
      out.write("                                                                </li>\n");
      out.write("                                                                <li class=\"list-inline-item seprate\">\n");
      out.write("                                                                    <span>/</span>\n");
      out.write("                                                                </li>\n");
      out.write("                                                                <li class=\"list-inline-item\">Peminjaman</li>\n");
      out.write("                                                            </ul>\n");
      out.write("                                                        </div>\n");
      out.write("\n");
      out.write("                                                    </div>\n");
      out.write("                                                </div>\n");
      out.write("                                            </div>\n");
      out.write("                                        </div>\n");
      out.write("                                    </div>\n");
      out.write("                                </section>\n");
      out.write("                                <!-- END BREADCRUMB-->\n");
      out.write("\n");
      out.write("                                <!-- MAIN CONTENT-->\n");
      out.write("                                <div class=\"main-content\">\n");
      out.write("                                    <div class=\"section__content section__content--p30\">\n");
      out.write("                                        <div class=\"container-fluid\">                      \n");
      out.write("                                            <div class=\"row\">     \n");
      out.write("                                                <div class=\"col-lg-12\" style=\"margin-top: 35px;\">\n");
      out.write("                                                    <h3 class=\"d-flex justify-content-center\">\n");
      out.write("                                                        Logbook Lab PCR\n");
      out.write("                                                    </h3>     \n");
      out.write("                                                    <hr>\n");
      out.write("                                                </div>\n");
      out.write("                                            </div>\n");
      out.write("\n");
      out.write("                                            <div class=\"row justify-content-center mb-5\">                                \n");
      out.write("                                                <h4>Daftar Logbook</h4>\n");
      out.write("                                                \n");
      out.write("                                                <div class=\"col-lg-12 mt-3\">\n");
      out.write("                                                    <div class=\"table-responsive table--no-card m-b-30\">\n");
      out.write("                                                        <table class=\"table table-borderless table-striped table-earning\">\n");
      out.write("                                                            <thead>\n");
      out.write("                                                                <tr>\n");
      out.write("                                                                    <th>No</th>\n");
      out.write("                                                                    <th>ID Logbook</th>\n");
      out.write("                                                                    <th>Username</th>\n");
      out.write("                                                                    <th>ID Peminjaman</th>\n");
      out.write("                                                                    <th>No PC</th>\n");
      out.write("                                                                    <th>Keterangan</th>\n");
      out.write("                                                                    <th>Status</th>\n");
      out.write("                                                                    <th>Aksi</th>\n");
      out.write("                                                                    \n");
      out.write("                                                                </tr>\n");
      out.write("                                                            </thead>\n");
      out.write("                                                            \n");
      out.write("                                                            <tbody>\n");
      out.write("                                                                ");

                                                                    int i = 1;
                                                                    while (rs.next()) {
      out.write("\n");
      out.write("                                                                <tr>\n");
      out.write("                                                                    <td>");
      out.print( i);
      out.write("</td>\n");
      out.write("                                                                    <td>");
      out.print(rs.getString("id_logbook"));
      out.write("</td>\n");
      out.write("                                                                    <td>");
      out.print(rs.getString("username"));
      out.write("</td>                           \n");
      out.write("                                                                    <td>");
      out.print(rs.getString("id_peminjaman"));
      out.write("</td>\n");
      out.write("                                                                    <td>");
      out.print(rs.getString("no_pc"));
      out.write("</td>\n");
      out.write("                                                                    <td>");
      out.print(rs.getString("keterangan"));
      out.write("</td>\n");
      out.write("                                                                    <td>");
      out.print(rs.getString("status"));
      out.write("</td>\n");
      out.write("                                                                    <td>\n");
      out.write("                                                                        <a href=\"../view/edit_logbook.jsp?id_logbook=");
      out.print(rs.getInt("id_logbook"));
      out.write("\">Edit</a>\n");
      out.write("                                                                    </td>\n");
      out.write("                                                                   \n");
      out.write("                                                                    \n");
      out.write("                                                                </tr>\n");
      out.write("                                                                ");
 i++;
                                                                    } 
      out.write("\n");
      out.write("                                                            </tbody>\n");
      out.write("                                                            ");

                                                                    rs.close();
                                                                    stmt.close();
                                                                    conn.close();
                                                                } catch (SQLException ex) {
                                                                    out.print("Gagal Koneksi");
                                                                } catch (Exception ex) {
                                                                    out.print(ex.getMessage());
                                                                }
                                                            
      out.write("\n");
      out.write("                                                        </table>\n");
      out.write("                                                           \n");
      out.write("                                                        \n");
      out.write("                                                    </div>\n");
      out.write("                                                </div>\n");
      out.write("                                            </div>\n");
      out.write("                                        </div>\n");
      out.write("                                    </div>\n");
      out.write("                                </div>\n");
      out.write("                                <!-- END MAIN CONTENT-->\n");
      out.write("                                <!-- END PAGE CONTAINER-->\n");
      out.write("                            </div>\n");
      out.write("                        </div>\n");
      out.write("                        <section>\n");
      out.write("                            <div class=\"container-fluid\">\n");
      out.write("                                <div class=\"row\">\n");
      out.write("                                    <div class=\"col-md-12\">\n");
      out.write("                                        <div class=\"copyright\">\n");
      out.write("                                            <p>Copyright © 2018 Colorlib. All rights reserved. Template by <a href=\"https://colorlib.com\">Colorlib</a>.</p>\n");
      out.write("                                        </div>\n");
      out.write("                                    </div>\n");
      out.write("                                </div>\n");
      out.write("                            </div>\n");
      out.write("                        </section>\n");
      out.write("                        <!-- Jquery JS-->\n");
      out.write("                        <script src=\"../vendor/jquery-3.2.1.min.js\"></script>\n");
      out.write("                        <!-- Bootstrap JS-->\n");
      out.write("                        <script src=\"../vendor/bootstrap-4.1/popper.min.js\"></script>\n");
      out.write("                        <script src=\"../vendor/bootstrap-4.1/bootstrap.min.js\"></script>\n");
      out.write("                        <!-- Vendor JS       -->\n");
      out.write("                        <script src=\"../vendor/slick/slick.min.js\">\n");
      out.write("                        </script>\n");
      out.write("                        <script src=\"../vendor/wow/wow.min.js\"></script>\n");
      out.write("                        <script src=\"../vendor/animsition/animsition.min.js\"></script>\n");
      out.write("                        <script src=\"../vendor/bootstrap-progressbar/bootstrap-progressbar.min.js\">\n");
      out.write("                        </script>\n");
      out.write("                        <script src=\"../vendor/counter-up/jquery.waypoints.min.js\"></script>\n");
      out.write("                        <script src=\"../vendor/counter-up/jquery.counterup.min.js\">\n");
      out.write("                        </script>\n");
      out.write("                        <script src=\"../vendor/circle-progress/circle-progress.min.js\"></script>\n");
      out.write("                        <script src=\"../vendor/perfect-scrollbar/perfect-scrollbar.js\"></script>\n");
      out.write("                        <script src=\"../vendor/chartjs/Chart.bundle.min.js\"></script>\n");
      out.write("                        <script src=\"../vendor/select2/select2.min.js\">\n");
      out.write("                        </script>\n");
      out.write("                        <!-- Main JS-->\n");
      out.write("                        <script src=\"../js/main.js\"></script>\n");
      out.write("                        </body>\n");
      out.write("                        </html>\n");
      out.write("                        <!-- end document-->\n");
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
