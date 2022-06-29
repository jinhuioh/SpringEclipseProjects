<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<script type="text/javascript" src="resources/js/jquery-3.6.0.min.js"></script>
<script type="text/javascript">
	$(function() { //dom(document object model) tree구조로 읽는다. 
		//=body dom tree로 ram에 읽어들인 후, function을 실행해라.
		//익명함수
		$('#b1').click(function() {
			$.ajax({ //제이슨 표기법 ,,
				//CORS정책  url: "http://rss.hankooki.com/daily/dh_culture.xml"
				url: "https://api.rss2json.com/v1/api.json?rss_url=https%3A%2F%2Fwww.chosun.com%2Farc%2Foutboundfeeds%2Frss%2Fcategory%2Fentertainments%2F%3FoutputType%3Dxml&api_key=5j5tdjmuj3ixtqj7lj8kgl0rymrdvsegwe2ynhop",
				data: {
					url:"https://www.chosun.com/arc/outboundfeeds/rss/category/entertainments/?outputType=xml",
					api_key:"5j5tdjmuj3ixtqj7lj8kgl0rymrdvsegwe2ynhop",
					count:20
				},
				success: function(result) {
					alert(result.length)
					//alert('신문사연결 성공')
					//alert(result)
					list = result.items
					//alert(list.length)
					$(list).each(function(index, news) {// java의 for(String s: list)와 같음. 포문 돌리는것과 같다. 한개 값씩 다 꺼내주는것.
						//console.log(index +""+ news.author +""+ news.title)
						img = news.thumbnail
						console.log(img)
						
						//값                     키(배열안에 들어있는 키)
						title = news.title
						$('#d1').append(title +'<br>')
						
						link = news.link
						str = "<a href=" + link + ">" + title +"</a>"
						$('#d1').append('<img src= "' +img+ '" width=200 height=200>' +str+ '<br>')
					
						//title을 클릭했을 때, link로 연결
						pubDate = news.pubDate
						$('#d1').append(news.pubDate +'<br>')
					}) 
				},
				error: function() {
					alert('연결 실패.')
				}//error
			})//ajax
		})//b1
		
	})
</script>
</head>
<body>
	<button id="b1">조선일보 정치기사 받아오기.</button>
	<hr color="pink">
	<div id="d1"></div>
	
</body>
</html>