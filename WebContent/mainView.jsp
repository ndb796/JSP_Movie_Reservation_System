<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!doctype html>
<html>
	<!-- 헤더 파일 불러오기 -->
  <%@ include file="./viewFragment/header.jspf" %>
   <body>
    <div class="container-fluid">
      <div class="row d-flex d-md-block flex-nowrap wrapper">
		<%@ include file="./viewFragment/navigation.jspf" %>
        <main id="main" class="col-md-9 float-left col pl-md-5 pt-3 main">
          <div class="page-header mt-3">
            <h2>영화 예매 사이트</h2>
          </div>
          <p class="lead">이곳은 현재 상영중인 영화 티켓을 예매할 수 있는 사이트입니다.</p>
          <hr>
           <!-- 캐러셀을 이용하여 사진 슬라이드 기능 구현하기 -->
          <div id="carousel" class="carousel slide" style="max-width:1080px;" data-ride="carousel">
            <ol class="carousel-indicators">
              <li data-target="#carousel" data-slide-to="0" class="active"></li>
              <li data-target="#carousel" data-slide-to="1"></li>
              <li data-target="#carousel" data-slide-to="2"></li>
            </ol>
          <div class="carousel-inner">
            <div class="carousel-item active">
              <img class="d-block w-100" src="./img/인피니티 워.jpeg" alt="첫 번째 이미지">
            </div>
            <div class="carousel-item">
              <img class="d-block w-100" src="./img/버닝.jpeg" alt="두 번째 이미지">
            </div>
            <div class="carousel-item">
              <img class="d-block w-100" src="./img/데드풀2.jpeg" alt="세 번째 이미지">
            </div>
          </div>
          <a class="carousel-control-prev" href="#carousel" data-slide="prev">
            <span class="carousel-control-prev-icon" aria-hidden="true"></span>
            <span class="sr-only">이전 사진</span>
          </a>
          <a class="carousel-control-next" href="#carousel" data-slide="next">
            <span class="carousel-control-next-icon" aria-hidden="true"></span>
            <span class="sr-only">다음 사진</span>
          </a>
          </div>
           <!-- 영화 예고편을 동영상 형태로 볼 수 있게 미디어 태그 이용 -->
          <p class="lead mt-4 mb-3 pt-4 pb-3">개봉작 예고편</p>
          <iframe width="100%" height="100%" src="https://www.youtube.com/embed/xUDhdCsLkjU" frameborder="0" allow="autoplay; encrypted-media" allowfullscreen></iframe>
          <p class="lead mt-4 mb-3 pt-4 pb-3">개봉 예정작 예고편</p>
          <iframe width="100%" height="100%" src="https://www.youtube.com/embed/MoMd7ae98hk" frameborder="0" allow="autoplay; encrypted-media" allowfullscreen></iframe>
          <section class="mt-4 mb-3 pt-4 pb-3" style="max-width:1080px;">
            <p class="lead">공지사항</p>
            <hr>
             <!-- 테이블 형태의 공지사항 작성 -->
            <table class="table table-striped">
              <thead>
                <tr>
                  <th class="mobile" style="width:55px; text-align:center;">번호</th>
                  <th style="text-align:center;">제목</th>
                  <th class="mobile" style="width:80px; text-align:center;">작성자</th>
                  <th class="mobile" style="width:120px; text-align:center;">날짜</th>
                </tr>
              </thead>
              <tbody>
                <tr>
                 <!-- 글의 순서에 따라 번호를 붙이는 게시물 형식 만들기 -->
                  <td style="text-align: center;">3</td>
                  <td>신규 운영진을 모집합니다.</td>
                  <td style="text-align: center;">운영자</td>
                  <td style="text-align: center;">2018-01-05</td>
                </tr>
                <tr>
                  <td style="text-align: center;">2</td>
                  <td>커뮤니티 웹 사이트에 오신 것을 환영합니다.</td>
                  <td style="text-align: center;">운영자</td>
                  <td style="text-align: center;">2018-01-04</td>
                </tr>
                <tr>
                  <td style="text-align: center;">1</td>
                  <td>커뮤니티 웹 사이트가 개설되었습니다.</td>
                  <td style="text-align: center;">운영자</td>
                  <td style="text-align: center;">2018-01-03</td>
                </tr>
              </tbody>
            </table>
          </section>
        </main>
      </div>
    </div>
     <!-- footer, modal 파일 불러오기 -->
    <%@ include file="./viewFragment/footer.jspf" %>
    <%@ include file="./viewFragment/modal.jspf" %>
  </body>
</html>
    