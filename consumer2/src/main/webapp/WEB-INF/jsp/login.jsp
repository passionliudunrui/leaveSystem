<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>登录页面</title>
</head>
<body>

    <form action="login" method="post">
        <br>
        <label>账号:</label><input name="id"/>
        <br>
        <label>密码:</label><input name="password"/>
        <br>
        <label>student or teacher:</label><input name="choice"/>
        <p></p>
        <input type="submit" value="登录">
    </form>
    <br>
    <form action="register" method="post">
        <input type="submit" value="注册">

    </form>

</body>

</html>