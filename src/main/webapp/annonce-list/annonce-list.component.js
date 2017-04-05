angular
	.module('annonceList')
	.component('annonceList', {
		templateUrl: 'annonce-list/annonce-list.html',
		/**
		 * Controller gérant l'affichage des annonces.
		 * @param $http		ressource permettant l'appel $http
		 * @param Annonce	service dans core/annonce permettant la gestion des annonces avec le back
		 */
		controller: ['$http','Annonce', function AnnonceListController($http, Annonce) {
			// Récupération dans une variable de this pour y accèder dans les fonctions
			var self = this;

			// Chargement en attendant les données
			self.loading = true;

			/**
			 * Fonction récupérant les annonces par le fichier json
			 * Une fois que l'url Back sera ok, il faudra utiliser le service
			 * this.annonces = Annonce.query();
			 */
	        $http.get('annonce-list/MyAnnounce.json')
	            .then(function(response){ 
					// En cas de succes                                   
	                self.annonces = response.data;
	                self.loading = false;
	            }, function(response){  
	            	// Traitement de l'erreur
	            	alert(response);
		            self.loading = false;
	            })
	        ;
		}]	
	});
