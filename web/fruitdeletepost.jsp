<%@ page import="cn.acdt.shop.impl.FruitDAOImpl" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" pageEncoding="UTF-8" %>
<%
String deletename = request.getParameter("deleteName");
    FruitDAOImpl fui = new FruitDAOImpl();
if (fui.delete(deletename)){
    out.print("<script>alert('删除成功');window.location='fruitdelete.jsp'</script>");
}else {
    out.print("<script>alert('删除失败');window.location='fruitdelete.jsp'</script>");
}
%>