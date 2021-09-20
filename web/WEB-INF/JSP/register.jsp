<%--
  Created by IntelliJ IDEA.
  User: hkisy
  Date: 2021/9/20
  Time: 9:34 下午
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>register</title>
    <link href="https://cdn.staticfile.org/twitter-bootstrap/3.3.7/css/bootstrap.min.css" rel="stylesheet">

</head>
<body>
<div class="container">
    <div class="row clearfix">
        <div class="col-md-12 column">
            <div class="page-header">
                <h1>
                    <small>用户注册</small>
                </h1>
            </div>
        </div>
    </div>
    <form id="register" action="/welcome/register">
        <div class="form-group">
            <label>Username：</label>
            <input type="text" name="username" class="form-control">
        </div>
        <div class="form-group">
            <label>password：</label>
            <input type="password" name="password" class="form-control">
        </div>
        <div class="form-group">
            <label>password：</label>
            <input type="text" name="nickname" class="form-control">
        </div>
        <br>
        <div class="form-group">
            <input type="submit" class="btn btn-primary" value="register">
        </div>
    </form>
    <form id="cancel" action="/welcome/cancel">
        <div class="form-group">
            <input type="submit" class="btn btn-primary" value="cancel">
        </div>
    </form>
</div>
</body>
</html>
