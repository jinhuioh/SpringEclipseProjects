<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
    <meta charset="utf-8">
    <title>마커 생성하기</title>
    
</head>
<body>
<div id="map" style="width:500%;height:450px;"></div>

<script type="text/javascript" src="//dapi.kakao.com/v2/maps/sdk.js?appkey=c70476f6cbc0a929f8d3fd022f4a5763"></script>
<script>
var mapContainer = document.getElementById('map'), // 지도를 표시할 div 아이디가 map인것을 가져온다.
    mapOption = { 
        center: new kakao.maps.LatLng(37.57176852941233, 126.98652093363337), // 지도의 중심좌표
        level: 3 // 지도의 확대 레벨
    };

var map = new kakao.maps.Map(mapContainer, mapOption); // 지도를 생성합니다 mapcontainer에 mapㅇ르 넣는다.

// 마커가 표시될 위치입니다 
var markerPosition  = new kakao.maps.LatLng(37.57176852941233, 126.98652093363337); 

// 마커를 생성합니다
var marker = new kakao.maps.Marker({
    position: markerPosition
});

// 마커가 지도 위에 표시되도록 설정합니다
marker.setMap(map);

// 아래 코드는 지도 위의 마커를 제거하는 코드입니다
// marker.setMap(null);    
</script>
</body>
</html>