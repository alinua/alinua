angular
	.module('homePage')
	.component('homePage', {
		templateUrl: 'home-page/home-page.html',
		/**
		 * Controller gérant l'affichage des annonces.
		 * @param $http		ressource permettant l'appel $http
		 * @param Annonce	service dans core/annonce permettant la gestion des annonces avec le back
		 */
		controller: function HomeController() {
			// Récupération dans une variable de this pour y accèder dans les fonctions
			var self = this;
			
			// Gestion du bandeau de présentation
			self.bandeau = true;
			// Fonction permettant de fermer le bandeau de présentation		
			self.closeBandeau = function () {
				self.bandeau = false;
			}
		}	
	});
