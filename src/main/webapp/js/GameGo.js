// JavaScript Document
// JS实现选项卡切换

//移动鼠标事件
function showInfo(obj){
		obj.getElementsByTagName("dl")[0].style.display = "block";
	}		
//鼠标移开事件
function hideInfo(obj){
		obj.getElementsByTagName("dl")[0].style.display = "none";
	}		
		
//搜索
$(document).ready(function(){
	var index=0;//是否输入value做标记
	var GameName=null;//输入的名称做标记
	//dl的相关事件
	$("#click #click_img1").click(function(){
		$("dl.common").css("display","none");//隐藏除this的所有
		$("dl.common dl").css("display","none");//隐藏this下的dl
		$("#click_dl").css("display","block").addClass("click_dl");
		
		//普通搜索的点击事件
		$("#dt_input1").click(function(index,obj){
			if($("#dt_input0").val()=="请输入游戏名称"||$("#dt_input0").val()==undefined||$("#dt_input0").val()==""||$("#dt_input0").val()==null){
				$("#dt_span").html("请输入游戏！").css({"color":"red","backgroundColor":"#FF9","padding":"8px 8px 8px 8px","margin":"0 8px 0 8px"});
			}else{
				$("#click_dl").css("display","none");
				$("#click_dl2").css("display","block").addClass("click_dl");
				if($("#dt_input0").val()=="地下城与勇士"){
					$("#click_dl2_1").css("display","block");
					index=1;
					GameName="地下城与勇士";
				}else if($("#dt_input0").val()=="问道"){
					$("#click_dl2_2").css("display","block");
					index=1;
					GameName="问道";
				}
				
			}
		});	
		//普通搜索的文本框
		$("#dt_input0").focus(function(){
			if($(this).val()=="请输入游戏名称"){
				$(this).val("");
			}
		}).blur(function(){
			if($(this).val()==""){
				$(this).val("请输入游戏名称");
			}
		});

	})	
	//dl2的相关事件
	//没有选游戏的操作
	$(document).on("click","#click_img2",{},function(index,obj){
			$("dl.common").css("display","none");//隐藏除this的所有
			/*$("dl.common dl").css("display","none");//隐藏this下的dl*/
			$("#click_dl2").css("display","block").addClass("click_dl");
				if(index!=1){
					$("#dl2_span").html("请先输入游戏名称...").css({"color":"#999","padding":"8px 8px 8px 8px","margin":"0 8px 0 8px","fontSize":"18px"});
				}else{
					
				}
	
	});
	
	//选了游戏后对li的点击操作
/*	$("#click_dl2 li").click(function(){
		$("#click_dl2").css("display","none");
		$("#click_dl3").css("display","block").addClass("click_dl");
		if(GameName==="地下城与勇士"){
			if($(this).html()==="广东区"){
				$("#click_dl3_1").css("display","block");
				$("#click_dl3_1_ul1").css("display","block");
			}else if($(this).html()==="北京区"){
				$("#click_dl3_1").css("display","block");
				$("#click_dl3_1_ul2").css("display","block");
			}else if($(this).html()==="四川区"){
				$("#click_dl3_1").css("display","block");
				$("#click_dl3_1_ul3").css("display","block");
			}else if($(this).html()==="江苏区"){
				$("#click_dl3_1").css("display","block");
				$("#click_dl3_1_ul4").css("display","block");
			}else if($(this).html()==="湖北区"){
				$("#click_dl3_1").css("display","block");
				$("#click_dl3_1_ul5").css("display","block");
			}else if($(this).html()==="广西区"){
				$("#click_dl3_1").css("display","block");
				$("#click_dl3_1_ul6").css("display","block");
			}else if($(this).html()==="东北区"){
				$("#click_dl3_1").css("display","block");
				$("#click_dl3_1_ul7").css("display","block");
			}else if($(this).html()==="浙江区"){
				$("#click_dl3_1").css("display","block");
				$("#click_dl3_1_ul8").css("display","block");
			}else if($(this).html()==="山东区"){
				$("#click_dl3_1").css("display","block");
				$("#click_dl3_1_ul9").css("display","block");
			}else if($(this).html()==="上海区"){
				$("#click_dl3_1").css("display","block");
				$("#click_dl3_1_ul10").css("display","block");
			}else if($(this).html()==="西南区"){
				$("#click_dl3_1").css("display","block");
				$("#click_dl3_1_ul11").css("display","block");
			}else if($(this).html()==="安徽区"){
				$("#click_dl3_1").css("display","block");
				$("#click_dl3_1_ul12").css("display","block");
			}else if($(this).html()==="河北区"){
				$("#click_dl3_1").css("display","block");
				$("#click_dl3_1_ul13").css("display","block");
			}else if($(this).html()==="辽林区"){
				$("#click_dl3_1").css("display","block");
				$("#click_dl3_1_ul14").css("display","block");
			}else if($(this).html()==="福建区"){
				$("#click_dl3_1").css("display","block");
				$("#click_dl3_1_ul15").css("display","block");
			}else if($(this).html()==="华北区"){
				$("#click_dl3_1").css("display","block");
				$("#click_dl3_1_ul16").css("display","block");
			}else if($(this).html()==="重庆区"){
				$("#click_dl3_1").css("display","block");
				$("#click_dl3_1_ul17").css("display","block");
			}else if($(this).html()==="黑龙江区"){
				$("#click_dl3_1").css("display","block");
				$("#click_dl3_1_ul18").css("display","block");
			}else if($(this).html()==="江西区"){
				$("#click_dl3_1").css("display","block");
				$("#click_dl3_1_ul19").css("display","block");
			}else if($(this).html()==="西北区"){
				$("#click_dl3_1").css("display","block");
				$("#click_dl3_1_ul20").css("display","block");
			}else if($(this).html()==="陕西区"){
				$("#click_dl3_1").css("display","block");
				$("#click_dl3_1_ul21").css("display","block");
			}else if($(this).html()==="吉林区"){
				$("#click_dl3_1").css("display","block");
				$("#click_dl3_1_ul22").css("display","block");
			}else if($(this).html()==="山西区"){
				$("#click_dl3_1").css("display","block");
				$("#click_dl3_1_ul23").css("display","block");
			}else if($(this).html()==="天津区"){
				$("#click_dl3_1").css("display","block");
				$("#click_dl3_1_ul24").css("display","block");
			}else if($(this).html()==="河南区"){
				$("#click_dl3_1").css("display","block");
				$("#click_dl3_1_ul25").css("display","block");
			}else if($(this).html()==="湖南区"){
				$("#click_dl3_1").css("display","block");
				$("#click_dl3_1_ul26").css("display","block");
			}else if($(this).html()==="新疆区"){
				$("#click_dl3_1").css("display","block");
				$("#click_dl3_1_ul27").css("display","block");
			}else if($(this).html()==="内蒙古区"){
				$("#click_dl3_1").css("display","block");
				$("#click_dl3_1_ul28").css("display","block");
			}else if($(this).html()==="云南区"){
				$("#click_dl3_1").css("display","block");
				$("#click_dl3_1_ul29").css("display","block");
			}else if($(this).html()==="体验区"){
				$("#click_dl3_1").css("display","block");
				$("#click_dl3_1_ul30").css("display","block");
			}
		}else if(GameName==="问道"){
			if($(this).html()==="双线一区"){
				$("#click_dl3_2").css("display","block");
				$("#click_dl3_2_ul1").css("display","block");
			}else if($(this).html()==="双线二区"){
				$("#click_dl3_2").css("display","block");
				$("#click_dl3_2_ul2").css("display","block");
			}else if($(this).html()==="电信一区"){
				$("#click_dl3_2").css("display","block");
				$("#click_dl3_2_ul3").css("display","block");
			}else if($(this).html()==="电信二区"){
				$("#click_dl3_2").css("display","block");
				$("#click_dl3_2_ul4").css("display","block");
			}else if($(this).html()==="网通一区"){
				$("#click_dl3_2").css("display","block");
				$("#click_dl3_2_ul5").css("display","block");
			}else if($(this).html()==="网通二区"){
				$("#click_dl3_2").css("display","block");
				$("#click_dl3_2_ul6").css("display","block");
			}else if($(this).html()==="封测区"){
				$("#click_dl3_2").css("display","block");
				$("#click_dl3_2_ul7").css("display","block");
			}
			
			
		}
		
	});*/

	//dl3的相关事件
	$(document).on("click","#click_img3",{},function(){
		$("dl.common").css("display","none");//隐藏除this的所有
		$("dl.common dl").css("display","none");//隐藏this下的dl
			$("#click_dl3").css("display","block").addClass("click_dl");
				if(index!=1){
					$("#dl3_span").html("请先输入游戏区...").css({"color":"#999","padding":"8px 8px 8px 8px","margin":"0 8px 0 8px","fontSize":"18px"});
			}
	
	});
	//dl4的相关事件
	$(document).on("click","#click_img4",{},function(){
		$("dl.common").css("display","none");//隐藏除this的所有
		$("dl.common dl").css("display","none");//隐藏this下的dl
			$("#click_dl4").css("display","block").addClass("click_dl");
				if(index!=1){
					$("#dl4_span").html("请先输入游戏区...").css({"color":"#999","padding":"8px 8px 8px 8px","margin":"0 8px 0 8px","fontSize":"18px"});
				}
	
	});
	//所有dl的关闭事件
	$(document).on("click","input.dt_input",{},function(){
			$(this).parents("dl").css("display","none");
			$(".common_div").css("display","none");
	});
	var index2=0;
	//dl的点击事件获得相应的列表
	$(document).on("click","#two3_ul #click_dl li",{},function(obj){
			$(".common span").each(function(){
				$(this).html("");
			});
		    var Game_Name=$(this).attr("class");
		    var id=$(this).index();
			$(".Game_Name").parents("dl").css("display","none");
			$(".Game_Name"+id).parents("dl").css("display","block").addClass("click_dl");
			$(".Game_Name"+id).css("display","block");
			index2++;
	});
	//dl2的点击事件
	$(document).on("click","#two3_ul #click_dl2 li",{},function(){
			var Game_Name1=$(this).attr("class");
			var id=$(this).index();
			/*温馨提示： 找到服务器的几区  例如广东区 district0  找广东1-8区 district0_0*/
			$("."+Game_Name1).parents("dl").css("display","none");
			$("."+Game_Name1).css("display","none");
			$("."+Game_Name1+"_love").parents("dl").css("display","block").addClass("click_dl");
			$("."+Game_Name1+"_love").css("display","block");
			$("."+Game_Name1+id).css("display","block");
	});
	//搜索
	$("#input").focus(function(){
			if($(this).val()=="请输入游戏名称"){
				$(this).val("");
			}
	}).blur(function(){
		if($(this).val()==""){
			$(this).val("请输入游戏名称");
		}
	});
	$("#two4").click(function(){
			 if($("#input").val()!=null && $("#input").val()!="" && $("#input").val()!=undefined && $("#input").val()!="请输入游戏名称"){
				 if($("#input").val()=="地下城与勇士"){
					open("http://tool.5173.com/AccountRent/indexNew.aspx?gm=44343b06076d4a7a95a0ef22aac481ae&ga=&gs=&key=","地下城与勇士租赁",'width='+(window.screen.availWidth-10)+',height='+(window.screen.availHeight-30)+ ',top=0,left=0,toolbar=no,menubar=no,scrollbars=no, resizable=no,location=no, status=no')
				}else if($("#input").val()=="问道"){
					open("http://tool.5173.com/AccountRent/indexNew.aspx?gm=f3823b6683834acdbfbd82f67b394b88&ga=&gs=&key=","问道","'width='+(window.screen.availWidth-10)+',height='+(window.screen.availHeight-30)+ ',top=0,left=0,toolbar=no,menubar=no,scrollbars=no, resizable=no,location=no, status=no'")
				}else if($("#input").val()=="新天龙八部"){
					open("http://zulin.5173.com/AccountRent/indexNew.aspx?gm=20c8bbc1b9794fc98bd96859624d4769","新天龙八部","'width='+(window.screen.availWidth-10)+',height='+(window.screen.availHeight-30)+ ',top=0,left=0,toolbar=no,menubar=no,scrollbars=no, resizable=no,location=no, status=no'")
				}else if($("#input").val()=="剑侠情缘"){
					open("","剑侠情缘Ⅲ","'width='+(window.screen.availWidth-10)+',height='+(window.screen.availHeight-30)+ ',top=0,left=0,toolbar=no,menubar=no,scrollbars=no, resizable=no,location=no, status=no'")
				}else if($("#input").val()=="魔兽世界(国服)"){
					open("","魔兽世界(国服)","'width='+(window.screen.availWidth-10)+',height='+(window.screen.availHeight-30)+ ',top=0,left=0,toolbar=no,menubar=no,scrollbars=no, resizable=no,location=no, status=no'")
				}else if($("#input").val()=="剑灵"){
					open("","剑灵","'width='+(window.screen.availWidth-10)+',height='+(window.screen.availHeight-30)+ ',top=0,left=0,toolbar=no,menubar=no,scrollbars=no, resizable=no,location=no, status=no'")
				}else if($("#input").val()=="英雄联盟"){
					open("","英雄联盟","'width='+(window.screen.availWidth-10)+',height='+(window.screen.availHeight-30)+ ',top=0,left=0,toolbar=no,menubar=no,scrollbars=no, resizable=no,location=no, status=no'")
				}else if($("#input").val()=="守望先锋"){
					open("","守望先锋","'width='+(window.screen.availWidth-10)+',height='+(window.screen.availHeight-30)+ ',top=0,left=0,toolbar=no,menubar=no,scrollbars=no, resizable=no,location=no, status=no'")
				}else if($("#input").val()=="奇迹MU"){
					open("","奇迹MU","'width='+(window.screen.availWidth-10)+',height='+(window.screen.availHeight-30)+ ',top=0,left=0,toolbar=no,menubar=no,scrollbars=no, resizable=no,location=no, status=no'")
				}else if($("#input").val()=="天下3"){
					open("","天下3","'width='+(window.screen.availWidth-10)+',height='+(window.screen.availHeight-30)+ ',top=0,left=0,toolbar=no,menubar=no,scrollbars=no, resizable=no,location=no, status=no'")
				}else if($("#input").val()=="天涯明月刀"){
					open("","天涯明月刀","'width='+(window.screen.availWidth-10)+',height='+(window.screen.availHeight-30)+ ',top=0,left=0,toolbar=no,menubar=no,scrollbars=no, resizable=no,location=no, status=no'")
				}else if($("#input").val()=="魔域"){
					open("","魔域","'width='+(window.screen.availWidth-10)+',height='+(window.screen.availHeight-30)+ ',top=0,left=0,toolbar=no,menubar=no,scrollbars=no, resizable=no,location=no, status=no'")
				}else if($("#input").val()=="QQ华夏"){
					open("","QQ华夏","'width='+(window.screen.availWidth-10)+',height='+(window.screen.availHeight-30)+ ',top=0,left=0,toolbar=no,menubar=no,scrollbars=no, resizable=no,location=no, status=no'")
				}else if($("#input").val()=="QQ三国"){
					open("","QQ三国","'width='+(window.screen.availWidth-10)+',height='+(window.screen.availHeight-30)+ ',top=0,left=0,toolbar=no,menubar=no,scrollbars=no, resizable=no,location=no, status=no'")
				}else if($("#input").val()=="龙之谷"){
					open("","龙之谷","'width='+(window.screen.availWidth-10)+',height='+(window.screen.availHeight-30)+ ',top=0,left=0,toolbar=no,menubar=no,scrollbars=no, resizable=no,location=no, status=no'")
				}else if($("#input").val()=="仙侠世界"){
					open("","仙侠世界","'width='+(window.screen.availWidth-10)+',height='+(window.screen.availHeight-30)+ ',top=0,left=0,toolbar=no,menubar=no,scrollbars=no, resizable=no,location=no, status=no'")
				}else if($("#input").val()=="梦三国"){
					open("","梦三国","'width='+(window.screen.availWidth-10)+',height='+(window.screen.availHeight-30)+ ',top=0,left=0,toolbar=no,menubar=no,scrollbars=no, resizable=no,location=no, status=no'")
				}else if($("#input").val()=="醉逍遥"){
					open("","醉逍遥","'width='+(window.screen.availWidth-10)+',height='+(window.screen.availHeight-30)+ ',top=0,left=0,toolbar=no,menubar=no,scrollbars=no, resizable=no,location=no, status=no'")
				}else if($("#input").val()=="天谕"){
					open("","天谕","'width='+(window.screen.availWidth-10)+',height='+(window.screen.availHeight-30)+ ',top=0,left=0,toolbar=no,menubar=no,scrollbars=no, resizable=no,location=no, status=no'")
				}else if($("#input").val()=="疾风之刃"){
					open("","疾风之刃","'width='+(window.screen.availWidth-10)+',height='+(window.screen.availHeight-30)+ ',top=0,left=0,toolbar=no,menubar=no,scrollbars=no, resizable=no,location=no, status=no'")
				}else if($("#input").val()=="传奇永恒"){
					open("","传奇永恒","'width='+(window.screen.availWidth-10)+',height='+(window.screen.availHeight-30)+ ',top=0,left=0,toolbar=no,menubar=no,scrollbars=no, resizable=no,location=no, status=no'")
				}else if($("#input").val()=="极光世界"){
					open("","极光世界","'width='+(window.screen.availWidth-10)+',height='+(window.screen.availHeight-30)+ ',top=0,left=0,toolbar=no,menubar=no,scrollbars=no, resizable=no,location=no, status=no'")
				}else if($("#input").val()=="诛仙"){
					open("","诛仙","'width='+(window.screen.availWidth-10)+',height='+(window.screen.availHeight-30)+ ',top=0,left=0,toolbar=no,menubar=no,scrollbars=no, resizable=no,location=no, status=no'")
				}else if($("#input").val()=="轩辕传奇"){
					open("","轩辕传奇","'width='+(window.screen.availWidth-10)+',height='+(window.screen.availHeight-30)+ ',top=0,left=0,toolbar=no,menubar=no,scrollbars=no, resizable=no,location=no, status=no'")
				}else if($("#input").val()=="热血江湖"){
					open("","热血江湖","'width='+(window.screen.availWidth-10)+',height='+(window.screen.availHeight-30)+ ',top=0,left=0,toolbar=no,menubar=no,scrollbars=no, resizable=no,location=no, status=no'")
				}else if($("#input").val()=="传奇3"){
					open("","传奇3","'width='+(window.screen.availWidth-10)+',height='+(window.screen.availHeight-30)+ ',top=0,left=0,toolbar=no,menubar=no,scrollbars=no, resizable=no,location=no, status=no'")
				}else if($("#input").val()=="九阴真经"){
					open("","九阴真经","'width='+(window.screen.availWidth-10)+',height='+(window.screen.availHeight-30)+ ',top=0,left=0,toolbar=no,menubar=no,scrollbars=no, resizable=no,location=no, status=no'")
				}else if($("#input").val()=="仙途"){
					open("","仙途","'width='+(window.screen.availWidth-10)+',height='+(window.screen.availHeight-30)+ ',top=0,left=0,toolbar=no,menubar=no,scrollbars=no, resizable=no,location=no, status=no'")
				}else if($("#input").val()=="武魂"){
					open("","武魂","'width='+(window.screen.availWidth-10)+',height='+(window.screen.availHeight-30)+ ',top=0,left=0,toolbar=no,menubar=no,scrollbars=no, resizable=no,location=no, status=no'")
				}else if($("#input").val()=="新英雄年代"){
					open("","新英雄年代","'width='+(window.screen.availWidth-10)+',height='+(window.screen.availHeight-30)+ ',top=0,left=0,toolbar=no,menubar=no,scrollbars=no, resizable=no,location=no, status=no'")
				}else if($("#input").val()=="极光世界"){
					open("","极光世界","'width='+(window.screen.availWidth-10)+',height='+(window.screen.availHeight-30)+ ',top=0,left=0,toolbar=no,menubar=no,scrollbars=no, resizable=no,location=no, status=no'")
				}else if($("#input").val()=="梦幻西游"){
					open("","梦幻西游","'width='+(window.screen.availWidth-10)+',height='+(window.screen.availHeight-30)+ ',top=0,left=0,toolbar=no,menubar=no,scrollbars=no, resizable=no,location=no, status=no'")
				}else if($("#input").val()=="成吉思汗"){
					open("","成吉思汗","'width='+(window.screen.availWidth-10)+',height='+(window.screen.availHeight-30)+ ',top=0,left=0,toolbar=no,menubar=no,scrollbars=no, resizable=no,location=no, status=no'")
				}else if($("#input").val()=="桃花源记"){
					open("","桃花源记","'width='+(window.screen.availWidth-10)+',height='+(window.screen.availHeight-30)+ ',top=0,left=0,toolbar=no,menubar=no,scrollbars=no, resizable=no,location=no, status=no'")
				}else if($("#input").val()=="神泣"){
					open("","神泣","'width='+(window.screen.availWidth-10)+',height='+(window.screen.availHeight-30)+ ',top=0,left=0,toolbar=no,menubar=no,scrollbars=no, resizable=no,location=no, status=no'")
				}else if($("#input").val()=="上古世纪"){
					open("","上古世纪","'width='+(window.screen.availWidth-10)+',height='+(window.screen.availHeight-30)+ ',top=0,left=0,toolbar=no,menubar=no,scrollbars=no, resizable=no,location=no, status=no'")
				}else if($("#input").val()=="斗战神"){
					open("","斗战神","'width='+(window.screen.availWidth-10)+',height='+(window.screen.availHeight-30)+ ',top=0,left=0,toolbar=no,menubar=no,scrollbars=no, resizable=no,location=no, status=no'")
				}else if($("#input").val()=="剑侠情缘Ⅲ"){
					open("","剑侠情缘Ⅲ","'width='+(window.screen.availWidth-10)+',height='+(window.screen.availHeight-30)+ ',top=0,left=0,toolbar=no,menubar=no,scrollbars=no, resizable=no,location=no, status=no'")
				}else if($("#input").val()=="最终幻想14(FF14)"){
					open("","最终幻想14(FF14)","'width='+(window.screen.availWidth-10)+',height='+(window.screen.availHeight-30)+ ',top=0,left=0,toolbar=no,menubar=no,scrollbars=no, resizable=no,location=no, status=no'")
				}else if($("#input").val()=="激战2"){
					open("","激战2","'width='+(window.screen.availWidth-10)+',height='+(window.screen.availHeight-30)+ ',top=0,left=0,toolbar=no,menubar=no,scrollbars=no, resizable=no,location=no, status=no'")
				}
			}else{ 
				alert("请输入游戏名称......");
				return false;
			}
		
	});
	//关联过渡图片和下滑特效
	var index4=0;
	$("#five1_1 .guanlian").click(function(){
		index++;
		var id=$(this).index();
			$("#guanlian"+id).css("z-index",index);
			$("#guanlian"+id).slideToggle("slow");
			$(".commonColor").slideToggle("slow");

	})
	$(".common_div img").mouseover(function(){
			$(".commonColor").css({"background":"#000","opacity":"0.5"});
	}).mouseout(function(){
			$(".commonColor").css({"background":"#FFF","opacity":"1"});
		
	});

	
});

//选项卡切换效果
	window.onload=function(){
		
	var imgs=document.getElementById("show").getElementsByTagName("img");
	var lis=document.getElementById("index").getElementsByTagName("li");
		
	    MouseOver(lis, imgs, 'style_ok');
        var index = 0;
        var TimeOut;
        for (var i = 0; i < lis.length; i++) {
            lis[i].id = i;
            lis[i].onmouseover = function () {
                clearTimeout(TimeOut);
                for (var j = 0; j < imgs.length; j++) {
                    imgs[j].style.display = "none";
                    lis[j].className = " ";
                }
                imgs[this.id].style.display = "block";
                lis[this.id].className = "style_ok";
            };
            lis[i].onmouseout = function () {
                index = this.id;
                lunbo();
            }
        }

        function MouseOver($this, $parent, ClassName) {
            for (var i = 0; i < $this.length; i++) {
                $this[i].id = i;
                $this[i].onmouseover = function () {
                    for (var j = 0; j < $parent.length; j++) {
                        $parent[j].style.display = "none";
                        $this[j].className = "";
                    }
                    $parent[this.id].style.display = "block";
                    $this[this.id].className ="style_ok";
                }
            }
        }

        function lunbo() {//轮播
            for (var j = 0; j < imgs.length; j++) {
                imgs[j].style.display = "none";
                lis[j].className =" ";
            }
            if (index >= imgs.length)
				index = 0;
            	imgs[index].style.display = "block";
            	lis[index].className ="style_ok";
           	 index++;
           	 TimeOut = setTimeout(lunbo, 3000);
        }
        lunbo();
		}