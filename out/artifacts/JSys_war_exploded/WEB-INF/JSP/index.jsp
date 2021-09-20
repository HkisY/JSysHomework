<%--
  Created by IntelliJ IDEA.
  User: hkisy
  Date: 2018/6/8
  Time: 上午10:09
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<!DOCTYPE html>
<html lang="zh-CN">
<head>
  <meta charset="UTF-8">
  <title>Login</title>
  <meta name="renderer" content="webkit">
  <meta http-equiv="X-UA-Compatible" content="IE=edge">

  <link rel="stylesheet" href="../../resources/bootstrap.min.js/css/bootstrap.css">
  <link rel="stylesheet" href="../../resources/css/login/login.css">


  <script src="resources/jquery/jquery-3.3.1.min.js"></script>
  <script src="../../resources/bootstrap.min.js/js/bootstrap.min.js"></script>
  <script src="../../resources/js/welcome/login.js"></script>


</head>
<body>
<div>
  <div>
    <!--背景图层-->
    <div class="loginBack">

    </div>
    <!--主体注册于登录区块-->
    <div class="login-form">
      <form id="loginForm" method="post">
        <div class="bg-primary">
          <div class="position">
            <label>Username</label>
          </div>
          <input style="color: black;" id="username" name="username" type="text" placeholder="username">
        </div>

        <div class="bg-primary">
          <div class="position">
            <label>Password</label>
          </div>
          <input style="color: black;" id="password" name="password" type="password"
                 placeholder="password">
        </div>

        <div class="btn">
          <button class="btn" type="button" onclick="login()">login</button>
          <button class="btn" id="register" type="button" onclick="logon()">register</button>
        </div>
      </form>
    </div>
  </div>
</div>

</body>

</html>

