<%--
  Created by IntelliJ IDEA.
  User: hkisy
  Date: 2021/9/21
  Time: 4:08 下午
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
    <link href="https://cdn.staticfile.org/twitter-bootstrap/3.3.7/css/bootstrap.min.css" rel="stylesheet">

</head>
<body>
<div class="container">
    <div class="row clearfix">
        <div class="col-md-12 column">
            <div class="page-header">
                <h1>
                    <small>选课</small>
                </h1>
            </div>
        </div>
    </div>
    <form id="selectCourse" action="/chose/selectCourse">
        <div class="form-group">
            <label>学生编号：</label>
            <input type="text" name="studentId" class="form-control">
        </div>
        <div class="form-group">
            <label>课程编号：</label>
            <input type="text" name="courseId" class="form-control">
        </div>
        <br>
        <div class="form-group">
            <input type="submit" class="btn btn-primary" value="确认">
        </div>
    </form>
    <form id="cancel" action="/chose/cancel">
        <div class="form-group">
            <input type="submit" class="btn btn-primary" value="cancel">
        </div>
    </form>
</div>
</body>
</html>
