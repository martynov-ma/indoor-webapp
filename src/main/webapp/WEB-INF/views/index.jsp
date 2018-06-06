<!DOCTYPE html>
<%@ page contentType="text/html;charset=UTF-8" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="sec"  uri="http://www.springframework.org/security/tags" %>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags" %>
<html lang="ru">
<head>
    <meta charset="utf-8">
    <title>Indoor-навигация | Домашняя страница</title>

    <link href="<spring:url value="../resources/css/bootstrap.min.css"/>" rel="stylesheet" type="text/css">
    <link href="<spring:url value="../resources/css/metisMenu.min.css"/>" rel="stylesheet" type="text/css">
    <link href="<spring:url value="../resources/css/startmin.css"/>" rel="stylesheet" type="text/css">
    <link href="<spring:url value="../resources/css/font-awesome.min.css"/>" rel="stylesheet" type="text/css">
    <link href="<spring:url value="../resources/css/timeline.css"/>" rel="stylesheet" type="text/css">
    <link href="<spring:url value="../resources/css/morris.css"/>" rel="stylesheet" type="text/css">
    <link href="<spring:url value="../resources/css/toastr.min.css"/>" rel="stylesheet" type="text/css">

    <style type="text/css">
        .demo-container {
            width: 950px;
            height: 560px;
            padding: 20px 15px 15px 15px;
        }
        .demo-placeholder {
            width: 100%;
            height: 100%;
            font-size: 14px;
            line-height: 1.2em;
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
                                <a href="<c:url value="/view/beacons.html"/>">Bluetooth-метки</a>
                            </li>
                            <li>
                                <a href="<c:url value="/view/cabinets.html"/>">Кабинеты</a>
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
            <div class="panel tabbed-panel panel-default" style="width: 1000px; height: 640px">
                <div class="panel-heading clearfix">
                    <div class="panel-title pull-left">
                        План здания по этажам
                    </div>
                    <div class="pull-right">
                        <ul id="floorTabs" class="nav nav-tabs">
                            <li class="active"><a href="#tab-default-1" data-toggle="tab">Этаж 1</a></li>
                            <li><a href="#tab-default-2" data-toggle="tab">Этаж 2</a></li>
                            <li><a href="#tab-default-3" data-toggle="tab">Этаж 3</a></li>
                            <li class="dropdown">
                                <a href="#" data-toggle="dropdown">Ещё <span class="caret"></span></a>
                                <ul class="dropdown-menu" role="menu">
                                    <li><a href="#tab-default-4" data-toggle="tab">Этаж 4</a></li>
                                    <li><a href="#tab-default-5" data-toggle="tab">Этаж 5</a></li>
                                    <li><a href="#tab-default-6" data-toggle="tab">Этаж 6</a></li>
                                </ul>
                            </li>
                        </ul>
                    </div>
                </div>
                <div class="panel-body">
                    <div class="tab-content">
                        <div class="tab-pane fade in active" id="tab-default-1">
                            <div class="demo-container">
                                <div id="floor1" class="demo-placeholder"></div>
                            </div>
                        </div>
                        <div class="tab-pane fade active" id="tab-default-2">
                            <div class="demo-container">
                                <div id="floor2" class="demo-placeholder"></div>
                            </div>
                        </div>
                        <div class="tab-pane fade active" id="tab-default-3">
                            <div class="demo-container">
                                <div id="floor3" class="demo-placeholder"></div>
                            </div>
                        </div>
                        <div class="tab-pane fade active" id="tab-default-4">
                            <div class="demo-container">
                                <div id="floor4" class="demo-placeholder"></div>
                            </div>
                        </div>
                        <div class="tab-pane fade active" id="tab-default-5">
                            <div class="demo-container">
                                <div id="floor5" class="demo-placeholder"></div>
                            </div>
                        </div>
                        <div class="tab-pane fade active" id="tab-default-6">
                            <div class="demo-container">
                                <div id="floor6" class="demo-placeholder"></div>
                            </div>
                        </div>
                    </div>
                </div>
            </div>
            <!--div class="row">
                <div class="demo-container">
                    <div id="placeholder" class="demo-placeholder"></div>
                </div>
            </div-->

        </div>
    </div>

</div>

<script src="<spring:url value="../resources/js/jquery.min.js"/>" type="text/javascript"></script>
<script src="<spring:url value="../resources/js/flot/jquery.flot.js"/>" type="text/javascript"></script>
<script src="<spring:url value="../resources/js/flot/jquery.flot.navigate.js"/>" type="text/javascript"></script>
<script src="<spring:url value="../resources/js/flot/jquery.flot.image.js"/>" type="text/javascript"></script>
<script src="<spring:url value="../resources/js/bootstrap.min.js"/>" type="text/javascript"></script>
<script src="<spring:url value="../resources/js/metisMenu.min.js"/>" type="text/javascript"></script>
<script src="<spring:url value="../resources/js/startmin.js"/>" type="text/javascript"></script>
<script src="<spring:url value="../resources/js/toastr.min.js"/>" type="text/javascript"></script>

<script type="text/javascript">
    $(function() {

        var beaconsApiUrl = '${pageContext.request.contextPath}/api/beacons';
        
        $("#testBtn").bind("click", function () {
            /*var tdata = {
                label: "beacon",
                clickable: true,
                data: [ [700, 540], [800, 540], [900, 540],
                    [1000, 540], [1100, 540], [1200, 540],
                    [1300, 540], [1400, 540], [1500, 540],
                    [1600, 540], [1700, 540], [1765, 410],
                    [1878, 410], [416, 502] ],
                images: { show: false }, bars: { show: false }, lines: { show: false },
                points: { show: true, radius: 3, lineWidth: 3 }
            };

            drawPlan($("#floor2"), "floor2.jpg", 2000, 1650, tdata, [ "blue" ]);*/
        });

        $("<div id='tooltip'></div>").css({
            position: "absolute",
            display: "none",
            border: "1px solid #656565",
            padding: "2px",
            "background-color": "#9d9d9d",
            opacity: 0.80
        }).appendTo("body");
        
        buildPlanForFloor(1, $("#floor1"), "floor1.jpg", 2000, 1650, [ "blue" ]);

        $("#floor1").bind("plotclick", function (event, pos, item) {
            toastr["info"]("Координаты нажатия [" + Math.round(pos.x) + ", " + Math.round(pos.y) + "]");
            //toastr["info"]("Координаты нажатия [" + Math.round(pos.x) + ", " + Math.round(pos.y) + "]<br/><br/><button type='button' class='btn btn-success btn-sm'>Добавить метку</button>");
            if (item) {
                highlight(item.series, item.datapoint);
            }
        });

        $("#floor1").bind("plothover", function (event, pos, item) {
            if (item) {
                var x = Math.round(item.datapoint[0]),
                    y = Math.round(item.datapoint[1]);

                $("#tooltip").html(item.series.label + " [" + x + ", " + y + "]")
                    .css({top: item.pageY + 5, left: item.pageX + 9})
                    .fadeIn(200);
            } else {
                $("#tooltip").hide();
            }
        });

        buildPlanForFloor(2, $("#floor2"), "floor2.jpg", 2000, 1650, [ "blue" ]);
        buildPlanForFloor(3, $("#floor3"), "floor3.jpg", 2500, 700, [ "blue" ]);
        buildPlanForFloor(4, $("#floor4"), "floor4.jpg", 2500, 700, [ "blue" ]);
        buildPlanForFloor(5, $("#floor5"), "floor5.jpg", 2500, 700, [ "blue" ]);
        buildPlanForFloor(6, $("#floor6"), "floor6.jpg", 2500, 700, [ "blue" ]);

        function buildPlanForFloor(num, placeholder, planImgName, width, height, colors) {

            var data = [];
            function onDataReceived(response) {

                for(i = 0; i < response.result.length; i++) {
                    data.push([response.result[i].cordx, response.result[i].cordy]);
                }

                var points = {
                    label: "beacon",
                    clickable: true,
                    data: data,
                    images: { show: false }, bars: { show: false }, lines: { show: false },
                    points: { show: true, radius: 3, lineWidth: 3 }
                };
                var floor1 = drawPlan(placeholder, planImgName, width, height, points, colors);
            }

            $.get(beaconsApiUrl + '?floorNum=' + num, onDataReceived);
        }

        function drawPlan(placeholder, planImgName, width, height, pointsData, colors) {
            var data = [{
                data: [ [ "resources/img/" + planImgName, 0, 0, width, height ] ],
                images: { show: true }, bars: { show: false }, points: { show: false }, lines: { show: false }
            }, pointsData];
            var options = {
                grid: {
                    show: true,
                    aboveData: true,
                    clickable: true,
                    hoverable: true
                },
                legend: {
                    show: true,
                    position: "ne"
                },
                series: {
                    images: { show: true }, bars: { show: true }, points: { show: true }, lines: { show: true }
                },
                colors: colors,
                xaxis: { zoomRange: [0.1, width], panRange: [0, width], max: width },
                yaxis: { zoomRange: [0.1, height], panRange: [0, height], max: height },
                zoom: { interactive: true },
                pan: { interactive: true }
            };
            return plan = $.plot.image.loadDataImages(data, options, function () {
                $.plot(placeholder, data, options);
            });
        }

        /*var floor1 = $("#floor1");
        var data = [ {
            data: [ [ "resources/img/floor1.jpg", 0, 0, 2000, 1650 ] ],
            images: { show: true }, bars: { show: false }, points: { show: false }, lines: { show: false }
        }, {
            label: "user",
            clickable: false,
            data: [ [300, 500], [1400, 520] ],
            images: { show: false }, bars: { show: false }, lines: { show: false },
            points: { show: true, radius: 2, lineWidth: 3 }
        }, {
            label: "beacon",
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
            $.plot(floor1, data, options);
        });
        floor1.bind("plotclick", function (event, pos, item) {
            if (item) {
                map.highlight(item.series, item.datapoint);
            }
        });*/
    });
</script>

</body>
</html>
