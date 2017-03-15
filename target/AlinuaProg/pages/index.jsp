<html>
<head>



  <script src="https://code.jquery.com/jquery-1.10.2.js"></script>

</head>
<body>
<h2>INDEX.JSP!</h2>


<button id="butt">Click me</button>

<p id="demo">test</p>

<script>
$(document).ready(function(){
	
	console.log("coucou");
	
    $("#butt").click(function(){
    	document.getElementById("demo").innerHTML = "click !";
    	
    	$.ajax({
    	   	//url: 'UserSpringAction',
    	   	url: 'UserS',
    		type: 'POST',
    		data : 'variableAjax='+"coucouAjx",
    		dataType: 'json',
    		success: function (recupJson) {
    			console.log("recupJson "+recupJson);
    			document.getElementById("demo").innerHTML = recupJson;

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

