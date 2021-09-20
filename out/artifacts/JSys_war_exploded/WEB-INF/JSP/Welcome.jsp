<%--
  Created by IntelliJ IDEA.
  User: hkisy
  Date: 2021/9/20
  Time: 2:52 下午
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>课程展示页面</title>
    <link href="https://cdn.staticfile.org/twitter-bootstrap/3.3.7/css/bootstrap.min.css" rel="stylesheet">

</head>
<body>
<div class="container">
    <div class="row clearfix">
        <div class="col-md-12 column">
            <h4>将就看吧，我是前端废物之选课系统</h4>
        </div>
    </div>
</div>
<div class="container">
    <div class="row clearfix">
        <div class="col-md-12 column">
            <div class="page-header">
                <h1>
                    <small>用户登录</small>
                </h1>
            </div>
        </div>
    </div>
    <form id="login" action="/welcome/login">
        <div class="form-group">
            <label>课程编号：</label>
            <input type="text" name="username" class="form-control">
        </div>
        <div class="form-group">
            <label>课程名字：</label>
            <input type="password" name="password" class="form-control">
        </div>
        <br>
        <div class="form-group">
            <input type="submit" class="btn btn-primary" value="login">
        </div>
    </form>
    <form id="register" action="/welcome/registerPage">
        <div class="form-group">
            <input type="submit" class="btn btn-primary" value="register">
        </div>
    </form>
</div>

</body>
</html>
