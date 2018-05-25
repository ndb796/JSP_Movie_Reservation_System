<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!doctype html>
<html>
  <%@ include file="./viewFragment/header.jspf" %>
  <body>
    <div class="container-fluid">
      <div class="row d-flex d-md-block flex-nowrap wrapper">
        <%@ include file="./viewFragment/navigation.jspf" %>
        <main id="main" class="col-md-9 float-left col pl-md-5 pt-3 main">
          <div class="page-header mt-3">
            <h2>인원/좌석 선택</h2>
          </div>
          <p class="lead">예매 인원과 좌석을 선택해주세요.</p>
          <hr>
          <div style="position:relative; left:230px; top:50px;"><img src="./img/screen.jpeg"></div>
          <section class="mt-4 mb-3 pt-4 pb-3" style="max-width:1080px;">
          <form action="payAction.reservation" method="POST" class="pt-3" style="max-width:720px;">
         	 <c:forEach items="${ list }" var="data" begin="0" end="98">
         	 	<c:choose>
         	 		<c:when test="${ data.third == false }">
         	 			<button onclick="location.href='./payView.reservation?movieID=${ param.movieID }&seatID=${ data.first }'" type="button" class="btn btn-primary">${ data.second }</button>
         	 		</c:when>
	         	 	<c:otherwise>
         	 			<button onclick="location.href='./payView.reservation?movieID=${ param.movieID }&seatID=${ data.first }'" type="button" class="btn btn-primary" disabled>${ data.second }</button>
	         	 	</c:otherwise>
         	 	</c:choose>
         	 </c:forEach>
         	 <br><br>
         	 <c:forEach items="${ list }" var="data" begin="99" end="264">
         	 	<c:choose>
         	 		<c:when test="${ data.third == false }">
         	 			<button onclick="location.href='./payView.reservation?movieID=${ param.movieID }&seatID=${ data.first }'" type="button" class="btn btn-primary">${ data.second }</button>
         	 		</c:when>
	         	 	<c:otherwise>
         	 			<button onclick="location.href='./payView.reservation?movieID=${ param.movieID }&seatID=${ data.first }'" type="button" class="btn btn-primary" disabled>${ data.second }</button>
	         	 	</c:otherwise>
         	 	</c:choose>
         	 </c:forEach>
      		 <section class="mt-4 mb-3 pt-4 pb-3" style="max-width:1080px;">
          </form>
        </main>
      </div>
    </div>
    <%@ include file="./viewFragment/footer.jspf" %>
    <%@ include file="./viewFragment/modal.jspf" %>
  </body>
</html>
