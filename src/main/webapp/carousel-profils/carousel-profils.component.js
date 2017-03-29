angular
	.module('carouselProfils')
	.component('carouselProfils', {
		templateUrl: 'carousel-profils/carousel-profils.html',
		controller: ['$http','ProfilsChomeurs', function CarouselProfilsController($http, ProfilsChomeurs) {
			var self = this;
			self.loading = true;
			/* Une fois que l'url Back sera ok, il faudra utiliser le service
				this.profils = ProfilsChomeurs.query();
			*/
	        $http.get('carousel-profils/profils.json')
	            .then(function(response){                                    
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
