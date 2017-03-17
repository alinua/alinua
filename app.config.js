angular
	.module('alinua')
	.config(['$locationProvider','$routeProvider' ,function($locationProvider, $routeProvider){
		$locationProvider.hashPrefix('!');
		$routeProvider
		    .when('/', {
		        template: '<home-page></home-page>',
		    })  
		    .when('/annonces', {
		        template: '<annonce-list></annonce-list>',
		    })
		    .otherwise({redirectTo : '/'})
		;    
	}]);
