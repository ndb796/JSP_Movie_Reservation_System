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
    <%@ include file="./viewFragment/footer.jspf" %>
    <%@ include file="./viewFragment/modal.jspf" %>
  </body>
</html>
