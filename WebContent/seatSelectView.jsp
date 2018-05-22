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
            <h2>인원/좌석 선택</h2>
          </div>
          <p class="lead">예매 인원과 좌석을 선택해주세요.</p>
          <hr>
          <div class="form-group">
              <label>인원</label>
              <select class="form-control">
                <option selected>1인</option>
                <option>2인</option>
                <option>3인</option>
                <option>4인</option>
                <option>5인</option>
              </select>
          </div>
          <section class="mt-4 mb-3 pt-4 pb-3" style="max-width:1080px;">
          <form class="pt-3" style="max-width:720px;">
         	<%
             int i = 1;
             while(i < 133)
             {
            	 %>
            	 <button type="submit" class="btn btn-primary"><% i++; %></button>
             <%
             }
      		 %>
        	<section class="mt-4 mb-3 pt-4 pb-3" style="max-width:1080px;">
            <p class="lead"></p>
            <%
             while(i < 265)
             {
            	 %> 
            	 <button type="submit" class="btn btn-primary"><% i++; %></button>
             <%
             }
      		 %>
      		 <section class="mt-4 mb-3 pt-4 pb-3" style="max-width:1080px;">
            <a href="./payView.reservation" class="btn btn-primary float-right">결제하기</a>
          </form>
        </main>
      </div>
    </div>
    <%@ include file="./viewFragment/footer.jspf" %>
    <%@ include file="./viewFragment/modal.jspf" %>
  </body>
</html>
