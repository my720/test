<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="s" uri="/struts-tags"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>LoginError画面</title>
</head>
<body>
 <h1>ログインに失敗しました</h1>
 【入力内容を確認してください】
 <br>
 ユーザー名：<s:property value="name"/>
 <br>
 パスワード:<s:property value="password"/>
</body>
</html>