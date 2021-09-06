#Esta es una nueva pagina
Feature: Ingresar a la web administrativa de llu

  Scenario: Ingresar a la web administrativa con credenciales validas como Administrador

    Given Victor ingresa a la web
    When Victor ingresa el usuario: fcortez@solera.pe y el password: admin
    And click en el boton Acceder
    Then Victor deberia ingresar a la web y ver el Modulo Usuario

  Scenario: Ingresar a la web administrativa con credenciales validas como Picker

    Given Victor ingresa a la web
    When Victor ingresa el usuario: kaylas@solera.pe y el password: 1234
    And click en el boton Acceder
    Then Victor deberia ingresar a la web y ver el Modulo Picking

  Scenario: Ingresar a la web administrativa con credenciales validas como Delivery

    Given Victor ingresa a la web
    When Victor ingresa el usuario: vmonzon@solera.pe y el password: 58926348
    And click en el boton Acceder
    Then Victor deberia ingresar a la web y ver el Modulo Delivery