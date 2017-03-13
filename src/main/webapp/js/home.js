
/**
 * Created by 陈心航 on 2017/3/4.
 */


$(function ($) {
    //Tab切换
    $("#bookTab").children(".book_new").find("[id]").mouseover(function () {
        var id = "#book_" + $(this).attr("id");
        $("#bookTab").children(".book_class").find("[id]").hide();
        $(this).addClass("book_type_out").siblings().removeClass("book_type_out");
        $(id).show();
    });
    //图片轮播
    function changeImg(){
        var index=0;
        var stop=false;
//            分别获得图片和数字赋给变量
        var $li=$("#content").find("#scroll_img").children("li");
        var $page = $("#content").find("#scroll_number").children("li");

        $page.eq(index).addClass("scroll_number_over").stop(true,true).siblings().removeClass("scroll_number_over");
        $page.mouseover(function(){
            stop=true;
            index=$page.index($(this));
            $li.eq(index).stop(true,true).fadeIn().siblings().fadeOut();
            $(this).addClass("scroll_number_over").stop(true,true).siblings().removeClass("scroll_number_over");

        }).mouseout(function(){
            stop=false;

        });
        setInterval(function(){
            if(stop) return;
            index++;
            if(index>=$li.length){
                index=0;
            }
            $li.eq(index).stop(true,true).fadeIn().siblings().fadeOut();
            $page.eq(index).addClass("scroll_number_over").stop(true,true).siblings().removeClass("scroll_number_over");
        },2000);
    }
    changeImg();
});

$(window).scroll(function(){
    var objTop=$(this).scrollTop();
    $(".z-a").offset({top:objTop+100})
});
