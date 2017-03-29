angular.
  module('core.profile').
  factory('Profile', ['$resource',
    /**
     * Service gérant l'accès aux profils depuis l'API (back)
     */
    function($resource) {
      return $resource('profile/:profileId.json', {}, {
        query: {
          method: 'GET',
          params: {profileId: 'profile'},
          isArray: true
        }
      });
    }
  ]).
  factory('ProfilsChomeurs', ['$resource',
    /**
     * Service gérant l'accès aux profils étant en recherche d'emploi depuis l'API (back)
     */
    function($resource) {
      return $resource('profilsChomeurs/:id.json', {}, {
        query: {
          method: 'GET',
          params: {id: 'profile'},
          isArray: true
        }
      });
    }
  ]);
