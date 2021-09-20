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
    <title>addCourse</title>
    <link href="https://cdn.staticfile.org/twitter-bootstrap/3.3.7/css/bootstrap.min.css" rel="stylesheet">

</head>
<body>
    <div class="container">
        <div class="row clearfix">
            <div class="col-md-12 column">
                <div class="page-header">
                    <h1>
                        <small>新增课程</small>
                    </h1>
                </div>
            </div>
        </div>

        <form action="${pageContext.request.contextPath}/course/addCourse" method="post">
            <div class="form-group">
                <label>课程编号：</label>
                <input type="text" name="courseNum" class="form-control">
            </div>
            <div class="form-group">
                <label>课程名字：</label>
                <input type="text" name="courseName" class="form-control">
            </div>
            <div class="form-group">
                <label>任课教师：</label>
                <input type="text" name="teacher" class="form-control">
            </div>
            <div class="form-group">
                <label>课程描述：</label>
                <input type="text" name="description" class="form-control">
            </div>
            <div class="form-group">
                <label>学 分：</label>
                <input type="text" name="score" class="form-control">
            </div>
            <br>
            <div class="form-group">
                <input type="submit" class="btn btn-primary" value="添加">
            </div>
        </form>
    </div>
</body>
</html>
