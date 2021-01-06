<%@ page import="cn.acdt.shop.impl.FruitDAOImpl" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" pageEncoding="UTF-8" %>

<jsp:useBean id="fruit" class="cn.acdt.shop.bean.Fruit"></jsp:useBean>
<jsp:setProperty name="fruit" property="*"></jsp:setProperty>
<%
    FruitDAOImpl fu = new FruitDAOImpl();
    if(fu.addFruit(fruit)){
//        response.sendRedirect("index.jsp");
        out.print("<script>alert('录入成功');window.location='FruitEntry.jsp'</script>");
    }else {
        out.print("<script>alert('可是录入失败');window.location='FruitEntry.jsp'</script>");
//        response.sendRedirect("FruitEntry.jsp");
    }
%>
