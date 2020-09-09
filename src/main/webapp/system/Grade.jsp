<%--
  Created by IntelliJ IDEA.
  User: a
  Date: 2020/6/20
  Time: 11:00
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>

<!DOCTYPE html>
<html>

<head>
    <!-- 页面meta -->
    <meta charset="utf-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">


    <title>学校后台管理系统</title>
    <meta name="description" content="学校后台管理系统">
    <meta name="keywords" content="学校后台管理系统">


    <script src="https://oss.maxcdn.com/html5shiv/3.7.3/html5shiv.min.js"></script>
    <script src="https://oss.maxcdn.com/respond/1.4.2/respond.min.js"></script>
    <script type="text/javascript" src="${pageContext.request.contextPath }/js/jquery-1.4.4.min.js"></script>
    <script type="text/javascript" src="${pageContext.request.contextPath }/js/highcharts.js"></script>
    <script src="https://cdn.bootcss.com/echarts/4.2.1-rc1/echarts.min.js" type="text/javascript"></script>

    <![endif]-->


    <link rel="stylesheet" href="../plugins/bootstrap/css/bootstrap.min.css">
    <link rel="stylesheet" href="../plugins/font-awesome/css/font-awesome.min.css">
    <link rel="stylesheet" href="../plugins/ionicons/css/ionicons.min.css">
    <link rel="stylesheet" href="../plugins/iCheck/square/blue.css">
    <link rel="stylesheet" href="../plugins/morris/morris.css">
    <link rel="stylesheet" href="../plugins/jvectormap/jquery-jvectormap-1.2.2.css">
    <link rel="stylesheet" href="../plugins/datepicker/datepicker3.css">
    <link rel="stylesheet" href="../plugins/daterangepicker/daterangepicker.css">
    <link rel="stylesheet" href="../plugins/bootstrap-wysihtml5/bootstrap3-wysihtml5.min.css">
    <link rel="stylesheet" href="../plugins/datatables/dataTables.bootstrap.css">
    <link rel="stylesheet" href="../plugins/treeTable/jquery.treetable.css">
    <link rel="stylesheet" href="../plugins/treeTable/jquery.treetable.theme.default.css">
    <link rel="stylesheet" href="../plugins/select2/select2.css">
    <link rel="stylesheet" href="../plugins/colorpicker/bootstrap-colorpicker.min.css">
    <link rel="stylesheet" href="../plugins/bootstrap-markdown/css/bootstrap-markdown.min.css">
    <link rel="stylesheet" href="../plugins/adminLTE/css/AdminLTE.css">
    <link rel="stylesheet" href="../plugins/adminLTE/css/skins/_all-skins.min.css">
    <link rel="stylesheet" href="../css/style.css">
    <link rel="stylesheet" href="../plugins/ionslider/ion.rangeSlider.css">
    <link rel="stylesheet" href="../plugins/ionslider/ion.rangeSlider.skinNice.css">
    <link rel="stylesheet" href="../plugins/bootstrap-slider/slider.css">
    <link rel="stylesheet" href="../plugins/bootstrap-datetimepicker/bootstrap-datetimepicker.css">
</head>

<body class="hold-transition skin-purple sidebar-mini">

<div class="wrapper">

    <!-- 页面头部 -->
    <header class="main-header">


        <!-- Logo -->
        <a href="all-admin-index.html" class="logo">
            <!-- mini logo for sidebar mini 50x50 pixels -->
            <span class="logo-mini"><b>学校</b></span>
            <!-- logo for regular state and mobile devices -->
            <span class="logo-lg"><b>学校</b>后台管理</span>
        </a>


        <!-- Header Navbar: style can be found in header.less -->
        <nav class="navbar navbar-static-top">
            <!-- Sidebar toggle button-->
            <a href="#" class="sidebar-toggle" data-toggle="offcanvas" role="button">
                <span class="sr-only">Toggle navigation</span>
            </a>

            <div class="navbar-custom-menu">
                <ul class="nav navbar-nav">
                    <!-- Messages: style can be found in dropdown.less-->
                    <li class="dropdown messages-menu">
                        <a href="#" class="dropdown-toggle" data-toggle="dropdown">
                            <i class="fa fa-envelope-o"></i>
                            <span class="label label-success">4</span>
                        </a>
                        <ul class="dropdown-menu">
                            <li class="header">你有4个邮件</li>
                            <li>
                                <!-- inner menu: contains the actual data -->
                                <ul class="menu">
                                    <li>
                                        <!-- start message -->
                                        <a href="#">
                                            <div class="pull-left">
                                                <img src="../img/paypal.png" class="img-circle" alt="User Image">
                                            </div>
                                            <h4>
                                                系统消息
                                                <small><i class="fa fa-clock-o"></i> 5 分钟前</small>
                                            </h4>
                                            <p>欢迎登录系统?</p>
                                        </a>
                                    </li>
                                    <!-- end message -->
                                    <li>
                                        <a href="#">
                                            <div class="pull-left">
                                                <img src="../img/paypal.png" class="img-circle" alt="User Image">
                                            </div>
                                            <h4>
                                                团队消息
                                                <small><i class="fa fa-clock-o"></i> 2 小时前</small>
                                            </h4>
                                            <p>你有新的任务了</p>
                                        </a>
                                    </li>
                                    <li>
                                        <a href="#">
                                            <div class="pull-left">
                                                <img src="../img/paypal.png" class="img-circle" alt="User Image">
                                            </div>
                                            <h4>
                                                Developers
                                                <small><i class="fa fa-clock-o"></i> Today</small>
                                            </h4>
                                            <p>Why not buy a new awesome theme?</p>
                                        </a>
                                    </li>
                                    <li>
                                        <a href="#">
                                            <div class="pull-left">
                                                <img src="../img/paypal.png" class="img-circle" alt="User Image">
                                            </div>
                                            <h4>
                                                Sales Department
                                                <small><i class="fa fa-clock-o"></i> Yesterday</small>
                                            </h4>
                                            <p>Why not buy a new awesome theme?</p>
                                        </a>
                                    </li>
                                    <li>
                                        <a href="#">
                                            <div class="pull-left">
                                                <img src="../img/paypal.png" class="img-circle" alt="User Image">
                                            </div>
                                            <h4>
                                                Reviewers
                                                <small><i class="fa fa-clock-o"></i> 2 days</small>
                                            </h4>
                                            <p>Why not buy a new awesome theme?</p>
                                        </a>
                                    </li>
                                </ul>
                            </li>
                            <li class="footer"><a href="#">See All Messages</a></li>
                        </ul>
                    </li>
                    <!-- Notifications: style can be found in dropdown.less -->
                    <li class="dropdown notifications-menu">
                        <a href="#" class="dropdown-toggle" data-toggle="dropdown">
                            <i class="fa fa-bell-o"></i>
                            <span class="label label-warning">10</span>
                        </a>
                        <ul class="dropdown-menu">
                            <li class="header">你有10个新消息</li>
                            <li>
                                <!-- inner menu: contains the actual data -->
                                <ul class="menu">
                                    <li>
                                        <a href="#">
                                            <i class="fa fa-users text-aqua"></i> 5 new members joined today
                                        </a>
                                    </li>
                                    <li>
                                        <a href="#">
                                            <i class="fa fa-warning text-yellow"></i> Very long description here that may not
                                            fit into the page and may cause design problems
                                        </a>
                                    </li>
                                    <li>
                                        <a href="#">
                                            <i class="fa fa-users text-red"></i> 5 new members joined
                                        </a>
                                    </li>
                                    <li>
                                        <a href="#">
                                            <i class="fa fa-shopping-cart text-green"></i> 25 sales made
                                        </a>
                                    </li>
                                    <li>
                                        <a href="#">
                                            <i class="fa fa-user text-red"></i> You changed your username
                                        </a>
                                    </li>
                                </ul>
                            </li>
                            <li class="footer"><a href="#">View all</a></li>
                        </ul>
                    </li>
                    <!-- Tasks: style can be found in dropdown.less -->
                    <li class="dropdown tasks-menu">
                        <a href="#" class="dropdown-toggle" data-toggle="dropdown">
                            <i class="fa fa-flag-o"></i>
                            <span class="label label-danger">9</span>
                        </a>
                        <ul class="dropdown-menu">
                            <li class="header">你有9个新任务</li>
                            <li>
                                <!-- inner menu: contains the actual data -->
                                <ul class="menu">
                                    <li>
                                        <!-- Task item -->
                                        <a href="#">
                                            <h3>
                                                Design some buttons
                                                <small class="pull-right">20%</small>
                                            </h3>
                                            <div class="progress xs">
                                                <div class="progress-bar progress-bar-aqua" style="width: 20%" role="progressbar" aria-valuenow="20" aria-valuemin="0" aria-valuemax="100">
                                                    <span class="sr-only">20% Complete</span>
                                                </div>
                                            </div>
                                        </a>
                                    </li>
                                    <!-- end task item -->
                                    <li>
                                        <!-- Task item -->
                                        <a href="#">
                                            <h3>
                                                Create a nice theme
                                                <small class="pull-right">40%</small>
                                            </h3>
                                            <div class="progress xs">
                                                <div class="progress-bar progress-bar-green" style="width: 40%" role="progressbar" aria-valuenow="20" aria-valuemin="0" aria-valuemax="100">
                                                    <span class="sr-only">40% Complete</span>
                                                </div>
                                            </div>
                                        </a>
                                    </li>
                                    <!-- end task item -->
                                    <li>
                                        <!-- Task item -->
                                        <a href="#">
                                            <h3>
                                                Some task I need to do
                                                <small class="pull-right">60%</small>
                                            </h3>
                                            <div class="progress xs">
                                                <div class="progress-bar progress-bar-red" style="width: 60%" role="progressbar" aria-valuenow="20" aria-valuemin="0" aria-valuemax="100">
                                                    <span class="sr-only">60% Complete</span>
                                                </div>
                                            </div>
                                        </a>
                                    </li>
                                    <!-- end task item -->
                                    <li>
                                        <!-- Task item -->
                                        <a href="#">
                                            <h3>
                                                Make beautiful transitions
                                                <small class="pull-right">80%</small>
                                            </h3>
                                            <div class="progress xs">
                                                <div class="progress-bar progress-bar-yellow" style="width: 80%" role="progressbar" aria-valuenow="20" aria-valuemin="0" aria-valuemax="100">
                                                    <span class="sr-only">80% Complete</span>
                                                </div>
                                            </div>
                                        </a>
                                    </li>
                                    <!-- end task item -->
                                </ul>
                            </li>
                            <li class="footer">
                                <a href="#">View all tasks</a>
                            </li>
                        </ul>
                    </li>
                    <!-- User Account: style can be found in dropdown.less -->
                    <li class="dropdown user user-menu">
                        <a href="#" class="dropdown-toggle" data-toggle="dropdown">
                            <img src="../img/paypal.png" class="user-image" alt="User Image">
                            <span class="hidden-xs">三小只团队</span>
                        </a>
                        <ul class="dropdown-menu">
                            <!-- User image -->
                            <li class="user-header">
                                <img src="../img/user2-160x160.jpg" class="img-circle" alt="User Image">

                                <p>
                                    三小只团队 - ${sessionScope.username}
                                    <!--<small>最后登录 11:20AM</small>-->
                                </p>
                            </li>

                            <li class="user-footer">
                                <div class="pull-left">
                                    <a href="${pageContext.request.contextPath}/main/update_Page.action?username=${sessionScope.username}"> 修改密码</a>  <!--此处要对应user的修改功能-->
                                </div>
                                <div class="pull-right">
                                    <a href="${pageContext.request.contextPath}/system/login.jsp">退出</a>  <!--此处要对应user的删除功能-->
                                </div>
                            </li>
                        </ul>
                    </li>

                </ul>
            </div>
        </nav>
    </header>
    <!-- 页面头部 /-->

    <!-- 导航侧栏 -->
    <aside class="main-sidebar">
        <!-- sidebar: style can be found in sidebar.less -->
        <section class="sidebar">
            <!-- Sidebar user panel -->
            <div class="user-panel">
                <div class="pull-left image">
                    <img src="../img/paypal.png" style="width: 140px;height: 40px;" class="img-circle" alt="User Image">
                </div>
                <div class="pull-left info">
                    <p>三小只团队 - ${sessionScope.username}</p>
                    <a href="#"><i class="fa fa-circle text-success"></i> 在线</a>
                </div>
            </div>

            <!-- sidebar menu: : style can be found in sidebar.less -->
            <ul class="sidebar-menu">
                <li class="header">菜单</li>

                <li id="admin-index"><a href="${pageContext.request.contextPath}/main/main_Page.action"><i class="fa fa-dashboard"></i>
                    <span>首页</span></a></li>

                <!-- 菜单 -->
                <li class="treeview">
                    <a href="#">
                        <i class="fa fa-folder"></i> <span>管理中心</span>
                        <span class="pull-right-container">
                        <i class="fa fa-angle-left pull-right"></i>
                    </span>
                    </a>
                    <ul class="treeview-menu">

                        <li id="admin-login">
                            <a href="${pageContext.request.contextPath}/user/deleteUserById_Page.action">   <!--进行页面跳转然后完成后台user的删除功能-->
                                <i class="fa fa-circle-o"></i> 注销
                            </a>
                        </li>

                        <li id="admin-register">
                            <a href="${pageContext.request.contextPath}/main/register_Page.action">   <!--进行页面跳转然后完成后台user的增加功能-->
                                <i class="fa fa-circle-o"></i> 注册
                            </a>
                        </li>

                        <li id="admin-profile">
                            <a href="${pageContext.request.contextPath}/main/update_Page.action?username=${sessionScope.username}">   <!--对应后台的修改user功能-->
                                <i class="fa fa-circle-o"></i> 修改密码
                            </a>
                        </li>
                    </ul>
                </li>


                <li class="treeview">
                    <a href="#">
                        <i class="fa fa-pie-chart"></i> <span>学院管理</span>
                        <span class="pull-right-container">
                        <i class="fa fa-angle-left pull-right"></i>
                    </span>
                    </a>
                    <ul class="treeview-menu">

                        <li id="charts-chartjs">
                            <a href="${pageContext.request.contextPath}/aca/academy_Page.action?currentPage=1">
                                <i class="fa fa-circle-o"></i> 学院信息列表
                            </a>
                        </li>
                    </ul>
                </li>


                <li class="treeview">
                    <a href="#">
                        <i class="fa fa-laptop"></i> <span>年级管理</span>
                        <span class="pull-right-container">
                        <i class="fa fa-angle-left pull-right"></i>
                    </span>
                    </a>
                    <ul class="treeview-menu">

                        <li id="elements-general">
                            <a href="${pageContext.request.contextPath}/grade/grade_Page.action?currentPage=1">
                                <i class="fa fa-circle-o"></i> 年级信息列表
                            </a>
                        </li>
                    </ul>
                </li>


                <li class="treeview">
                    <a href="#">
                        <i class="fa fa-cogs"></i> <span>班级管理</span>
                        <span class="pull-right-container">
                        <i class="fa fa-angle-left pull-right"></i>
                    </span>
                    </a>
                    <ul class="treeview-menu">

                        <li id="system-setting">
                            <a href="${pageContext.request.contextPath}/clazz/clazz_Page.action?currentPage=1">
                                <i class="fa fa-circle-o"></i> 班级信息列表
                            </a>
                        </li>

                    </ul>
                </li>


                <li class="treeview">
                    <a href="#">
                        <i class="fa fa-edit"></i> <span>学生管理</span>
                        <span class="pull-right-container">
                        <i class="fa fa-angle-left pull-right"></i>
                    </span>
                    </a>
                    <ul class="treeview-menu">

                        <li id="form-general">
                            <a href="${pageContext. request. contextPath}/main/inforSearch.action">
                                <i class="fa fa-circle-o"></i> 信息查询
                            </a>
                        </li>

                        <li id="form-editors">
                            <a href="${pageContext. request. contextPath}/stu/student_Page.action?currentPage=1">
                                <i class="fa fa-circle-o"></i> 学生信息管理
                            </a>
                        </li>

                        <li id="travellog-setting">
                            <a href="${pageContext.request.contextPath}/health/healthcardrecord_Page.action?currentPage=1">
                                <i class="fa fa-circle-o"></i> 医保卡记录管理
                            </a>
                        </li>

                    </ul>
                </li>
                <!-- 菜单 /-->
            </ul>
        </section>
        <!-- /.sidebar -->
    </aside>
    <!-- 导航侧栏 /-->

    <!-- 内容区域 -->
    <div class="content-wrapper">

        <!-- 内容头部 -->
        <section class="content-header">
            <h1>
                年级管理
                <small>数据列表</small>
            </h1>
            <ol class="breadcrumb">
                <li>首页</li>
                <li>年级管理</li>
                <li class="active">数据列表</li>
            </ol>
        </section>
        <!-- 内容头部 /-->

        <!-- 正文区域 -->
        <section class="content">

            <!-- .box-body -->
            <div class="box box-primary">
                <div class="box-header with-border">
                    <h3 class="box-title">列表</h3>
                </div>

                <div class="box-body">

                    <!-- 数据表格 -->
                    <div class="table-box">

                        <!--工具栏-->
                        <div class="pull-left">
                            <div class="form-group form-inline">
                                <div class="btn-group">
                                    <a href="${pageContext.request.contextPath}/grade/toAddGrade.action">
                                        <button type="button" class="btn btn-default" title="新建">
                                            <i class="fa fa-file-o"></i> 新建</button>
                                    <!--对应年级信息的增加-->
                                    </a>
                                </div>
                            </div>
                        </div>
                        <div class="box-tools pull-right">
<%--                            <div class="has-feedback">--%>
<%--                                <input type="text" class="form-control input-sm" placeholder="搜索">--%>
<%--                                <!--按年级号进行搜索年级信息-->--%>
<%--                                <span class="glyphicon glyphicon-search form-control-feedback"></span>--%>
<%--                            </div>--%>
                        </div>
                        <!--工具栏/-->
                        <form action="${pageContext.request.contextPath}/grade/updateAll.action" method="post">

                        <!--数据列表-->
                        <table id="dataList" class="table table-bordered table-striped table-hover dataTable">
                            <thead>
                            <tr><input  style="margin-left: 8px" type="submit" value="批量修改" class="btn btn-default"></tr>
                            <tr>
                                <th class="" style="padding-right:0px;">
                                    <input id="selall" type="checkbox" class="icheckbox_square-blue">
                                </th>
                                <th class="sorting_desc">年级名称</th>
                                <th class="sorting_asc sorting_asc_disabled">年级人数</th>
                                <th class="sorting_desc sorting_desc_disabled">年级就业率</th>
                                <th class="sorting">年级考研率</th>
                                <th class="text-center">操作</th>
                            </tr>
                            </thead>
                            <tbody>
                            <c:forEach items="${grapageBean.list}" var="grade" varStatus="status">
                                <tr>
                                    <td><input name="ids" type="checkbox" value="${grade.gradeId}">
                                        <input type="hidden" name="gradeList[${status.index}].gradeId" value="${grade.gradeId}">
                                    </td>
                                    <td><input type="text" name="gradeList[${status.index}].gradeName" value="${grade.gradeName}"></td>
                                    <td><input type="text" name="gradeList[${status.index}].gradeNumber" value="${grade.gradeNumber}"></td>
                                    <td><input type="text" name="gradeList[${status.index}].employmengtRate" value="${grade.employmengtRate}"></td>
                                    <td><input type="text" name="gradeList[${status.index}].postgradeRate" value="${grade.postgradeRate}"></td>
                                    <td class="text-center">
                                        <!--对应后端controller年级信息的删除的RequestMapping名字-->
                                        <a href="${pageContext.request.contextPath}/grade/deleteByone.action?gradeid=${grade.gradeId}">
                                            <button type="button"  class="btn bg-olive btn-xs">删除</button>
                                        </a>

                                    <%--                                        <a href="${pageContext.request.contextPath}/grade/updateByOne.action?gradeid=${grade.gradeId}"><button type="button" class="btn bg-olive btn-xs">编辑</button></a>--%>
                                    </td>
                                </tr>
                            </c:forEach>
                            </tbody>
                            <!--
                        <tfoot>
                        <tr>
                        <th>Rendering engine</th>
                        <th>Browser</th>
                        <th>Platform(s)</th>
                        <th>Engine version</th>
                        <th>CSS grade</th>
                        </tr>
                        </tfoot>-->
                        </table>
                        <!--数据列表/-->
                        </form>
                    </div>
                    <!-- 数据表格 /-->


                </div>
                <!-- /.box-body -->

                <!-- .box-footer-->
                <div class="box-footer">
                    <div class="pull-left">
                        <div class="form-group form-inline">
                            第 ${grapageBean.currentPage } / ${grapageBean.totalPage }
                            &nbsp;&nbsp;
                            每页显示${grapageBean.pageSize }条  &nbsp;&nbsp;&nbsp;
                            总计${grapageBean.totalSize }条记录 &nbsp;&nbsp;&nbsp;
                        </div>
                    </div>

                    <div class="box-tools pull-right">
                        <ul class="pagination">
                            <c:if test="${grapageBean.currentPage !=1 }">
                                <li><a href="${pageContext.request.contextPath}/grade/grade_Page.action?currentPage=1">首页</a></li>
                                <li><a href="${pageContext.request.contextPath}/grade/grade_Page.action?currentPage=${grapageBean.currentPage-1 }">上一页</a></li>
                            </c:if>

                            <c:forEach begin="1" end="${grapageBean.totalPage }" var="i">
                                <c:if test="${grapageBean.currentPage == i }">
                                    <li><a href="${pageContext.request.contextPath}/grade/grade_Page.action?currentPage=${i}">${i }</a></li>
                                </c:if>
                                <c:if test="${grapageBean.currentPage != i }">
                                    <li><a href="${pageContext.request.contextPath}/grade/grade_Page.action?currentPage=${i}">${i }</a></li>
                                </c:if>

                            </c:forEach>

                            <c:if test="${grapageBean.currentPage !=grapageBean.totalPage }">
                                <li><a href="${pageContext.request.contextPath}/grade/grade_Page.action?currentPage=${grapageBean.currentPage+1 }">下一页</a></li>
                                <li><a href="${pageContext.request.contextPath}/grade/grade_Page.action?currentPage=${grapageBean.totalPage }">尾页</a></li>
                            </c:if>
                        </ul>
                    </div>

                </div>
                <!-- /.box-footer-->
            </div>

        </section>
        <!-- 正文区域 /-->

        <div id="container_left" style="width: 100%; height: 400px; margin: 0 auto; align:center;"></div>
        <script>
            // 折线图
            var names = [];    //类别数组（实际用来盛放X轴坐标值）
            var series = [];
            var sss=[];
            $.ajax({
                type:"post",
                url:"${pageContext.request.contextPath}/grade/ReceiveJson.action",
                contentType:"application/json;charset=utf-8",
                data:{},
                success: function(list) {

                    //请求成功时执行该函数内容，data即为服务器返回的json对象
                    $.each(list, function (index, grade) {
                        names.push(grade.gradeName);    //挨个取出类别并填入类别数组
                        series.push(grade.employmengtRate);
                        sss.push(grade.postgradeRate);
                        console.log("表格"+grade.gradeName);
                        console.log("表格"+grade.employmengtRate);
                        console.log("表格"+grade.postgradeRate);

                    });

                    console.log(JSON.stringify(list))
                    hrFun(list);


                },
            });
            // 心率
            var hrChart = echarts.init(document.getElementById("container_left"));
            function hrFun(list) {
                hrChart.setOption({
                    title: {
                        text: '年级就业率情势图'
                    },
                    color: ['#3398DB'],
                    tooltip: {
                        trigger: 'axis',
                        axisPointer: { // 坐标轴指示器，坐标轴触发有效
                            type: 'shadow' // 默认为直线，可选为：'line' | 'shadow'
                        }
                    },
                    legend: {
                        data:[
                            {name:'考研率',textStyle:{color:'red'}},
                            {name:'就业率',textStyle:{color:'blue'}}
                        ]

                    },
                    grid: {
                        left: '3%',
                        right: '20%',
                        bottom: '20%',
                        containLabel: true
                    },
                    xAxis: [{
                        type: 'category',
                        data: names
                    }],
                    yAxis: [{ // 纵轴标尺固定
                        type: 'value',
                        scale: true,
                        name: '达标率',
                        max: 1,
                        min: 0,
                        minInterval: 0.1,
                        interval:0.1
                        //splitNumber: 0.1,
                        // boundaryGap: [0.2, 0.2]
                    }],
                    series: [{
                        name: '就业率',
                        type: 'line',
                        data: series,
                        lineStyle: {
                            normal: {
                                color: "red",
                                width: 3,
                            },

                        }
                    },
                        {
                            name: '考研率',
                            type: 'line',
                            data: sss,
                            lineStyle: {
                                normal: {
                                    color: "blue",
                                    width: 3,
                                },

                            }
                        }],
                }, true);
            }

        </script>

    </div>
    <!-- 内容区域 /-->

    <!-- 底部导航 -->
    <footer class="main-footer">
        <div class="pull-right hidden-xs">
            <b>Version</b> 1.0.8
        </div>
        <strong>Copyright &copy;&copy; 2020-6-28 <a href="#">盐城师范学院·三小只团队</a>.</strong> All rights reserved.
    </footer>
    <!-- 底部导航 /-->

</div>


<script src="../plugins/jQuery/jquery-2.2.3.min.js"></script>
<script src="../plugins/jQueryUI/jquery-ui.min.js"></script>
<script>
    $.widget.bridge('uibutton', $.ui.button);
</script>
<script src="../plugins/bootstrap/js/bootstrap.min.js"></script>
<script src="../plugins/raphael/raphael-min.js"></script>
<script src="../plugins/morris/morris.min.js"></script>
<script src="../plugins/sparkline/jquery.sparkline.min.js"></script>
<script src="../plugins/jvectormap/jquery-jvectormap-1.2.2.min.js"></script>
<script src="../plugins/jvectormap/jquery-jvectormap-world-mill-en.js"></script>
<script src="../plugins/knob/jquery.knob.js"></script>
<script src="../plugins/daterangepicker/moment.min.js"></script>
<script src="../plugins/daterangepicker/daterangepicker.js"></script>
<script src="../plugins/daterangepicker/daterangepicker.zh-CN.js"></script>
<script src="../plugins/datepicker/bootstrap-datepicker.js"></script>
<script src="../plugins/datepicker/locales/bootstrap-datepicker.zh-CN.js"></script>
<script src="../plugins/bootstrap-wysihtml5/bootstrap3-wysihtml5.all.min.js"></script>
<script src="../plugins/slimScroll/jquery.slimscroll.min.js"></script>
<script src="../plugins/fastclick/fastclick.js"></script>
<script src="../plugins/iCheck/icheck.min.js"></script>
<script src="../plugins/adminLTE/js/app.min.js"></script>
<script src="../plugins/treeTable/jquery.treetable.js"></script>
<script src="../plugins/select2/select2.full.min.js"></script>
<script src="../plugins/colorpicker/bootstrap-colorpicker.min.js"></script>
<script src="../plugins/bootstrap-wysihtml5/bootstrap-wysihtml5.zh-CN.js"></script>
<script src="../plugins/bootstrap-markdown/js/bootstrap-markdown.js"></script>
<script src="../plugins/bootstrap-markdown/locale/bootstrap-markdown.zh.js"></script>
<script src="../plugins/bootstrap-markdown/js/markdown.js"></script>
<script src="../plugins/bootstrap-markdown/js/to-markdown.js"></script>
<script src="../plugins/ckeditor/ckeditor.js"></script>
<script src="../plugins/input-mask/jquery.inputmask.js"></script>
<script src="../plugins/input-mask/jquery.inputmask.date.extensions.js"></script>
<script src="../plugins/input-mask/jquery.inputmask.extensions.js"></script>
<script src="../plugins/datatables/jquery.dataTables.min.js"></script>
<script src="../plugins/datatables/dataTables.bootstrap.min.js"></script>
<script src="../plugins/chartjs/Chart.min.js"></script>
<script src="../plugins/flot/jquery.flot.min.js"></script>
<script src="../plugins/flot/jquery.flot.resize.min.js"></script>
<script src="../plugins/flot/jquery.flot.pie.min.js"></script>
<script src="../plugins/flot/jquery.flot.categories.min.js"></script>
<script src="../plugins/ionslider/ion.rangeSlider.min.js"></script>
<script src="../plugins/bootstrap-slider/bootstrap-slider.js"></script>
<script src="../plugins/bootstrap-datetimepicker/bootstrap-datetimepicker.js"></script>
<script src="../plugins/bootstrap-datetimepicker/locales/bootstrap-datetimepicker.zh-CN.js"></script>
<script>
    $(document).ready(function() {
        // 选择框
        $(".select2").select2();

        // WYSIHTML5编辑器
        $(".textarea").wysihtml5({
            locale: 'zh-CN'
        });
    });


    // 设置激活菜单
    function setSidebarActive(tagUri) {
        var liObj = $("#" + tagUri);
        if (liObj.length > 0) {
            liObj.parent().parent().addClass("active");
            liObj.addClass("active");
        }
    }


    $(document).ready(function() {
        // 激活导航位置
        setSidebarActive("admin-index");
    });
</script>
</body>

</html>
<!---->
