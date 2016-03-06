'use strict';

var userControllers = angular.module('userControllers', ['userServices']);

userControllers.controller('LoginCtrl', function ($scope, LoginService) {

    $scope.login = function () {
        console.log("going to login");
        LoginService.login($scope.user, function () {

        });
    }

});

userControllers.controller('SignUpCtrl', function ($scope, LoginService) {

    $scope.register = function () {
        LoginService.register($scope.user, function () {
            $scope.message = {
                type: "success",
                title: "Registered!",
                text: "Now you can login with registered username/password"
            };
        });
    }

});