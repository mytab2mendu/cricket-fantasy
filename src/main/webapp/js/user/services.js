'use strict';

var userServices = angular.module('userServices', []);

userServices.service('LoginService', function ($http) {
    return {
        login: function (user) {
            var data = "username=amar&password=patel";
            var headers = {
                headers: {
                    "content-type": "application/x-www-form-urlencoded",
                    ignoreAuthModule: 'ignoreAuthModule'
                }
            };
            $http.post("user/authenticate", data, headers).success(function (user) {
                console.log("success login");
                callback(user);
            }).error(function (arg1, arg2, arg3) {
                console.log("fail login");
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