angular.
  module('core.profile').
  factory('Profile', ['$resource',
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
