
<%@ page contentType="text/html;charset=UTF-8" language="java" pageEncoding="UTF-8" %>
<html>
<head>
    <title>水果信息录入</title>
</head>
<body>
<form action="FruitInformationProcessing.jsp" method="post">
水果名字:<input type="text" name="name">
水果数量:<input type="text" name="num">
水果价格:<input type="text" name="price">
水果折扣:<input type="text" name="discount">
<%--水果录入时间:<input type="text" name="time">--%>
    <input type="submit" value="提交">
</form>
</body>
</html>
