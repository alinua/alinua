angular.
  module('core.annonce').
  factory('Annonce', ['$resource',
    /**
     * Service gérant l'accès aux annonces depuis l'API (back)
     */
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
