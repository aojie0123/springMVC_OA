<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@taglib prefix="c" uri="http://java.sun.com/jstl/core_rt" %>
<jsp:include page="top.jsp"/>
<script>
    /********异步提交函数**************************/
//form支持多表单提交，中间用,隔开，url为提交地址
    function subForm(form,url){
        //防止高频点击
        var date = new Date();
        var time = date.getTime();//毫秒时间戳
        if(typeof minTime == "undefined"){
            var finger = 2;
            minTime = time+2000;//下次点击的最小时间
            console.log("定义minTime");
        }else{
            if(minTime && time < minTime){
                var finger = 1;
                warn("操作过于频繁");
                console.log("time:"+time+"，mintime:"+minTime+"，差额："+(time-minTime));
            }else{
                var finger = 2;
                console.log("time:"+time+"，mintime:"+minTime+"，多出："+(time-minTime));
                minTime = time+2000;//下次点击的最小时间
            }
        }
        if(finger == 2){
            //串联表单
            var formName = form.split(",");
            var serialize = "";
            var a = "";
            console.log(formName.length);
            for(var i=0;i<formName.length;i++){
                if(serialize == ""){
                    a = "";
                }else{
                    a = "&";
                }
                if(formName[i] != ""){
                    serialize += a + $("[name="+formName[i]+"]").serialize();
                }
            }
            //异步提交数据
            $.post(url,serialize,function(data){
                //console.log(data);
                if(data.warn == 2){
                    if(data.href){//如果异步返回的json参数中定义了重定向url，则跳转到本url
                        window.location.href = data.href;
                    }else{
                        window.location.reload();
                    }
                }else{
                    warn(data.warn);
                }
            },"json");
        }
    }
</script>
<section id="content" class="table-layout animated fadeIn">
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
                            <button type="button" class="btn btn-default light" onclick="subForm('listForm', '/department/batchRemove')">
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
                <form name="listForm">
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
                                    <input type="checkbox" name="sn[]" value="${department.sn}">
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
                    </tbody>
                </table>
                </form>
            </div>
        </div>
    </div>
</div>
</section>
<jsp:include page="bottom.jsp"/>