<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!doctype html>
<html>
  <%@ include file="./fragment/header.jspf" %>
  <body>
    <div class="container-fluid">
      <div class="row d-flex d-md-block flex-nowrap wrapper">
        <%@ include file="./fragment/navigation.jspf" %>
        <main id="main" class="col-md-9 float-left col pl-md-5 pt-3 main">
          <div class="page-header mt-3">
            <h2>로그인</h2>
          </div>
          <p class="lead">아이디와 비밀번호를 입력해 로그인합니다.</p>
          <hr>
          <form action="userLoginAction.reservation" method="POST" class="pt-3" style="max-width:720px;">
            <div class="form-group">
              <label>아이디</label>
              <input name="userID" type="text" class="form-control" placeholder="아이디를 입력하세요.">
            </div>
            <div class="form-group">
              <label>비밀번호</label>
              <input name="userPassword" type="password" class="form-control" placeholder="비밀번호를 입력하세요.">
            </div>
            <button type="submit" class="btn btn-primary">로그인</button>
          </form>
        </main>
      </div>
    </div>
    <script src="./js/jquery.min.js"></script>
    <script src="./js/popper.min.js"></script>
    <script src="./js/bootstrap.min.js"></script>
  </body>
</html>
