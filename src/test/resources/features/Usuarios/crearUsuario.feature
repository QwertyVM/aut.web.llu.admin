Feature: Crear usuario Llu Administrador

  Background: Victor esta logeado como administrador
    Given Victor se encuentra logeado en la web

  Scenario Outline: Crear Usuario Perfil Administrador
    When Victor ingresa al modulo de creacion
    And El ingresa el detalle del formulario
      | name | lastname |doctype|docNumber|email|cellphone|profile|password | reppwd |
      | <name>   | <lname> |<doctype>|<docnumber>|<email>|<cellphone>|<profile>| <pwd> | <rpwd> |
    And click en el boton Crear Cuenta
    Then Victor deberia visualizar el mensaje de exito: EL usuario fue creado con exito
    Examples:
      | name | lname | doctype | docnumber | email | cellphone | profile | pwd | rpwd |
      | Ana | Monzon | DNI | 99988854 | anamonzon@gmail.com | 945658745 |Administrador| 1234 | 1234 |