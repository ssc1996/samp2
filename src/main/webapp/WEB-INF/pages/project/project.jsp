<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt" %>
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
	<style type="text/css">
		.card{overflow: inherit;}
	</style>

  <link rel="stylesheet" href="/samp2/assets/css/jquery-ui.min.css">
  <script src="/samp2/assets/js/official/jquery-ui.min.js"></script>
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
											<th>导出时所需模板</th>
											<th>操作</th>
										</tr>
										<c:forEach items="${allProject }" var="project">
											
											<tr>
												<td>${project.projId }</td>
												<td>${project.projNo }</td>
												<td>${project.projName }</td>
												<td>${project.projAddress }</td>
												<td>${project.projPersonLiable }</td>
												<td>${project.projMember }</td>
												<td>${project.custName }</td>
												<td>${project.projDescribe }</td>
												<td><fmt:formatDate value="${project.projStartTime }" type="both"/></td>
												<td><fmt:formatDate value="${project.projEndTime }" type="both"/></td>
												<td><select><option value="1">模板一</option><option value="2">模板2</option></select></td>
												<td><span><i class="fa fa-eye" title="预览"></i></span>|<span><i class="fa fa-share" title="导出"></i></span>|<span class="delProject"><i class="fa fa-trash" title="删除"></i></span></td>
											</tr>
										</c:forEach>
									</table>
						</div>
						<div role="tabpanel" class="tab-pane" id="profile">
							<form class="form-inline" action="project/addProject.do" method="post">
								<div class="form-group">
									<label for="projNo">项目编号*</label>
									<input type="text" class="form-control" name="projNo" id="projNo">
								</div>
								<div class="form-group">
									<label for="projName">项目名称*</label>
									<input type="text" class="form-control" name="projName" id="projName">
								</div>
								<div class="form-group">
									<label for="projAddress">项目地址*</label>
									<input type="text" class="form-control" name="projAddress" id="projAddress">
								</div>
								<div class="form-group">
									<label for="projCustId">客户*</label>
									<input type="hidden" class="form-control" name="projCustId" id="projCustId">
									<input type="text" class="form-control" name="custName" id="custName">
								</div>
								<div class="form-group">
									<label for="projPersonLiable">项目负责人*</label>
									<input type="hidden" class="form-control" name="projLiableId" id="projLiableId">
									<input type="text" class="form-control" name="projPersonLiable" id="projPersonLiable">
								</div>
								<div class="form-group">
									<label for="projMember">项目成员*</label>
									<input type="hidden" class="form-control" name="projMemberId" id="projMemberId">
									<input type="text" name="projMember" data-toggle="modal" data-target="#modalInfo" class="form-control" id="projMember">
								</div>
								<div class="form-group">
									<label for="sampNum">采样点数*</label>
									<input type="text" class="form-control" name="sampNum" id="sampNum">
								</div>
								<div class="form-group">
									<label for="waterSampleNum">水样点数*</label>
									<input type="text" class="form-control" name="waterSampleNum" id="waterSampleNum">
								</div>
								<div class="form-group">
									<label for="soilSampleNum">土样点数*</label>
									<input type="text" class="form-control" name="soilSampleNum" id="soilSampleNum">
								</div>
								<div class="form-group">
									<label for="userName">费用合计*</label>
									<input type="text" class="form-control" id="userName">
								</div>
								<div class="form-group">
									<label for="maxDepth">最大深度*</label>
									<input type="text" class="form-control" name="maxDepth" id="maxDepth">
								</div>
								<div class="form-group">
									<label for="userName">采样设备*</label>
									<input type="text" class="form-control" id="userName">
								</div>
								<div class="form-group">
									<label for="userName">保存期*</label>
									<input type="text" class="form-control" name="keepStage" id="keepStage">
								</div>
								<div class="form-group">
									<label for="testContent">测试内容*</label>
									<input type="text" class="form-control" name="testContent" id="testContent">
								</div>
								<div class="form-group">
									<label for="projDescribe">项目描述*</label>
									<input type="text" class="form-control" name="projDescribe" id="projDescribe">
								</div>
								<div class="form-group calendarWarp">
									<label for="projStartTime">预计开始时间*</label>
									<input type="text" name="projStartTime" class='form-control ECalendar' id="projStartTime"/>
								</div>
								<div class="form-group calendarWarp">
									<label for="projEndTime">预计结束时间*</label>
									<input type="text" class="form-control ECalendar" name="projEndTime" id="projEndTime">
									<input type="hidden" class="form-control" name="projCreateId" id="projCreateId" value="${user.userId }">
									<input type="hidden" class="form-control" name="projCreatePerson" id="projCreatePerson" value="${user.realName }">
									<input type="hidden" class="form-control" name="projModifyId" id="projModifyId" value="${user.userId }">
									<input type="hidden" class="form-control" name="projModifyPerson" id="projModifyPerson" value="${user.realName }">
									<input type="hidden" class="form-control" name="deleteData" id="deleteData" value="N">
								</div>
								<button type="submit" class="btn rolebtn btn-info"> 提交</button>
							</form>
						</div>
					</div>
			</div>
		</div>
	</div>
	<div class="modal fade modal-info" id="modalInfo" tabindex="-1" role="dialog" aria-labelledby="myModalLabel" aria-hidden="true">
        <div class="modal-dialog">
            <div class="modal-content">
                <div class="modal-header">
                    <button type="button" class="close" data-dismiss="modal" aria-label="Close"><span aria-hidden="true">&times;</span></button>
                    <h4 class="modal-title" id="myModalLabel">Modal Info</h4>
                </div>
                <div class="modal-body">
                    <div >
                    	<table class="table table-hover dataList"></table>
                    </div>
                    <div>
                    	<table class="table table-hover addMemberList"></table>
                    </div>
                </div>
                <div class="modal-footer">
                    <button type="button" class="btn btn-default" data-dismiss="modal">Close</button>
                    <button type="button" class="btn btn-info memberOk">OK</button>
                </div>
            </div>
        </div>
    </div>
	<script type="text/javascript">
		$("#projStartTime").ECalendar({
			type : "time",
			stamp : false,
			skin : 5,
			format : "yyyy-mm-dd hh:ii"
		});
		$("#projEndTime").ECalendar({
			type : "time",
			stamp : false,
			skin : 5,
			format : "yyyy-mm-dd hh:ii"
		});
		
		$("#projMember").focus(function() {
			console.log(1);
			$.ajax({
				type: "post",
				url: "user/findAllUser.do",
				success: function(data) {
					var liList = "<tr><th scope=\"row\">用户id</th><th>用户编号</th><th>用户名称</th><th>用户名</th><th>操作</th></tr>";
					$.each(data, function(index, value) {
						 liList += "<tr><th scope=\"row\">"+value.userId+"</th><td>"+value.userNo+"</td><td>"+value.realName+"</td><td>"+value.userName+"</td><td><a class=\"btn btn-info addMember\">添加</a></td></tr>";
					});
					$(".dataList").html(liList);
				}
			});
		});
		var addMember = "<tr><th scope=\"row\">用户id</th><th>用户编号</th><th>用户名称</th><th>用户名</th><th>操作</th></tr>";
		var memberId = "&#";
		var member = "&#";
		$(document).on("click", ".addMember", function() {
		var patt=new RegExp($(this).parent().parent().find("th").eq(0).html(),"g");
		if(memberId.match(patt)==null) {
			memberId+= ","+$(this).parent().parent().find("th").eq(0).html();
			member += ","+$(this).parent().parent().find("td").eq(1).html();
			addMember += "<tr>"+$(this).parent().parent().html()+"</tr>";
			$.tooltip(addMember);
			$(".addMemberList").html(addMember);
			$.each($(".addMemberList"), function(index, value) {
				$(value).find("a").html("删除");
				$(value).find("a").removeClass("addMember");
				$(value).find("a").addClass("removeMember");
			});
		}else{
			$.tooltip("请勿重复选择");
		}
		});
		$(document).on("click", ".removeMember", function() {
			var removeMemberId = ","+$(this).parent().parent().find("th").eq(0).html();
			var removeMember = ","+$(this).parent().parent().find("td").eq(1).html();
			memberId = memberId.replace(removeMemberId, "");
			member = member.replace(removeMember, "");
			$(this).parent().parent().remove();
			addMember = $(".addMemberList").html();
			console.log(addMember);
		});
		
		$(".memberOk").click(function() {
			$("#projMemberId").val(memberId.replace("&#,",""));
			$("#projMember").val(member.replace("&#,",""));
		});
		var dats = [];
		$("#projPersonLiable").click(function() {
			$.ajax({
				type: "post",
				url: "user/findAllUser.do",
				success: function(data){
					$.each(data, function(index, value) {
						dats[index] = value.realName;
					});
				}
			});
		});
		$( "#projPersonLiable" ).autocomplete({
			source: dats
		});
		$(".delProject").click(function() {
			var flag = confirm("确定删除？");
			if(flag) {
				var $tr = $(this).parents("tr");
				var projId = $tr.find("td").eq(0).html();
				$.ajax({
				type: "post",
				url:"/samp2/project/removeProject.do",
				data:{"projId":projId},
				success: function(data) {
					$.tooltip(data);
					$tr.remove();
				}
			});
			}
			
			
		});
	</script>
  </body>
</html>
