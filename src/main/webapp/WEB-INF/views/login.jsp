<!DOCTYPE html>
<%@ page contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags" %>
<html lang="ru">
<head>
    <meta charset="utf-8">
    <title>Indoor-навигация | Вход</title>

    <link href="<spring:url value="../css/bootstrap.min.css"/>" rel="stylesheet" type="text/css">
    <link href="<spring:url value="../css/metisMenu.min.css"/>" rel="stylesheet" type="text/css">
    <link href="<spring:url value="../css/startmin.css"/>" rel="stylesheet" type="text/css">
    <link href="<spring:url value="../css/font-awesome.min.css"/>" rel="stylesheet" type="text/css">

</head>
<body>

<div class="container">
    <div class="row">
        <div class="col-md-4 col-md-offset-4">
            <div class="login-panel panel panel-default">
                <div class="panel-heading">
                    <h3 class="panel-title">Вход</h3>
                </div>
                <div class="panel-body">
                    <c:url value="/j_spring_security_check" var="loginUrl" />
                    <form role="form" action="${loginUrl}" method="post">
                        <fieldset>
                            <c:if test= "${not empty param.error}">
                                <span style="color: red"><b>Неправильный логин или пароль</b></span>
                            </c:if>
                            <div class="form-group">
                                <input class="form-control" placeholder="Логин" name="j_username" type="text" autofocus>
                            </div>
                            <div class="form-group">
                                <input class="form-control" placeholder="Пароль" name="j_password" type="password" value="">
                            </div>
                            <div class="checkbox">
                                <label>
                                    <input name="j_spring_security_remember_me" type="checkbox">Запомнить меня
                                </label>
                            </div>
                            <!-- Change this to a button or input when using this as a form -->
                            <input type="submit" class="btn btn-lg btn-success btn-block" value="Войти">
                        </fieldset>
                    </form>
                </div>
            </div>
        </div>
    </div>
</div>

<script src="<spring:url value="../js/jquery.min.js"/>" type="text/javascript"></script>
<script src="<spring:url value="../js/bootstrap.min.js"/>" type="text/javascript"></script>
<script src="<spring:url value="../js/metisMenu.min.js"/>" type="text/javascript"></script>

</body>
</html>
