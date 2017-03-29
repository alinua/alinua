/**
 * Module de connection LinkedIn
 **/
angular
	.module('login')
	.component('login', {
		templateUrl: 'login/login.html',
		/**
		 * Controller gérant l'affichage des annonces.
		 * @param $scope				
		 * @param $auth		
		 * @param $location		
		 * @param $http			ressource permettant l'appel $http	
		 * @param $window	
		 */
		controller: function LoginController($scope,$auth,$location,$http,$window) {
			$scope.authenticate = function(provider) {
			       $window.open('https://www.linkedin.com/oauth/v2/authorization?response_type=code&client_id=775n9ttoxg45s6&redirect_uri=http%3A%2F%2Flocalhost%2Falinua%2F&state=DCEeFWf45A53sdfKef424', "popup", "width=400,height=600,left=10,top=150");
			};
		}	
	});
