'use strict';

var userServices = angular.module('userServices', []);

userServices.service('LoginService', function ($http) {
    return {
        login: function (user) {
            $http.post("user/login", user).success(function (user) {
                console.log(user);
            }).error(function (arg1, arg2, arg3) {

            });
        },
        register: function (user, callback) {
            $http.post("user/register", user).success(function (user) {
                callback();
            }).error(function (arg1, arg2, arg3) {

            });
        }
    }
});