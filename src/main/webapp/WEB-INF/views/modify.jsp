<%--
  Created by IntelliJ IDEA.
  User: Shuhan Chen
  Date: 2018/10/19
  Time: 13:19
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<html>
<head>
    <title>修改用户信息</title>
    <link rel="stylesheet" href="https://cdn.staticfile.org/twitter-bootstrap/3.3.7/css/bootstrap.min.css">
    <script src="https://cdn.staticfile.org/jquery/2.1.1/jquery.min.js"></script>
    <script src="https://cdn.staticfile.org/twitter-bootstrap/3.3.7/js/bootstrap.min.js"></script>
</head>
<body>
<div class="container">
    <div class="row">
        <div class="page-header">
            <h1>后台管理系统
                <small>用户数据管理中心</small>
            </h1>
        </div>
    </div>

    <div class="row">
        <div class="jumbotron">
            <h1>Mybatis</h1>
            <p>Welcome to BackUserDataManager</p>
            <p><a href="#" class="btn btn-primary btn-lg">SeeMore</a></p>
        </div>
    </div>

    <c:set var="user" value="${user}"></c:set>
    <div class="row">
        <div class="col-md-8 col-md-offset-2">
            <form action="modifyCheck.do" class="form-horizontal">
                <div class="form-group">
                    <label class="col-sm-2 control-label">用户ID</label>
                    <div class="col-sm-10">
                        <input type="text" class="form-control" id="id" name="id" value="${user.id}" placeholder="" readonly="readonly">
                    </div>
                </div>
                <div class="form-group">
                    <label class="col-sm-2 control-label">用户名</label>
                    <div class="col-sm-10">
                        <input type="text" class="form-control" id="username" name="username" value="${user.username}" placeholder="" >
                    </div>
                </div>
                <div class="form-group">
                    <label class="col-sm-2 control-label">用户密码</label>
                    <div class="col-sm-10">
                        <input type="text" class="form-control" id="password" name="password" value="${user.password}" placeholder="" >
                    </div>
                </div>
                <div class="form-group">
                    <label class="col-sm-2 control-label">昵称</label>
                    <div class="col-sm-10">
                        <input type="text" class="form-control" id="nickname" name="nickname" value="${user.nickname}" placeholder="" >
                    </div>
                </div>
                <div class="form-group">
                    <label class="col-sm-2 control-label">年龄</label>
                    <div class="col-sm-10">
                        <input type="text" class="form-control" id="age" name="age" value="${user.age}" placeholder="">
                    </div>
                </div>
                <div class="form-group">
                    <label class="col-sm-2 control-label">性别</label>
                    <div class="col-sm-10">
                        <input type="text" class="form-control" id="gender" name="gender" value="<c:if test="${user.gender == 0}">女</c:if><c:if
                            test="${user.gender == 1}">男</c:if>" placeholder="" >
                    </div>
                </div>
                <div class="form-group">
                    <label class="col-sm-2 control-label">手机号码</label>
                    <div class="col-sm-10">
                        <input type="text" class="form-control" id="phone" name="phone" value="${user.phone}" placeholder="">
                    </div>
                </div>
                <div class="form-group">
                    <label class="col-sm-2 control-label">邮箱</label>
                    <div class="col-sm-10">
                        <input type="text" class="form-control" id="email" name="email" value="${user.email}" placeholder="">
                    </div>
                </div>
                <div class="form-group">
                    <label class="col-sm-2 control-label">创建时间</label>
                    <div class="col-sm-10">
                        <input type="text" class="form-control" id="createTime" name="createTime" value="<fmt:formatDate value="${user.createTime}"
                            pattern="yyyy-MM-dd"></fmt:formatDate>" placeholder="" readonly="readonly">
                    </div>
                </div>
                <div class="form-group">
                    <label class="col-sm-2 control-label">更新时间</label>
                    <div class="col-sm-10">
                        <input type="text" class="form-control" id="updateTime" name="updateTime" value="<fmt:formatDate value="${user.updateTime}"
                            pattern="yyyy-MM-dd"></fmt:formatDate>" placeholder="" readonly="readonly">
                    </div>
                </div>
                <div class="form-group">
                    <label class="col-sm-2 control-label">最后一次登录时间</label>
                    <div class="col-sm-10">
                        <input type="text" class="form-control" id="lastLogin" name="lastLogin" value="<fmt:formatDate value="${user.lastLogin}"
                            pattern="yyyy-MM-dd"></fmt:formatDate>" placeholder="" readonly="readonly">
                    </div>
                </div>
                <div class="form-group">
                    <label class="col-sm-2 control-label">用户状态</label>
                    <div class="col-sm-10">
                        <input type="text" class="form-control" id="userStatus" name="userStatus"
                               value="<c:if test="${user.userStatus == 1}">正常</c:if>
                                   <c:if test="${user.userStatus == 0}">删除</c:if>
                                   <c:if test="${user.userStatus == 2}">锁定</c:if>
" placeholder=""  readonly="readonly">
                    </div>
                </div>
                <div class="form-group">
                    <label class="col-sm-2 control-label">备注</label>
                    <div class="col-sm-10">
                        <input type="text" class="form-control" id="remark" name="remark" value="${user.remark}" placeholder="">
                    </div>
                </div>
                <center><button type="submit" class="btn btn-primary btn-lg btn" id="submit" name="submit">修改</button></center>
            </form>
        </div>
    </div>
</div>
</body>
</html>
