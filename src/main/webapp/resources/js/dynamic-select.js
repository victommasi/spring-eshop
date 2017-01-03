$(document).ready(function () {

	$.getJSON('/eshop/resources/json/estados_cidades.json', function (data) {

		var items = [];
		var options = '<option value=""> Select state </option>';	
		
		$.each(data, function (key, val) {
			options += '<option value="' + val.nome + '">' + val.nome + '</option>';
		});					
		$("#states").html(options);				
		
		$("#states").change(function () {				
		
			var options_cities = '';
			options_cities += '<option value=""> Select city </option>';
			var str = "";					
			
			$("#states option:selected").each(function () {
				str += $(this).text();
			});
			
			$.each(data, function (key, val) {
				
				if(val.nome == str) {	
					$.each(val.cities, function (key_city, val_city) {
						options_cities += '<option value="' + val_city + '">' + val_city + '</option>';
					});							
				}
			});

			$("#cities").html(options_cities);
			
		}).change();		
	
	});

});
