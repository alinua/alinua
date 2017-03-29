angular.
  module('core.annonce').
  factory('Annonce', ['$resource',
    function($resource) {
      return $resource('annonces/:annonceId.json', {}, {
        query: {
          method: 'GET',
          params: {annonceId: 'annonce'},
          isArray: true
        }
      });
    }
  ]);
