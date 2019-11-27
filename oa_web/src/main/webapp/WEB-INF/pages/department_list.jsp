<%--
  Created by IntelliJ IDEA.
  User: 雨木科技
  Date: 2019/11/26
  Time: 16:57
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@taglib prefix="c" uri="http://java.sun.com/jstl/core" %>
<jsp:include page="top.jsp"/>

<div class="tray tray-center">
    <div class="content-header">
        <h2> 部门列表 </h2>
        <p class="lead"></p>
    </div>
    <div class="admin-form theme-primary mw1000 center-block" style="padding-bottom: 175px;">
        <div class="panel  heading-border">
            <div class="panel-menu">
                <div class="row">
                    <div class="hidden-xs hidden-sm col-md-3">
                        <div class="btn-group">
                            <button type="button" class="btn btn-default light">
                                <i class="fa fa-refresh"></i>
                            </button>
                            <button type="button" class="btn btn-default light">
                                <i class="fa fa-trash"></i>
                            </button>
                            <button type="button" class="btn btn-default light">
                                <i class="fa fa-plus" onclick="javascript:window.location.href='/department/to_add';"></i>
                            </button>
                        </div>
                    </div>
                    <div class="col-xs-12 col-md-9 text-right">
                        <div class="btn-group">
                            <button type="button" class="btn btn-default light">
                                <i class="fa fa-chevron-left"></i>
                            </button>
                            <button type="button" class="btn btn-default light">
                                <i class="fa fa-chevron-right"></i>
                            </button>
                        </div>
                    </div>
                </div>
            </div>
            <div class="panel-body pn">
                <table id="message-table" class="table admin-form theme-warning tc-checkbox-1">
                    <thead>
                    <tr class="">
                        <th class="text-center hidden-xs">Select</th>
                        <th class="hidden-xs">部门编号</th>
                        <th class="hidden-xs">部门名称</th>
                        <th class="hidden-xs">地址</th>
                        <th>操作</th>
                    </tr>
                    </thead>
                    <tbody>
                    <c:forEach items="${list}" var="department">
                        <tr class="message-unread">
                            <td class="hidden-xs">
                                <label class="option block mn">
                                    <input type="checkbox" name="mobileos" value="FR">
                                    <span class="checkbox mn"></span>
                                </label>
                            </td>
                            <td>${department.sn}</td>
                            <td>${department.name}</td>
                            <td>${department.address}</td>
                            <td>
                                <a href="/department/to_update?sn=${department.sn}">编辑</a>
                                <a href="/department/remove?sn=${department.sn}">删除</a>
                            </td>
                        </tr>
                    </c:forEach>
<%--                    <tr class="message-unread">--%>
<%--                        <td class="hidden-xs">--%>
<%--                            <label class="option block mn">--%>
<%--                                <input type="checkbox" name="mobileos" value="FR">--%>
<%--                                <span class="checkbox mn"></span>--%>
<%--                            </label>--%>
<%--                        </td>--%>
<%--                        <td>10001</td>--%>
<%--                        <td>总经理办公室</td>--%>
<%--                        <td>星星大厦E座1201</td>--%>
<%--                        <td>--%>
<%--                            <a href="/department/to_update?sn=10001">编辑</a>--%>
<%--                            <a href="/department/remove?sn=10001">删除</a>--%>
<%--                        </td>--%>
<%--                    </tr>--%>

<%--                    <tr class="message-unread">--%>
<%--                        <td class="hidden-xs">--%>
<%--                            <label class="option block mn">--%>
<%--                                <input type="checkbox" name="mobileos" value="FR">--%>
<%--                                <span class="checkbox mn"></span>--%>
<%--                            </label>--%>
<%--                        </td>--%>
<%--                        <td>10002</td>--%>
<%--                        <td>财务部</td>--%>
<%--                        <td>星星大厦E座1202</td>--%>
<%--                        <td>--%>
<%--                            <a href="/department/to_update?sn=10002">编辑</a>--%>
<%--                            <a href="/department/remove?sn=10002">删除</a>--%>
<%--                        </td>--%>
<%--                    </tr>--%>

<%--                    <tr class="message-unread">--%>
<%--                        <td class="hidden-xs">--%>
<%--                            <label class="option block mn">--%>
<%--                                <input type="checkbox" name="mobileos" value="FR">--%>
<%--                                <span class="checkbox mn"></span>--%>
<%--                            </label>--%>
<%--                        </td>--%>
<%--                        <td>10003</td>--%>
<%--                        <td>事业部</td>--%>
<%--                        <td>星星大厦E座1101</td>--%>
<%--                        <td>--%>
<%--                            <a href="/department/to_update?sn=10003">编辑</a>--%>
<%--                            <a href="/department/remove?sn=10003">删除</a>--%>
<%--                        </td>--%>
<%--                    </tr>--%>

                    </tbody>
                </table>
            </div>
        </div>
    </div>
</div>

<jsp:include page="bottom.jsp"/>