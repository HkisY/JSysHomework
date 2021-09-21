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
  <title>学生展示页面</title>
  <link href="https://cdn.staticfile.org/twitter-bootstrap/3.3.7/css/bootstrap.min.css" rel="stylesheet">

</head>
<body>
<div class="container">
  <div class="row clearfix">
    <div class="col-md-12 column">
      <div class="page-header">
        <h1>
          <small>学生列表————————————————显示所有学生</small>
        </h1>
      </div>
    </div>
    <div class="row">
      <div class="col-md-2 column">
        <a class="btn btn-primary" href="${pageContext.request.contextPath}/student/toUpdatePage">修改学生信息</a>
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
        <th>学生编码</th>
        <th>学生名字</th>
        <th>学生性别</th>
        <th>学生年级</th>
        <th>学生生日</th>
        <th>学生专业</th>
        <th>学生班级</th>
        <th>班级老师</th>
      </tr>
      </thead>
      <tbody>
      <c:forEach var="undergraduate" items="${list}">
        <tr>
          <td>${undergraduate.studentId}</td>
          <td>${undergraduate.name}</td>
          <td>${undergraduate.gender}</td>
          <td>${undergraduate.grade}</td>
          <td>${undergraduate.birthday}</td>
          <td>${undergraduate.major}</td>
          <td>${undergraduate.className}</td>
          <td>${undergraduate.teacher}</td>
        </tr>
      </c:forEach>
      </tbody>
    </table>
  </div>
</div>
</body>
</html>
