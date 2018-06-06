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
                                <a href="<c:url value="/view/beacons.html"/>">Bluetooth-метки</a>
                            </li>
                            <li>
                                <a href="<c:url value="/view/cabinets.html"/>">Кабинеты</a>
                            </li>
                        </ul>
                    </li>
                    <li>
                        <a href="<c:url value="/view/history.html"/>"><i class="fa fa-history fa-fw"></i> История</a>
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

            <div class="row">
                <div class="col-lg-12">
                    <div class="panel panel-default" style="width: 900px">
                        <div class="panel-heading">
                            Пользователи
                            <button id="createUserBtn" style="margin-left: 20px;" class="btn btn-success btn-sm user-edit-btn" data-toggle="modal" data-target="#myModal">
                                Создать пользователя
                            </button>
                        </div>
                        <div class="panel-body">
                            <div class="dataTable_wrapper">
                                <table id="usersTable" class="table table-striped table-bordered table-hover">
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
                                        <c:forEach items="${users}" var="user">
                                            <tr id="userEntry_${user.id}" class="gradeA">
                                                <td>${user.id}</td>
                                                <td>${user.firstName}</td>
                                                <td>${user.lastName}</td>
                                                <td>${user.login}</td>
                                                <td>${user.password}</td>
                                                <td>
                                                    <button id="editUserBtn_${user.id}" class="btn btn-primary btn-sm user-edit-btn edit-user-btn" data-toggle="modal" data-target="#myModal">
                                                        Изменить
                                                    </button>
                                                    <button id="deleteUserBtn_${user.id}" class="btn btn-danger btn-sm user-edit-btn delete-user-btn">
                                                        Удалить
                                                    </button>
                                                </td>
                                            </tr>
                                        </c:forEach>
                                    </tbody>
                                </table>
                            </div>
                            <!-- Modal -->
                            <div class="modal fade" id="myModal" tabindex="-1" role="dialog" aria-labelledby="modalLabel" aria-hidden="true">
                                <div class="modal-dialog">
                                    <div class="modal-content">
                                        <div class="modal-header">
                                            <button type="button" class="close" data-dismiss="modal" aria-hidden="true">&times;</button>
                                            <h4 class="modal-title" id="modalLabel"></h4>
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
                                            <input id="applyChangesBtn" type="submit" class="btn btn-success" data-dismiss="modal" value="Сохранить">
                                        </div>
                                    </div>
                                </div>
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
        var usersApiUrl = '${pageContext.request.contextPath}/api/users';

        var userTable = $('#usersTable');
        userTable.DataTable({
            responsive: true
        });

        $('#createUserBtn').bind("click", function () {
            $("#modalLabel").text("Создание пользователя");
            clearEditForm();
        });

        userTable.find('.edit-user-btn').each(function (index, btn) {
            btn.addEventListener("click", function () {
                fillEditForm(btn.id.substring(btn.id.indexOf('_') + 1));
            })
        });

        userTable.find('.delete-user-btn').each(function (index, btn) {
            btn.addEventListener("click", function () {
                deleteEntity(usersApiUrl, btn.id.substring(btn.id.indexOf('_') + 1), 'Пользователь удалён');
            })
        });

        $("#applyChangesBtn").bind("click", function () {
            applyChanges();
        });

        function fillEditForm(userId) {
            $("#modalLabel").text("Редактирование пользователя");
            var userFormInputs = $("#userEditForm").find("input");
            var userTableEntry = $("#userEntry_" + userId).find("td");
            userFormInputs[0].value = userTableEntry[0].innerText;
            userFormInputs[1].value = userTableEntry[1].innerText;
            userFormInputs[2].value = userTableEntry[2].innerText;
            userFormInputs[3].value = userTableEntry[3].innerText;
            userFormInputs[4].value = userTableEntry[4].innerText;
        }

        function clearEditForm() {
            $("#userEditForm").find("input").each(function (index, input) {
                input.value = '';
            })
        }

        function applyChanges() {
            var userFormInputs = $("#userEditForm").find("input");
            var user = {
                firstName: userFormInputs[1].value,
                lastName: userFormInputs[2].value,
                login: userFormInputs[3].value,
                password: userFormInputs[4].value
            };
            var method;
            if (userFormInputs[0].value.length === 0) {
                method = "POST";
            } else {
                method = "PUT";
                user.id = userFormInputs[0].value;
            }
            if (!valid(user)) {
                toastr["warning"]("Логин/пароль не должны быть пустыми", "Ошибка")
                return;
            }
            updateEntity(user, usersApiUrl, method)
        }

        function valid(data) {
            return data.login.length !== 0 && data.password.length !== 0;
        }

        function updateEntity(entity, url, method) {
            $.ajax({
                url: url,
                method: method,
                data: JSON.stringify(entity),
                contentType: "application/json",
                dataType: "json",
                success: function () {
                    if (method === "POST") toastr["success"]("Пользователь создан", "Успех");
                    else if (method === "PUT") toastr["success"]("Пользователь отредактирован", "Успех");
                    reloadEntityTable(url);
                },
                error: function (jqXHR, textStatus, errorThrown) {
                    toastr["error"]("Ошибка при редактировании пользователя: " + textStatus, "Ошибка");
                }
            })
        }

        function deleteEntity(url, id, successMsg) {
            $.ajax({
                url: url + '/' + id,
                method: "DELETE",
                success: function () {
                    toastr["success"](successMsg, "Успех");
                    reloadEntityTable(url);
                },
                error: function (jqXHR, textStatus, errorThrown) {
                    toastr["error"]("Ошибка при удалении: " + textStatus, "Ошибка");
                }
            })
        }

        function reloadEntityTable(url) {
            $.ajax({
                url: url,
                method: "GET",
                dataType: "json",
                success: function (data) {
                    updateUserTable(data.result);
                }
            })
        }

        function updateUserTable(users) {
            console.log(users);
            /*var datatable = $("#usersTable").dataTable().api();
            datatable.clear();
            datatable.rows.add(users);
            datatable.draw();*/
        }
    });
</script>

</body>
</html>
