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
    <script type="text/javascript" src="js/jquery-1.11.1-min.js"></script>
    <title>Title</title>
</head>
<body>

<script type="text/javascript">

    $(function () {
        stuInfor();
    });

    function stuInfor() {
        $.ajax({
            url: "student/search.do",
            type: "get",
            dataType: "json",
            success: function (data) {
                var html = "";

                $.each(data, function (i, n) {
                    html += "<tr>";
                    html += "<td>" + n.id + "</td>";
                    html += "<td>" + n.name + "</td>";
                    html += "<td>" + n.age + "</td>";
                    html += "</tr>";
                });


                $("#studentBody").html(html);
            }
        })
    }

</script>

<div align="center">
    <table>
        <thead>
        <th>id</th>
        <th>姓名</th>
        <th>年龄</th>
        </thead>
        <tbody id="studentBody">
        <!-- 显示数据 -->
        </tbody>
    </table>
</div>

</body>
</html>
