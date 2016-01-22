/*
 * This file is part of huborcid.
 *
 * huborcid is free software: you can redistribute it and/or modify
 * it under the terms of the GNU Affero General Public License as published by
 * the Free Software Foundation, either version 3 of the License, or
 * (at your option) any later version.
 *
 * huborcid is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU Affero General Public License for more details.
 *
 * You should have received a copy of the GNU Affero General Public License
 * along with huborcid.  If not, see <http://www.gnu.org/licenses/>.
 */
'use strict';

angular.module('huborcidApp')
    .config(function ($stateProvider) {
        $stateProvider
            .state('resultOrcidWork', {
                parent: 'entity',
                url: '/resultOrcidWork',
                data: {
                    roles: ['ROLE_USER'],
                    pageTitle: 'huborcidApp.resultOrcidWork.home.title'
                },
                views: {
                    'content@': {
                        templateUrl: 'scripts/app/entities/resultOrcidWork/resultOrcidWorks.html',
                        controller: 'ResultOrcidWorkController'
                    }
                },
                resolve: {
                    translatePartialLoader: ['$translate', '$translatePartialLoader', function ($translate, $translatePartialLoader) {
                        $translatePartialLoader.addPart('resultOrcidWork');
                        return $translate.refresh();
                    }]
                }
            })
            .state('resultOrcidWorkDetail', {
                parent: 'entity',
                url: '/resultOrcidWork/:id',
                data: {
                    roles: ['ROLE_USER'],
                    pageTitle: 'huborcidApp.resultOrcidWork.detail.title'
                },
                views: {
                    'content@': {
                        templateUrl: 'scripts/app/entities/resultOrcidWork/resultOrcidWork-detail.html',
                        controller: 'ResultOrcidWorkDetailController'
                    }
                },
                resolve: {
                    translatePartialLoader: ['$translate', '$translatePartialLoader', function ($translate, $translatePartialLoader) {
                        $translatePartialLoader.addPart('resultOrcidWork');
                        return $translate.refresh();
                    }]
                }
            });
    });