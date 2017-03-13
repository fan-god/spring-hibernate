/**
 * Created by Administrator on 2017/3/1.
 */
$(function(){
    $("#dForReach2").click(function(){
        $("#dForReach1").css({"background":"white","color":"blue"});
        $("#dForReach2").css({"background":"blue","color":"white"});
        $("#reach2").css("display","block");
        $("#reach1").css("display","none");
    });
    $("#dForReach1").click(function () {
        $("#dForReach1").css({"background": "blue", "color": "white"});
        $("#dForReach2").css({"background": "white", "color": "blue"});
        $("#reach1").css("display","block");
        $("#reach2").css("display","none");
    });


    $("#reach1").focus(function(){
        $("#reach1").val("");
    });
    $("#reach1").blur(function(){
        $("#reach1").val("请输入任意关键字");
    });
    $("#reach2").focus(function () {
        $("#reach2").val("");
    });
    $("#reach2").blur(function () {
        $("#reach2").val("关键字查找游戏、搜区服、寻商品");
    });
    $(".close").click(function(){
        $("[name='game-index']").css("display","none");
    });



    //ajax---------------------------------------------------------------------------------------------
    $(".gameTypeDiv ul li div").click(function(){
        $(".showGameInfo ul li").css("display","none");
        $.ajax({
            async: false,
            url:"http://localhost:8080/ssh01/game/showAllGameByFirstWord",
            type:"post",
            data:"value="+$(this).text(),
            dateType:"json",
            success:function(data){
                var d = eval(data);
                for(var i=0;i<d.length;i++){
                    $(".showGameInfo ul").append("<li>"+d[i]+"</li>");

                }
/*--------------------------------------------------连表---------------------------------------*/
                $(".showGameInfo ul li").click(function () {
                    $(".showQu ul li").css("display","none");
                    $.ajax({
                        url:"http://localhost:8080/ssh01/game/listAllQuByGameName",
                        type:"post",
                        data:"value="+$(this).text(),
                        dateType:"json",
                        success:function(data){
                            var d = eval(data);
                            for(var i=0;i<d.length;i++){
                                $(".showQu ul").append("<li>"+d[i]+"</li>");
                                $("#showGameName").css("display","none");
                                $("#showQuName").css("display","block");
                            }
                            /*-----------------------------------------------------------------*/
                            $(".showQu ul li").click(function(){
                                $(".showServer ul li").css("display","none");
                                $.ajax({
                                    url:"http://localhost:8080/ssh01/game/getServerByQu",
                                    type:"post",
                                    data:"value="+$(this).text(),
                                    dateType:"json",
                                    success:function(data){
                                        var d = eval(data);
                                        for(var i=0;i<d.length;i++){
                                            $(".showServer ul").append("<li>"+d[i]+"</li>");
                                            $("#showQuName").css("display","none");
                                            $("#showServerName").css("display","block");
                                        }
                                        $(".showServer ul li").click(function(){
                                            $("#showServerName").css("display","none");
                                            $("#showLast").css("display","block");
                                        })
                                    }
                                })
                            })
                        }
                    })
                });

            }
        });
});

    $(".reMen").click(function () {
        $.ajax({
            url: "http://localhost:8080/ssh01/game/getGameNameByIsHot",
            type: "post",
            data: "value=" + $(".reMen").text(),
            dateType: "json",
            success: function (data) {
                var d = eval(data);
                for (var i = 0; i < d.length; i++) {
                    $(".showGameInfo ul").append("<li>" + d[i].cname + "</li>");
                    $(".showGameInfo ul li").css("color","red");
                }
            }
        });
    });

    $(".gameType dd:eq(0)").click(function () {
        $.ajax({
            url: "http://localhost:8080/ssh01/game/listAll",
            type: "post",
            data: "value=" + "OK",
            dateType: "json",
            success: function (data) {
                var d = eval(data);
                for (var i = 0; i < d.length; i++) {
                    $(".showGameInfo ul").append("<li>" + d[i].cname + "</li>");
                    if(d[i].isHot=="S"){
                        $(".showGameInfo ul li").css("color","red");
                    }
                }
            }
        });
    });

    $(".type").click(function () {
        $.ajax({
            url: "http://localhost:8080/ssh01/game/listByType",
            type: "post",
            data: "value=" + $(this).text(),
            dateType: "json",
            success: function (data) {
                var d = eval(data);
                for (var i = 0; i < d.length; i++) {
                    $(".showGameInfo ul").append("<li>" + d[i].cname + "</li>");
                }
            }
        });
    });
});



/*******************************************************************************************************/
function show(index){
    var cssType = document.getElementsByName("css-index");
    for(var i=0;i<cssType.length;i++){
        if(i==index){
            cssType[i].style.border="1px solid blue";
            cssType[i].style.fontWeight="bold";
        }else{
            cssType[i].style.border="none";
        }
        $(".showGameInfo ul li").css("display","none");
    }
}

//---------------游戏名、区名、服务器名的下拉框效果
function block(index){
    var game = document.getElementsByName("game-index");
    for(var i=0;i<game.length;i++){
        if(i==index){
            game[i].style.display="block";
        }else{
            game[i].style.display="none";
        }
    }
}

