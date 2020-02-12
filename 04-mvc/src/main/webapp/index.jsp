<%--
  Created by IntelliJ IDEA.
  User: Administrator
  Date: 2019/8/16
  Time: 22:57
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%
    String basePath = request.getScheme() + "://" + request.getServerName() + ":" + request.getServerPort() + request.getContextPath() + "/";
%>
<html>
<head>
    <base href="<%=basePath%>">
    <title>Title</title>
</head>
<body>
1
<form action="sxr.do" method="post">
    姓名<input type="text" name="name"><br>
    年龄<input type="text" name="age"><br>
    <input type="submit" value="提交">

</form>

student
<form action="sn.do" method="post">
    姓名<input type="text" name="name"><br>
    年龄<input type="text" name="age"><br>
    <input type="submit" value="提交">

</form>


 3 如果控制器方法的形参名和请求中参数名不一样。
<form action="sss.do" method="post">
    姓名<input type="text" name="sname"><br>
    年龄<input type="text" name="sage"><br>
    <input type="submit" value="提交">

</form>

</body>
</html>
