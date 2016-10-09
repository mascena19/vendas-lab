angular.module("vendas").controller("fornecedorCtrl", function ($scope, $http) {
		$scope.novoFornecedor = function (fornecedor) {
			$http.post("fornecedor/novo", fornecedor).success(function (resultadoDoResponse) {
				$scope.fornecedor = resultadoDoResponse;
			});
		};		
	});
