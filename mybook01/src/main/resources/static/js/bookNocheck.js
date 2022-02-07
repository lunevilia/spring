/**
 * 
 */
 
 $(document).ready(function(){
	$('#bookNoCheck').on("click", function(){

		var bookNo = $('#bookNo').val();
		alert("확인");
		$.ajax({
                type : "post",           
                url : "bookCheck",      
                data:{"bookNo" :bookNo},
				dataType:'text',        
        	success:function(result){
				if(result == "use"){
					alert("사용할 수 있는 서적번호입니다.");
				}else{
				    alert("사용할 수 없는 서적번호입니다.");
			 	}
			},
			error:function(data, textStatus){
				alert("전송 실패" + data + textStatus);
			}
        });
		
	})
});