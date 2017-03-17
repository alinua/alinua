angular
	.module('login')
	.component('login', {
		templateUrl: 'login/login.html',
		controller: function LoginController($scope,$auth) {
			$scope.authenticate = function(provider) {
			      $auth.authenticate(provider)
			      .then(function(data) {
			        alert('COUCOU');
			      	alert(data);
			      })
			      .catch(function(error) {
				if (error.error) {
				     // Popup error - invalid redirect_uri, pressed cancel button, etc.
				     alert("1"+error.error);
				   } else if (error.data) {
				     // HTTP response error from server
				     alert("2"+error.status);
				   } else {
				     alert("3"+error);
				   }
			      });
			};
		}	
	});
