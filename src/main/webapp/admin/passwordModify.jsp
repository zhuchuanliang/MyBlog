<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<link rel="shortcut icon" href="favicon.ico">
<link rel="stylesheet" type="text/css" href="${pageContext.request.contextPath}/static/jquery-easyui-1.3.3/themes/default/easyui.css">
<link rel="stylesheet" type="text/css" href="${pageContext.request.contextPath}/static/jquery-easyui-1.3.3/themes/icon.css">
<script type="text/javascript" src="${pageContext.request.contextPath}/static/jquery-easyui-1.3.3/jquery.min.js"></script>
<script type="text/javascript" src="${pageContext.request.contextPath}/static/jquery-easyui-1.3.3/jquery.easyui.min.js"></script>
<script type="text/javascript" src="${pageContext.request.contextPath}/static/jquery-easyui-1.3.3/locale/easyui-lang-zh_CN.js"></script>
<title>Insert title here</title>
<script type="text/javascript">
function modifyPassword(){
	$("#ff").form("submit",{
		url:"${pageContext.request.contextPath}/admin/blogger/modifyPassword.do",
		onSubmit:function(){
			var newPassword=$("#newPassword").val();
			var newPassword2=$("#newPassword2").val();
			if(!$(this).form("validate")){
				return false;
			}
			if(newPassword!=newPassword2){
				$.messager.alert("系统提示","确认密码输入错误！");
				return false;
			}
			return true;
		},
		success:function(result){
			var result=eval('('+result+')');
			if(result.success){
				$.messager.alert("系统提示","密码修改成功,下一次登录失效！");
				resetValue();
				$("#ff").form("close");
			}else{
				$.messager.alert("系统提示","密码修改失败！");
				return;
			}
		}
	});
}
function clearModifyPassword(){
	
	$('#ff').form('clear');
}
</script>
</head>
<body>
<div style="margin:20px 0;"></div>
	<div class="easyui-panel" title="密码修改" style="width:400px;padding:30px 60px">
		<div style="margin-bottom:20px">
		 <form id="ff" class="easyui-form" method="post" data-options="novalidate:true">
	    	<table cellpadding="5">
	    		<tr>
	    			<td>用户名:</td>
	    			<td><input class="easyui-textbox" type="text" name="userName" data-options="required:true"></input></td>
	    		</tr>
	    		<tr>
	    			<td>密码:</td>
	    			<td><input class="easyui-textbox" type="password" id="newPassword" name="newPassword" data-options="required:true"></input></td>
	    		</tr>
	    		<tr>
	    			<td>确认密码:</td>
	    			<td><input class="easyui-textbox" type="password" id="newPassword2" name="newPassword2" data-options="required:true"></input></td>
	    		</tr>
	    		
	    	</table>
	    </form>
		
		<div style="text-align:center;padding:5px">
			<a href="javascript:modifyPassword()" class="easyui-linkbutton" iconCls="icon-ok">保存</a>
	    	<a href="javascript:clearModifyPassword()" class="easyui-linkbutton" iconCls="icon-cancel">清除</a>
		</div>
	
	</div>
</div>
</body>
</html>