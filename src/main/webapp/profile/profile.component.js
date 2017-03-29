angular
	.module('profile')
	.component('profile', {
		templateUrl: 'profile/profile.html',
		controller: ['$http','Profile', function ProfileController($http, Profile) {
			var self = this;
			self.loading = true;
			/* Une fois que l'url Back sera ok, il faudra utiliser le service
				this.profile = Profile.query();
			*/
	        $http.get('profile/monProfile.json')
	            .then(function(response){                                    
	                self.profile = response.data;
	                self.loading = false;
	            }, function(response){                                   
	            	// Traitement de l'erreur
	            	alert(response);
		            self.loading = false;
	            })
	        ;
		}]	
	});
