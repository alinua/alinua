angular
	.module('homePage')
	.component('homePage', {
		templateUrl: 'home-page/home-page.html',
		controller: function HomeController() {
			self = this;
			
			self.bandeau = true;		
			self.closeBandeau = function () {
				self.bandeau = false;
			}
		
		}	
	});
