angular
	.module('signUp')
	.component('signUp', {
		templateUrl: 'sign-up/sign-up.html',
		/**
		 * Controlleur gérant l'inscription
		 */
		controller: function SignUpController($scope,$auth,$location,$http,$window) {
			$scope.authenticate = function(provider) {
			       $window.open('https://www.linkedin.com/oauth/v2/authorization?response_type=code&client_id=775n9ttoxg45s6&redirect_uri=http%3A%2F%2Flocalhost%2Falinua%2F&state=DCEeFWf45A53sdfKef424', "popup", "width=400,height=600,left=10,top=150");
			};
			
			// Récupérer this dans la variable self
			var self = this;
			
			// Affichage par défaut de l'étudiant
			self.tab = "etudiant";
			self.isEtudiant = true;

			/**
			 * Fonction qui gère l'inscription en tant qu'étudiant
			 */
			$scope.etudiant = function() {
				self.tab = "etudiant";
				self.isEtudiant = true;
			};
			
			/**
			 * Fonction qui gère l'inscription en tant qu'entreprise
			 */
			$scope.entreprise = function() {
				self.tab = "entreprise";
				self.isEtudiant = false;
			};
		}	
	});
