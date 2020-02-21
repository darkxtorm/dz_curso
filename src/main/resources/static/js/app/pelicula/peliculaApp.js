var app = angular.module('peliculaModule',[])
    .controller('peliculaController', function($http, $scope, $window){
    //variable
        $scope.pelicula = {
            id: null,
            descripcion: null,
            categoria: null
        };

        $scope.peliculas = [];


        function list(){
            $http.get('/pelicula/list').then((response)=> {
                $scope.pelicula = response.data;
            });

        };


        $scope.add = (pelicula) => {
            $http.post('/pelicula/add', pelicula).then((response)=>{
                $scope.pelicula = {};
                list();
            })
        };

        $scope.selectEdit = (pelicula) =>{

                $scope.pelicula = pelicula;
        }

        $scope.edit = (pelicula) => {

            $http.put('/pelicula/update/' + pelicula.id, pelicula).then((response) => {
                list();
            });
        }
        $scope.delete = (pelicula)=>{
                console.log(pelicula);
                $http.delete('/pelicula/delete/' + pelicula.id).then((response)=>{
                   list();
                });
        }

        list();
    });