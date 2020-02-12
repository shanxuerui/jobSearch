<%--
  Created by IntelliJ IDEA.
  User: Administrator
  Date: 2019/8/19
  Time: 17:31
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
    SMM整合的例子<br>
    <img src="images/mn.jpg"/>
    <table>
        <tr>
            <td><a href="addStudent.jsp">学生添加方式11</a></td>

        </tr>
        <tr>
            <td><a href="student/jump.do?target=addStudent22">学生添加方式22</a></td>

        </tr>
        <tr>
            <td><a href="student/jump.do?target=listStudent">学生查询方式</a></td>

        </tr>
    </table>





</div>

</body>
</html>
