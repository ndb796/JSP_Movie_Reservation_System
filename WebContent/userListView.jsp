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
            <h2>회원 관리</h2>
          </div>
          <p class="lead">가입한 회원들을 관리할 수 있습니다.</p>
          <hr>
          <table class="table table-striped" style="max-width:1080px;">
            <thead>
              <tr>
                <th class="mobile" style="width:140px; text-align:center;">회원 아이디</th>
                <th style="text-align:center;">회원 이름</th>
                <th class="mobile" style="width:100px; text-align:center;">탈퇴</th>
              </tr>
            </thead>
            <tbody>
	            <c:forEach items="${ userList }" var="user">
	              <c:choose>
	              	<c:when test="${user.userType eq 1}">
		              <tr>
		                <td style="text-align: center;">${ user.userID }</td>
		                <td style="text-align: center;">${ user.userName }</td>
		                <td onclick="location.href = './userManageDeleteAction.reservation?userID=${ user.userID }';" class="btn btn-primary btn-block">탈퇴</td>
		              </tr>
					</c:when>
	              </c:choose>
	            </c:forEach>
             </tbody>
          </table>
        </main>
      </div>
    </div>
    <%@ include file="./viewFragment/footer.jspf" %>
    <%@ include file="./viewFragment/modal.jspf" %>
  </body>
</html>
