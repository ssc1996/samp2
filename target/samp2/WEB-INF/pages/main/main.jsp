<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>

<head>
    <title></title>
    <meta name="viewport" content="width=device-width, initial-scale=1">
    <!-- Fonts -->
    <link href='http://fonts.googleapis.com/css?family=Roboto+Condensed:300,400' rel='stylesheet' type='text/css'>
    <link href='http://fonts.googleapis.com/css?family=Lato:300,400,700,900' rel='stylesheet' type='text/css'>
    <!-- CSS assetss -->
    <link rel="stylesheet" type="text/css" href="/samp2/assets/css/bootstrap.min.css">
    <link rel="stylesheet" type="text/css" href="/samp2/assets/css/font-awesome.min.css">
    <link rel="stylesheet" type="text/css" href="/samp2/assets/css/animate.min.css">
    <link rel="stylesheet" type="text/css" href="/samp2/assets/css/bootstrap-switch.min.css">
    <link rel="stylesheet" type="text/css" href="/samp2/assets/css/checkbox3.min.css">
    <link rel="stylesheet" type="text/css" href="/samp2/assets/css/jquery.dataTables.min.css">
    <link rel="stylesheet" type="text/css" href="/samp2/assets/css/dataTables.bootstrap.css">
    <link rel="stylesheet" type="text/css" href="/samp2/assets/css/select2.min.css">
    <!-- CSS App -->
    <link rel="stylesheet" type="text/css" href="/samp2/assets/css/style.css">
    <link rel="stylesheet" type="text/css" href="/samp2/assets/css/flat-blue.css">
</head>

<body class="flat-blue">
    <div class="app-container">
        <div class="row content-container">
            <nav class="navbar navbar-default navbar-fixed-top navbar-top">
                <div class="container-fluid">
                    <div class="navbar-header">
                        <button type="button" class="navbar-expand-toggle">
                            <i class="fa fa-bars icon"></i>
                        </button>
                        <ol class="breadcrumb menutip navbar-breadcrumb">
                            <li class="active">公告</li>
                        </ol>
                        <button type="button" class="navbar-right-expand-toggle pull-right visible-xs">
                            <i class="fa fa-th icon"></i>
                        </button>
                    </div>
                    <ul class="nav navbar-nav navbar-right">
                        <button type="button" class="navbar-right-expand-toggle pull-right visible-xs">
                            <i class="fa fa-times icon"></i>
                        </button>
                        <li class="dropdown profile">
                            <a href="#" class="dropdown-toggle" data-toggle="dropdown" role="button" aria-expanded="false">${user.userName } <span class="caret"></span></a>
                            <ul class="dropdown-menu animated fadeInDown">
                                <li class="profile-img">
                                    <img src="../assets/img/picjumbo.com_HNCK4153_resize.jpg" class="profile-img">
                                </li>
                                <li>
                                    <div class="profile-info">
                                        <h4 class="username">${user.userName }</h4>
                                        <p>${user.userPhone }</p>
                                        <div class="btn-group margin-bottom-2x" role="group">
                                            <button type="button" class="btn btn-default"><i class="fa fa-user"></i> 修改密码</button>
                                            <button type="button" class="btn btn-default logout"><i class="fa fa-sign-out"></i> 退出</button>
                                        </div>
                                    </div>
                                </li>
                            </ul>
                        </li>
                    </ul>
                </div>
            </nav>
            <div class="side-menu sidebar-inverse">
                <nav class="navbar navbar-default" role="navigation">
                    <div class="side-menu-container">
                        <div class="navbar-header">
                            <a class="navbar-brand" href="#">
                                <div class="icon fa fa-paper-plane"></div>
                                <div class="title"></div>
                            </a>
                            <button type="button" class="navbar-expand-toggle pull-right visible-xs">
                                <i class="fa fa-times icon"></i>
                            </button>
                        </div>
                        <ul class="nav menu navbar-nav">
                            <li class="active">
                                <a href="#">
                                    <span class="icon fa fa-tachometer"></span><span class="title">公告</span>
                                </a>
                            </li>
                            <c:forEach items="${userMenu.oneMenu }" var="menus">
	                            <li class="panel panel-default dropdown">
	                                <a data-toggle="collapse" href="#${menus.menuSign }">
	                                    <i class="icon fa fa-desktop"></i><span class="title">${menus.roleName }</span>
	                                </a>
	                                <!-- Dropdown level 1 -->
	                                <div id="${menus.menuSign }" class="panel-collapse collapse">
	                                    <div class="panel-body">
	                                        <ul class="nav navbar-nav">
	                                        <c:forEach items="${userMenu.secMenu }" var="menu">
	                                        	<c:if test="${menu.menuParent == menus.roleId }">
		                                            <li>
		                                            	<a href="javascript:void()" data-page="${menu.menuPath }">${menu.roleName }</a>
		                                            </li>
	                                        	</c:if>
	                                            </c:forEach>
	                                        </ul>
	                                    </div>
	                                </div>
	                            </li>
                            </c:forEach>
                            
                            
                        </ul>
                    </div>
                    <!-- /.navbar-collapse -->
                </nav>
            </div>
            
            <!-- Main Content -->
            <div class="container-fluid">
                <div class="side-body padding-top">
                    <div class="row">
                        <div class="main"></div>
                    </div>
                </div>
            </div>
        </div>
        <footer class="app-footer">
            <div class="wrapper">
                <span class="pull-right">SEP实朴检测技术服务有限公司</span>
            </div>
        </footer>
        <div>
            <!-- Javascript assetss -->
            <script type="text/javascript" src="/samp2/assets/js/jquery.min.js"></script>
            <script type="text/javascript" src="/samp2/assets/js/bootstrap.min.js"></script>
            <script type="text/javascript" src="/samp2/assets/js/Chart.min.js"></script>
            <script type="text/javascript" src="/samp2/assets/js/bootstrap-switch.min.js"></script>
            <script type="text/javascript" src="/samp2/assets/js/jquery.matchHeight-min.js"></script>
            <script type="text/javascript" src="/samp2/assets/js/jquery.dataTables.min.js"></script>
            <script type="text/javascript" src="/samp2/assets/js/dataTables.bootstrap.min.js"></script>
            <script type="text/javascript" src="/samp2/assets/js/select2.full.min.js"></script>
            <script type="text/javascript" src="/samp2/assets/js/ace/ace.js"></script>
            <script type="text/javascript" src="/samp2/assets/js/ace/mode-html.js"></script>
            <script type="text/javascript" src="/samp2/assets/js/ace/theme-github.js"></script>
            <!-- Javascript -->
            <script type="text/javascript" src="/samp2/assets/js/app.js"></script>
            <script type="text/javascript" src="/samp2/assets/js/index.js"></script>
            <script>
                        	$(".logout").click(function(){
                        		window.location.href="/samp2/user/removeUser.do";
                        	});
                        	
                        	$("a").click(function(){
	                        	var page = $(this).attr("data-page");
	                        	if(page != null){
		                        	page = "/samp2/pages/"+page;
		                        	$.post(page,function(data){
			                        	$(".main").html(data);
		                        	});
	                        	}
                        	
                        	});
                        	$(".menu>li").on("click", function() {
                        		$.each($(".menu>li"), function(index,value) {$(value).removeClass("active");});
                        		$(this).addClass("active");
                        		$("ol.menutip").html("<li class=\"active\">"+$(this).find("span").eq(0).html()+"</li>");
                        	});
                        	$(".menu ul>li").on("click", function() {
                        		var that = $(this);
                        		$.each($("ol.menutip>li"), function(index,value) {
                        			$(value).removeClass("active");
                        				if(index == 1) {
                        					$(value).addClass("active");$(value).html($(that).find("a").html());
                        				}
                        			});
                        			if($("ol.menutip>li").length == 1){
		                        		$("ol.menutip").html($("ol.menutip").html()+"<li class=\"active\">"+$(this).find("a").html()+"</li>");
                        			}
                        		return false;
                        	});
                        </script>
</body>

</html>
