/**
 * Module de connection LinkedIn
 * 
 * Module de connection LinkedIn
 *
 **/
angular
	.module('signUp')
	.component('signUp', {
		templateUrl: 'sign-up/sign-up.html',
		controller: function SignUpController($scope,$auth,$location,$http,$window) {
			$scope.authenticate = function(provider) {
			       $window.open('https://www.linkedin.com/oauth/v2/authorization?response_type=code&client_id=775n9ttoxg45s6&redirect_uri=http%3A%2F%2Flocalhost%2Falinua%2F&state=DCEeFWf45A53sdfKef424', "popup", "width=400,height=600,left=10,top=150");
			};
			
			var self = this;
			
			$scope.etudiant = function() {
				self.tab = "etudiant";
				self.isEtudiant = true;
			};
			
			$scope.entreprise = function() {
				self.tab = "entreprise";
				self.isEtudiant = false;
			};
			
			
			self.tab = "etudiant";
			self.isEtudiant = true;
		}	
	});
