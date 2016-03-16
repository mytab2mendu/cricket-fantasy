'use strict';

var app = angular.module('app', ['ngRoute', 'userControllers']);

app.config(['$routeProvider', function ($routeProvider) {
    $routeProvider.when('/', {
        redirectTo: '/login',
    }).when('/home', {
        templateUrl: 'partials/home.html',
        controller: 'HomeCtrl'
    }).when('/login', {
        templateUrl: 'partials/login.html'
    }).otherwise('/');
}]);
