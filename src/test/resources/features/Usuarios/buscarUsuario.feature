Feature: Buscar Usuario en Llu Administrador

  Background: Victor esta logeado como administrador
    Given Victor se encuentra logeado en la web

  Scenario: Buscar Usuario que ya este registrado previamente

    When Victor ingresa el numero de documento 74580649 del usuario a buscar
    And el hace click en  en el boton Buscar
    Then el deberia ver los usuarios que tengan el numero de documento 74580649

  Scenario: Buscar Usuario que NO este registrado

    When Victor ingresa el numero de documento 766013547 del usuario a buscar
    And el hace click en  en el boton Buscar
    Then el deberia visualizar el siguiente mensajde de error: No se encontraron resultados