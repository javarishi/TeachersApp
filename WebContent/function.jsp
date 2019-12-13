<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/functions" prefix="fn" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<%
String variable = "This is also a String variable";
%>

<c:set var="string1" value=" This is first String."/>
<c:set var="string2" value="This is second String."/>
<p>Index (1) : ${fn:indexOf(string1, "first")}</p>
<p>Index (2) : ${fn:indexOf(string2, "second")}</p>

<p>toUpperCase (3) : ${fn:toUpperCase(string1)}</p>

<c:set var = "string3" value = "${fn:replace(string2, 'second', 'first')}" />
<p>Replace String : ${string3}</p>
<p>Index (4) : ${fn:length(string2)}</p>


</body>
</html>