angular.
  module('core.users').
  factory('Users', ['$resource',
    /**
     * Service gérant l'accès aux utilisateurs depuis l'API (back)
     */
    function($resource) {
      return $resource('users/:usersId.json', {}, {
        query: {
          method: 'GET',
          params: {usersId: 'users'},
          isArray: true
        }
      });
    }
  ]);
