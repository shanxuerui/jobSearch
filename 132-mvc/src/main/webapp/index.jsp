<%--
  Created by IntelliJ IDEA.
  User: Administrator
  Date: 2019/8/21
  Time: 16:29
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
    <font color="red" size="50px">SSM整合</font><br><br>
    <img src="images/lyf.jpg"/>
    <table>
        <tr>
            <td><a href="addStudent.jsp">添加学生1</a></td>
        </tr>

        <tr>
            <td><a href="student/jump.do?target=addStudent2">添加学生2</a></td>
        </tr>

        <tr>
            <td><a href="student/jump.do?target=studentList">查询</a></td>
        </tr>
    </table>
</div>
</body>
</html>
