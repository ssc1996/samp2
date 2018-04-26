 <%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>
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
    <title>LOGIN IN</title>
    <script type="text/javascript" src="${pageContext.request.contextPath}/assets/js/official/jquery-1.8.0.js"></script>
  </head>
  <body class="flat-blue login-page">
    <div class="container">
        <div class="login-box">
            <div>
                <div class="login-form row">
                    <div class="col-sm-12 text-center login-header">
                        <i class="login-logo fa fa-flask fa-5x"></i>
                        <h4 class="login-title"></h4>
                    </div>
                    <div class="col-sm-12">
                        <div class="login-body">
                            <div class="progress hidden" id="login-progress">
                                <div class="progress-bar progress-bar-success progress-bar-striped active" role="progressbar" aria-valuenow="100" aria-valuemin="0" aria-valuemax="100" style="width: 100%">
                                    Log In...
                                </div>
                            </div>
                            <form method="post" action="user/backLogin.do">
                                <div class="control">
                                    <input type="text" name="userName" class="form-control" placeholder="请键入用户名" value="" />
                                </div>
                                <div class="control">
                                    <input type="password" name="userPwd" class="form-control" placeholder="请键入密码" value="" />
                                </div>
                                <div class="login-button text-center">
                                    <input type="submit" class="btn btn-primary" value="登陆">
                                </div>
                            </form>
                        </div>
                        <div class="login-footer">
                            <!-- <input type="checkbox" class="text-left" value="7天免登陆"/><a href="#" class="color-white">7天免登陆</a>
                            <span class="text-right"><a href="#" class="color-white">忘记密码</a></span> -->
                        </div>
                    </div>
                </div>
            </div>
        </div>
    </div>
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
            <script type="text/javascript" src="/samp2/assets/js/jquery.hDialog.min.js"></script>
            <!-- Javascript -->
            <script type="text/javascript" src="/samp2/assets/js/app.js"></script>
            <script type="text/javascript" src="/samp2/assets/js/index.js"></script>
            <script type="text/javascript">
            	if(!$.isEmptyObject($.trim("${loginMsg }"))){
            		$.tooltip("${loginMsg }");
            	}
            </script>
</body>
</html>
