/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: JspCServletContext/1.0
 * Generated at: 2012-12-18 21:20:19 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package net.myrrix.web;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.util.List;
import java.util.Map;
import net.myrrix.common.stats.JVMEnvironment;
import net.myrrix.web.common.stats.ServletStats;
import net.myrrix.common.stats.RunningStatistics;
import net.myrrix.common.stats.RunningStatisticsPerTime;
import net.myrrix.web.servlets.AbstractMyrrixServlet;
import net.myrrix.web.servlets.PreferenceServlet;
import org.apache.mahout.cf.taste.impl.common.RunningAverage;
import net.myrrix.common.ReloadingReference;
import net.myrrix.online.ServerRecommender;

public final class index_jspx extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final javax.servlet.jsp.JspFactory _jspxFactory =
          javax.servlet.jsp.JspFactory.getDefaultFactory();

  private static java.util.Map<java.lang.String,java.lang.Long> _jspx_dependants;

  private javax.el.ExpressionFactory _el_expressionfactory;
  private org.apache.tomcat.InstanceManager _jsp_instancemanager;

  public java.util.Map<java.lang.String,java.lang.Long> getDependants() {
    return _jspx_dependants;
  }

  public void _jspInit() {
    _el_expressionfactory = _jspxFactory.getJspApplicationContext(getServletConfig().getServletContext()).getExpressionFactory();
    _jsp_instancemanager = org.apache.jasper.runtime.InstanceManagerFactory.getInstanceManager(getServletConfig());
  }

  public void _jspDestroy() {
  }

  public void _jspService(final javax.servlet.http.HttpServletRequest request, final javax.servlet.http.HttpServletResponse response)
        throws java.io.IOException, javax.servlet.ServletException {

    final javax.servlet.jsp.PageContext pageContext;
    final javax.servlet.ServletContext application;
    final javax.servlet.ServletConfig config;
    javax.servlet.jsp.JspWriter out = null;
    final java.lang.Object page = this;
    javax.servlet.jsp.JspWriter _jspx_out = null;
    javax.servlet.jsp.PageContext _jspx_page_context = null;


    try {
      response.setContentType("text/html;charset=UTF-8");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, false, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      out = pageContext.getOut();
      _jspx_out = out;

      out.write("<!DOCTYPE html>");
      out.write("<html>");
      out.write("<!-- Copyright 2012 Myrrix. See myrrix.com/legal for license. -->");
      out.write("<head>");
      out.write("<title>");
      out.write("Myrrix Serving Layer");
      out.write("</title>");
      out.write("<style type=\"text/css\">");
      out.write("\nbody {background-color:#202020}\nbody,p,th,td,h1,h2,h3 {font-family:\"Gill Sans\",\"Gill Sans MT\",Helvetica,sans-serif;font-weight:300;color:white}\na {text-decoration:none}\ntable,th,td {border:1px dotted black}\nth,td {padding:5px;white-space:nowrap;vertical-align:top}\ntd {text-align:right}\ntable.layout > tbody > tr > th, table.layout > tbody > tr > td, table.layout {border:0;padding:0;text-align:left}\ntable {border-collapse:collapse}\nh1,h2,h3,a {color:#CCFF66}\nh1,h2,h3 {text-transform:uppercase}\nhr {margin:20px 0 10px 0}\ninput {width:70px}\na.arrow {line-height:100%;font-size:200%;margin-left:10px}\n");
      out.write("</style>");
      out.write("<script type=\"text/javascript\">");
      out.write("\nfunction doQuery(endpoint, isGet, paramSuffixes, postBodyElement) {\n\n  if (typeof(paramSuffixes) == \"undefined\") {\n    paramSuffixes = [];\n  }\n  if (typeof(postBodyElement) == \"undefined\") {\n    postBodyElement = null;\n  }\n\n  var httpmethod = isGet ? \"GET\" : \"POST\";\n  var pathElements = [];\n  pathElements.push(endpoint);\n  for (var i = 0; i < paramSuffixes.length; i++) {\n    var elementValue = document.getElementById(endpoint + \"-\" + paramSuffixes[i]).value;\n    pathElements.push(elementValue);\n  }\n  var path = pathElements.join(\"/\");\n  var resultElement = document.getElementById(\"request-result\");\n\n  resultElement.innerHTML = \"[Querying...]\";\n  var xmlHttp = new XMLHttpRequest();\n  xmlHttp.onreadystatechange = function() {\n    if (xmlHttp.readyState == 4) {\n      var httpStatus = xmlHttp.status;\n      if (httpStatus == 200) {\n        var responseText = xmlHttp.responseText;\n        if (responseText.length == 0) {\n          responseText = \"[empty]\";\n        }\n        resultElement.innerHTML = responseText;\n      } else {\n");
      out.write("        resultElement.innerHTML = \"[HTTP Error \" + httpStatus + \"]\";\n      }\n    }\n  };\n  xmlHttp.open(httpmethod, path);\n  xmlHttp.setRequestHeader(\"Accept\", \"text/plain\");\n  if (postBodyElement == null) {\n    xmlHttp.send(null);\n  } else {\n    xmlHttp.send(document.getElementById(postBodyElement).value);\n  }\n  return false;\n}\n\nfunction handleReturn(event, endpoint, isGet, paramSuffixes, postBodyElement) {\n  if (event.keyCode == 13) {\n    doQuery(endpoint, isGet, paramSuffixes, postBodyElement);\n    return false;\n  }\n  return true;\n}\n\nfunction expandOrCollapse(divID, arrowSpanID) {\n  var theDiv = document.getElementById(divID);\n  var theArrowSpan = document.getElementById(arrowSpanID);\n  if (theDiv.style.display == 'none') {\n    theDiv.style.display = 'block';\n    theArrowSpan.innerHTML = '&#x25BC;';\n  } else {\n    theDiv.style.display = 'none';\n    theArrowSpan.innerHTML = '&#x25B6;';\n  }\n}\n");
      out.write("</script>");
      out.write("</head>");
      out.write("<body>");
      out.write("<div style=\"width:800px;margin-left:auto;margin-right:auto;padding:10px\">");
      out.write("<h1>");
      out.write("Myrrix Serving Layer");
      out.write("</h1>");
      out.write("<table style=\"width:100%\" class=\"layout\">");
      out.write("<tr>");
      out.write("<td style=\"text-align:left\">");
      out.write("<h2>");
      out.write("Machine");
      out.write("</h2>");

System.gc(); // Helps make the heap reported more reliable:
pageContext.setAttribute("jvmEnv", new JVMEnvironment());

ServerRecommender rec = (ServerRecommender) application.getAttribute(AbstractMyrrixServlet.RECOMMENDER_KEY);
pageContext.setAttribute("rec", rec);

boolean readOnly = (Boolean) application.getAttribute(AbstractMyrrixServlet.READ_ONLY_KEY);

String localInputDir = String.valueOf(application.getAttribute(AbstractMyrrixServlet.LOCAL_INPUT_DIR_KEY));
pageContext.setAttribute("localInputDir", localInputDir);

String localInputDirDisplay;
if (localInputDir.length() > 32) {
  localInputDirDisplay = localInputDir.substring(0, 32) + "...";
} else {
  localInputDirDisplay = localInputDir;
}
pageContext.setAttribute("localInputDirDisplay", localInputDirDisplay);

RunningAverage estimateError = (RunningAverage) application.getAttribute(PreferenceServlet.AVG_ESTIMATE_ERROR_KEY);
float avgEstimateError = estimateError == null ? 0.0f : (float) estimateError.getAverage();
if (Float.isNaN(avgEstimateError)) {
  avgEstimateError = 0.0f;
}
pageContext.setAttribute("avgEstimateError", avgEstimateError);

pageContext.setAttribute("partition", application.getAttribute(AbstractMyrrixServlet.PARTITION_KEY));
ReloadingReference<List<?>> partitionRef =
    (ReloadingReference<List<?>>) application.getAttribute(AbstractMyrrixServlet.ALL_PARTITIONS_REF_KEY);
int numPartitions = partitionRef == null ? 0 : partitionRef.get().size();
pageContext.setAttribute("numPartitions", numPartitions);

      out.write("<table>");
      out.write("<tr>");
      out.write("<td>");
      out.write("Host");
      out.write("</td>");
      out.write("<td style=\"text-align:left\">");
      out.write("<code>");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${jvmEnv.hostName}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null, false));
      out.write("</code>");
      out.write("</td>");
      out.write("</tr>");
      out.write("<tr>");
      out.write("<td>");
      out.write("Cores");
      out.write("</td>");
      out.write("<td style=\"text-align:left\">");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${jvmEnv.numProcessors}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null, false));
      out.write("</td>");
      out.write("</tr>");
      out.write("<tr>");
      out.write("<td>");
      out.write("Heap Used");
      out.write("</td>");
      out.write("<td style=\"text-align:left\">");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${jvmEnv.usedMemoryMB}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null, false));
      out.write("MB (");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${jvmEnv.percentUsedMemory}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null, false));
      out.write('%');
      out.write(')');
      out.write("</td>");
      out.write("</tr>");
      out.write("<tr>");
      out.write("<td>");
      out.write("Logs");
      out.write("</td>");
      out.write("<td style=\"text-align:left\">");
      out.write("<a target=\"_blank\" href=\"log.txt\">");
      out.write("View");
      out.write("</a>");
      out.write("</td>");
      out.write("</tr>");

  if (numPartitions > 1) {

      out.write("<tr>");
      out.write("<td>");
      out.write("Partition");
      out.write("</td>");
      out.write("<td style=\"text-align:left\">");
      out.write('#');
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${partition}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null, false));
      out.write(' ');
      out.write('(');
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${numPartitions}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null, false));
      out.write(" total)");
      out.write("</td>");
      out.write("</tr>");

  }

      out.write("</table>");
      out.write("</td>");
      out.write("<td style=\"text-align:left\">");
      out.write("<h2>");
      out.write("Recommender");
      out.write("</h2>");
      out.write("<table>");

  if (rec.getBucket() != null || rec.getInstanceID() != null) {

      out.write("<tr>");
      out.write("<td>");
      out.write("Bucket");
      out.write("</td>");
      out.write("<td style=\"text-align:left\">");
      out.write("<code>");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${rec.bucket}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null, false));
      out.write("</code>");
      out.write("</td>");
      out.write("</tr>");
      out.write("<tr>");
      out.write("<td>");
      out.write("Instance ID");
      out.write("</td>");
      out.write("<td style=\"text-align:left\">");
      out.write("<code>");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${rec.instanceID}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null, false));
      out.write("</code>");
      out.write("</td>");
      out.write("</tr>");

  }

      out.write("<tr>");
      out.write("<td>");
      out.write("Local Input Dir");
      out.write("</td>");
      out.write("<td style=\"text-align:left\">");
      out.write("<code>");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${localInputDirDisplay}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null, false));
      out.write("</code>");
      out.write("</td>");
      out.write("</tr>");
      out.write("<tr>");
      out.write("<td>");
      out.write("Ready?");
      out.write("</td>");
      out.write("<td style=\"text-align:left\">");
      out.write("<code>");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${rec.ready}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null, false));
      out.write("</code>");
      out.write("</td>");
      out.write("</tr>");
      out.write("<tr>");
      out.write("<td>");
      out.write("User Count");
      out.write("</td>");
      out.write("<td style=\"text-align:left\">");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${rec.generationManager.currentGeneration.numUsers}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null, false));
      out.write("</td>");
      out.write("</tr>");
      out.write("<tr>");
      out.write("<td>");
      out.write("Item Count");
      out.write("</td>");
      out.write("<td style=\"text-align:left\">");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${rec.generationManager.currentGeneration.numItems}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null, false));
      out.write("</td>");
      out.write("</tr>");
      out.write("<tr>");
      out.write("<td>");
      out.write("Avg. Estimate Error (beta)");
      out.write("</td>");
      out.write("<td style=\"text-align:left\">");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${avgEstimateError}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null, false));
      out.write("</td>");
      out.write("</tr>");
      out.write("</table>");
      out.write("</td>");
      out.write("</tr>");
      out.write("</table>");
      out.write("<hr/>");
      out.write("<h2>");
      out.write("<span onclick=\"expandOrCollapse('endpoint-stats','endpoint-stats-arrow')\">");
      out.write("Endpoint Stats\n  ");
      out.write("<span id=\"endpoint-stats-arrow\">");
      out.write('▶');
      out.write("</span>");
      out.write("</span>");
      out.write("</h2>");
      out.write("<div style=\"display:none\" id=\"endpoint-stats\">");
      out.write("<table style=\"width:100%\">");
      out.write("<tr>");
      out.write("<th>");
      out.write("Service");
      out.write("</th>");
      out.write("<th>");
      out.write("Requests");
      out.write("<br/>");
      out.write("(last hour)");
      out.write("</th>");
      out.write("<th>");
      out.write("Average (&mu;s)");
      out.write("<br/>");
      out.write("(last hour)");
      out.write("</th>");
      out.write("<th>");
      out.write("Max (&mu;s)");
      out.write("<br/>");
      out.write("(last hour)");
      out.write("</th>");
      out.write("<th>");
      out.write("Client");
      out.write("<br/>");
      out.write("Errors");
      out.write("</th>");
      out.write("<th>");
      out.write("Server");
      out.write("<br/>");
      out.write("Errors");
      out.write("</th>");
      out.write("</tr>");

    Map<String,ServletStats> timings =
        (Map<String,ServletStats>) application.getAttribute(AbstractMyrrixServlet.TIMINGS_KEY);
    for (Map.Entry<String,ServletStats> entry : timings.entrySet()) {
      pageContext.setAttribute("entry", entry);
  
      out.write("<tr>");
      out.write("<td style=\"font-family:Courier,monospace;text-align:left\">");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${entry.key}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null, false));
      out.write("</td>");

        RunningStatistics allTime = entry.getValue().getAllTime();
        pageContext.setAttribute("averageMicroSec", (long) allTime.getAverage() / 1000L);
        pageContext.setAttribute("maxMicroSec", (long) allTime.getMax() / 1000L);
        RunningStatisticsPerTime lastHour = entry.getValue().getLastHour();
        pageContext.setAttribute("averageLastHourMicroSec", (long) lastHour.getAverage() / 1000L);
        pageContext.setAttribute("maxLastHourMicroSec", (long) lastHour.getMax() / 1000L);
        pageContext.setAttribute("clientErrors", entry.getValue().getNumClientErrors());
        pageContext.setAttribute("serverErrors", entry.getValue().getNumServerErrors());
      
      out.write("<td>");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${entry.value.allTime.count}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null, false));
      out.write("<br/>");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${entry.value.lastHour.count}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null, false));
      out.write("</td>");
      out.write("<td>");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${averageMicroSec}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null, false));
      out.write("<br/>");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${averageLastHourMicroSec}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null, false));
      out.write("</td>");
      out.write("<td>");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${maxMicroSec}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null, false));
      out.write("<br/>");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${maxLastHourMicroSec}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null, false));
      out.write("</td>");
      out.write("<td>");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${clientErrors}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null, false));
      out.write("</td>");
      out.write("<td>");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${serverErrors}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null, false));
      out.write("</td>");
      out.write("</tr>");

    }
  
      out.write("</table>");
      out.write("</div>");
      out.write("<hr/>");
      out.write("<h2>");
      out.write("<span onclick=\"expandOrCollapse('feature-space','feature-space-arrow');document.getElementById('feature-space-map').src='som.jspx?maxMapSize=40&matrix=item'\">");
      out.write("Feature Space Map\n  ");
      out.write("<span id=\"feature-space-arrow\">");
      out.write('▶');
      out.write("</span>");
      out.write("</span>");
      out.write("</h2>");
      out.write("<div style=\"display:none\" id=\"feature-space\">");
      out.write("<p>");
      out.write("<em>");
      out.write("Randomized self-organizing map of feature space. Nearby points are users or items that are similar. Mouse-over cells to view IDs.");
      out.write("</em>");
      out.write("<br/>");
      out.write("<a onclick=\"document.getElementById('feature-space-map').src='som.jspx?maxMapSize=40&matrix=user'\" href=\"#\">");
      out.write("Compute New User-Feature Map");
      out.write("</a>");
      out.write(" &middot;\n    ");
      out.write("<a onclick=\"document.getElementById('feature-space-map').src='som.jspx?maxMapSize=40&matrix=item'\" href=\"#\">");
      out.write("Compute New Item-Feature Map");
      out.write("</a>");
      out.write("</p>");
      out.write("<iframe style=\"width:100%;height:680px;border:0;padding:0;margin:0\" src=\"\" id=\"feature-space-map\">");
      out.write("Your browser does not support iframes.");
      out.write("</iframe>");
      out.write("</div>");
      out.write("<hr/>");
      out.write("<h2>");
      out.write("Test");
      out.write("</h2>");
      out.write("<table style=\"width:100%\" class=\"layout\">");
      out.write("<tr>");
      out.write("<td style=\"width:60%\">");
      out.write("<table class=\"layout\">");
      out.write("<form style=\"padding:10px\" action=\"#\">");
      out.write("<tr>");
      out.write("<td/>");
      out.write("<td>");
      out.write("&nbsp;&nbsp;User ID");
      out.write("</td>");
      out.write("<td colspan=\"2\"/>");
      out.write("</tr>");
      out.write("<tr>");
      out.write("<td>");
      out.write("<code>");
      out.write("/recommend");
      out.write("</code>");
      out.write("</td>");
      out.write("<td>");
      out.write("<code>");
      out.write('/');
      out.write("</code>");
      out.write("<input onkeyup=\"return handleReturn(event, 'recommend',true,new Array('userid'))\" id=\"recommend-userid\" type=\"text\"/>");
      out.write("</td>");
      out.write("<td/>");
      out.write("<td>");
      out.write("<a onclick=\"return doQuery('recommend',true,new Array('userid'))\" class=\"arrow\" href=\"#\">");
      out.write("&#x27AC;");
      out.write("</a>");
      out.write("</td>");
      out.write("</tr>");
      out.write("</form>");
      out.write("<tr>");
      out.write("<td colspan=\"4\">");
      out.write("<hr/>");
      out.write("</td>");
      out.write("</tr>");
      out.write("<form style=\"padding:10px\" action=\"#\">");
      out.write("<tr>");
      out.write("<td/>");
      out.write("<td>");
      out.write("&nbsp;&nbsp;Item ID 1");
      out.write("</td>");
      out.write("<td>");
      out.write("&nbsp;&nbsp;");
      out.write("<em>");
      out.write("(Item ID 2)");
      out.write("</em>");
      out.write("</td>");
      out.write("<td/>");
      out.write("</tr>");
      out.write("<tr>");
      out.write("<td>");
      out.write("<code>");
      out.write("/recommendToAnonymous");
      out.write("</code>");
      out.write("</td>");
      out.write("<td>");
      out.write("<code>");
      out.write('/');
      out.write("</code>");
      out.write("<input onkeyup=\"return handleReturn(event,'recommendToAnonymous',true,new Array('itemid1','itemid2'))\" id=\"recommendToAnonymous-itemid1\" type=\"text\"/>");
      out.write("</td>");
      out.write("<td>");
      out.write("<code>");
      out.write('/');
      out.write("</code>");
      out.write("<input onkeyup=\"return handleReturn(event,'recommendToAnonymous',true,new Array('itemid1','itemid2'))\" id=\"recommendToAnonymous-itemid2\" type=\"text\"/>");
      out.write("</td>");
      out.write("<td>");
      out.write("<a onclick=\"return doQuery('recommendToAnonymous',true,new Array('itemid1','itemid2'))\" class=\"arrow\" href=\"#\">");
      out.write("&#x27AC;");
      out.write("</a>");
      out.write("</td>");
      out.write("</tr>");
      out.write("</form>");
      out.write("<tr>");
      out.write("<td colspan=\"4\">");
      out.write("<hr/>");
      out.write("</td>");
      out.write("</tr>");
      out.write("<form style=\"padding:10px\" action=\"#\">");
      out.write("<tr>");
      out.write("<td/>");
      out.write("<td>");
      out.write("&nbsp;&nbsp;Item ID 1");
      out.write("</td>");
      out.write("<td>");
      out.write("&nbsp;&nbsp;");
      out.write("<em>");
      out.write("(Item ID 2)");
      out.write("</em>");
      out.write("</td>");
      out.write("<td/>");
      out.write("</tr>");
      out.write("<tr>");
      out.write("<td>");
      out.write("<code>");
      out.write("/similarity");
      out.write("</code>");
      out.write("</td>");
      out.write("<td>");
      out.write("<code>");
      out.write('/');
      out.write("</code>");
      out.write("<input onkeyup=\"return handleReturn(event,'similarity',true,new Array('itemid1','itemid2'))\" id=\"similarity-itemid1\" type=\"text\"/>");
      out.write("</td>");
      out.write("<td>");
      out.write("<code>");
      out.write('/');
      out.write("</code>");
      out.write("<input onkeyup=\"return handleReturn(event,'similarity',true,new Array('itemid1','itemid2'))\" id=\"similarity-itemid2\" type=\"text\"/>");
      out.write("</td>");
      out.write("<td>");
      out.write("<a onclick=\"return doQuery('similarity',true,new Array('itemid1','itemid2'))\" class=\"arrow\" href=\"#\">");
      out.write("&#x27AC;");
      out.write("</a>");
      out.write("</td>");
      out.write("</tr>");
      out.write("</form>");
      out.write("<tr>");
      out.write("<td colspan=\"4\">");
      out.write("<hr/>");
      out.write("</td>");
      out.write("</tr>");
      out.write("<form style=\"padding:10px\" action=\"#\">");
      out.write("<tr>");
      out.write("<td/>");
      out.write("<td>");
      out.write("&nbsp;&nbsp;User ID");
      out.write("</td>");
      out.write("<td>");
      out.write("&nbsp;&nbsp;Item ID");
      out.write("</td>");
      out.write("<td/>");
      out.write("</tr>");
      out.write("<tr>");
      out.write("<td>");
      out.write("<code>");
      out.write("/estimate");
      out.write("</code>");
      out.write("</td>");
      out.write("<td>");
      out.write("<code>");
      out.write('/');
      out.write("</code>");
      out.write("<input onkeyup=\"return handleReturn(event,'estimate',true,new Array('userid','itemid'))\" id=\"estimate-userid\" type=\"text\"/>");
      out.write("</td>");
      out.write("<td>");
      out.write("<code>");
      out.write('/');
      out.write("</code>");
      out.write("<input onkeyup=\"return handleReturn(event,'estimate',true,new Array('userid','itemid'))\" id=\"estimate-itemid\" type=\"text\"/>");
      out.write("</td>");
      out.write("<td>");
      out.write("<a onclick=\"return doQuery('estimate',true,new Array('userid','itemid'))\" class=\"arrow\" href=\"#\">");
      out.write("&#x27AC;");
      out.write("</a>");
      out.write("</td>");
      out.write("</tr>");
      out.write("</form>");
      out.write("<tr>");
      out.write("<td colspan=\"4\">");
      out.write("<hr/>");
      out.write("</td>");
      out.write("</tr>");
      out.write("<form style=\"padding:10px\" action=\"#\">");
      out.write("<tr>");
      out.write("<td/>");
      out.write("<td>");
      out.write("&nbsp;&nbsp;User ID");
      out.write("</td>");
      out.write("<td>");
      out.write("&nbsp;&nbsp;Item ID");
      out.write("</td>");
      out.write("<td/>");
      out.write("</tr>");
      out.write("<tr>");
      out.write("<td>");
      out.write("<code>");
      out.write("/because");
      out.write("</code>");
      out.write("</td>");
      out.write("<td>");
      out.write("<code>");
      out.write('/');
      out.write("</code>");
      out.write("<input onkeyup=\"return handleReturn(event,'because',true,new Array('userid','itemid'))\" id=\"because-userid\" type=\"text\"/>");
      out.write("</td>");
      out.write("<td>");
      out.write("<code>");
      out.write('/');
      out.write("</code>");
      out.write("<input onkeyup=\"return handleReturn(event,'because',true,new Array('userid','itemid'))\" id=\"because-itemid\" type=\"text\"/>");
      out.write("</td>");
      out.write("<td>");
      out.write("<a onclick=\"return doQuery('because',true,new Array('userid','itemid'))\" class=\"arrow\" href=\"#\">");
      out.write("&#x27AC;");
      out.write("</a>");
      out.write("</td>");
      out.write("</tr>");
      out.write("</form>");
      out.write("<tr>");
      out.write("<td colspan=\"4\">");
      out.write("<hr/>");
      out.write("</td>");
      out.write("</tr>");

    if (readOnly) {
  
      out.write("<tr>");
      out.write("<td style=\"text-align:center\" colspan=\"4\">");
      out.write("<em>");
      out.write("(Read-only Mode)");
      out.write("</em>");
      out.write("</td>");
      out.write("</tr>");

    } else {
  
      out.write("<form style=\"padding:10px\" action=\"#\">");
      out.write("<tr>");
      out.write("<td/>");
      out.write("<td>");
      out.write("&nbsp;&nbsp;User ID");
      out.write("</td>");
      out.write("<td>");
      out.write("&nbsp;&nbsp;Item ID");
      out.write("</td>");
      out.write("<td/>");
      out.write("</tr>");
      out.write("<tr>");
      out.write("<td>");
      out.write("<code>");
      out.write("/pref");
      out.write("</code>");
      out.write("</td>");
      out.write("<td>");
      out.write("<code>");
      out.write('/');
      out.write("</code>");
      out.write("<input onkeyup=\"return handleReturn(event,'pref',false,new Array('userid','itemid'))\" id=\"pref-userid\" type=\"text\"/>");
      out.write("</td>");
      out.write("<td>");
      out.write("<code>");
      out.write('/');
      out.write("</code>");
      out.write("<input onkeyup=\"return handleReturn(event,'pref',false,new Array('userid','itemid'))\" id=\"pref-itemid\" type=\"text\"/>");
      out.write("</td>");
      out.write("<td>");
      out.write("<a onclick=\"return doQuery('pref',false,new Array('userid','itemid'))\" class=\"arrow\" href=\"#\">");
      out.write("&#x27AC;");
      out.write("</a>");
      out.write("</td>");
      out.write("</tr>");
      out.write("</form>");
      out.write("<tr>");
      out.write("<td colspan=\"4\">");
      out.write("<hr/>");
      out.write("</td>");
      out.write("</tr>");
      out.write("<form id=\"ingestFileForm\" style=\"padding:10px\" enctype=\"multipart/form-data\" method=\"post\" action=\"ingest\">");
      out.write("<tr>");
      out.write("<td>");
      out.write("<code>");
      out.write("/ingest");
      out.write("</code>");
      out.write("</td>");
      out.write("<td colspan=\"2\">");
      out.write("<input style=\"width:140px\" name=\"ingestedFile\" type=\"file\"/>");
      out.write("</td>");
      out.write("<td>");
      out.write("<a onclick=\"document.getElementById('ingestFileForm').submit()\" class=\"arrow\" href=\"#\">");
      out.write("&#x27AC;");
      out.write("</a>");
      out.write("</td>");
      out.write("</tr>");
      out.write("</form>");
      out.write("<tr>");
      out.write("<td colspan=\"4\">");
      out.write("<hr/>");
      out.write("</td>");
      out.write("</tr>");
      out.write("<form style=\"padding:10px\" action=\"#\">");
      out.write("<tr>");
      out.write("<td>");
      out.write("<code>");
      out.write("/ingest");
      out.write("</code>");
      out.write("</td>");
      out.write("<td colspan=\"2\">");
      out.write("<textarea id=\"ingestData\" rows=\"20\">");
      out.write("userID,itemID[,value]...");
      out.write("</textarea>");
      out.write("</td>");
      out.write("<td>");
      out.write("<a onclick=\"return doQuery('ingest',false,[],'ingestData')\" class=\"arrow\" href=\"#\">");
      out.write("&#x27AC;");
      out.write("</a>");
      out.write("</td>");
      out.write("</tr>");
      out.write("</form>");
      out.write("<tr>");
      out.write("<td colspan=\"4\">");
      out.write("<hr/>");
      out.write("</td>");
      out.write("</tr>");
      out.write("<form style=\"padding:10px\" action=\"#\">");
      out.write("<tr>");
      out.write("<td>");
      out.write("<code>");
      out.write("/refresh");
      out.write("</code>");
      out.write("</td>");
      out.write("<td colspan=\"2\"/>");
      out.write("<td>");
      out.write("<a onclick=\"return doQuery('refresh',false)\" class=\"arrow\" href=\"#\">");
      out.write("&#x27AC;");
      out.write("</a>");
      out.write("</td>");
      out.write("</tr>");
      out.write("</form>");

    }
  
      out.write("</table>");
      out.write("</td>");
      out.write("<td style=\"width:40%\">");
      out.write("<div style=\"background-color:#404040;padding:10px;min-height:500px;white-space:normal\">");
      out.write("<pre>");
      out.write("<code id=\"request-result\">");
      out.write('[');
      out.write(']');
      out.write("</code>");
      out.write("</pre>");
      out.write("</div>");
      out.write("</td>");
      out.write("</tr>");
      out.write("</table>");
      out.write("<p>");
      out.write("&copy; ");
      out.write("<a target=\"_blank\" href=\"http://myrrix.com\">");
      out.write("Myrrix Ltd");
      out.write("</a>");
      out.write(", except for included third-party open source software.\nFull details of licensing at ");
      out.write("<a target=\"_blank\" href=\"http://myrrix.com/legal/\">");
      out.write("http://myrrix.com/legal/");
      out.write("</a>");
      out.write("</p>");
      out.write("</div>");
      out.write("</body>");
      out.write("</html>");
    } catch (java.lang.Throwable t) {
      if (!(t instanceof javax.servlet.jsp.SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          try { out.clearBuffer(); } catch (java.io.IOException e) {}
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
        else throw new ServletException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }
}
