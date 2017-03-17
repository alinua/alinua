angular
	.module('homePage')
	.component('homePage', {
		templateUrl: 'home-page/home-page.html',
		controller: function HomeController() {
			$scope.title = "Bienvenue";
		}	
	});
