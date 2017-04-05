angular
	.module('profile')
	.component('profile', {
		templateUrl: 'profile/profile.html',
		/**
		 * Controlleur gérant l'affichage d'un profil publique
		 * @param $http		ressource permettant l'appel $http
		 * @param Profile	service dans core/profile permettant la gestion des profils avec le back
		 */
		controller: ['$http','Profile', function ProfileController($http, Profile) {
			// Récupérer this dans la variable self
			var self = this;

			// Afficher un chargement en attendant les données
			self.loading = true;

			/* Une fois que l'url Back sera ok, il faudra utiliser le service
				this.profile = Profile.query();
			*/
			/**
			 * Méthode de récupération des informations du profil depuis un fichier json
			 * Appelée au chargement de la page
			 * @param profile/monProfile.json	fichier contenant les informations du profil
			 */
	        $http.get('profile/monProfile.json')
	            .then(function(response){
					 // En cas de succès de lecture du fichier
	                self.profile = response.data;
	                self.loading = false;
	            }, function(response){
	            	// En cas d'erreur de lecture du fichier
	            	alert(response);
		            self.loading = false;
	            })
	        ;
		}]	
	});
