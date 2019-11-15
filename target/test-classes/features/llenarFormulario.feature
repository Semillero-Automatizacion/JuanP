#Author: Juan Olivares
#Creacion de formulario

@tag
Feature: Validacion de formulario ColorLib
 
  @tag2
  Scenario Outline: Caso100_Validacion formulario
       Given Ingreso al navegador
    	And Ingresar sesion <usuario><contrasena>
    	When diligencio formulario <required><sport><sport2><nurl><contra><number><ip><field><date1><date2>

    Examples: 	
      | usuario | contrasena  | required			 | sport  | sport2  | nurl 			  			| contra 		 | number			 | field 		 | ip 	 | date1 				| date2 			 |
  		| "demo"  | "demo"      | "123requisito" | "Golf" | "Tennis"| "www.youtube.com" | "passw0rd" | "-3849.354" | "0123456" | "103" | "2016-06-06" | "2012/01/13" |
      
