<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!doctype html>
<html>
  <%@ include file="./fragment/header.jspf" %>
  <body>
    <div class="container-fluid">
      <div class="row d-flex d-md-block flex-nowrap wrapper">
        <nav class="col-md-3 float-left col-1 pl-0 pr-0 collapse width show" id="sidebar">
          <div class="list-group border-0 card text-center text-md-left">
            <a href="./index.jsp" class="list-group-item d-inline-block collapsed" data-parent="#sidebar">
              <img style="width: 20px;" src="./img/home.svg"><span class="d-none d-md-inline">메인</span>
            </a>
            <a href="#usermenu" class="list-group-item d-inline-block collapsed"
            data-parent="#sidebar" data-toggle="collapse" aria-expanded="false">
              <img style="width: 20px;" src="./img/user.svg"><span class="d-none d-md-inline">회원 관리</span>
            </a>
            <div class="collapse" id="usermenu">
              <a href="./userJoin.jsp" class="list-group-item" data-parent="#sidebar">회원가입</a>
              <a href="./userLogin.jsp" class="list-group-item" data-parent="#sidebar">로그인</a>
              <a href="./userFind.jsp" class="list-group-item" data-parent="#sidebar">ID/PW 찾기</a>
              <a href="./userEdit.jsp" class="list-group-item" data-parent="#sidebar">회원정보수정</a>
              <a href="./userLogout.jsp" class="list-group-item" data-parent="#sidebar">로그아웃</a>
            </div>
            <a href="./board.jsp" class="list-group-item d-inline-block collapsed" data-parent="#sidebar">
              <img style="width: 20px;" src="./img/board.svg"><span class="d-none d-md-inline">자유게시판</span>
            </a>
            <a href="./qna.jsp" class="list-group-item d-inline-block collapsed" data-parent="#sidebar">
              <img style="width: 20px;" src="./img/qna.svg"><span class="d-none d-md-inline">Q & A</span>
            </a>
            <a href="./schedule.jsp" class="list-group-item d-inline-block collapsed" data-parent="#sidebar">
              <img style="width: 20px;" src="./img/home.svg"><span class="d-none d-md-inline">영화 상영시간</span>
            </a>
            <a href="#search" class="list-group-item d-inline-block collapsed"
            data-parent="#sidebar" data-toggle="collapse" aria-expanded="false">
              <img style="width: 20px;" src="./img/search.svg"><span class="d-none d-md-inline">검색</span>
            </a>
            <a href="./exit.jsp" class="list-group-item d-inline-block collapsed" data-parent="#sidebar">
              <img style="width: 20px;" src="./img/board.svg"><span class="d-none d-md-inline">회원탈퇴</span>
            </a>
            <div class="collapse" id="search">
              <div class="input-group p-2" style="background-color:#1c1c1c;">
                <input type="text" class="form-control" placeholder="내용을 입력하세요.">
              </div>
            </div>
          </div>
        </nav>
        <main id="main" class="col-md-9 float-left col pl-md-5 pt-3 main">
          <div class="page-header mt-3">
            <h2>자유게시판</h2>
          </div>
          <p class="lead">다른 회원들과 자유롭게 소통하세요.</p>
          <hr>
          <table class="table table-striped" style="max-width:1080px;">
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
                <td style="text-align: center;">5</td>
                <td><a href="./boardView.jsp" style="color:#000000;">인피니티 워 보고 왔어요~</a></td>
                <td style="text-align: center;">김민우</td>
                <td style="text-align: center;">2018-05-10</td>
              </tr>
              <tr>
                <td style="text-align: center;">4</td>
                <td><a href="./boardView.jsp" style="color:#000000;">버닝 생각보다 별로네요..</a></td>
                <td style="text-align: center;">박현정</td>
                <td style="text-align: center;">2018-05-08</td>
              </tr>
              <tr>
                <td style="text-align: center;">3</td>
                <td><a href="./boardView.jsp" style="color:#000000;">인피니티 워 꿀잼!</a></td>
                <td style="text-align: center;">이승엽</td>
                <td style="text-align: center;">2018-05-06</td>
              </tr>
              <tr>
                <td style="text-align: center;">2</td>
                <td><a href="./boardView.jsp" style="color:#000000;">신촌 CGV 이벤트 당첨되신 분 있나요?</a></td>
                <td style="text-align: center;">손흥민</td>
                <td style="text-align: center;">2018-04-29</td>
              </tr>
              <tr>
                <td style="text-align: center;">1</td>
                <td><a href="./boardView.jsp" style="color:#000000;">(공지)비방글/스포일러 금지합니다.</a></td>
                <td style="text-align: center;">운영자</td>
                <td style="text-align: center;">2018-04-25</td>
              </tr>
            </tbody>
          </table>
          <div style="max-width:1080px;">
            <a href="./boardWrite.jsp" class="btn btn-primary float-right">글쓰기</a>
          </div>
          <ul class="pagination">
            <li class="page-item disabled">
              <span class="page-link">&laquo;</span>
            </li>
            <li class="page-item active"><a class="page-link mobile" href="#">1</a></li>
            <li class="page-item"><a class="page-link mobile" href="#">2</a></li>
            <li class="page-item"><a class="page-link mobile" href="#">3</a></li>
            <li class="page-item"><a class="page-link mobile" href="#">4</a></li>
            <li class="page-item"><a class="page-link mobile" href="#">5</a></li>
            <li class="page-item"><a class="page-link mobile" href="#">6</a></li>
            <li class="page-item"><a class="page-link mobile" href="#">7</a></li>
            <li class="page-item"><a class="page-link mobile" href="#">8</a></li>
            <li class="page-item"><a class="page-link mobile" href="#">9</a></li>
            <li class="page-item"><a class="page-link mobile" href="#">10</a></li>
            <li class="page-item">
              <span class="page-link">&raquo;</span>
            </li>
          </ul>
        </main>
      </div>
    </div>
    <script src="./js/jquery.min.js"></script>
    <script src="./js/popper.min.js"></script>
    <script src="./js/bootstrap.min.js"></script>
  </body>
</html>