<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<%--
  Created by IntelliJ IDEA.
  User: hkisy
  Date: 2021/9/20
  Time: 7:15 下午
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
                <div class="page-header">
                    <h1>
                        <small>课程列表————————————————显示所有课程</small>
                    </h1>
                </div>
            </div>
            <div class="row">
                <div class="col-md-4 column">
                    <a class="btn btn-primary" href="${pageContext.request.contextPath}/course/toAddPage">新增课程</a>
                </div>
            </div>
            <br>
        </div>
    </div>
    <div class="container">
        <div class="row clearfix">
           <table class="table table-hover table-striped">
               <thead>
               <tr>
                   <th>课程代码</th>
                   <th>课程名字</th>
                   <th>课程教师</th>
                   <th>课程描述</th>
                   <th>课程学分</th>
               </tr>
               </thead>
               <tbody>
               <c:forEach var="course" items="${list}">
                   <tr>
                       <td>${course.courseNum}</td>
                       <td>${course.courseName}</td>
                       <td>${course.teacher}</td>
                       <td>${course.description}</td>
                       <td>${course.score}</td>
                   </tr>
               </c:forEach>
               </tbody>
           </table>
        </div>
    </div>
</body>
</html>
