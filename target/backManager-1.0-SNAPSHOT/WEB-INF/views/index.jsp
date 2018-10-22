<%--
  Created by IntelliJ IDEA.
  User: Shuhan Chen
  Date: 2018/10/15
  Time: 21:28
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
<meta charset="utf-8">
    <title>后台管理系统</title>
    <link rel="stylesheet" href="https://cdn.staticfile.org/twitter-bootstrap/3.3.7/css/bootstrap.min.css">
    <script src="https://cdn.staticfile.org/jquery/2.1.1/jquery.min.js"></script>
    <script src="https://cdn.staticfile.org/twitter-bootstrap/3.3.7/js/bootstrap.min.js"></script>

    <%--<link rel="stylesheet" href="../lib/bootstrap-4.1.3-dist/css/bootstrap.min.css">--%>
    <%--<script src="../lib/2.2.4/jquery-2.2.4.js"></script>--%>
    <%--<script src="../lib/bootstrap-4.1.3-dist/js/bootstrap.min.js"></script>--%>
</head>
<body>
    <div class="container">
        <div class="row">
            <div class="page-header">
                <h1>后台管理系统 <small>用户数据中心</small></h1>
            </div>
        </div>
        <div class="row">
            <div class="jumbotron">
                <h1>MyBatis</h1>
                <p>Welcome to backManager!</p>
                <p><a class="btn btn-primary btn-lg" href="#" role="button">
                    查看详情</a>
                </p>
            </div>
        </div>
        <div class="row">
            <table class="table table-hover table-striped">
                    <tr>
                        <td>用户编码</td>
                        <td>登陆账号</td>
                        <td>用户昵称</td>
                        <td>邮箱</td>
                        <td>联系方式</td>
                        <td>账号创建时间</td>
                        <td>用户状态</td>
                        <td>操作</td>
                    </tr>
                <c:forEach var="user" items="${userList}">
                    <tr>
                        <td>${user.id}</td>
                        <td>${user.username}</td>
                        <td>${user.nickname}</td>
                        <td>${user.email}</td>
                        <td>${user.phone}</td>
                        <td>${user.createTime}</td>
                        <c:if test="${user.userStatus == 0}"><td>删除</td></c:if>
                        <c:if test="${user.userStatus == 1}"><td>正常</td></c:if>
                        <c:if test="${user.userStatus == 2}"><td>锁定</td></c:if>
                        <td>
                            <a href="examine.do?id=${user.id}">查看</a>
                            <c:if test="${user.userStatus == 1}"><a href="modify.do?id=${user.id}">修改</a></c:if>
                            <c:if test="${user.userStatus == 2}"><a href="unlock.do?id=${user.id}">解锁</a></c:if>
                            <a href="delete.do?id=${user.id}">删除</a>
                        </td>
                    </tr>
                </c:forEach>
            </table>
        </div>
    </div>
</body>
</html>
