package org.apache.jsp.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class Calendar_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("\n");
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("<head>\n");
      out.write("<meta charset='utf-8' />\n");
      out.write("<link href='C:\\Users\\Bernitatowyg\\Documents\\NetBeansProjects\\Final Year Project\\web\\css/fullcalendar.min.css' rel='stylesheet' />\n");
      out.write("<link href='C:\\Users\\Bernitatowyg\\Documents\\NetBeansProjects\\Final Year Project\\web\\css/fullcalendar.print.min.css' rel='stylesheet' media='print' />\n");
      out.write("<script src='C:\\Users\\Bernitatowyg\\Documents\\NetBeansProjects\\Final Year Project\\web\\Js/lib/moment.min.js'></script>\n");
      out.write("<script src='C:\\Users\\Bernitatowyg\\Documents\\NetBeansProjects\\Final Year Project\\web\\Js/lib/jquery.min.js'></script>\n");
      out.write("<script src='C:\\Users\\Bernitatowyg\\Documents\\NetBeansProjects\\Final Year Project\\web\\Js/fullcalendar.min.js'></script>\n");
      out.write("<script src='C:\\Users\\Bernitatowyg\\Documents\\NetBeansProjects\\Final Year Project\\web\\Js/locale-all.js'></script>\n");
      out.write("<script>\n");
      out.write("\n");
      out.write("\n");
      out.write("\t$(document).ready(function() {\n");
      out.write("\t\tvar initialLocaleCode = 'en';\n");
      out.write("\n");
      out.write("\t\t$('#calendar').fullCalendar({\n");
      out.write("\t\t\theader: {\n");
      out.write("\t\t\t\tleft: 'prev,next today',\n");
      out.write("\t\t\t\tcenter: 'title',\n");
      out.write("\t\t\t\tright: 'month,agendaWeek,agendaDay,listMonth'\n");
      out.write("\t\t\t},\n");
      out.write("\t\t\tdefaultDate: '2017-05-12',\n");
      out.write("\t\t\tlocale: initialLocaleCode,\n");
      out.write("\t\t\tbuttonIcons: false, // show the prev/next text\n");
      out.write("\t\t\tweekNumbers: true,\n");
      out.write("\t\t\tnavLinks: true, // can click day/week names to navigate views\n");
      out.write("\t\t\teditable: true,\n");
      out.write("\t\t\teventLimit: true, // allow \"more\" link when too many events\n");
      out.write("\t\t\tevents: [\n");
      out.write("\t\t\t\t{\n");
      out.write("\t\t\t\t\ttitle: 'All Day Event',\n");
      out.write("\t\t\t\t\tstart: '2017-05-01'\n");
      out.write("\t\t\t\t},\n");
      out.write("\t\t\t\t{\n");
      out.write("\t\t\t\t\ttitle: 'Long Event',\n");
      out.write("\t\t\t\t\tstart: '2017-05-07',\n");
      out.write("\t\t\t\t\tend: '2017-05-10'\n");
      out.write("\t\t\t\t},\n");
      out.write("\t\t\t\t{\n");
      out.write("\t\t\t\t\tid: 999,\n");
      out.write("\t\t\t\t\ttitle: 'Repeating Event',\n");
      out.write("\t\t\t\t\tstart: '2017-05-09T16:00:00'\n");
      out.write("\t\t\t\t},\n");
      out.write("\t\t\t\t{\n");
      out.write("\t\t\t\t\tid: 999,\n");
      out.write("\t\t\t\t\ttitle: 'Repeating Event',\n");
      out.write("\t\t\t\t\tstart: '2017-05-16T16:00:00'\n");
      out.write("\t\t\t\t},\n");
      out.write("\t\t\t\t{\n");
      out.write("\t\t\t\t\ttitle: 'Conference',\n");
      out.write("\t\t\t\t\tstart: '2017-05-11',\n");
      out.write("\t\t\t\t\tend: '2017-05-13'\n");
      out.write("\t\t\t\t},\n");
      out.write("\t\t\t\t{\n");
      out.write("\t\t\t\t\ttitle: 'Meeting',\n");
      out.write("\t\t\t\t\tstart: '2017-05-12T10:30:00',\n");
      out.write("\t\t\t\t\tend: '2017-05-12T12:30:00'\n");
      out.write("\t\t\t\t},\n");
      out.write("\t\t\t\t{\n");
      out.write("\t\t\t\t\ttitle: 'Lunch',\n");
      out.write("\t\t\t\t\tstart: '2017-05-12T12:00:00'\n");
      out.write("\t\t\t\t},\n");
      out.write("\t\t\t\t{\n");
      out.write("\t\t\t\t\ttitle: 'Meeting',\n");
      out.write("\t\t\t\t\tstart: '2017-05-12T14:30:00'\n");
      out.write("\t\t\t\t},\n");
      out.write("\t\t\t\t{\n");
      out.write("\t\t\t\t\ttitle: 'Happy Hour',\n");
      out.write("\t\t\t\t\tstart: '2017-05-12T17:30:00'\n");
      out.write("\t\t\t\t},\n");
      out.write("\t\t\t\t{\n");
      out.write("\t\t\t\t\ttitle: 'Dinner',\n");
      out.write("\t\t\t\t\tstart: '2017-05-12T20:00:00'\n");
      out.write("\t\t\t\t},\n");
      out.write("\t\t\t\t{\n");
      out.write("\t\t\t\t\ttitle: 'Birthday Party',\n");
      out.write("\t\t\t\t\tstart: '2017-05-13T07:00:00'\n");
      out.write("\t\t\t\t},\n");
      out.write("\t\t\t\t{\n");
      out.write("\t\t\t\t\ttitle: 'Click for Google',\n");
      out.write("\t\t\t\t\turl: 'http://google.com/',\n");
      out.write("\t\t\t\t\tstart: '2017-05-28'\n");
      out.write("\t\t\t\t}\n");
      out.write("\t\t\t]\n");
      out.write("\t\t});\n");
      out.write("\n");
      out.write("\t\t// build the locale selector's options\n");
      out.write("\t\t$.each($.fullCalendar.locales, function(localeCode) {\n");
      out.write("\t\t\t$('#locale-selector').append(\n");
      out.write("\t\t\t\t$('<option/>')\n");
      out.write("\t\t\t\t\t.attr('value', localeCode)\n");
      out.write("\t\t\t\t\t.prop('selected', localeCode == initialLocaleCode)\n");
      out.write("\t\t\t\t\t.text(localeCode)\n");
      out.write("\t\t\t);\n");
      out.write("\t\t});\n");
      out.write("\n");
      out.write("\t\t// when the selected option changes, dynamically change the calendar option\n");
      out.write("\t\t$('#locale-selector').on('change', function() {\n");
      out.write("\t\t\tif (this.value) {\n");
      out.write("\t\t\t\t$('#calendar').fullCalendar('option', 'locale', this.value);\n");
      out.write("\t\t\t}\n");
      out.write("\t\t});\n");
      out.write("\t});\n");
      out.write("\n");
      out.write("</script>\n");
      out.write("<style>\n");
      out.write("\n");
      out.write("\tbody {\n");
      out.write("\t\tmargin: 0;\n");
      out.write("\t\tpadding: 0;\n");
      out.write("\t\tfont-family: \"Lucida Grande\",Helvetica,Arial,Verdana,sans-serif;\n");
      out.write("\t\tfont-size: 14px;\n");
      out.write("\t}\n");
      out.write("\n");
      out.write("\t#top {\n");
      out.write("\t\tbackground: #eee;\n");
      out.write("\t\tborder-bottom: 1px solid #ddd;\n");
      out.write("\t\tpadding: 0 10px;\n");
      out.write("\t\tline-height: 40px;\n");
      out.write("\t\tfont-size: 12px;\n");
      out.write("\t}\n");
      out.write("\n");
      out.write("\t#calendar {\n");
      out.write("\t\tmax-width: 900px;\n");
      out.write("\t\tmargin: 40px auto;\n");
      out.write("\t\tpadding: 0 10px;\n");
      out.write("\t}\n");
      out.write("\n");
      out.write("</style>\n");
      out.write("</head>\n");
      out.write("<body>\n");
      out.write("<container>\n");
      out.write("\n");
      out.write("\n");
      out.write("\t<div id='top'>\n");
      out.write("\n");
      out.write("\t\tLocales:\n");
      out.write("\t\t<select id='locale-selector'></select>\n");
      out.write("\n");
      out.write("\t</div>\n");
      out.write("\n");
      out.write("\t<div id='calendar'></div>\n");
      out.write("        \n");
      out.write("</container>\n");
      out.write("</body>\n");
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
