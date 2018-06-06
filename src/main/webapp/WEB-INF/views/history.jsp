<!DOCTYPE html>
<%@ page contentType="text/html;charset=UTF-8" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="sec"  uri="http://www.springframework.org/security/tags" %>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags" %>
<html lang="ru">
<head>
    <meta charset="utf-8">
    <title>Indoor-навигация | Управление кабинетами</title>

    <link href="<spring:url value="../resources/css/bootstrap.min.css"/>" rel="stylesheet" type="text/css">
    <link href="<spring:url value="../resources/css/metisMenu.min.css"/>" rel="stylesheet" type="text/css">
    <link href="<spring:url value="../resources/css/dataTables/dataTables.bootstrap.css"/>" rel="stylesheet">
    <link href="<spring:url value="../resources/css/dataTables/dataTables.responsive.css"/>" rel="stylesheet">
    <link href="<spring:url value="../resources/css/startmin.css"/>" rel="stylesheet" type="text/css">
    <link href="<spring:url value="../resources/css/font-awesome.min.css"/>" rel="stylesheet" type="text/css">
    <link href="<spring:url value="../resources/css/timeline.css"/>" rel="stylesheet" type="text/css">
    <link href="<spring:url value="../resources/css/morris.css"/>" rel="stylesheet" type="text/css">
    <link href="<spring:url value="../resources/css/toastr.min.css"/>" rel="stylesheet" type="text/css">
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
                    <li>
                        <a href="#"><i class="fa fa-table fa-fw"></i> Управление сущностями<span class="fa arrow"></span></a>
                        <ul class="nav nav-second-level">
                            <li>
                                <a href="<c:url value="/view/users.html"/>">Пользователи</a>
                            </li>
                            <li>
                                <a href="<c:url value="/view/beacons.html"/>">Bluetooth-метки</a>
                            </li>
                            <li>
                                <a href="<c:url value="/view/cabinets.html"/>">Кабинеты</a>
                            </li>
                        </ul>
                    </li>
                    <li>
                        <a class="active" href="<c:url value="/view/history.html"/>"><i class="fa fa-history fa-fw"></i> История</a>
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
                    <h1 class="page-header">История местонахождения пользователей</h1>
                </div>
            </div>

            <div class="row">
                <div class="col-lg-12">
                    <div class="panel panel-default" style="width: 1000px">
                        <div class="panel-heading">
                            Местонахождения пользователей
                        </div>
                        <div class="panel-body">
                            <div class="dataTable_wrapper">
                                <table id="locationsTable" class="table table-striped table-bordered table-hover">
                                    <thead>
                                    <tr>
                                        <th>ID</th>
                                        <th>Этаж</th>
                                        <th>Координата X</th>
                                        <th>Координата Y</th>
                                        <th>Дата и время</th>
                                    </tr>
                                    </thead>
                                    <tbody>
                                    <c:forEach items="${locationsHistory}" var="location">
                                        <tr id="cabinetEntry_${location.id}" class="gradeA">
                                            <td>${location.id}</td>
                                            <td>${location.floorNum}</td>
                                            <td>${location.cordx}</td>
                                            <td>${location.cordy}</td>
                                            <td>${location.date}</td>
                                        </tr>
                                    </c:forEach>
                                    </tbody>
                                </table>
                            </div>
                        </div>
                    </div>
                </div>
            </div>

        </div>
    </div>

</div>

<script src="<spring:url value="../resources/js/jquery.min.js"/>" type="text/javascript"></script>
<script src="<spring:url value="../resources/js/bootstrap.min.js"/>" type="text/javascript"></script>
<script src="<spring:url value="../resources/js/metisMenu.min.js"/>" type="text/javascript"></script>
<script src="<spring:url value="../resources/js/dataTables/jquery.dataTables.min.js"/>"></script>
<script src="<spring:url value="../resources/js/dataTables/dataTables.bootstrap.min.js"/>"></script>
<script src="<spring:url value="../resources/js/startmin.js"/>" type="text/javascript"></script>
<script src="<spring:url value="../resources/js/toastr.min.js"/>" type="text/javascript"></script>

<script>

    $(function() {
        var locationsTable = $('#locationsTable');
        locationsTable.DataTable({
            responsive: true
        });
    });

</script>

</body>
</html>
