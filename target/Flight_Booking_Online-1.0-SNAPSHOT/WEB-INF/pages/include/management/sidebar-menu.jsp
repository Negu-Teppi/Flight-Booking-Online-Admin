<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!-- start sidebar menu -->
<div class="sidebar-container">
    <div class="sidemenu-container navbar-collapse collapse fixed-menu">
        <div id="remove-scroll">
            <ul class="sidemenu page-header-fixed p-t-20" data-keep-expanded="false" data-auto-scroll="true" data-slide-speed="200">
                <li class="sidebar-toggler-wrapper hide">
                    <div class="sidebar-toggler">
                        <span></span>
                    </div>
                </li>
                <li class="sidebar-user-panel">
                    <div class="user-panel">
                        <div class="row">
                            <div class="sidebar-userpic">
                                <img src="<c:url value="/resources-management/assets/img/avatar.png"/>" class="img-responsive" alt=""> </div>
                        </div>
                        <div class="profile-usertitle">
                            <div class="sidebar-userpic-name"> Manh Lee </div>
                            <div class="profile-usertitle-job"> Manager </div>
                        </div>
                        <div class="sidebar-userpic-btn">
                            <a class="tooltips" href="user_profile.html" data-placement="top" data-original-title="Profile">
                                <i class="material-icons">person_outline</i>
                            </a>
                            <a class="tooltips" href="email_inbox.html" data-placement="top" data-original-title="Mail">
                                <i class="material-icons">mail_outline</i>
                            </a>
                            <a class="tooltips" href="chat.html" data-placement="top" data-original-title="Chat">
                                <i class="material-icons">chat</i>
                            </a>
                            <a class="tooltips" href="login.html" data-placement="top" data-original-title="Logout">
                                <i class="material-icons">input</i>
                            </a>
                        </div>
                    </div>
                </li>
                <li class="menu-heading">
                    <span>-- Setup</span>
                </li>
                <li class="nav-item start">
                    <a href="#" class="nav-link nav-toggle">
                        <i class="material-icons">vpn_key</i>
                        <span class="title">Setup Aircrafts</span>
                        <span class="arrow"></span>
                    </a>
                    <ul class="sub-menu">
                        <li class="nav-item ">
                            <a href="<c:url value="/manager/view/aircraft"/>" class="nav-link ">
                                <span class="title">View</span>
                            </a>
                        </li>
                        <li class="nav-item">
                            <a href="<c:url value="/manager/aircraft-seat/add"/> " class="nav-link ">
                                <span class="title">Set Seat</span>
                            </a>
                        </li>
                    </ul>
                </li>
                <li class="nav-item">
                    <a href="#" class="nav-link nav-toggle">
                        <i class="material-icons">vpn_key</i>
                        <span class="title">Setup Airports</span>
                        <span class="arrow"></span>
<%--                        <span class="label label-rouded label-menu label-danger">new</span>--%>
                    </a>
                    <ul class="sub-menu">
                        <li class="nav-item">
                            <a href="<c:url value="/manager/view/airport"/>" class="nav-link ">
                                <span class="title">View Airport</span>
                            </a>
                        </li>
                        <li class="nav-item">
                            <a href="" class="nav-link ">
                                <span class="title">Edit</span>
                            </a>
                        </li>
                    </ul>
                </li>
                <li class="nav-item">
                    <a href="#" class="nav-link nav-toggle">
                        <i class="material-icons">vpn_key</i>
                        <span class="title">Setup Flights</span>
                        <span class="arrow"></span>
                        <%--                        <span class="label label-rouded label-menu label-danger">new</span>--%>
                    </a>
                    <ul class="sub-menu">
                        <li class="nav-item">
                            <a href="<c:url value="/manager/flight-route/add"/>" class="nav-link ">
                                <span class="title">Add</span>
                            </a>
                        </li>
                        <li class="nav-item">
                            <a href="<c:url value="/manager/flight-route/view"/> " class="nav-link ">
                                <span class="title">View</span>
                            </a>
                        </li>
                    </ul>
                </li>
                <li class="nav-item start">
                    <a href="#" class="nav-link nav-toggle">
                        <i class="material-icons">vpn_key</i>
                        <span class="title">Setup Flight</span>
                        <span class="arrow"></span>
                    </a>
                    <ul class="sub-menu">
                        <li class="nav-item ">
                            <a href="<c:url value="/manager/flight/add"/>" class="nav-link ">
                                <span class="title">View</span>
                            </a>
                        </li>
                        <li class="nav-item">
                            <a href="<c:url value="/WEB-INF/pages/manager/setup/aircraft/set-seat.jsp"/> " class="nav-link ">
                                <span class="title">Add</span>
                            </a>
                        </li>
                    </ul>
                </li>
                <li class="menu-heading m-t-20">
                    <span>-- Manage</span>
                </li>
                <li class="nav-item">
                    <a href="#" class="nav-link nav-toggle">
                        <i class="material-icons">business_center</i>
                        <span class="title">Manage Booking</span>
                        <span class="arrow"></span>
                    </a>
                    <ul class="sub-menu">
                        <li class="nav-item">
                            <a href="new_booking.html" class="nav-link ">
                                <span class="title">Export</span>
                            </a>
                        </li>
                        <li class="nav-item">
                            <a href="view_booking.html" class="nav-link ">
                                <span class="title">Search</span>
                            </a>
                        </li>
                        <li class="nav-item">
                            <a href="edit_booking.html" class="nav-link ">
                                <span class="title">Reject</span>
                            </a>
                        </li>
                    </ul>
                </li>
                <li class="nav-item">
                    <a href="#" class="nav-link nav-toggle">
                        <i class="material-icons">business_center</i>
                        <span class="title">Manage Service</span>
                        <span class="arrow"></span>
                    </a>
                    <ul class="sub-menu">
                        <li class="nav-item">
                            <a href="new_booking.html" class="nav-link ">
                                <span class="title">Add</span>
                            </a>
                        </li>
                        <li class="nav-item">
                            <a href="view_booking.html" class="nav-link ">
                                <span class="title">Edit</span>
                            </a>
                        </li>
                        </li>
                    </ul>
                </li>
                <li class="nav-item">
                    <a href="#" class="nav-link nav-toggle">
                        <i class="material-icons">business_center</i>
                        <span class="title">Manage Flight Routes</span>
                        <span class="arrow"></span>
                    </a>
                    <ul class="sub-menu">
                        <li class="nav-item">
                            <a href="new_booking.html" class="nav-link ">
                                <span class="title">Add</span>
                            </a>
                        </li>
                        <li class="nav-item">
                            <a href="view_booking.html" class="nav-link ">
                                <span class="title">Edit</span>
                            </a>
                        </li>
                        <li class="nav-item">
                            <a href="edit_booking.html" class="nav-link ">
                                <span class="title">Update Status</span>
                            </a>
                        </li>
                    </ul>
                </li>
                <li class="nav-item">
                    <a href="#" class="nav-link nav-toggle">
                        <i class="material-icons">business_center</i>
                        <span class="title">Manage Promotion</span>
                        <span class="arrow"></span>
                    </a>
                    <ul class="sub-menu">
                        <li class="nav-item">
                            <a href="new_booking.html" class="nav-link ">
                                <span class="title">Add</span>
                            </a>
                        </li>
                        <li class="nav-item">
                            <a href="view_booking.html" class="nav-link ">
                                <span class="title">Edit</span>
                            </a>
                        </li>
                        <li class="nav-item">
                            <a href="edit_booking.html" class="nav-link ">
                                <span class="title">Update Status</span>
                            </a>
                        </li>
                    </ul>
                </li>
            </ul>
        </div>
    </div>
</div>
<!-- end sidebar menu -->