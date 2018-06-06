<!DOCTYPE html>
<%@ page contentType="text/html;charset=UTF-8" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="sec"  uri="http://www.springframework.org/security/tags" %>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags" %>
<html lang="ru">
<head>
    <meta charset="utf-8">
    <title>Indoor-навигация | Управление Bluetooth-метками</title>

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
                                <a href="<c:url value="/view/users.html"/>">Пользователи</a>
                            </li>
                            <li>
                                <a class="active" href="<c:url value="/view/beacons.html"/>">Bluetooth-метки</a>
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

            <div class="row">
                <div class="col-lg-12">
                    <div class="panel panel-default" style="width: 900px">
                        <div class="panel-heading">
                            Bluetooth-метки
                            <button id="createBeaconBtn" style="margin-left: 20px;" class="btn btn-success btn-sm beacon-edit-btn" data-toggle="modal" data-target="#myModal">
                                Создать метку
                            </button>
                        </div>
                        <div class="panel-body">
                            <div class="dataTable_wrapper">
                                <table id="beaconsTable" class="table table-striped table-bordered table-hover">
                                    <thead>
                                    <tr>
                                        <th>ID</th>
                                        <th>Имя</th>
                                        <th>Этаж</th>
                                        <th>Координата X</th>
                                        <th>Координата Y</th>
                                        <th>Управление</th>
                                    </tr>
                                    </thead>
                                    <tbody>
                                        <c:forEach items="${beacons}" var="beacon">
                                            <tr id="beaconEntry_${beacon.id}" class="gradeA">
                                                <td>${beacon.id}</td>
                                                <td>${beacon.name}</td>
                                                <td>${beacon.floorNum}</td>
                                                <td>${beacon.cordx}</td>
                                                <td>${beacon.cordy}</td>
                                                <td>
                                                    <button id="editBeaconBtn_${beacon.id}" onclick="fillEditForm(${beacon.id})" class="btn btn-primary btn-sm user-edit-btn edit-beacon-btn" data-toggle="modal" data-target="#myModal">
                                                        Изменить
                                                    </button>
                                                    <button id="deleteBeaconBtn_${beacon.id}" onclick="deleteEntity(beaconsApiUrl, ${beacon.id})" class="btn btn-danger btn-sm user-edit-btn delete-beacon-btn">
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
                                        <div id="beaconEditForm" class="modal-body">
                                            <input id="beaconIdInput" type="hidden" name="id">
                                            <div class="form-group">
                                                <label>Имя</label>
                                                <input class="form-control" name="name" type="text">
                                            </div>
                                            <div class="form-group">
                                                <label>Номер этажа</label>
                                                <input class="form-control" name="floorNum" type="text">
                                            </div>
                                            <div class="form-group">
                                                <label>Координата X</label>
                                                <input class="form-control" name="cordx" type="text">
                                            </div>
                                            <div class="form-group">
                                                <label>Координата Y</label>
                                                <input class="form-control" name="cordy" type="text">
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

    var beaconsApiUrl = '${pageContext.request.contextPath}/api/beacons';

    $(function() {

        var beaconsTable = $('#beaconsTable');
        beaconsTable.DataTable({
            responsive: true
        });

        $('#createBeaconBtn').bind("click", function () {
            $("#modalLabel").text("Создание метки");
            clearEditForm();
        });

        /*beaconsTable.find('.edit-beacon-btn').each(function (index, btn) {
            btn.addEventListener("click", function () {
                fillEditForm(btn.id.substring(btn.id.indexOf('_') + 1));
            })
        });*/

        /*beaconsTable.find('.delete-beacon-btn').each(function (index, btn) {
            btn.addEventListener("click", function () {
                deleteEntity(beaconsApiUrl, btn.id.substring(btn.id.indexOf('_') + 1), 'Метка удалена');
            })
        });*/

        $("#applyChangesBtn").bind("click", function () {
            applyChanges();
        });



        function clearEditForm() {
            $("#beaconEditForm").find("input").each(function (index, input) {
                input.value = '';
            })
        }

        function applyChanges() {
            var beaconFormInputs = $("#beaconEditForm").find("input");
            var beacon = {
                name: beaconFormInputs[1].value,
                floorNum: beaconFormInputs[2].value,
                cordx: beaconFormInputs[3].value,
                cordy: beaconFormInputs[4].value
            };
            console.log(beacon);
            var method;
            if (beaconFormInputs[0].value.length === 0) {
                method = "POST";
            } else {
                method = "PUT";
                beacon.id = beaconFormInputs[0].value;
            }
            if (!valid(beacon)) {
                toastr["warning"]("Поля не должны быть пустыми", "Ошибка");
                return;
            }
            updateEntity(beacon, beaconsApiUrl, method)
        }

        function valid(data) {
            return data.name.length !== 0 && data.floorNum.length !== 0 && data.cordx.length !== 0 && data.cordy.length !== 0;
        }

        function updateEntity(entity, url, method) {
            $.ajax({
                url: url,
                method: method,
                data: JSON.stringify(entity),
                contentType: "application/json",
                dataType: "json",
                success: function () {
                    if (method === "POST") toastr["success"]("Метка создана", "Успех");
                    else if (method === "PUT") toastr["success"]("Метка отредактирована", "Успех");
                    reloadEntityTable(url);
                },
                error: function (jqXHR, textStatus, errorThrown) {
                    toastr["error"]("Ошибка при редактировании метки: " + textStatus, "Ошибка");
                }
            })
        }

    });

    function fillEditForm(beaconId) {
        $("#modalLabel").text("Редактирование метки");
        var beaconFormInputs = $("#beaconEditForm").find("input");
        var beaconTableEntry = $("#beaconEntry_" + beaconId).find("td");
        beaconFormInputs[0].value = beaconTableEntry[0].innerText;
        beaconFormInputs[1].value = beaconTableEntry[1].innerText;
        beaconFormInputs[2].value = beaconTableEntry[2].innerText;
        beaconFormInputs[3].value = beaconTableEntry[3].innerText;
        beaconFormInputs[4].value = beaconTableEntry[4].innerText;
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

    function updateUserTable(beacons) {
        //console.log(beacons);
        /*var datatable = $("#usersTable").dataTable().api();
        datatable.clear();
        datatable.rows.add(users);
        datatable.draw();*/
    }
</script>

</body>
</html>
