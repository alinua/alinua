angular
	.module('userList')
	.component('userList', {
		templateUrl: 'user-list/user-list.html',
		/**
		 * Controlleur gérant l'affichage de la liste des profils publiques
		 * @param $http		ressource permettant l'appel $http
		 */
		controller: ['$http', function userListController($http) {
			// Récupérer this dans la variable self
			var self = this;

			// Afficher un chargement en attendant les données
			self.loading = true;
			
			/**
			 * Méthode de récupération des informations des profils depuis un fichier json
			 * Appelée au chargement de la page
			 * @param user-list/MyUsers.json	fichier contenant les informations des profil
			 */
	        $http.get('user-list/MyUsers.json')
	            .then(function(response){
					 // En cas de succès de lecture du fichier
	                self.users = response.data;
	                self.loading = false;
	            }, function(response){
	            	// En cas d'erreur de lecture du fichier
	            	alert(response);
		            self.loading = false;
	            })
	        ;
		}]	
	});
