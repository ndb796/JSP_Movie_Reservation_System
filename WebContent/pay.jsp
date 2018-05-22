<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!doctype html>
<html>
  <%@ include file="./fragment/header.jspf" %>
  <body>
    <div class="container-fluid">
      <div class="row d-flex d-md-block flex-nowrap wrapper">
        <nav class="col-md-3 float-left col-1 pl-0 pr-0 collapse width show" id="sidebar">
          <div class="list-group border-0 card text-center text-md-left">
            <a href="./index.html" class="list-group-item d-inline-block collapsed" data-parent="#sidebar">
              <img style="width: 20px;" src="./img/home.svg"><span class="d-none d-md-inline">메인</span>
            </a>
            <a href="#usermenu" class="list-group-item d-inline-block collapsed"
            data-parent="#sidebar" data-toggle="collapse" aria-expanded="false">
              <img style="width: 20px;" src="./img/user.svg"><span class="d-none d-md-inline">회원 관리</span>
            </a>
            <div class="collapse" id="usermenu">
              <a href="./userJoin.html" class="list-group-item" data-parent="#sidebar">회원가입</a>
              <a href="./userLogin.html" class="list-group-item" data-parent="#sidebar">로그인</a>
              <a href="./userEdit.html" class="list-group-item" data-parent="#sidebar">회원정보수정</a>
              <a href="./userFind.html" class="list-group-item" data-parent="#sidebar">ID/PW 찾기</a>
              <a href="./userLogout.html" class="list-group-item" data-parent="#sidebar">로그아웃</a>
            </div>
            <a href="./board.html" class="list-group-item d-inline-block collapsed" data-parent="#sidebar">
              <img style="width: 20px;" src="./img/board.svg"><span class="d-none d-md-inline">자유게시판</span>
            </a>
            <a href="./qna.html" class="list-group-item d-inline-block collapsed" data-parent="#sidebar">
              <img style="width: 20px;" src="./img/qna.svg"><span class="d-none d-md-inline">Q & A</span>
            </a>
            <a href="./schedule.html" class="list-group-item d-inline-block collapsed" data-parent="#sidebar">
              <img style="width: 20px;" src="./img/home.svg"><span class="d-none d-md-inline">영화 상영시간</span>
            </a>
            <a href="#search" class="list-group-item d-inline-block collapsed"
            data-parent="#sidebar" data-toggle="collapse" aria-expanded="false">
              <img style="width: 20px;" src="./img/search.svg"><span class="d-none d-md-inline">검색</span>
            </a>
            <a href="./exit.html" class="list-group-item d-inline-block collapsed" data-parent="#sidebar">
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
            <h2>결제</h2>
          </div>
          <p class="lead">선택한 영화 표를 결제할 수 있습니다.</p>
          <hr>
          <form class="pt-3" style="max-width:720px;">
            <div class="form-group">
              <label>카드사</label>
              <select class="form-control">
                <option selected>NH채움</option>
                <option>신한</option>
                <option>삼성</option>
                <option>롯데</option>
                <option>카카오뱅크</option>
              </select>
            </div>
            <div class="form-group">
              <label>할부</label>
              <select class="form-control">
                <option selected>일시불</option>
                <option>3개월(무이자)</option>
                <option>6개월(무이자)</option>
                <option>12개월(무이자)</option>
              </select>
            </div>
            <button type="submit" class="btn btn-primary">결제하기</button>
          </form>
        </main>
      </div>
    </div>
    <script src="./js/jquery.min.js"></script>
    <script src="./js/popper.min.js"></script>
    <script src="./js/bootstrap.min.js"></script>
  </body>
</html>
