angular
	.module('userList')
	.component('userList', {
		templateUrl: 'user-list/user-list.html',
		controller: ['$http', function userListController($http) {
			var self = this;
			self.loading = true;
	        $http.get('user-list/MyUsers.json')
	            .then(function(response){                                    
	                self.users = response.data;
	                self.loading = false;
	            }, function(response){                                   
	            	// Traitement de l'erreur
	            	alert(response);
		            self.loading = false;
	            })
	        ;
		}]	
	});
