<%--
  Created by IntelliJ IDEA.
  User: Administrator
  Date: 2019/8/19
  Time: 20:04
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
            注册优质学生
    <form action="student/addStudent.do" method="post">
        <table>
            <tr>
                <td>姓名</td>
                <td><input type="text" name="name"/></td>
            </tr>
            <tr>
                <td>年龄</td>
                <td><input type="text" name="age"/></td>
            </tr>
            <tr>
                <td>提交</td>
                <td><input type="submit" value="添加学生"/></td>
            </tr>
        </table>
    </form>

</div>

</body>
</html>
