angular
	.module('alinua')
	.config(['$locationProvider','$routeProvider' ,function($locationProvider, $routeProvider){
		$locationProvider.hashPrefix('!');
		$routeProvider
		    .when('/', {
		        template: '<home-page></home-page>',
		    }) 
		    .when('/erreur404', {
		        template: '<erreur404></erreur404>',
		    }) 
		    .when('/annonces', {
		        template: '<annonce-list></annonce-list>',
		    })
		    .otherwise({redirectTo : '/erreur404'})
		;    
	}]);
