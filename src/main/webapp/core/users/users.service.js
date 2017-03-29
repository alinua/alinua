angular.
  module('core.users').
  factory('Users', ['$resource',
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
