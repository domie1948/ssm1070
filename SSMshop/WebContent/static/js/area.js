$(function(){
//第二级
	
	$("#area").change(function(){
		if($("#area option:selected").text()=="请选择"){
			$("#spancity").css("display","none"); 
			$("#spancity").css("display","none");
		}else{
			$("#spancity").css("display","inline"); 
			$("#spancity").css("display","inline");
		}
		$("#spancity").empty();
		$("#spanqu").empty();
		if($("#area_info") != null && $("#area_info") != ""){
	  		$("#area_info").attr("value","");
	  	}
	  	if($("#memberProvinceid") != null && $("#memberProvinceid") != ""){
	  		$("#memberProvinceid").val("");
	  	}
	  	if($("#area_id") != null && $("#area_id") != ""){
	  		$("#area_id").val("");
	  	}
		var id = $(this).val();
		var area = $(this).find("option:selected").text;
	  	$.ajax({
             type: "post",
             url:"/zsShop/person/getChildArea?id="+id,
             dataType: "json",
			 success:function(data) {
			 	var $li ='<select name="city" class="select" id="city" onchange="getqu(1);">';
			 		$li +='<option selected="selected" value="0">请选择</option>';
			 	if(data.result!='null'){
				 	var jsonObj = eval("(" + data.result + ")");
				 	console.log(jsonObj);
					for ( var i = 0; i < jsonObj.length; i++) {
						$li += '<option value='+jsonObj[i].id+'>'+jsonObj[i].areaName+'</option>'
					}
			 	}
			 	$li += "</select>";
				$("#spancity").append($li);
			}
     	});
	  	if($("#area").val() == "" || $("#area").val() == "0" || $("#area").val() == "请选择"){
	  		$("#areaMsg").html('请选择省');
	  	}else if($("#areaMsg") != null && $("#areaMsg") != ""){
     		$("#areaMsg").html('请选择市');
     	}
	  	if($("#area_info") != null && $("#area_info") != ""){
	  		$("#area_info").attr("value",area);
	  	}
	  	if($("#memberProvinceid") != null && $("#memberProvinceid") != ""){
	  		$("#memberProvinceid").val(id);
	  	}
	});
});


//第三级显示收货地区的区域值
function getqu(idtype){
	var areainfo = $("#area_info").val();
	var id = $("#city").val();
	var pre = $("#area").find("option:selected").html(); 
	var area = $("#city").find("option:selected").html();
	if(idtype == '1'){//等于1的时候 表示是2级 城市
		if(id == 0){
			if($("#memberProvinceid") != null && $("#memberProvinceid") != ""){
		  		$("#memberProvinceid").val("");
		  	}
		  	if($("#area_id") != null && $("#area_id") != ""){
		  		$("#area_id").val("");
		  	}
		  	if($("#area_info") != null && $("#area_info") != ""){
		  		$("#area_info").attr("value",pre);
		  	}
		  	if($(".areaMsg") != null && $(".areaMsg") != ""){
				$(".areaMsg").html('请选择市');
			}
			$("#qu").remove();
			return false;
		}
		$("#spanqu").html("");
		$("#city_id").val(id);
		$("#area_info").val();//areainfo + area
		$.ajax({
	         type: "post",
	         url:"/zsShop/person/getChildArea?id="+id,
	         data: '',
	         dataType: "json",
			 async:false,
			 success:function(data) {
			 	var $li ='<select name="qu" class="select" id="qu" onchange="getqu(2);">';
			 		$li +='<option selected="selected" value="0">请选择</option>';
			 	if(data.result!='null'){
				 	var jsonObj = eval("(" + data.result + ")");
					for ( var i = 0; i < jsonObj.length; i++) {
						$li += '<option value='+jsonObj[i].id+'>'+jsonObj[i].areaName+'</option>'
					}
			 	}
			 	$li += "</select>";
				$("#spanqu").append($li);
				if($("#area_info") != null && $("#area_info") != ""){
					$("#area_info").attr("value",pre + area);
				}
				if($(".areaMsg") != null && $(".areaMsg") != ""){
					$(".areaMsg").html('请选择区');
				}
			}
	 	});
	}else if(idtype =='2'){//等于2的时候 表示区域 不处理
		var quid = $("#qu").val();
		var quarea = $("#qu").find("option:selected").html();
		if($("#area_id") != null && $("#area_id") != ""){
			$("#area_id").val(quid);
		}
		if($("#area_info") != null && $("#area_info") != ""){
			$("#area_info").attr("value",pre + area + quarea);
		}
		if($(".areaMsg") != null && $(".areaMsg") != ""){
			$(".areaMsg").html('');
		}
		if(quid==0){
				$(".areaMsg").html('请选择区');
				$("#area_id").val("");
			    $("#area_info").attr("value",pre + area);
			}
	}
}

	/*
	 * 初始化地址信息,用于信息回显
	 * 
	 */
	function init_area(areaId01,areaId02,area03){
		//alert(areaId01+"\t"+areaId02+"\t"+area03);
		//地址初始化
		$("#area").find("option").each(function(){
			var id = areaId01;
			if($(this).attr("value") == id){
				$(this).attr("selected",true);
				$.ajax({
		             type: "post",
		             url:"/zsShop/person/getChildArea?id="+areaId01,
		             dataType: "json",
					 success:function(data) {
					 	var $li ='<select name="city" class="select" id="city" onchange="getqu(1);">';
					 		$li +='<option selected="selected" value="0">请选择</option>';
					 	if(data.result!='null'){
						 	var jsonObj = eval("(" + data.result + ")");
							for ( var i = 0; i < jsonObj.length; i++) {
								$li += '<option value='+jsonObj[i].id+'>'+jsonObj[i].areaName+'</option>'
							}
					 	}
					 	$li += "</select>";
						$("#spancity").append($li);
						//第二级
						$("#city").find("option").each(function(){
	    		     		if($(this).attr("value") == areaId02){
	    		     			$(this).attr("selected",true);
	    		     			$.ajax({
	    		   		         type: "post",
	    		   		      url:"/zsShop/person/getChildArea?id="+areaId02,
	    		   		         data: '',
	    		   		         dataType: "json",
	    		   				 async:false,
	    		   				 success:function(data) {
	    		   				 	var $li ='<select name="qu" class="select" id="qu" onchange="getqu(2);">';
	    		   				 		$li +='<option selected="selected" value="0">请选择</option>';
	    		   				 	if(data.result!='null'){
	    		   					 	var jsonObj = eval("(" + data.result + ")");
	    		   						for ( var i = 0; i < jsonObj.length; i++) {
	    		   							$li += '<option value='+jsonObj[i].id+'>'+jsonObj[i].areaName+'</option>'
	    		   						}
	    		   				 	}
	    		   				 	$li += "</select>";
	    		   					$("#spanqu").append($li);
	    		   					//选择第三级
	    		   					$("#qu").find("option").each(function(){
	    		   						if($(this).attr("value") == area03){
	    		   							$(this).attr("selected",true);
	    		   						}
	    		   					});
	    		   				}
	    		   		 	});
	    		     		}
	    		     	});
					}
		     	});
			}
		});
	}
