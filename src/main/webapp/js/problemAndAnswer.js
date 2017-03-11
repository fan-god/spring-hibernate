
function choose(index){
    var list = $(".navigation dd");
    for(var i=0;i<list.length;i++){
        if(i==index){
            $(list[i]).css({"borderTop":"3px solid blue","background":"white"});
        }else{
            $(list[i]).css({"borderTop":"none","background":"gainsboro"});
        }
    }
}
function get(index) {
    var list = $(".center-bar dd");
    for (var i = 0; i < list.length; i++) {
        if (i == index) {
            $(list[i]).css({"border": "1px solid #B8E834", "background": "white","color":"blue"});
        } else {
            $(list[i]).css({"border": "none", "background": "gainsboro"});
        }
    }
}




function jump_to(){
    var regexp=/^[1-9]\d*$/;
    var pageNo = document.getElementById("inputPage").value;
    var totalPage = document.getElementById("totalPage").value;
    if(!regexp.test(pageNo)){
        alert("请输入 正确的数字！");
        return false;
    }else if((pageNo-totalPage) > 0){
        alert("总页码一共"+totalPage+"页，请输入正确的页码！");
        return false;
    }else{
        $("form").attr("action","/ssh01/home/problemAndAnswer?pageIndex="+pageNo);
        return true;
    }

}
function goNo(){
    if(jump_to()==true){
        return true;
    }else{
        return false;
    }
}