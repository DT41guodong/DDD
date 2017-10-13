<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%
String path = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+request.getContextPath()+"/";
%>
<!DOCTYPE html>
<html>
<head>
<base href="<%=path%>">
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>页面</title>
<style type="text/css">
.zj{
width:900px;
height:500px;
border:1px solid red;
}
.fj{
width:26%;
height:97%;
border:1px solid blue;
}
</style>
</head>
<body>
<div class="zj">
<div class="fj">

</div>
</div>
</body>
</html>