<%-- <%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@include file="/common/taglibs.jsp"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1.0, maximum-scale=1.0, user-scalable=no" />
    <meta name="renderer" content="webkit">
   <title>首页</title>
		<script src="${ctx}/resource/js/jquery-1.11.3/jquery.min.js" type="text/javascript" charset="utf-8"></script>
    
      <link href="${ctx}/resource/uc/iconfont/iconfont.css" rel="stylesheet"/>
 <link href="${ctx}/resource/uc/common.css" rel="stylesheet"/>
    <link href="${ctx}/resource/uc/cart.css" rel="stylesheet"/>
</head>
    
    <style type="text/css">
    
    </style>
</head>
<body>
    <!--头部-->
      <%@ include file="/common/utop.jsp" %>
    <div class="wrapper uc-router">
    </div>

     <div class="wrapper">
        <div class="pay-wrap">
            <div class="order-result">
                <div class="section clearfix">
                    <img src="${ctx}/resource/img/ico/order-success.jpg" class="ico" />
                    <div class="titbox">
                        <div class="tit">订单提交成功，应付金额  ${obj.total} 元</div>
                        <div class="stit">订单号：${obj.code} </div>
                    </div>
                    <div class="mt20">
                        <div class="meta">
                            <div class="hd">收货地址</div>
                            <div class="bd">${address.area} ${address.name}  (收) ${address.phone}</div>
                        </div>
                    </div>
                </div>
            </div>
        </div>
    </div>

    <!--脚部-->
    <div class="fatfooter">

    </div>
    <!--脚部-->
</body>
<script src="js/jquery.js"></script>
<link rel="stylesheet" href="js/icheck/style.css"/>
<script src="js/icheck/icheck.min.js"></script>
<script src="js/global.js"></script>
<script>

</script>
</html> --%>