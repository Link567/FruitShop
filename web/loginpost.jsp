<%@ page import="cn.acdt.shop.impl.UserDAOImpl" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" pageEncoding="UTF-8" %>
<jsp:useBean id="user" class="cn.acdt.shop.bean.User"></jsp:useBean>
<jsp:setProperty name="user" property="*"></jsp:setProperty>
<%
    UserDAOImpl ui = new UserDAOImpl();
    if (ui.selectUser(user)){
        response.sendRedirect("index.jsp");
    }else {
        response.sendRedirect("login.jsp");
    }
%>