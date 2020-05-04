<%--
  Created by IntelliJ IDEA.
  User: yousuke
  Date: 2020-05-03
  Time: 21:50
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ page import="model.Character,java.util.List" %>
<% List<Character> list = (List<Character>) request.getAttribute("list");%>

<html>
<head>
    <title>一覧</title>
</head>
<body>
<div>
   <% if(list==null||list.size()==0){ %>
    <h3>誰も登録してないよ</h3>
    <%}else{ %>
    <table>
        <tr>
            <th>名前</th>
            <th>必殺技</th>
        </tr>
        <% for(Character chr: list ){ %>
        <tr>
            <td><%=chr.getName()%></td>
            <td><%=chr.getSpecialAttack()%></td>
        </tr>
        <% } %>
    </table>
    <% } %>
    <a href="/SemiJspServlet2020/characters/create">キャラの登録</a>
</div>
</body>
</html>
