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
            <h2>회원 가입</h2>
          </div>
          <p class="lead">사용자 정보를 기입해 회원가입해주세요.</p>
          <hr>
          <form action="userJoinAction.reservation" method="POST" class="pt-3" style="max-width:720px;">
            <div class="form-group">
              <label>아이디</label>
              <input name="userID" type="text" class="form-control" placeholder="아이디를 입력하세요.">
            </div>
            <div class="form-group">
              <label>비밀번호</label>
              <input name="userPassword" type="password" class="form-control" placeholder="비밀번호를 입력하세요.">
            </div>
            <div class="form-group">
              <label>비밀번호 확인</label>
              <input name="userPasswordConfirm" type="password" class="form-control" placeholder="비밀번호 확인을 입력하세요.">
            </div>
            <div class="form-group">
              <label>전화번호</label>
              <input name="userPhone" type="text" class="form-control" placeholder="전화번호를 입력하세요.">
            </div>
            <div class="form-group">
              <label>주소</label>
              <input name="userAddress" type="text" class="form-control" placeholder="주소를 입력하세요.">
            </div>
            <div class="form-group">
              <label>이메일</label>
              <input name="userEmail" type="email" class="form-control" placeholder="이메일을 입력하세요.">
            </div>
           <a href="./index.jsp" class="btn btn-primary float-right">회원 가입</a>
          </form>
        </main>
      </div>
    </div>
    <%@ include file="./viewFragment/footer.jspf" %>
    <%@ include file="./viewFragment/modal.jspf" %>
  </body>
</html>
