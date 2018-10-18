<%--
  Created by IntelliJ IDEA.
  User: Shuhan Chen
  Date: 2018/10/15
  Time: 21:28
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <meta charset="utf-8">
    <title>后台管理系统</title>
    <link rel="stylesheet" href="https://cdn.staticfile.org/twitter-bootstrap/3.3.7/css/bootstrap.min.css">
    <script src="https://cdn.staticfile.org/jquery/2.1.1/jquery.min.js"></script>
    <script src="https://cdn.staticfile.org/twitter-bootstrap/3.3.7/js/bootstrap.min.js"></script>
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

                <tr>
                    <td>1</td>
                    <td>admin</td>
                    <td>小牧</td>
                    <td>xiaomu@mooc.com</td>
                    <td>1388888888</td>
                    <td>2017-05-15</td>
                    <td>正常</td>
                    <td>
                        <a href="#">查看</a>
                        <a href="#">修改</a>
                        <a href="#">删除</a>
                    </td>
                </tr>
            </table>
        </div>
    </div>
</body>
</html>
