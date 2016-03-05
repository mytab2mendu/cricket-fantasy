'use strict';

var app = angular.module('app', ['ngRoute', 'userControllers']);

app.config(['$routeProvider', function($routeProvider) {
    $routeProvider.when('/', {
        templateUrl: 'partials/login.html'
    });
}]);
