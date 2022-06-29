<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<script type="text/javascript"
	src="https://www.gstatic.com/charts/loader.js"></script>
<script type="text/javascript">
      google.charts.load('current', {'packages':['corechart']});
      google.charts.setOnLoadCallback(drawChart);

      function drawChart() {

        var data = google.visualization.arrayToDataTable([
          ['하는 일', '시간'],
          ['수업',     8],
          ['식사',      3],
          ['이동',  2],
          ['운동', 1],
          ['공부', 3],
          ['잠자기.',    7]
        ]);

        var options = {
          title: 'My Daily Activities'
        };

        var chart = new google.visualization.PieChart(document.getElementById('piechart'));

        chart.draw(data, options);

      //=============2번째 차트
      var data2 = google.visualization.arrayToDataTable([
          ['하는 일2', '시간'],
          ['수업2',     7],
          ['식사2',      3],
          ['이동2',  3],
          ['운동2', 1],
          ['게임2', 3],
          ['잠자기2.',    7]
        ]);

        var options2 = {
          title: '하루일정'
        };

        var chart2 = new google.visualization.PieChart(document.getElementById('piechart2'));

        chart2.draw(data2, options2);
        
        //------------------3번째 차트
        
         var data3 = google.visualization.arrayToDataTable([
          ['Year', '콜라', '사이다'],
          ['2019',  1000,      400],
          ['2020',  1170,      460],
          ['2021',  660,       1120],
          ['2022',  1030,      540]
        ]);

        var options3 = {
          title: 'Company Performance',
          hAxis: {title: 'Year',  titleTextStyle: {color: '#333'}},
          vAxis: {minValue: 0}
        };

        var chart3 = new google.visualization.AreaChart(document.getElementById('chart_div'));
        chart3.draw(data3, options3);
        
        
      }
    </script>
</head>
<body>
	<div id="piechart" style="width: 400px; height: 400px;"></div>
	<div id="piechart2" style="width: 400px; height: 400px;"></div>
	<div id="chart_div" style="width: 300px; height: 300px;"></div>
</body>
</html>


<%-- 

<html>
<head>
<script type="text/javascript"
	src="https://www.gstatic.com/charts/loader.js"></script>
<script type="text/javascript">
      google.charts.load('current', {'packages':['corechart']});
      google.charts.setOnLoadCallback(drawChart);

  function drawChart() {
    var data = google.visualization.arrayToDataTable([
      ['Mon', 20, 28, 38, 45],
      ['Tue', 31, 38, 55, 66],
      ['Wed', 50, 55, 77, 80],
      ['Thu', 77, 77, 66, 50],
      ['Fri', 68, 66, 22, 15]
      // Treat first row as data as well.
    ], true);

    var options = {
      legend:'none'
    };

    var chart = new google.visualization.CandlestickChart(document.getElementById('chart_div'));

    chart.draw(data, options);
  }
    </script>
</head>
<body>
	<div id="chart_div" style="width: 900px; height: 500px;"></div>
</body>
</html>

 --%>