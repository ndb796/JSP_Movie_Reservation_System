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
            <h2>영화 정보 등록</h2>
          </div>
          <p class="lead">영화 정보를 등록합니다.</p>
          <hr>
          <form action="movieWriteAction.reservation" method="POST" class="pt-3" style="max-width:920px;">
            <div class="form-group">
              <label>제목</label>
              <input name="movieTitle" type="text" class="form-control" placeholder="제목을 입력하세요.">
            </div>
            <div class="form-group">
              <label>장르</label>
              <input name="movieGenre" type="text" class="form-control" placeholder="장르를 입력하세요.">
            </div>
            <div class="form-group">
              <label>러닝타임</label>
              <input name="movieTime" type="number" class="form-control" placeholder="러닝타임을 입력하세요.">
            </div>
            <div class="form-group">
              <label>내용</label>
              <textarea name="movieContent" class="form-control" style="height:320px" placeholder="내용을 입력하세요."></textarea>
            </div>
            <button type="submit" class="btn btn-primary">글쓰기</button>
            <section class="mt-4 mb-3 pt-4 pb-3" style="max-width:1080px;">
            <p class="lead"><% %></p>
            </section>
          </form>
        </main>
      </div>
    </div>
    <%@ include file="./viewFragment/footer.jspf" %>
    <%@ include file="./viewFragment/modal.jspf" %>
  </body>
</html>