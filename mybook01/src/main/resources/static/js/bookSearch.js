/**
 * 	bookSearch
 */
 
 
 $(document).ready(function(){
	$('#bookSearchFrm').on('submit', function(){
		event.preventDefault();
		alert("검색 시작");
		var formData = $(this).serialize();
		
		$.ajax({
			type:"post",
			url:"bookSearch",
			data:formData,  
			success:function(result){   // 컨트롤러에서 반환한 prdList를 result가 받음				
				$('#searchResultbox').html(result);			
			},
			error:function(data, textStatus){
				alert("전송 실패");
			}
		});
	});
});