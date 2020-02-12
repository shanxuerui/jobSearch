<%--
  Created by IntelliJ IDEA.
  User: Administrator
  Date: 2019/8/21
  Time: 16:32
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
<div align="center">
    <font color="red" size="33px">注册学生</font><br>

    <form action="student/add.do" method="post">
        <table>
            <tr>
                <td><font color="red">姓名</font></td>
                <td><input type="text" name="name"/></td>
            </tr>

            <tr>
                <td><font color="red">年龄</font></td>
                <td><input type="text" name="age"/></td>
            </tr>

            <tr>
                <td><input type="submit" value="增加学生"></td>
            </tr>
        </table>
    </form>
</div>
</body>
</html>
