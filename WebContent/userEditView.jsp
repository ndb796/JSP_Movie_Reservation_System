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
            <h2>회원 정보 수정</h2>
          </div>
          <p class="lead">사용자 정보를 수정합니다.</p>
          <hr>
          <form class="pt-3" style="max-width:720px;">
            <div class="form-group">
              <label>아이디</label>
              <input type="text" class="form-control">
            </div>
            <div class="form-group">
              <label>비밀번호</label>
              <input type="password" class="form-control">
            <div class="form-group">
              <label>비밀번호 확인</label>
              <input type="password" class="form-control">
            </div>
            <div class="form-group">
              <label>주소</label>
              <input type="text" class="form-control">
            </div>
            <div class="form-group">
              <label>이메일</label>
              <input type="email" class="form-control">
            </div>
            <div class="form-row">
              <div class="form-group col-md-4">
              <label>성</label>
              <input type="text" class="form-control">
              </div>
              <div class="form-group col-md-8">
              <label>이름</label>
              <input type="text" class="form-control">
              </div>
            </div>
            <div class="form-group">
              <label>성별</label>
              <select class="form-control">
                <option selected>남성</option>
                <option>여성</option>
              </select>
            </div>
            <button type="submit" class="btn btn-primary">회원 정보 수정</button>
          </form>
        </main>
      </div>
    </div>
    <script src="./js/jquery.min.js"></script>
    <script src="./js/popper.min.js"></script>
    <script src="./js/bootstrap.min.js"></script>
  </body>
</html>
