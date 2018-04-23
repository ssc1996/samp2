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
		   
		<title>角色一览</title>
		   
		<meta http-equiv="pragma" content="no-cache">
		<meta http-equiv="cache-control" content="no-cache">
		<meta http-equiv="expires" content="0">    
		<meta http-equiv="keywords" content="keyword1,keyword2,keyword3">
		<meta http-equiv="description" content="This is my page">
		
	</head>
	<body>
		<div class="col-xs-12">
			<div class="card">
				<div class="card-body no-padding">
					<div role="tabpanel">
						<!-- Nav tabs -->
						<ul class="nav nav-tabs" role="tablist">
							<li role="presentation" class="active"><a href="#home" aria-controls="home" role="tab" data-toggle="tab">权限一览</a></li>
							<li role="presentation"><a href="#profile" aria-controls="profile" role="tab" data-toggle="tab">添加权限</a></li>
						</ul>
					<!-- Tab panes -->
						<div class="tab-content">
							<div role="tabpanel" class="tab-pane active" id="home">
								<div class="card-body">
									<table class="table table-hover">
										<tr>
											<th>序号</th>
											<th>权限名称</th>
											<th>权限路径</th>
											<th>权限类型</th>
											<th>权限父级节点</th>
										</tr>
										<c:forEach items="${allRole }" var="role">
											<tr>
												<td>${role.roleId }</td>
												<td>${role.roleName }</td>
												<td>${role.menuPath }</td>
												<td>${role.menuType }</td>
												<td>${role.menuParent }</td>
											</tr>
										</c:forEach>
									</table>
								</div>
							</div>
							<div role="tabpanel" class="tab-pane" id="profile">
								<div class="card-body">
									<form class="form-inline roleform" action="user/addRole.do" method="post">
										<div class="form-group">
											<label for="userName">权限名称*</label>
											<input type="text" class="form-control" name="roleName" id="roleName">
										</div>
										<div class="form-group">
											<label for="realName">权限类型*</label>
											<select class="form-control" name="menuType" id="menuType">
												<option selected value="WEB">电脑端</option>
												<option value="APP">手机端</option>
											</select>
										</div>
										<div class="form-group">
											<label for="userPwd">权限路径*</label>
											<input type="text" class="form-control" name="menuPath" id="menuPath">
										</div>
										<div class="form-group">
											<label for="userPwd">权限级别*</label>
											<input type="text" class="form-control" name="menuGrade" id="menuGrade">
										</div>
										<div class="form-group">
											<label for="userPhone">权限父级节点*</label>
											<input type="text" class="form-control" name="menuParent" id="menuParent">
										</div>
										<div class="form-group">
											<label for="userPhone">权限标记*</label>
											<input type="text" class="form-control" name="menuParent" id="menuSign">
										</div>
										<div class="form-group">
											<input type="hidden" class="form-control" name="deleteData" id="exampleInputName2" value="N" placeholder="是否删除">
										</div>
										<button type="button" class="btn rolebtn btn-info"> 提交</button>
									</form>
								</div>
							</div>
						</div>
					</div>
				</div>
			</div>
		</div>
		<script type="text/javascript" src="/samp2/assets/js/jquery.form.js"></script>
        <script type="text/javascript" src="/samp2/assets/js/jquery.hDialog.min.js"></script>
        <script type="text/javascript">
        	$(".rolebtn").click(function() {
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
        </script>
	</body>
</html>
