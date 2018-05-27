<!DOCTYPE html>
<%@ page contentType="text/html;charset=UTF-8" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="sec"  uri="http://www.springframework.org/security/tags" %>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags" %>
<html lang="ru">
<head>
    <meta charset="utf-8">
    <title>Indoor-навигация | Управление пользователями</title>

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
                            <button onclick="clearEditForm()" style="margin-left: 20px;" class="btn btn-success btn-sm user-edit-btn" data-toggle="modal" data-target="#myModal">
                                Создать пользователя
                            </button>
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
                                        <th>Управление</th>
                                    </tr>
                                    </thead>
                                    <tbody>
                                        <c:forEach items="${users}" var="user" varStatus="status">
                                            <tr class="gradeA">
                                                <td>${user.id}</td>
                                                <td>${user.firstName}</td>
                                                <td>${user.lastName}</td>
                                                <td>${user.login}</td>
                                                <td>${user.password}</td>
                                                <td>
                                                    <button onclick="fillEditForm(${status.index})" class="btn btn-primary btn-sm user-edit-btn" data-toggle="modal" data-target="#myModal">
                                                        Изменить
                                                    </button>
                                                    <button onclick="deleteUser(${user.id})" class="btn btn-danger btn-sm user-edit-btn">
                                                        Удалить
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
                                            <h4 class="modal-title" id="myModalLabel"></h4>
                                        </div>
                                        <div id="userEditForm" class="modal-body">
                                            <input id="userIdInput" type="hidden" name="id">
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
                                            <button type="button" class="btn btn-default" data-dismiss="modal">Отмена</button>
                                            <input onclick="applyChanges()" type="submit" class="btn btn-success" data-dismiss="modal" value="Сохранить">
                                        </div>
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

<script src="<spring:url value="../resources/js/jquery.min.js"/>" type="text/javascript"></script>
<script src="<spring:url value="../resources/js/bootstrap.min.js"/>" type="text/javascript"></script>
<script src="<spring:url value="../resources/js/metisMenu.min.js"/>" type="text/javascript"></script>
<script src="<spring:url value="../resources/js/dataTables/jquery.dataTables.min.js"/>"></script>
<script src="<spring:url value="../resources/js/dataTables/dataTables.bootstrap.min.js"/>"></script>
<script src="<spring:url value="../resources/js/startmin.js"/>" type="text/javascript"></script>
<script src="<spring:url value="../resources/js/toastr.min.js"/>" type="text/javascript"></script>

<script>

    $(document).ready(function() {
        $('#dataTables-example').DataTable({
            responsive: true
        });
    });

    var users = {
        <c:forEach items="${users}" var="user" varStatus="status">
            "${status.index}": {
                id: "${user.id}",
                firstName: "${user.firstName}",
                lastName: "${user.lastName}",
                login: "${user.login}",
                password: "${user.password}"
            },
        </c:forEach>
    };
    var userFormInputs = $("#userEditForm").find("input");
    var modalTitle = $("#myModalLabel");

    function fillEditForm(userIndex) {
        modalTitle.text("Редактирование пользователя");
        var user = users[userIndex];
        userFormInputs[0].value = user.id;
        userFormInputs[1].value = user.firstName;
        userFormInputs[2].value = user.lastName;
        userFormInputs[3].value = user.login;
        userFormInputs[4].value = user.password;
    }

    function clearEditForm() {
        modalTitle.text("Создание пользователя");
        userFormInputs.each(function () {
            this.value = '';
        })
    }

    function applyChanges() {
        var method, jsonUser;
        if (userFormInputs[0].value.length === 0) {
            method = "POST";
            jsonUser = {
                firstName: userFormInputs[1].value,
                lastName: userFormInputs[2].value,
                login: userFormInputs[3].value,
                password: userFormInputs[4].value
            }
        } else {
            method = "PUT";
            jsonUser = {
                id: userFormInputs[0].value,
                firstName: userFormInputs[1].value,
                lastName: userFormInputs[2].value,
                login: userFormInputs[3].value,
                password: userFormInputs[4].value
            }
        }
        if (!valid(jsonUser)) {
            toastr["warning"]("Логин/пароль не должны быть пустыми", "Ошибка")
            return;
        }

        $.ajax({
            url: "${pageContext.request.contextPath}/api/users",
            method: method,
            data: JSON.stringify(jsonUser),
            contentType: "application/json",
            dataType: "json",
            success: function () {
                if (method === "POST") toastr["success"]("Пользователь создан", "Успех");
                else if (method === "PUT") toastr["success"]("Пользователь успешно редактирован", "Успех");
                $('#dataTables-example').ajax.reload();
                //reloadUserTable();
            }
        })
    }

    function valid(data) {
        return data.login.length !== 0 && data.password.length !== 0;
    }

    function deleteUser(id) {
        $.ajax({
            url: "${pageContext.request.contextPath}/api/users/" + id,
            method: "DELETE",
            dataType: "json",
            success: function () {
                toastr["success"]("Пользователь успешно удалён", "Успех");
                $('#dataTables-example').ajax.reload();
                //reloadUserTable();
            }
        })
    }
</script>

</body>
</html>
