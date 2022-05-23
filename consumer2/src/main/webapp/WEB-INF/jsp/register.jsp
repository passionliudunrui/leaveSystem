<%--
  Created by IntelliJ IDEA.
  User: 86176
  Date: 2022/5/22
  Time: 20:13
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>

    <form action="toRegister" method="post">
        <br>
        <label>账号:</label><input name="id"/>
        <br>
        <label>姓名:</label><input name="userName"/>
        <br>
        <label>班级:</label><input name="classId"/>
        <br>
        <label>密码:</label><input name="password"/>
        <br>
        <label>student or teacher </label> <input name="choice">
        <br>
        <input type="submit" value="toRegister">
    </form>

</body>
</html>
