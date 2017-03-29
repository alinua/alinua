angular
	.module('alinua')
	.config(['$locationProvider','$routeProvider','$authProvider' ,function($locationProvider, $routeProvider, $authProvider){
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
		    .when('/login', {
		        template: '<login></login>',
		    })
		    .when('/users', {
		        template: '<user-list></user-list>',
		    })
		    .when('/profile', {
                template: '<profile></profile>',
            })
		    .otherwise({redirectTo : '/erreur404'});
	}]);
