<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jstl/core_rt" %>
<%--
  Created by IntelliJ IDEA.
  User: 雨木科技
  Date: 2019/11/29
  Time: 16:15
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<jsp:include page="top.jsp"/>
<section id="content" class="table-layout animated fadeIn">
    <div class="tray tray-center">
        <div class="content-header">
            <h2> 编辑员工信息 </h2>
            <p class="lead"></p>
        </div>
        <div class="admin-form theme-primary mw1000 center-block" style="padding-bottom: 175px;">
            <div class="panel heading-border">
                <form:form id="addForm" name="addForm" modelAttribute="employee" action="/employee/update" method="post">
                    <div class="panel-body bg-light">
                        <div class="section-divider mt20 mb40">
                            <span> 基本信息 </span>
                        </div>
                        <div class="section row">
                            <div class="col-md-6">
                                <label for="sn" class="field prepend-icon">
                                    <form:input path="sn" cssClass="gui-input" placeholder="工号..." readonly="readonly" value="${employee.sn}"/>
                                    <label for="sn" class="field-icon">
                                        <i class="fa fa-user"></i>
                                    </label>
                                </label>
                            </div>
                            <div class="col-md-6">
                                <label for="name" class="field prepend-icon">
                                    <form:input path="name" cssClass="gui-input" placeholder="姓名..." value="${employee.name}"/>
                                    <label for="name" class="field-icon">
                                        <i class="fa fa-user"></i>
                                    </label>
                                </label>
                            </div>
                        </div>
                        <div class="section row">
                            <div class="col-md-6">
                                <label for="sn" class="field select">
                                    <form:select path="departmentSn" cssClass="gui-input" placeholder="所属部门...">
                                        <c:forEach items="${dList}" var="department">
                                            <c:if test="${department.sn == employee.departmentSn}">
                                                <form:option value="${department.sn}" selected="selected">${department.name}</form:option>
                                            </c:if>
                                            <c:if test="${department.sn != employee.departmentSn}">
                                                <form:option value="${department.sn}" selected="selected">${department.name}</form:option>
                                            </c:if>
                                        </c:forEach>
                                    </form:select>
                                    <i class="arrow double"></i>
                                </label>
                            </div>
                            <div class="col-md-6">
                                <label for="post" class="field select">
                                    <form:select path="post" cssClass="gui-input" placeholder="所属部门...">
                                        <c:forEach items="${pList}" var="post">
                                            <c:if test="${post == employee.post}">
                                                <form:option value="${post}" selected="selected">${post}</form:option>
                                            </c:if>
                                            <c:if test="${post != employee.post}">
                                                <form:option value="${post}" selected="selected">${post}</form:option>
                                            </c:if>
                                        </c:forEach>
                                    </form:select>
                                    <i class="arrow double"></i>
                                </label>
                            </div>
                        </div>
                        <div class="panel-footer text-right">
                            <button type="submit" class="button"> 保存 </button>
                            <button type="button" class="button" onclick="javascript:window.history.go(-1);"> 返回 </button>
                        </div>
                    </div>
                </form:form>
            </div>
        </div>
    </div>
</section>
<jsp:include page="bottom.jsp"/>