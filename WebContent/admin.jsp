<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@ taglib prefix="s" uri="/struts-tags"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8" />
<meta http-equiv="Content-Style-Type" content="text/css" />
<meta http-equiv="Content-Script-Type" content="text/javascript" />
<meta http-equiv="imagetoolbar" content="no" />
<meta name="description" content="" />
<meta name="keywords" content="" />
<title>Admin画面</title>
<style type="text/css">

body {
  margin: 0;
  font-family: "Hiragino Kaku Gothic ProN";
}

.top-wrapper {
  padding: 180px 0 100px 0;
  background-size: cover;
  color: white;
  text-align: center;
}

.top-wrapper h1 {
  opacity: 0.7;
  font-size: 45px;
  letter-spacing: 5px;
}

.top-wrapper p {
  opacity: 0.7;
}

.btn-wrapper {
  margin: 20px 0;
}

.btn-wrapper p {
  margin: 10px 0;
}

.A {
  background-color: #3b5998;
  margin-right: 10px;
}

.B{
  background-color: #55acee;
}

.btn {
  padding: 8px 24px;
  color: white;
  display: inline-block;
  opacity: 0.8;
  border-radius: 4px;
}

.btn:hover {
  opacity: 1;
}

.fa {
  margin-right: 5px;
}


</style>
</head>
<body>
<h1>管理者画面</h1>
<div class="btn-wrapper">
<p>商品</p>
<a href='<s:url action="ItemCreateAction"/>'class="btn A"><span class="fa fa"></span>新規登録</a>
<a href='<s:url action="ItemListAction"/>'class="btn B"><span class="fa fa"></span>一覧</a>


<p>ユーザー</p>
<a href='<s:url action="UserCreateAction"/>'class="btn A"><span class="fa fa"></span>新規登録</a>
<a href='<s:url action="UserListAction"/>'class="btn B"><span class="fa fa"></span>一覧</a>

<p>前画面に戻る場合は<a href='<s:url action="GoHomeAction"/>'>こちら</a></p>


</div>


</body>
</html>