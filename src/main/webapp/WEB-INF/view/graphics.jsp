<!DOCTYPE html>
<%@ page language="java" contentType="text/html; charset=utf-8"
         pageEncoding="utf-8"%>
<html>
<head lang="en">
    <meta charset="UTF-8">
    <title>图形数据展示</title>
    <script src="js/jquery.min.js"></script>
    <link rel="stylesheet" type="text/css" href="./css/common.css">
    <style>

    </style>
</head>
<body>
    <div id="indexBox">
        <div class="indexcontent">
            <div class="indexcontent-left">
                <div class="indexcontent-left-header">
                    <img class="left-img1" src="./images/logo.svg"/>
                </div>
                <div class="indexcontent-left-face">
                    <div>
                        <img class="left-img1" src="./images/head portrait.svg"/>
                    </div>
                </div>
                <div class="indexcontent-left-list">
                    <div class="indexcontent-left-list-main">

                    </div>
                </div>
            </div>
            <div class="right-collection">
                <!--会员管理右边-->
                <div class="indexcontent-right1">
                    <div class="indexcontent-right-main">
                        <div class="indexcontent-right-top">
                            <img  src="./images/Full screen button.svg"/>
                            <div class="indexcontent-right-top-right">
                                <img  src="./images/quit.svg"/>
                                <p>退出</p>
                            </div>
                        </div>
                        <div class="indexcontent-right-bottom">
                            <div class="indexcontent-right-bottom-main">
                                <div class="indexcontent-right-bottom-main-header">
                                    <div class="indexcontent-header-title">图形数据展示列表</div>
                                </div>
                                <div class="indexcontent-right-bottom-main-content">
                                    <form>
                                        <div class="members-form">

                                            <div class="members-form-bottom">
                                                <div class="back">返回</div>
                                            </div>
                                        </div>
                                    </form>
                                </div>
                            </div>
                        </div>
                    </div>
                </div>
            </div>
        </div>
    </div>
    <script src="js/common.js"></script>
<script>
  $(document).ready(function(){
      var Height=$(window).height();//
      var Height1=$(window).height()-60;//
      var Width=$(window).width();
      var indexData=[
          {icon:"./images/home-1.svg",text:"欢迎来到首页"},
          {icon:"./images/member-1.svg",text:"会员管理列表"},
          {icon:"./images/commercial tenant-1.svg",text:"商户管理列表"},
          {icon:"./images/attributa-1.svg",text:"产品属性列表"},
          {icon:"./images/label-1.svg",text:"标签展示列表"},
          {icon:"./images/merchant display.svg",text:"商户展示列表"},
          {icon:"./images/supermarket-1.svg",text:"超市展示列表"},
          {icon:"./images/referral  link.svg",text:"推广链接列表"},
          {icon:"./images/merchant display-1.svg",text:"管理人员列表"},
      ];
      console.log(Height+'+'+Width);
      $('#indexBox').css('width',Width);
      $('#indexBox').css('height',Height);
      $('.indexcontent-right-bottom').css('height',Height1);
      var h1 = '';
      for(var i=0;i<indexData.length;i++){
          if(i==5){
              h1 += '<div class="indexcontent-left-item active">'+
                      '<div class="indexcontent-left-item-left">'+
                      '<img src="'+indexData[i].icon+'"/>'+
                      '</div>'+
                      '<div class="indexcontent-left-item-middle">'+indexData[i].text+'</div>'+
                      '<div class="indexcontent-left-item-right">'+
                      '<img src="./images/跳转 前往 右箭头 向右 下一步 线性 .png"/>'+
                      '</div>'+
                      '</div>';
          }else{
              h1 += '<div class="indexcontent-left-item grey">'+
                      '<div class="indexcontent-left-item-left">'+
                      '<img src="'+indexData[i].icon+'"/>'+
                      '</div>'+
                      '<div class="indexcontent-left-item-middle">'+indexData[i].text+'</div>'+
                      '<div class="indexcontent-left-item-right">'+
                      '<img src="./images/跳转 前往 右箭头 向右 下一步 线性  (1).png"/>'+
                      '</div>'+
                      '</div>';
          };

      };
      $('.indexcontent-left-list-main').append(h1);

      /*点击左边切换右边*/
      $('.indexcontent-left-list-main>div').on('click',function(){
          var index=$(this).index();
          console.log(index);
          window.location.href="index.html?id="+index;
      })

  });

    $('.back').on('click',function(){
        window.history.back(-1);
    })


</script>
</body>
</html>
