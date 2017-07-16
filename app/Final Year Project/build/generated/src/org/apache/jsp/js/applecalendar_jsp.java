package org.apache.jsp.js;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class applecalendar_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("<head>\n");
      out.write("<meta charset=\"utf-8\">\n");
      out.write("<meta http-equiv=\"X-UA-Compatible\" content=\"IE=edge,chrome=1\">\n");
      out.write("<meta name=\"viewport\" content=\"width=device-width, initial-scale=1\">\n");
      out.write("<title>jQuery Monthly Plugin Examples</title>\n");
      out.write("<link href=\"http://cdnjs.cloudflare.com/ajax/libs/normalize/3.0.1/normalize.css\" rel=\"stylesheet\" type=\"text/css\">\n");
      out.write("<link href=\"css/monthly.css\" rel=\"stylesheet\" type=\"text/css\">\n");
      out.write("<link href=\"http://www.jqueryscript.net/css/jquerysctipttop.css\" rel=\"stylesheet\" type=\"text/css\">\n");
      out.write("</head>\n");
      out.write("\n");
      out.write("<body><div id=\"jquery-script-menu\">\n");
      out.write("<div class=\"jquery-script-center\">\n");
      out.write("<ul>\n");
      out.write("<li><a href=\"http://www.jqueryscript.net/time-clock/Responsive-Event-Calendar-Date-Picker-jQuery-Plugin-Monthly.html\">Download This Plugin</a></li>\n");
      out.write("<li><a href=\"http://www.jqueryscript.net/\">Back To jQueryScript.Net</a></li>\n");
      out.write("</ul>\n");
      out.write("<div class=\"jquery-script-ads\"><script type=\"text/javascript\"><!--\n");
      out.write("google_ad_client = \"ca-pub-2783044520727903\";\n");
      out.write("/* jQuery_demo */\n");
      out.write("google_ad_slot = \"2780937993\";\n");
      out.write("google_ad_width = 728;\n");
      out.write("google_ad_height = 90;\n");
      out.write("//-->\n");
      out.write("</script>\n");
      out.write("<script type=\"text/javascript\"\n");
      out.write("src=\"http://pagead2.googlesyndication.com/pagead/show_ads.js\">\n");
      out.write("</script></div>\n");
      out.write("<div class=\"jquery-script-clear\"></div>\n");
      out.write("</div>\n");
      out.write("</div>\n");
      out.write("<div class=\"container\" style=\"margin:150px auto; max-width:960px;\">\n");
      out.write("<h2>Event Calendar Example</h2>\n");
      out.write("<div class=\"monthly\" id=\"mycalendar\"></div>\n");
      out.write("<h2>Date Picker Example</h2>\n");
      out.write("<input type=\"text\" id=\"mytarget\" value=\"Select Date\" class=\"form-control\">\n");
      out.write("\t\t<div class=\"monthly\" id=\"mycalendar2\"></div>\n");
      out.write("</div>\n");
      out.write("<script src=\"http://code.jquery.com/jquery-1.11.3.min.js\"></script>\n");
      out.write("<script src=\"js/monthly-1.0.0.js\"></script>\n");
      out.write("<script type=\"text/javascript\">\n");
      out.write("\t$(window).load( function() {\n");
      out.write("\n");
      out.write("\t\t$('#mycalendar').monthly({\n");
      out.write("\t\t\tmode: 'event',\n");
      out.write("\t\t\txmlUrl: 'events.xml'\n");
      out.write("\t\t});\n");
      out.write("\t\t\n");
      out.write("\t\t$('#mycalendar2').monthly({\n");
      out.write("\t\t\ttarget: '#mytarget',\n");
      out.write("\t\t\tmaxWidth: '250px',\n");
      out.write("\t\t\tstartHidden: true,\n");
      out.write("\t\t\tshowTrigger: '#mytarget'\n");
      out.write("\t\t});\n");
      out.write("\n");
      out.write("\t});\n");
      out.write("</script><script type=\"text/javascript\">\n");
      out.write("\n");
      out.write("  var _gaq = _gaq || [];\n");
      out.write("  _gaq.push(['_setAccount', 'UA-36251023-1']);\n");
      out.write("  _gaq.push(['_setDomainName', 'jqueryscript.net']);\n");
      out.write("  _gaq.push(['_trackPageview']);\n");
      out.write("\n");
      out.write("  (function() {\n");
      out.write("    var ga = document.createElement('script'); ga.type = 'text/javascript'; ga.async = true;\n");
      out.write("    ga.src = ('https:' == document.location.protocol ? 'https://ssl' : 'http://www') + '.google-analytics.com/ga.js';\n");
      out.write("    var s = document.getElementsByTagName('script')[0]; s.parentNode.insertBefore(ga, s);\n");
      out.write("  })();\n");
      out.write("</body>\n");
      out.write("\n");
      out.write("</script>\n");
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
