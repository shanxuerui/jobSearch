<%--
  Created by IntelliJ IDEA.
  User: Administrator
  Date: 2019/8/19
  Time: 21:22
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

    <script type="text/javascript" src="js/jquery-1.11.1-min.js"></script>

</head>


<body>

<script type="text/javascript">

    $(function () {
        stuInfor();
    });

    function stuInfor() {
        $.ajax({
            url: "student/searchStudent.do",
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
        <tr>
            <th>学号</th>
            <th>姓名</th>
            <th>年龄</th>
        </tr>

        </thead>

        <tbody id="studentBody">

        </tbody>

    </table>




</div>











</body>
</html>
