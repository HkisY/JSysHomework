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
    <title>查询页面</title>
    <link href="https://cdn.staticfile.org/twitter-bootstrap/3.3.7/css/bootstrap.min.css" rel="stylesheet">

</head>
<body>
<div class="container">
    <div class="row clearfix">
        <div class="col-md-12 column">
            <div class="page-header">
                <h1>
                    <small>查询页面————————————————————</small>
                </h1>
            </div>
        </div>
        <div class="row">
            <div class="col-md-1 column">
                <a class="btn btn-primary" href="${pageContext.request.contextPath}/student/allUndergraduate">查询本科生</a>
            </div>
            <div class="col-md-1 column">
                <a class="btn btn-primary" href="${pageContext.request.contextPath}/student/allPostgraduate">查询研究生</a>
            </div>
        </div>
        <br>
    </div>
</div>
</body>
</html>
