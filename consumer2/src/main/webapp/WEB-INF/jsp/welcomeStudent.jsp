<%--
  Created by IntelliJ IDEA.
  User: 86176
  Date: 2022/5/22
  Time: 9:35
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
welcome student

    1.请假,请填写表格
    <form action="toLeave" method="post">
        <label>学号:</label><input name="id"/>
        <br>
        <label>姓名:</label><input name="userName"/>
        <br>
        <label>班级:</label><input name="classId"/>
        <br>
        <label>理由:</label><input name="reason"/>
        <p></p>
        <input type="submit" value="确认">
    </form>

    2.请假情况
    <form action="viewResult" method="post">
        <label>学号:</label><input name="id"/>
        <input type="submit" value="查看">
    </form>


    3.销假,请填写表格
    <form action="removeLeave" method="post">
        <label>学号:</label><input name="id"/>
        <br>
        <label>姓名:</label><input name="userName"/>
        <br>
        <label>返回时间</label><input name="time"/>
        <br>
        <input type="submit" value="确认">
    </form>



</body>
</html>
