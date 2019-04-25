<%@page import="java.io.PrintWriter"%>
<%@page import="com.cognizant.registration.Registration"%>
<%@page import="java.util.ArrayList"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    
<%@page import="com.cognizant.dao.*"%>
<%@page import="com.cognizant.daoimpl.*"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<form>
<%
ProfileDao pdao=new ProfileDaoImpl();
//String m_userid=request.getParameter("userid");
String m_userid="user2";
ArrayList<Registration> arList=pdao.showprofile(m_userid);

//PrintWriter pw=response.getWriter();
for(Registration rg:arList){
PrintWriter pw=response.getWriter();
	
	pw.println(rg.getFname());
	pw.println(rg.getLname());
	pw.println(rg.getEmail()); 
	pw.println(rg.getUserid()); 
	pw.println(rg.getEmptype());
	 }
%>
</form>
</body>
</html>