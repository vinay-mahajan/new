<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"
    import="java.util.Date,java.util.ArrayList"
    %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>

	<%
		out.print("Table of 5");
	%>
	<%
		int var = 5;
	out.print("<table border>");
		for (int i = 1; i <= 10; i++)
			out.print("<tr><td>"+var * i + "</td></tr>");
		out.print("</table>");
		
		Date d = new Date();
		ArrayList<String> al = new ArrayList<>();
	%>
	<%=d %><br>
	<%=al %>

</body>
</html>