<%@ page import="java.util.Calendar"%>
<%@ page 
	language="java" 
	contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"
    autoFlush="true"
    buffer="8kb"
    session="true"
    isThreadSafe="true"
    isErrorPage="false"
    isELIgnored="true"
    errorPage="/error.jsp"
    %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Home Page</title>
</head>
<body>
<p> First JSP Page </p>
<p>Testing Declaration Tag </p>
<%! 
	int i = 0;
	Calendar cal = Calendar.getInstance();
%>
<p>Testing scriptlet </p>
<%
	out.println("Your IP Address is : " + request.getRemoteAddr());
	pageContext.setAttribute("jspRequestAttr", "Request Attribute Value", PageContext.REQUEST_SCOPE);
	pageContext.setAttribute("jspSessionAttr", "Session Attribute Value", PageContext.SESSION_SCOPE);
	pageContext.setAttribute("jspApplicationAttr", "Context Attribute Value", PageContext.APPLICATION_SCOPE);
	pageContext.setAttribute("jspPageAttr", "Page Attribute Value", PageContext.PAGE_SCOPE);
%>
<!-- Implicit Objects
	out - PrintWriter -- response.getWriter()
	request -- HttpServletRequest
	response -- HttpServletResponse
	session -- HttpSession 
	application -- ServetContext
	config - ServletConfig
	page -- javax.jsp.Page
	pageContext -- javax.jsp.PageContext
	
	 -->
<p>Testing Expression Tag </p>

<p> Today's date: <%= cal.getTime() %> </p>

<%@include file="footer.jsp" %>
</body>
</html>