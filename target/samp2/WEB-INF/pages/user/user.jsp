<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>
    <base href="<%=basePath%>">
    
    <title>用户一览</title>
    
	<meta http-equiv="pragma" content="no-cache">
	<meta http-equiv="cache-control" content="no-cache">
	<meta http-equiv="expires" content="0">    
	<meta http-equiv="keywords" content="keyword1,keyword2,keyword3">
	<meta http-equiv="description" content="This is my page">
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
  <body>
	<div class="col-xs-12">
		<div class="card">
			<div class="card-body no-padding">
				<div role="tabpanel">
					<!-- Nav tabs -->
					<ul class="nav nav-tabs" role="tablist">
						<li role="presentation" class="active"><a href="#home" aria-controls="home" role="tab" data-toggle="tab">用户一览</a></li>
						<li role="presentation"><a href="#profile" aria-controls="profile" role="tab" data-toggle="tab">添加用户</a></li>
					</ul>
					<!-- Tab panes -->
					<div class="tab-content">
						<div role="tabpanel" class="tab-pane active" id="home">
							<div class="card-body">
								<div class="modal fade modal-info" id="modalInfo" tabindex="-1" role="dialog" aria-labelledby="myModalLabel" aria-hidden="true">
									<div class="modal-dialog">
										<div class="modal-content">
											<div class="modal-header">
												<button type="button" class="close closemodel" data-dismiss="modal" aria-label="Close"><span aria-hidden="true">&times;</span></button>
												<h4 class="modal-title" id="myModalLabel">用户详情</h4>
											</div>
											<div class="modal-body">
												<form class="userdetail" action="user/modifyUserRole.do" method="post">
													<table class="datatable tables table-striped table-hover" cellspacing="0" width="100%"></table>
													<div class="userRoledata"></div>
												</form>
											</div>
											<div class="modal-footer">
												<button type="button" class="btn closemodel btn-default" data-dismiss="modal">关闭</button>
												<button type="button" class="btn modityUser btn-info">修改</button>
												<button type="button" class="btn hide updateuser btn-info">保存</button>
											</div>
										</div>
									</div>
								</div>
								<table class="datatable table table-striped table-hover" cellspacing="0" width="100%">
									<thead>
										<tr>
											<th>编号</th>
											<th>账号</th>
											<th>姓名</th>
											<th>手机号码</th>
											<th>操作</th>
										</tr>
									</thead>
									<tbody>
										<c:forEach items="${allUser }" var="user">
											<tr>
												<td>${user.userId }</td>
												<td>${user.userName }</td>
												<td>${user.realName }</td>
												<td>${user.userPhone }</td>
												<td>
													<button type="button" class="btn usermodalbtn btn-xs btn-primary btn-info" data-toggle="modal" data-target="#modalInfo">详情</button>
													<button type="button" class="btn btn-xs btn-info btn-primary">修改密码</button>
												</td>
											</tr>
										</c:forEach>
									</tbody>
								</table>
							</div>
						</div>
						<div role="tabpanel" class="tab-pane" id="profile">
							<div class="card-body no-padding">
								<div class="step tabs-left card-no-padding">
									<ul class="nav nav-tabs" role="tablist">
										<li role="step" class="active">
											<a href="#step1-2" id="step1-tab" role="tab" data-toggle="tab" aria-controls="home" aria-expanded="true">
												<span class="icon fa fa-user-plus"></span>
												<div class="step-title">
													<div class="title">添加用户信息</div>
												</div>
											</a>
										</li>
										<li role="step" class="roleAllot">
											<a href="#step2-2" role="tab" id="step2-tab" data-toggle="tab" aria-controls="profile">
												<div class="icon fa fa-check-circle-o"></div>
												<div class="step-title">
													<div class="title">分配权限</div>
												</div>
											</a>
										</li>
									</ul>
									<div class="tab-content">
										<div role="tabpanel" class="tab-pane fade in active" id="step1-2" aria-labelledby="home-tab">
											<form class="form-inline userform" action="user/addUser.do" method="post">
											
												<div class="form-group">
													<label for="userName">用户名*</label>
													<input type="text" class="form-control" name="userName" id="userName">
												</div>
												<div class="form-group">
													<label for="realName">用户性名*</label>
													<input type="text" class="form-control" name="realName" id="realName">
												</div>
												<div class="form-group">
													<label for="userPwd">密码*</label>
													<input type="password" class="form-control" name="userPwd" id="userPwd">
												</div>
												<div class="form-group">
													<label for="userPhone">手机号码*</label>
													<input type="text" class="form-control" name="userPhone" id="userPhone">
												</div>
												<div class="form-group">
													<input type="hidden" class="form-control" name="userCreateId" id="userCreateId" value="${user.userId }" placeholder="创建人id">
													<input type="hidden" class="form-control" name="userCreateName" id="userCreateName" value="${user.userName }" placeholder="Jane Doe">
												</div>
												<div class="form-group">
													<input type="hidden" class="form-control" name="deleteData" id="deleteData" value="N" placeholder="是否删除">
													<input type="hidden" class="form-control" name="userDisable" id="userDisable" value="N" placeholder="是否禁用">
												</div>
												<button type="button" class="btn userbtn btn-info"> <a href="#step2-2" class="roleManager" data-class="roleAllot" role="tab" id="step2-tab" data-toggle="tab" aria-controls="profile">创建用户并分配权限</a></button>
											</form>
										</div>
										<div role="tabpanel" class="tab-pane fade" id="step2-2" aria-labelledby="profile-tab">
											<form class="roleform" action="user/addUserRole.do" method="post"></form>
										</div>
									</div>
								</div>
							</div>
						</div>
					</div>
				</div>
			</div>
		</div>
	</div>
           <script type="text/javascript" src="/samp2/assets/js/jquery.form.js"></script>
           <script type="text/javascript" src="/samp2/assets/js/jquery.hDialog.min.js"></script>
            <!-- Javascript -->
            <script type="text/javascript">
            	$(".closemodel").click(function() {
            		$(".modityUser").show();
            		$(".updateuser").addClass("hide");
            		$(".modityuserPhone").attr("type","hidden");
            		$(".modityuserPhone").next().html($(".modityuserPhone").val());
            		$(".modityuserPhone").next().show();
            	});
            	$(".roleManager").click(function() {
	            	var option= {
		            		async: false,
	            			success: function(data) {
	            				$.tooltip(data);
	            			},
	            			error: function(data) {
	            				$.tooltip(data);
	            			}
	            		}
           			$(".userform").ajaxSubmit(option);
            			
            		$("."+$(this).attr("data-class")).addClass("active");
            		$("."+$(this).attr("data-class")).prev("li").removeClass("active");
            		$.ajax({
            			type:'post',
            			url:'user/findRole.do',
            			data:{"userName":$("#userName").val()},
            			success:function(data){
            				var type = "WEB";
	            			var divList = "<div class=\"checkbox3 checkbox-inline checkbox-round \"><div  class=\"title checkbox-fa-light-12\">WEB端权限分配</div>";
	            			$.each(data.roleList, function(index, value) {
	            				var divClass = value.menuGrade == 1 ? "checkbox-success checkbox-check checkbox-light " : "checkbox-info checkbox-inline";
	            				if(value.menuType == "APP" && type == "WEB") {
	            					divList +=  "</div><div class=\"checkbox3 checkbox-inline checkbox-round \"><div  class=\"title checkbox-fa-light-12\">APP端权限分配</div>";
	            					type="APP";
	            				}
	            				divList += "<div class=\"checkbox3 "+divClass+" checkbox-round \">"+
									"<input type=\"hidden\" name=\"urList["+index+"].userId\" value=\""+data.userId +"\">"+
									"<input class=\"addRole\" type=\"checkbox\" name=\"urList["+index+"].roleId\" value=\""+value.roleId +"\" id=\"checkbox-fa-light-"+value.roleId +"\">"+
									"<label for=\"checkbox-fa-light-"+value.roleId +"\">"+
										value.roleName +
									"</label>"+
								"</div>";
	            			});
	            			divList += "</div><button class=\"btn userrolebtn btn-info\" type=\"button\" >完成</button>";
							$(".roleform").html(divList);
            			}
            		});
            	});
            	$(document).on("click",".userrolebtn",function() {
            	$.each($(".addRole"), function(index,value) {
            			if($(value).prop("checked") == false){
            				$(value).prev().val("");
            			}
            		});
            		var option= {
		            		async: false,
	            			success: function(data) {
	            				$.tooltip(data);
	            			},
	            			error: function(data) {
	            				$.tooltip(data);
	            			}
	            		}
           			$(".roleform").ajaxSubmit(option);
            	});
            	
            	$(document).on("click", ".usermodalbtn", function() {
            		$.ajax({
            			type: 'post',
            			async: false,
            			url: 'user/findUser.do',
            			data: {"userName": $(this).parents("tr").find("td").eq(1).html()},
            			success: function(data) {
            				var str = "";
            				str += "<tr>";
							str += "<th>编号</th>";
							str += "<td class=\"modityuserId\"><input type=\"hidden\" name=\"userId\" value=\""+data.userId +"\"/>"+data.userId +"</td>";
							str += "<th>账号</th>";
							str += "<td class=\"modityuserName\">"+data.userName +"</td>";
							str += "<th>姓名</th>";
							str += "<td class=\"modityrealName\">"+data.realName +"</td>";
							str += "<th>手机号码</th>";
							str += "<td><input class=\"modityuserPhone\" type=\"hidden\" name=\"userPhone\" value=\""+data.userPhone +"\"/> <span >"+data.userPhone +"</span></td>";
							str += "</tr>";
							str += "<tr>";
							str += "<th>创建日期</th>";
							str += "<td class=\"modityuserCreateDate\">"+data.userCreateDate +"</td>";
							str += "<th>创建人</th>";
							str += "<td class=\"modityuserCreateName\">"+data.userCreateName +"</td>";
							str += "<th>是否删除</th>";
							str += "<td class=\"moditydeleteData\">"+data.deleteData == "N" ? "否" : "是" +"</td>";
							str += "<th>是否被禁用</th>";
							str += "<td class=\"modityuserDisable\">"+data.userDisable == "N" ? "否" : "是" +"</td>";
							str += "</tr>";
            				$(".tables").html(str);
            			}
            		});
            		$.ajax({
            			type:'post',
            			async: false,
            			url:'user/findRoleByUserId.do',
            			data:{"userId":$(this).parents("tr").find("td").eq(0).html()},
            			success:function(data){
            				var type = "WEB";
	            			var divList = "<div class=\"checkbox3 checkbox-inline checkbox-round \"><div  class=\"title checkbox-fa-light-12\">WEB端权限分配</div>";
	            			$.each(data.roleList, function(index, value) {
	            				var divClass = value.menuGrade == 1 ? "checkbox-success checkbox-check checkbox-light " : "checkbox-info checkbox-inline";
	            				if(value.menuType == "APP" && type == "WEB") {
	            					divList +=  "</div><div class=\"checkbox3 checkbox-inline checkbox-round \"><div  class=\"title checkbox-fa-light-12\">APP端权限分配</div>";
	            					type="APP";
	            				}
	            				divList += "<div class=\"checkbox3 "+divClass+" checkbox-round \">"+
									"<label for=\"checkbox-fa-light-s-"+value.roleId +"\">"+
										value.roleName +
									"</label>"+
								"</div>";
	            			});
							$(".userRoledata").html(divList);
            			}
            		});
            	});
            	$(".modityUser").click(function() {
            		$(".modityuserPhone").attr("type","text");
            		$(".modityuserPhone").next().hide();
            		$(this).hide();
            		$(".updateuser").removeClass("hide");
            		$.ajax({
            			type:'post',
            			url:'user/findRole.do',
            			data:{"userName":$(".modityuserPhone").parents("tr").find("td").eq(1).html()},
            			success:function(data){
            				var type = "WEB";
	            			var divList = "<div class=\"checkbox3 checkbox-inline checkbox-round \"><div  class=\"title checkbox-fa-light-12\">WEB端权限分配</div>";
	            			$.each(data.roleList, function(index, value) {
	            				var divClass = value.menuGrade == 1 ? "checkbox-success checkbox-check checkbox-light " : "checkbox-info checkbox-inline";
	            				if(value.menuType == "APP" && type == "WEB") {
	            					divList +=  "</div><div class=\"checkbox3 checkbox-inline checkbox-round \"><div  class=\"title checkbox-fa-light-12\">APP端权限分配</div>";
	            					type="APP";
	            				}
	            				divList += "<div class=\"checkbox3 "+divClass+" checkbox-round \">"+
									"<input type=\"hidden\" name=\"urList["+index+"].userId\" value=\""+data.userId +"\">"+
									"<input type=\"checkbox\" class=\"modifyRole\" name=\"urList["+index+"].roleId\" value=\""+value.roleId +"\" id=\"checkbox-fa-light-modify-"+value.roleId +"\">"+
									"<label for=\"checkbox-fa-light-modify-"+value.roleId +"\">"+
										value.roleName +
									"</label>"+
								"</div>";
	            			});
							$(".userRoledata").html(divList);
            			}
            		});
            	});
            	$(".updateuser").on("click",function() {
            		$(".modityuserPhone").attr("type","hidden");
            		$(".modityuserPhone").next().html($(".modityuserPhone").val());
            		$(".modityuserPhone").next().show();
            		$(this).addClass("hide");
            		$(".modityUser").show();
            		$.each($(".modifyRole"), function(index,value) {
            			if($(value).prop("checked") == false){
            				$(value).prev().val("");
            			}
            		});
            		var option= {
		            		async: false,
	            			success: function(data) {
	            				$.tooltip(data);
	            			},
	            			error: function(data) {
	            				$.tooltip(data);
	            			}
	            		}
           			$(".userdetail").ajaxSubmit(option);
            	});
            </script>
                    
  </body>
</html>
