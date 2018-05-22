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
            <h2>Q & A</h2>
          </div>
          <p class="lead">회원님의 궁금증을 풀어드립니다.</p>
          <hr>
          <div class="panel panel-default">
            <div class="panel-heading mt-3">
              <h4 class="panel-title">
                <a data-toggle="collapse" href="#collapse1">▶ 게시판 누구나 이용할 수 있나요?</a>
              </h4>
            </div>
            <div id="collapse1" class="panel-collapse collapse in">
              <div class="panel-body">
                 저희 웹 사이트의 게시판은 <strong>누구나</strong> 이용할 수 있습니다.
              </div>
            </div>
            <div class="panel-heading mt-3">
              <h4 class="panel-title">
                <a data-toggle="collapse" href="#collapse2">▶ 고객센터의 전화번호가 궁금해요.</a>
              </h4>
            </div>
            <div id="collapse2" class="panel-collapse collapse in">
              <div class="panel-body">
                 고객센터의 전화번호는 <strong>02)000-0000</strong>입니다.
              </div>
            </div>
          </div>
          <div class="alert alert-warning">
            이외의 사항은 고객센터로 전화해주시면 친절히 답변해드리겠습니다.
          </div>
        </main>
      </div>
    </div>
    <%@ include file="./viewFragment/footer.jspf" %>
    <%@ include file="./viewFragment/modal.jspf" %>
  </body>
</html>
