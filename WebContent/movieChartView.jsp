<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!doctype html>
<html>
  <%@ include file="./viewFragment/header.jspf" %>
  <body>
    <div class="container-fluid">
      <div class="row d-flex d-md-block flex-nowrap wrapper">
        <%@ include file="./viewFragment/navigation.jspf" %>
        <main id="main" class="col-md-9 float-left col pl-md-5 pt-3 main">
          <div class="page-header mt-3">
            <h2>영화 상영시간</h2>
          </div>
          <p class="lead">현재 상영하고 있는 영화의 상영시간을 확인할 수 있습니다.</p>
          <hr>
          <table class="table table-striped" style="max-width:1080px;">
            <thead>
              <tr>
               <!-- 테이블의 구성요소를 지정하여 게시물들이 테이블의 기준에 맞게 정렬되도록 하기 -->
                <th class="mobile" style="width:100px; text-align:center;">장르</th>
                <th style="text-align:center;">영화 제목</th>
                <th class="mobile" style="width:100px; text-align:center;">러닝타임</th>
                <th class="mobile" style="width:70px; text-align:center;">상영관</th>
              </tr>
            </thead>
            <tbody>
         	  <c:forEach items="${ list }" var="movie">
              <tr>
                <td style="text-align: center;">${ movie.movieGenre }</td>
                <td><a style="color:#000000;">${ movie.movieTitle }</a></td>
                <td style="text-align: center;">${ movie.movieTime }분</td>
                <td onclick="location.href = './seatSelectView.reservation?movieID=${ movie.movieID }';" class="btn btn-primary">상영관</td>
              </tr>
              </c:forEach>
            </tbody>
          </table>
        </main>
      </div>
    </div>
    <%@ include file="./viewFragment/footer.jspf" %>
    <%@ include file="./viewFragment/modal.jspf" %>
  </body>
</html>
