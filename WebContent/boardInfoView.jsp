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
            <h2>글 보기</h2>
          </div>
          <p class="lead">게시글을 확인합니다.</p>
          <hr>
          <form class="pt-3" style="max-width:920px;">
            <div class="form-group">
              <label>제목</label>
              <p class="boardTitle">제목 예시입니다.</p>
            </div>
            <div class="form-group">
              <label>내용</label>
              <p class="boardContent">내용 예시입니다.</p>
            </div>
            <a href="./boardEdit.jsp" class="btn btn-primary">글 수정</a>
            <a href="#" class="btn btn-primary">글 삭제</a>
            <a href="./board.jsp" class="btn btn-primary">글 목록</a>
          </form>
        </main>
      </div>
    </div>
    <%@ include file="./fragment/footer.jspf" %>
    <script src="./js/jquery.min.js"></script>
    <script src="./js/popper.min.js"></script>
    <script src="./js/bootstrap.min.js"></script>
  </body>
</html>
