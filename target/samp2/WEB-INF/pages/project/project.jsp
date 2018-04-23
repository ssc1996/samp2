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
    
    <title>My JSP 'project.jsp' starting page</title>
    
	<meta http-equiv="pragma" content="no-cache">
	<meta http-equiv="cache-control" content="no-cache">
	<meta http-equiv="expires" content="0">    
	<meta http-equiv="keywords" content="keyword1,keyword2,keyword3">
	<meta http-equiv="description" content="This is my page">
	<!--
	<link rel="stylesheet" type="text/css" href="styles.css">
	-->

  </head>
  
  <body>
    <div class="col-xs-12">
		<div class="card">
			<div class="card-body no-padding">
				<div role="tabpanel">
					<!-- Nav tabs -->
					<ul class="nav nav-tabs" role="tablist">
						<li role="presentation" class="active"><a href="#home" aria-controls="home" role="tab" data-toggle="tab">项目一览</a></li>
						<li role="presentation"><a href="#profile" aria-controls="profile" role="tab" data-toggle="tab">添加项目</a></li>
					</ul>
				</div>
				<!-- Tab panes -->
					<div class="tab-content">
						<div role="tabpanel" class="tab-pane active" id="home">
							<table class="table table-hover">
										<tr>
											<th>序号</th>
											<th>项目编号</th>
											<th>项目名称</th>
											<th>项目地址</th>
											<th>项目负责人</th>
											<th>项目成员</th>
											<th>客户</th>
											<th>项目描述</th>
											<th>项目开始时间</th>
											<th>项目结束时间</th>
											<th>操作</th>
										</tr>
											<tr>
												<td>s</td>
												<td>${role.roleName }</td>
												<td>${role.menuPath }</td>
												<td>${role.menuType }</td>
												<td>${role.menuParent }</td>
												<td>${role.menuParent }</td>
												<td>${role.menuParent }</td>
												<td>${role.menuParent }</td>
												<td>${role.menuParent }</td>
												<td>${role.menuParent }</td>
												<td><i class="fa fa-share" title="预览"></i><i class="fa fa-" title="导出"></i></td>
											</tr>
									</table>
						</div>
						<div role="tabpanel" class="tab-pane" id="profile">
							<form class="form-tab" action="/project/addProject.do" method="post">
								<div class="form-group">
									<label for="userName">项目编号*</label>
									<input type="text" class="form-control" name="userName" id="userName">
								</div>
								<div class="form-group">
									<label for="userName">项目名称*</label>
									<input type="text" class="form-control" name="userName" id="userName">
								</div>
								<div class="form-group">
									<label for="userName">项目地址*</label>
									<input type="text" class="form-control" name="userName" id="userName">
								</div>
								<div class="form-group">
									<label for="userName">项目负责人*</label>
									<input type="text" class="form-control" name="userName" id="userName">
								</div>
								<div class="form-group">
									<label for="userName">项目成员*</label>
									<input type="text" class="form-control" name="userName" id="userName">
								</div>
								<div class="form-group">
									<label for="userName">客户名称*</label>
									<input type="text" class="form-control" name="userName" id="userName">
								</div>
								<div class="form-group">
									<label for="userName">预计开始时间*</label>
									<input type="text" class="form-control" name="userName" id="userName">
								</div>
								<div class="form-group">
									<label for="userName">预计结束时间*</label>
									<input type="text" class="form-control" name="userName" id="userName">
								</div>
								<button type="button" class="btn rolebtn btn-info"> 提交</button>
							</form>
						</div>
					</div>
			</div>
		</div>
	</div>
  </body>
</html>
