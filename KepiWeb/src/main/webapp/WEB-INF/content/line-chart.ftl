<head>
    <script src="/Chart.bundle.min.js"></script>
</head>
<body>
<h1>Line Chart</h1>
<canvas id="myChart" width="50" height="50" style="border:1px solid #000000;"></canvas>
<script>
var ctx = document.getElementById("myChart");
var scChart = new Chart(ctx, {
    type: 'scatter',
    data: {
        datasets: [{
            label: 'Test Line',
            data: [{x: 1, y: 12}, {x: 3, y: 19}, {x: 4, y: 3}, {x: 6, y: 5}, {x: 7, y: 2}, {x: 9, y: 3}],
            borderColor: [
                'rgba(255, 159, 64, 1)'
            ],
            borderWidth: 1
        }]
    },
    options: {
        scales: {
             xAxes: [{
                type: 'linear',
                position: 'bottom',
                ticks: {
                    beginAtZero:true
                }
            }]
        }
    }
});
</script>
</body>