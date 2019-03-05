<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
   <%@include file="/common/taglibs.jsp"%>
 <div class="sidebar-wrap">
        <div class="sidebar-title">
            <h1>菜单</h1>
        </div>
        <div class="sidebar-content">
            <ul class="sidebar-list">
                <li>
                    <a href="#"><i class="icon-font">&#xe003;</i>菜单</a>
                    <ul class="sub-menu">
                        <li><a href="${ctx}/itemCategory/findByCategory"><i class="icon-font">&#xe008;</i>商品种类管理</a></li>
                        <li><a href="${ctx}/item/findByItem"><i class="icon-font">&#xe005;</i>商品管理</a></li>
                        <li><a href="${ctx}/itemOrder/findByOrder"><i class="icon-font">&#xe006;</i>订单项管理</a></li>
                        <li><a href="${ctx}/user/findByUser"><i class="icon-font">&#xe008;</i>用户管理</a></li>
                        <li><a href="${ctx}/itemCategory/tj"><i class="icon-font">&#xe006;</i>商品统计</a></li>
                    </ul>
                </li>
            </ul>
        </div>
    </div>