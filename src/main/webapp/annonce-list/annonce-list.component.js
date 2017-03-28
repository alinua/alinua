angular
	.module('annonceList')
	.component('annonceList', {
		templateUrl: 'annonce-list/annonce-list.html',
		controller: ['$http','Annonce', function AnnonceListController($http, Annonce) {
			var self = this;
			self.loading = true;
			/* Une fois que l'url Back sera ok, il faudra utiliser le service
				this.annonces = Annonce.query();
			*/
	        $http.get('annonce-list/MyAnnounce.json')
	            .then(function(response){                                    
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
