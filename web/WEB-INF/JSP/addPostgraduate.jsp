<%--
  Created by IntelliJ IDEA.
  User: hkisy
  Date: 2021/9/20
  Time: 10:23 下午
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>addStudent</title>
    <link href="https://cdn.staticfile.org/twitter-bootstrap/3.3.7/css/bootstrap.min.css" rel="stylesheet">

</head>
<body>
<div class="container">
    <div class="row clearfix">
        <div class="col-md-12 column">
            <div class="page-header">
                <h1>
                    <small>新增研究生</small>
                </h1>
            </div>
        </div>
    </div>

    <form action="${pageContext.request.contextPath}/student/addPostgraduate" method="post">
        <div class="form-group">
            <label>学生学号：</label>
            <input type="text" name="studentId" class="form-control">
        </div>
        <div class="form-group">
            <label>学生名字：</label>
            <input type="text" name="name" class="form-control">
        </div>
        <div class="form-group">
            <label>学生性别：</label>
            <input type="text" name="gender" class="form-control">
        </div>
        <div class="form-group">
            <label>学生年级：</label>
            <input type="text" name="grade" class="form-control">
        </div>
        <div class="form-group">
            <label>学生生日：</label>
            <input type="text" name="birthday" class="form-control">
        </div>
        <div class="form-group">
            <label>学生专业：</label>
            <input type="text" name="major" class="form-control">
        </div>
        <div class="form-group">
            <label>专业：</label>
            <input type="text" name="major" class="form-control">
        </div>
        <div class="form-group">
            <label>研究方向：</label>
            <input type="text" name="research" class="form-control">
        </div>
        <br>
        <div class="form-group">
            <input type="submit" class="btn btn-primary" value="添加">
        </div>
    </form>
</div>
</body>
</html>
