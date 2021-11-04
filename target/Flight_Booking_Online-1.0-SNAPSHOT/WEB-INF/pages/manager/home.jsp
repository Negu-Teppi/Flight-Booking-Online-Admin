
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
    <title>Home</title>
    <jsp:include page="/WEB-INF/pages/include/management/css-page.jsp"/>
</head>
<body class="page-header-fixed sidemenu-closed-hidelogo page-content-white page-md header-white dark-sidebar-color logo-dark">
<div class="page-wrapper">
    <!-- start header -->
    <jsp:include page="/WEB-INF/pages/include/management/header.jsp" />
    <!-- end header -->
    <!-- start page container -->
    <div class="page-container">
        <!-- start sidebar menu -->
        <jsp:include page="/WEB-INF/pages/include/management/sidebar-menu.jsp" />
        <!-- end sidebar menu -->
        <!-- start page content -->
<%--        <div class="page-content-wrapper">--%>
<%--            <div class="page-content">--%>
<%--                <div class="page-bar">--%>
<%--                    <div class="page-title-breadcrumb">--%>
<%--                        <div class=" pull-left">--%>
<%--                            <div class="page-title">All Airport</div>--%>
<%--                        </div>--%>
<%--                        <ol class="breadcrumb page-breadcrumb pull-right">--%>
<%--                            <li><i class="fa fa-home"></i>&nbsp;<a class="parent-item" href="index.html">Home</a>&nbsp;<i class="fa fa-angle-right"></i>--%>
<%--                            </li>--%>
<%--                            <li><a class="parent-item" href="">Airport</a>&nbsp;<i class="fa fa-angle-right"></i>--%>
<%--                            </li>--%>
<%--                            <li class="active">All Airport</li>--%>
<%--                        </ol>--%>
<%--                    </div>--%>
<%--                </div>--%>
<%--                <div class="row">--%>
<%--                    <div class="col-md-12">--%>
<%--                        <div class="card card-box">--%>
<%--                            <div class="card-head">--%>
<%--                                <header>All Airport</header>--%>
<%--                                <div class="tools">--%>
<%--                                    <a class="fa fa-repeat btn-color box-refresh" href="javascript:;"></a>--%>
<%--                                    <a class="t-collapse btn-color fa fa-chevron-down" href="javascript:;"></a>--%>
<%--                                    <a class="t-close btn-color fa fa-times" href="javascript:;"></a>--%>
<%--                                </div>--%>
<%--                            </div>--%>
<%--                            <div class="card-body ">--%>
<%--                                <div class="row p-b-20">--%>
<%--                                    <div class="col-md-6 col-sm-6 col-6">--%>
<%--                                        <div class="btn-group">--%>
<%--                                            <a href='<c:url value="/manager/airport/add-airport"/>' id="addRow" class="btn btn-info">--%>
<%--                                                Add New <i class="fa fa-plus"></i>--%>
<%--                                            </a>--%>
<%--                                        </div>--%>
<%--                                    </div>--%>
<%--                                    <div class="col-md-6 col-sm-6 col-6">--%>
<%--                                        <div class="btn-group pull-right">--%>
<%--                                            <a class="btn deepPink-bgcolor  btn-outline dropdown-toggle" data-toggle="dropdown">Tools--%>
<%--                                                <i class="fa fa-angle-down"></i>--%>
<%--                                            </a>--%>
<%--                                            <ul class="dropdown-menu pull-right">--%>
<%--                                                <li>--%>
<%--                                                    <a href="javascript:;">--%>
<%--                                                        <i class="fa fa-print"></i> Print </a>--%>
<%--                                                </li>--%>
<%--                                                <li>--%>
<%--                                                    <a href="javascript:;">--%>
<%--                                                        <i class="fa fa-file-pdf-o"></i> Save as PDF </a>--%>
<%--                                                </li>--%>
<%--                                                <li>--%>
<%--                                                    <a href="javascript:;">--%>
<%--                                                        <i class="fa fa-file-excel-o"></i> Export to Excel </a>--%>
<%--                                                </li>--%>
<%--                                            </ul>--%>
<%--                                        </div>--%>
<%--                                    </div>--%>
<%--                                </div>--%>
<%--                                <div class="table-scrollable">--%>
<%--                                    <table class="table table-hover table-checkable order-column full-width" id="example4">--%>
<%--                                        <thead>--%>
<%--                                        <tr>--%>
<%--                                            <th class="center"> Name </th>--%>
<%--                                            <th class="center"> City </th>--%>
<%--                                            <th class="center"> Postal Code </th>--%>
<%--                                            <th class="center"> Country </th>--%>
<%--                                            <th class="center"> Postal Code </th>--%>
<%--                                            <th class="center"> Image </th>--%>
<%--                                            <th class="center"> Action </th>--%>
<%--                                        </tr>--%>
<%--                                        </thead>--%>
<%--                                        <c:forEach items="${airports}" var="airport">--%>
<%--                                            <tbody>--%>
<%--                                            <tr class="odd gradeX">--%>

<%--                                                <td class="center">${airport.name}</td>--%>
<%--                                                <td class="center">${airport.city.cityName}</td>--%>
<%--                                                <td class="center">${airport.city.post_code}</td>--%>
<%--                                                <td class="center">${airport.city.country.name}</td>--%>
<%--                                                <td class="center">${airport.city.country.postCode}</td>--%>
<%--                                                <td class="user-circle-img">--%>
<%--                                                    <img src="" alt="">--%>
<%--                                                </td>--%>
<%--                                                <td class="center">--%>
<%--                                                    <a href="<c:url--%>
<%--                                                        value="/manager/airport/edit/${airport.id}"/> "--%>
<%--                                                       class="btn btn-tbl-edit btn-xs">--%>
<%--                                                        <i class="fa fa-pencil"></i>--%>
<%--                                                    </a>--%>
<%--                                                    <button onclick="location.href='<c:url value="/manager/airport/delete/${airport.id}"/>'" class="btn btn-tbl-delete btn-xs">--%>
<%--                                                        <i class="fa fa-trash-o "></i>--%>
<%--                                                    </button>--%>
<%--                                                </td>--%>
<%--                                            </tr>--%>
<%--                                            </tbody>--%>
<%--                                        </c:forEach>--%>
<%--                                    </table>--%>
<%--                                </div>--%>
<%--                            </div>--%>
<%--                        </div>--%>
<%--                    </div>--%>
<%--                </div>--%>
<%--            </div>--%>
<%--        </div>--%>
        <!-- end page content -->
        <!-- start chat sidebar -->

        <!-- end chat sidebar -->
    </div>
    <!-- end page container -->
    <!-- start footer -->
    <jsp:include page="/WEB-INF/pages/include/management/footer.jsp" />
    <!-- end footer -->
</div>
<jsp:include page="/WEB-INF/pages/include/management/js-page.jsp" />
</body>
</html>