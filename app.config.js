angular
	.module('alinua')
	.config(['$locationProvider','$routeProvider' ,function($locationProvider, $routeProvider){
		$locationProvider.hashPrefix('!');
		$routeProvider
		    /*
		    .when('/', {
		        template: '<index></index>',
		    })        
		    .when('/annonces/:id', {
		        template: 'views/annonce.html',
		    })
		    */
		    .when('/annonces', {
		        template: '<annonce-list></annonce-list>',
		    })
		    .otherwise({redirectTo : '/annonces'})
		;    
	}]);
