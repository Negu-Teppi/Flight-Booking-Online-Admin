
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
    <title>Home</title>
    <jsp:include page="include/management/css-page.jsp"/>
</head>
<body class="page-header-fixed sidemenu-closed-hidelogo page-content-white page-md header-white dark-sidebar-color logo-dark">

    <div class="page-wrapper">
        <!-- start header -->
<%--        <jsp:include page="include/menu.jsp"/>--%>
        <!-- end header -->
        <!-- start page container -->
        <div class="page-container">
            <!-- start sidebar menu -->
            <jsp:include page="include/management/sidebar-menu.jsp" />
            <!-- end sidebar menu -->
            <!-- start page content -->

            <!-- end page content -->
            <!-- start chat sidebar -->

            <!-- end chat sidebar -->
        </div>
        <!-- end page container -->
        <!-- start footer -->
        <jsp:include page="include/management/footer.jsp" />
        <!-- end footer -->
    </div>
    <jsp:include page="include/management/js-page.jsp" />
</body>
</html>
