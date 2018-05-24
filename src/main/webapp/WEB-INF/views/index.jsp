<!DOCTYPE html>
<%@ page contentType="text/html;charset=UTF-8" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="sec"  uri="http://www.springframework.org/security/tags" %>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags" %>
<html lang="ru">
<head>
    <meta charset="utf-8">
    <title>Indoor-навигация | Домашняя страница</title>

    <link href="<spring:url value="../css/bootstrap.min.css"/>" rel="stylesheet" type="text/css">
    <link href="<spring:url value="../css/metisMenu.min.css"/>" rel="stylesheet" type="text/css">
    <link href="<spring:url value="../css/startmin.css"/>" rel="stylesheet" type="text/css">
    <link href="<spring:url value="../css/font-awesome.min.css"/>" rel="stylesheet" type="text/css">
    <link href="<spring:url value="../css/timeline.css"/>" rel="stylesheet" type="text/css">
    <link href="<spring:url value="../css/morris.css"/>" rel="stylesheet" type="text/css">

    <style type="text/css">
        .demo-container {
            width: 1000px;
            height: 560px;
            box-sizing: border-box;
            background-color: #f5f5f5;
            padding: 20px 15px 15px 15px;
            border: 1px solid #ddd;
            box-shadow: 0 3px 10px rgba(0,0,0,0.15);
            -o-box-shadow: 0 3px 10px rgba(0,0,0,0.1);
            -ms-box-shadow: 0 3px 10px rgba(0,0,0,0.1);
            -moz-box-shadow: 0 3px 10px rgba(0,0,0,0.1);
            -webkit-box-shadow: 0 3px 10px rgba(0,0,0,0.1);
        }
        .demo-placeholder {
            width: 100%;
            height: 100%;
            font-size: 14px;
            line-height: 1.2em;
        }
        #placeholder .button {
            position: absolute;
            cursor: pointer;
        }
        #placeholder div.button {
            font-size: smaller;
            padding: 2px;
        }
    </style>
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
                    <li><a href="<c:url value="/j_spring_security_logout"/>"><i class="fa fa-sign-out fa-fw"></i> Выход</a>
                    </li>
                </ul>
            </li>
        </ul>

        <!-- Sidebar -->
        <div class="navbar-default sidebar" role="navigation">
            <div class="sidebar-nav navbar-collapse">

                <ul class="nav" id="side-menu">
                    <li>
                        <a href="<c:url value="/index.html"/>" class="active"><i class="fa fa-dashboard fa-fw"></i> Новости и события</a>
                    </li>
                    <li>
                        <a href="#"><i class="fa fa-table fa-fw"></i> Управление сущностями<span class="fa arrow"></span></a>
                        <ul class="nav nav-second-level">
                            <li>
                                <a href="<c:url value="/view/users.html"/>">Пользователи</a>
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
                    <h1 class="page-header">План здания</h1>
                </div>
            </div>

            <!-- ... Your content goes here ... -->
            <div class="row">
                <div class="demo-container">
                    <div id="placeholder" class="demo-placeholder"></div>
                </div>
            </div>

        </div>
    </div>

</div>

<script src="<spring:url value="../js/jquery.min.js"/>" type="text/javascript"></script>
<script src="<spring:url value="../js/flot/jquery.flot.js"/>" type="text/javascript"></script>
<script src="<spring:url value="../js/flot/jquery.flot.navigate.js"/>" type="text/javascript"></script>
<script src="<spring:url value="../js/flot/jquery.flot.image.js"/>" type="text/javascript"></script>
<script src="<spring:url value="../js/bootstrap.min.js"/>" type="text/javascript"></script>
<script src="<spring:url value="../js/metisMenu.min.js"/>" type="text/javascript"></script>
<script src="<spring:url value="../js/startmin.js"/>" type="text/javascript"></script>

<script type="text/javascript">
    $(function() {
        var placeholder = $("#placeholder");
        var data = [ {
            data: [ [ "img/floor1.jpg", 0, 0, 2000, 1650 ] ],
            images: { show: true }, bars: { show: false }, points: { show: false }, lines: { show: false }
        }, {
            label: "user",
            clickable: false,
            data: [ [300, 500], [1400, 520] ],
            images: { show: false }, bars: { show: false }, lines: { show: false },
            points: { show: true, radius: 2, lineWidth: 3 }
        }, {
            label: "label",
            clickable: true,
            data: [ [700, 540], [800, 540], [900, 540],
                [1000, 540], [1100, 540], [1200, 540],
                [1300, 540], [1400, 540], [1500, 540],
                [1600, 540], [1700, 540], [1765, 410],
                [1878, 410], [416, 502] ],
            images: { show: false }, bars: { show: false }, lines: { show: false },
            points: { show: true, radius: 3, lineWidth: 3 }
        }
        ];
        var options = {
            grid: {
                show: true,
                aboveData: true,
                clickable: true
            },
            legend: {
                show: true,
                labelFormatter: function(label, series) {
                    // series is the series object for the label
                    return '<a href="#' + label + '">' + label + '</a>';
                },
                position: "ne"
            },
            series: {
                images: { show: true }, bars: { show: true }, points: { show: true }, lines: { show: true }
            },
            colors: [ "blue", "red"],
            xaxis: { zoomRange: [0.1, 2000], panRange: [0, 2000] },
            yaxis: { zoomRange: [0.1, 1650], panRange: [0, 1650], max: 1650 },
            zoom: { interactive: true },
            pan: { interactive: true }
        };
        var map = $.plot.image.loadDataImages(data, options, function () {
            $.plot(placeholder, data, options);
        });
        placeholder.bind("plotclick", function (event, pos, item) {
            if (item) {
                map.highlight(item.series, item.datapoint);
            }
        });
    });
</script>

</body>
</html>
