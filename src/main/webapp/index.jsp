<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>
    
    <title>主页</title>
    <script type="text/javascript" src="${pageContext.request.contextPath}/assets/js/official/jquery-1.8.0.js"></script>
    <script type="text/javascript">
    	$(function(){
    		$("#login").click(function(){
    			$.ajax({
    				url:"samp/login.do",
    				data:{
    					userName:$("#userName").val(),
    					userPwd:$("#userPwd").val()
    				},
    				success:function(data){
    					alert(data);
    				}
    			});
    		});
    		$("#update").click(function(){
    			$.ajax({
    				url:"samp/test.do",
    				data:new FormData($("#fm")),
    				type : "POST",
    				processData:false,
                	contentType:false,
    				success:function(data){
    					alert("成功");
    					alert(data);
    				}
    			});
    		
    		});
    		$("#ck").click(function(){
    			$.ajax({
    				type : "POST",
    				url:"samp/test.do",
    				data:{
    					str:'{123}'
    				},
    				success:function(data){
    					alert(data);
    				}
    			});
    		});
    	});
    </script>
  </head>
  <body>
    <span id="ck">点击</span>
    <input id="userName" value="ADMIN"/><input id="userPwd" value="ADMIN"/><button id="login">登录</button>
    <form id="fm" action="samp/updateImage.do" enctype="multipart/form-data" method="post">
    	<input id="file" name="file" type="file">
    	<input type="submit" value="提交">
    </form>
    <button id="update">上传</button>
  </body>
</html>
