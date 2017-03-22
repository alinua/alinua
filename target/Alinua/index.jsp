<html>
<head>
  <script src="https://code.jquery.com/jquery-1.10.2.js"></script>
</head>
<body>
<h2>INDEX.JSP!</h2>


<button id="butt">Click me</button>
<button id="butt2">Click me</button>

<p id="demo">test</p>

<script>
$(document).ready(function(){
	
	console.log("coucou");
	
    $("#butt").click(function(){
    	document.getElementById("demo").innerHTML = "click !";
    	
    	$.ajax({
    	   	//url: 'UserSpringAction',
    	   	url: 'springAction',
    		type: 'POST',
    		dataType: 'json',
    		success: function (recupJson) {
    			document.getElementById("demo").innerHTML = "clicked ";

    		},
    		error: function(){
    			console.log("erreur");
    			//alert("ERROR");
    		}
    		
    		
    	
    	});
    	
   
    });
    
    
    
    $("#butt2").click(function(){
    	document.getElementById("demo").innerHTML = "click2 !";
    	
    	$.ajax({
    	   	//url: 'UserSpringAction',
    	   	url: '/users/execute2',
    		type: 'GET',
    		dataType: 'json',
    		success: function (recupJson) {
    			document.getElementById("demo").innerHTML = "clicked2 ";

    		},
    		error: function(){
    			console.log("erreur");
    			//alert("ERROR");
    		}
    		
    		
    	
    	});
    	
   
    });
    
    
    
});
</script>






</body>
</html>

