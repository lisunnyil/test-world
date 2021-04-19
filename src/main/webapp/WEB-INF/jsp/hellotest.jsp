<%@ page language="java" contentType="text/html; charset=EUC-KR" pageEncoding="EUC-KR"%>
<!DOCTYPE html>
<html>
<head>
    <link rel="stylesheet" href="./lib/bootstrap/css/bootstrap.min.css">
    <link rel="stylesheet" href="./css/ladalico_ys.css">
    
    <meta charset="EUC-KR">
    <title>Ladalico Jsp page sample</title>
</head>
<body>
    <%@ include file="/WEB-INF/jsp/common/header.jsp" %>
    
    
    <section class="container">
        <div class="css_test">
            header footer test pageeeeee
        </div>
        <%@ include file="/WEB-INF/jsp/common/includeTest.jsp" %>
    </section>

    <%@ include file="/WEB-INF/jsp/common/footer.jsp" %>

</body>

<script src="./lib/bootstrap/jquery/jquery-3.6.0.min.js"></script>
<script src="./lib/bootstrap/js/bootstrap.min.js"></script>

</html>
 