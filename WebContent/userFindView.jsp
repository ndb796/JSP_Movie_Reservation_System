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
            <h2>ID/PW 찾기</h2>
          </div>
          <p class="lead">아이디와 비밀번호를 찾습니다.</p>
          <hr>
          <form class="pt-3" style="max-width:720px;">
            <div class="form-group">
              <label>이름</label>
              <input type="text" class="form-control" placeholder="이름을 입력하세요.">
            </div>
            <div class="form-group">
              <label>이메일</label>
              <input type="email" class="form-control" placeholder="이메일을 입력하세요.">
            </div>
            <button type="submit" class="btn btn-primary">인증번호 발송</button>
            새로운 비밀번호를 이메일로 발송합니다.
          </form>
        </main>
      </div>
    </div>
    <%@ include file="./viewFragment/footer.jspf" %>
    <%@ include file="./viewFragment/modal.jspf" %>
  </body>
</html>
