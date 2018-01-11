<!DOCTYPE HTML PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//ZH" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
<%@ page contentType="text/html;charset=UTF-8"%>
<%@ page buffer="200kb"%>
<%@ page import="java.util.Locale,es.web.common.struts.EssSessionManager,es.web.common.util.Sys" %>
<% 
String basePath = "http://"+request.getServerName()+":"+request.getServerPort()+request.getContextPath(); 
int checkport=request.getServerPort();
if (checkport==443) {
basePath = "https://"+request.getServerName()+request.getContextPath();
}
	response.sendRedirect(basePath+"/admin/login.do");
 %>