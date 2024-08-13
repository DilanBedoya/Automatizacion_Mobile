@Tests
Feature: AppDemo Test

  @TestCarrito
  Scenario Outline: Ingreso a la aplicación
    Given estoy en la aplicación de SauceLabs
    And valido que carguen correctamente los productos en la galería
    When agrego <UNIDADES> del siguiente producto "<PRODUCTO>"
    Then valido el carrito de compra actualice correctamente

    Examples:
      | PRODUCTO                | UNIDADES |
      | Sauce Labs Bolt T-Shirt | 1        |
      | Sauce Labs Backpack     | 1        |
      | Sauce Labs Bike Light   | 2        |


  @TestOrden
  Scenario: Ordenar de manera ascendente según el precio
    Given me ubico en la aplicación de SauceLabs
    And ingreso al menu de ordenamiento
    And ordeno de forma ascendente
    Then valido que carguen correctamente los productos


  @TestLogin
  Scenario: Login exitoso
    Given me encuentro en la aplicación de SauceLabs
    And voy al menú de Login
    When ingreso mi usuario "bod@example.com" y clave "10203040"
    And hago clic en login
    Then valido el inicio de sesión