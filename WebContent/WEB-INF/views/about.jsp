<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
	
<%@ page import="java.util.List" %>

<body>
	<div class="container about">
		<div class="center item grey lighten-4">
			<h6>
				<b>About</b>
			</h6>
			<p>ComPARES v1.0 (2024)
			<br/><br/>
			<h6>
				<b>Authors</b>
			</h6>
			<ul>
				<li>Isidoro Gil Leiva as creator</li>
				<li>David López Martínez as developer</li>
			</ul>
		</div>
	</div>
</body>
<script type="text/javascript">
	$(document).ready(function() {
		console.log("ready!");
		$(".title-section").text($("nav #about span").text()).fadeIn(1000);
	});
</script>