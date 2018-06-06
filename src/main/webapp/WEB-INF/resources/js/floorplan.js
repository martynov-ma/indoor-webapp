function buildPlan(placeholder, planImgName, width, height) {
    var data = [{
        data: [ [ "resources/img/" + planImgName, 0, 0, width, height ] ],
        images: { show: true }, bars: { show: false }, points: { show: false }, lines: { show: false }
    }];
    var options = {
        grid: {
            show: true,
            aboveData: true,
            clickable: true
        },
        legend: {
            show: true,
            position: "ne"
        },
        series: {
            images: { show: true }, bars: { show: true }, points: { show: true }, lines: { show: true }
        },
        colors: [ "blue", "red"],
        xaxis: { zoomRange: [0.1, width], panRange: [0, width], max: width },
        yaxis: { zoomRange: [0.1, height], panRange: [0, height], max: height },
        zoom: { interactive: true },
        pan: { interactive: true }
    };
    return plan = $.plot.image.loadDataImages(data, options, function () {
        $.plot(placeholder, data, options);
    });
}