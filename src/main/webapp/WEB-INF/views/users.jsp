<!DOCTYPE html>
<%@ page contentType="text/html;charset=UTF-8" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="sec"  uri="http://www.springframework.org/security/tags" %>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags" %>
<html lang="ru">
<head>
    <meta charset="utf-8">
    <title>Indoor-навигация | Управление пользователями</title>

    <link href="<spring:url value="../css/bootstrap.min.css"/>" rel="stylesheet" type="text/css">
    <link href="<spring:url value="../css/metisMenu.min.css"/>" rel="stylesheet" type="text/css"><!-- DataTables CSS -->
    <link href="<spring:url value="../css/dataTables/dataTables.bootstrap.css"/>" rel="stylesheet">
    <link href="<spring:url value="../css/dataTables/dataTables.responsive.css"/>" rel="stylesheet">
    <link href="<spring:url value="../css/startmin.css"/>" rel="stylesheet" type="text/css">
    <link href="<spring:url value="../css/font-awesome.min.css"/>" rel="stylesheet" type="text/css">
    <link href="<spring:url value="../css/timeline.css"/>" rel="stylesheet" type="text/css">
    <link href="<spring:url value="../css/morris.css"/>" rel="stylesheet" type="text/css">
</head>
<body>

<div id="wrapper">

    <!-- Navigation -->
    <nav class="navbar navbar-inverse navbar-fixed-top" role="navigation">
        <div class="navbar-header">
            <a class="navbar-brand" href="#">Indoor-навигация</a>
        </div>

        <button type="button" class="navbar-toggle" data-toggle="collapse" data-target=".navbar-collapse">
            <span class="sr-only">Toggle navigation</span>
            <span class="icon-bar"></span>
            <span class="icon-bar"></span>
            <span class="icon-bar"></span>
        </button>

        <!-- Top Navigation: Left Menu -->
        <ul class="nav navbar-nav navbar-left navbar-top-links">
            <li><a href="<c:url value="/index.html"/>"><i class="fa fa-home fa-fw"></i> Домашняя страница</a></li>
        </ul>

        <!-- Top Navigation: Right Menu -->
        <ul class="nav navbar-right navbar-top-links">
            <li class="dropdown">
                <a class="dropdown-toggle" data-toggle="dropdown" href="#">
                    <i class="fa fa-user fa-fw"></i> <sec:authentication property="principal.username"/> <b class="caret"></b>
                </a>
                <ul class="dropdown-menu dropdown-user">
                    <li><a href="#"><i class="fa fa-user fa-fw"></i> Профиль</a>
                    <li class="divider"></li>
                    <li><a href="<c:url value="/j_spring_security_logout" />"><i class="fa fa-sign-out fa-fw"></i> Выход</a>
                    </li>
                </ul>
            </li>
        </ul>

        <!-- Sidebar -->
        <div class="navbar-default sidebar" role="navigation">
            <div class="sidebar-nav navbar-collapse">

                <ul class="nav" id="side-menu">
                    <li>
                        <a href="<c:url value="/index.html"/>"><i class="fa fa-dashboard fa-fw"></i> Новости и события</a>
                    </li>
                    <li class="active">
                        <a href="#"><i class="fa fa-table fa-fw"></i> Управление сущностями<span class="fa arrow"></span></a>
                        <ul class="nav nav-second-level">
                            <li>
                                <a class="active" href="<c:url value="/view/users.html"/>">Пользователи</a>
                            </li>
                            <li>
                                <a href="#">Bluetooth-метки</a>
                            </li>
                            <li>
                                <a href="#">Кабинеты</a>
                            </li>
                        </ul>
                    </li>
                </ul>

            </div>
        </div>
    </nav>

    <!-- Page Content -->
    <div id="page-wrapper">
        <div class="container-fluid">

            <div class="row">
                <div class="col-lg-12">
                    <h1 class="page-header">Управление</h1>
                </div>
            </div>

            <!-- ... Your content goes here ... -->
            <div class="row">
                <div class="col-lg-12">
                    <div class="panel panel-default">
                        <div class="panel-heading">
                            Пользователи
                        </div>
                        <div class="panel-body">
                            <div class="dataTable_wrapper">
                                <table class="table table-striped table-bordered table-hover" id="dataTables-example">
                                    <thead>
                                    <tr>
                                        <th>ID</th>
                                        <th>Имя</th>
                                        <th>Фамилия</th>
                                        <th>Логин</th>
                                        <th>Пароль</th>
                                        <th>Статус</th>
                                        <th>Управление</th>
                                    </tr>
                                    </thead>
                                    <tbody>
                                        <c:forEach items="${users}" var="user" >
                                            <tr class="gradeA">
                                                <td>${user.id}</td>
                                                <td>${user.firstName}</td>
                                                <td>${user.lastName}</td>
                                                <td>${user.login}</td>
                                                <td>${user.password}</td>
                                                <td>${user.status.name()}</td>
                                                <td>
                                                    <button class="btn btn-primary btn-md" data-toggle="modal" data-target="#myModal">
                                                        Изменить
                                                    </button>
                                                </td>
                                            </tr>
                                        </c:forEach>
                                    </tbody>
                                </table>
                            </div>
                            <!-- Modal -->
                            <div class="modal fade" id="myModal" tabindex="-1" role="dialog" aria-labelledby="myModalLabel" aria-hidden="true">
                                <div class="modal-dialog">
                                    <div class="modal-content">
                                        <div class="modal-header">
                                            <button type="button" class="close" data-dismiss="modal" aria-hidden="true">&times;</button>
                                            <h4 class="modal-title" id="myModalLabel">Modal title</h4>
                                        </div>
                                        <form role="form" action="${pageContext.request.contextPath}/api/users" method="post">
                                            <div class="modal-body">

                                                    <div class="form-group">
                                                        <label>Имя</label>
                                                        <input class="form-control" name="firstName" type="text">
                                                    </div>
                                                    <div class="form-group">
                                                        <label>Фамилия</label>
                                                        <input class="form-control" name="lastName" type="text">
                                                    </div>
                                                    <div class="form-group">
                                                        <label>Логин</label>
                                                        <input class="form-control" name="login" type="text">
                                                    </div>
                                                    <div class="form-group">
                                                        <label>Пароль</label>
                                                        <input class="form-control" name="password" type="text">
                                                    </div>

                                            </div>
                                            <div class="modal-footer">
                                                <button type="button" class="btn btn-default" data-dismiss="modal">Close</button>
                                                <input type="submit" class="btn btn-success" value="Сохранить">
                                            </div>
                                        </form>
                                    </div>
                                    <!-- /.modal-content -->
                                </div>
                                <!-- /.modal-dialog -->
                            </div>
                        </div>
                    </div>
                </div>
            </div>

        </div>
    </div>

</div>

<script src="<spring:url value="../js/jquery.min.js"/>" type="text/javascript"></script>
<script src="<spring:url value="../js/bootstrap.min.js"/>" type="text/javascript"></script>
<script src="<spring:url value="../js/metisMenu.min.js"/>" type="text/javascript"></script>
<script src="<spring:url value="../js/dataTables/jquery.dataTables.min.js"/>"></script>
<script src="<spring:url value="../js/dataTables/dataTables.bootstrap.min.js"/>"></script>
<script src="<spring:url value="../js/startmin.js"/>" type="text/javascript"></script>

<script>
    $(document).ready(function() {
        $('#dataTables-example').DataTable({
            responsive: true
        });
    });
</script>

</body>
</html>
