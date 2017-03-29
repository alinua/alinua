angular
	.module('carouselProfils')
	.component('carouselProfils', {
		templateUrl: 'carousel-profils/carousel-profils.html',
		/**
		 * Controller gérant l'affichage en carousel des profils.
		 * @param $http				ressource permettant l'appel $http
		 * @param ProfilsChomeurs	service dans core/profile permettant la gestion des profiles en recherche d'emploi
		 */
		controller: ['$http','ProfilsChomeurs', function CarouselProfilsController($http, ProfilsChomeurs) {
			// Récupération dans une variable de this pour y accèder dans les fonctions
			var self = this;

			// Chargement en attendant les données
			self.loading = true;

			/**
			 * Fonction récupérant les profiles par le fichier json
			 * Une fois que l'url Back sera ok, il faudra utiliser le service
			 * this.profils = ProfilsChomeurs.query();
			 */
	        $http.get('carousel-profils/profils.json')
	            .then(function(response){ 
					// En cas de succes                                    
	                self.profils = response.data;
	                self.loading = false;
	            }, function(response){                                   
	            	// Traitement de l'erreur
	            	alert(response);
		            self.loading = false;
	            })
	        ;
		}]	
	});
