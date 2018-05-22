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
            <h2>회원 가입</h2>
          </div>
          <p class="lead">실명확인을 해주세요.</p>
          <hr>
          <form class="pt-3" style="max-width:720px;">
            <div class="form-group">
              <label>실명</label>
              <input type="text" class="form-control" placeholder="실명을 입력하세요.">
            </div>
            <div class="form-group">
              <label>주민등록번호</label>
              <input type="text" class="form-control" placeholder="주민번호 13자리를 입력하세요.(- 생략)">
            </div>
           <a href="./userInfo.jsp" class="btn btn-primary float-right">실명확인</a>
          </form>
        </main>
      </div>
    </div>
    <script src="./js/jquery.min.js"></script>
    <script src="./js/popper.min.js"></script>
    <script src="./js/bootstrap.min.js"></script>
  </body>
</html>
