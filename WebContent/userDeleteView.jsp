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
            <h2>회원탈퇴</h2>
          </div>
          <p class="lead">회원탈퇴를 합니다.</p>
          <hr>
          <div class="form-group">
            <label>탈퇴사유</label>
            <select class="form-control">
              <option selected>다른 사이트가 더 편해서</option>
              <option>특별한 사유없음</option>
            </select>
            <a href="./eixt2.jsp" class="btn btn-primary float-right">회원탈퇴</a>
          </div>
        </main>
      </div>
    </div>
    <%@ include file="./viewFragment/footer.jspf" %>
    <%@ include file="./viewFragment/modal.jspf" %>
  </body>
</html>
