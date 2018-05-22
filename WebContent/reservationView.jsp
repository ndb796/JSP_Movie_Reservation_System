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
            <h2>영화 예매</h2>
          </div>
          <p class="lead">영화를 예매할 수 있습니다.</p>
          <hr>
          <form class="pt-3" style="max-width:720px;">
            <div class="form-group">
              <label>상영관</label>
              <select class="form-control">
                <option selected>신촌</option>
                <option>혜화</option>
                <option>건대</option>
                <option>구로</option>
                <option>노원</option>
              </select>
            </div>
            <div class="form-group">
              <label>상영 시간</label>
              <select class="form-control">
                <option selected>08:40</option>
                <option>10:30</option>
                <option>13:20</option>
                <option>15:40</option>
                <option>19:00</option>
                <option>21:20</option>
                <option>23:50</option>
              </select>
            </div>
            <div class="form-group">
              <label>잔여 좌석</label>
              <select class="form-control">
                <option selected>3관 (110/180)</option>
                <option>5관(4D PLEX) (172/180)</option>
              </select>
            </div>
            <a href="./select.jsp" class="btn btn-primary float-right">인원/좌석 선택</a>
          </form>
        </main>
      </div>
    </div>
    <script src="./js/jquery.min.js"></script>
    <script src="./js/popper.min.js"></script>
    <script src="./js/bootstrap.min.js"></script>
  </body>
</html>
