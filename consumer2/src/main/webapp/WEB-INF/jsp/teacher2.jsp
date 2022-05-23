<%--
  Created by IntelliJ IDEA.
  User: 86176
  Date: 2022/5/23
  Time: 14:39
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>

    有学生请假<br>
    ${requestScope.msg}

    处理学生请求
    <br>
    <form action="handlerLeave" method="post">
        <br>
        <label>学号:</label><input name="studentId"/>
        <br>
        <label>是否同意:</label><input name="state"/>
        <br>
        (同意请求请输入1  不同意请输入2)
        <input type="submit" value="审批">
    </form>

</body>
</html>
