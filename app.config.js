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
		    .when('/profile', {
                template: '<profile></profile>',
            })	    
		    .otherwise({redirectTo : '/erreur404'})
	    ;
		    
		$authProvider.linkedin({
			clientId: '775n9ttoxg45s6'
		});
		
		$authProvider.httpInterceptor = function() { return true; },
		$authProvider.withCredentials = false;
		$authProvider.tokenRoot = null;
		$authProvider.baseUrl = '/';
		$authProvider.loginUrl = '/auth/login';
		$authProvider.signupUrl = '/auth/signup';
		$authProvider.unlinkUrl = '/auth/unlink/';
		$authProvider.tokenName = 'token';
		$authProvider.tokenPrefix = 'satellizer';
		$authProvider.tokenHeader = 'Authorization';
		$authProvider.tokenType = 'Bearer';
		$authProvider.storageType = 'localStorage';
		
		// LinkedIn
		$authProvider.linkedin({
			url: '/auth/linkedin',
			authorizationEndpoint: 'https://www.linkedin.com/uas/oauth2/authorization',
			redirectUri: window.location.origin+'/',
			requiredUrlParams: ['state'],
			scope: ['r_emailaddress'],
			scopeDelimiter: ' ',
			state: 'STATE',
			oauthType: '2.0',
			popupOptions: { width: 527, height: 582 }
		});
	}]);
