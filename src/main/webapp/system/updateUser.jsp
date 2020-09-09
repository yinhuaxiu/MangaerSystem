<%--
  Created by IntelliJ IDEA.
  User: nzq
  Date: 2020/6/21
  Time: 21:43
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>

<head>
    <meta charset="utf-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">


    <title>学校后台管理</title>


    <!-- Tell the browser to be responsive to screen width -->
    <meta content="width=device-width,initial-scale=1,maximum-scale=1,user-scalable=no" name="viewport">
    <!-- Bootstrap 3.3.6 -->
    <!-- Font Awesome -->
    <!-- Ionicons -->
    <!-- Theme style -->
    <!-- iCheck -->
    <!-- HTML5 Shim and Respond.js IE8 support of HTML5 elements and media queries -->
    <!-- WARNING: Respond.js doesn't work if you view the page via file:// -->
    <!--[if lt IE 9]>
    <script src="https://oss.maxcdn.com/html5shiv/3.7.3/html5shiv.min.js"></script>
    <script src="https://oss.maxcdn.com/respond/1.4.2/respond.min.js"></script>
    <![endif]-->

    <link rel="stylesheet" href="../plugins/bootstrap/css/bootstrap.min.css">
    <link rel="stylesheet" href="../plugins/font-awesome/css/font-awesome.min.css">
    <link rel="stylesheet" href="../plugins/ionicons/css/ionicons.min.css">
    <link rel="stylesheet" href="../plugins/adminLTE/css/AdminLTE.css">
    <link rel="stylesheet" href="../plugins/iCheck/square/blue.css">
</head>

<body class="hold-transition register-page">
<div class="register-box">
    <div class="register-logo">


        <a href="all-admin-index.html"><b>学校</b>后台管理系统</a>


    </div>

    <div class="register-box-body">
        <p class="login-box-msg">用户修改密码</p>

        <form action="${pageContext.request.contextPath}/user/updateUserByUseName.action" id="updatePassword" method="post">
            <div>${sessionScope.username}</div>
            <div class="form-group has-feedback">
                <input type="text" class="form-control" placeholder="原密码" name="oldPassword">
                <span class="glyphicon glyphicon-lock form-control-feedback"></span>
            </div>

            <%--<div class="form-group has-feedback">
                <input style="border: none" type="text" class="form-control">
            </div>--%>

            <div class="form-group has-feedback">
                <input type="password" class="form-control" placeholder="新密码" name="newPassword">
                <span class="glyphicon glyphicon-lock form-control-feedback"></span>
            </div>
        <%--    <div class="form-group has-feedback">
                <input type="text" class="form-control">
                <span class="glyphicon glyphicon-lock form-control-feedback"></span>
            </div>--%>
            <div class="form-group has-feedback">
                <input type="password" class="form-control" placeholder="确认密码" name="newPasswordCheck">
                <span class="glyphicon glyphicon-log-in form-control-feedback"></span>
            </div>
<%--            <div class="form-group has-feedback">--%>
<%--                <input type="text" class="form-control">--%>
<%--                <span class="glyphicon glyphicon-lock form-control-feedback"></span>--%>
<%--            </div>--%>
            <div class="row">
                <div class="col-xs-8">
                    <div class="checkbox icheck">
                        <label>
                            <input type="submit"  value="提交修改"
                                   style="width:80px; height: 34px;background-color: #3c8dbc; color: white;border: none;margin-top:-10px;">
                        </label>
                    </div>
                </div>
                <!-- /.col -->
                <div class="col-xs-4">
                    <a href=""><button type="button" class="btn btn-primary btn-block btn-flat" >确定修改</button></a>
                    <!--对应后台controller中user类的修改用户密码-->
                </div>
                <!-- /.col -->
            </div>
        </form>

        <br>
        <div class="social-auth-links text-center">
            <p style="color: #FF0000;">为了您得账户安全在请谨慎修改，尽量避免使用生日等易破解密码</p>
            <!--<a href="#" class="btn btn-block btn-social btn-facebook btn-flat"><i class="fa fa-qq"></i> 腾讯QQ用户登录</a>
            <a href="#" class="btn btn-block btn-social btn-google btn-flat"><i class="fa fa-weixin"></i> 微信用户登录</a> -->
        </div>
        <br>

        <a href="${pageContext.request.contextPath}/main/main_Page.action" class="text-center">取消修改，返回主页</a>
    </div>
    <!-- /.form-box -->
</div>
<!-- /.register-box -->

<!-- jQuery 2.2.3 -->
<!-- Bootstrap 3.3.6 -->
<!-- iCheck -->
<script src="../plugins/jQuery/jquery-2.2.3.min.js"></script>
<script src="../plugins/bootstrap/js/bootstrap.min.js"></script>
<script src="../plugins/iCheck/icheck.min.js"></script>
<script>
    $(function() {
        $('input').iCheck({
            checkboxClass: 'icheckbox_square-blue',
            radioClass: 'iradio_square-blue',
            increaseArea: '20%' // optional
        });
    });

</script>
</body>

</html>