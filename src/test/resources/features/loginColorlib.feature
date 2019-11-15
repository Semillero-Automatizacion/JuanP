#Author: Juan Olivares
#Feature: para el inicio de session aplicacion Colorlib
@tag
Feature: Inicio de sesion


  @tag1
  Scenario: Inicio de sesion Colorlib
    Given Ingreso al navegador
    When Ingresar usuario "demo"
    And Ingresar contraseña "demo"
    And Click en boton ingresar
    Then se valida el ingreso correcto
