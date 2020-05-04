<%--
  Created by IntelliJ IDEA.
  User: yousuke
  Date: 2020-05-03
  Time: 23:53
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>キャラクター登録</title>
</head>
<body>
<div>
    <form action="/SemiJspServlet2020/characters/create" method="post">
        名前:<input type="text" placeholder="ex: 井出岳人" name="name">
        必殺技:<input type="text" placeholder="ex: 旅行日程を立てる" name="special_attack">
        <button type="submit">登録</button>
    </form>

    <a href="/SemiJspServlet2020/characters">一覧へもどる</a>

</div>
</body>
</html>
