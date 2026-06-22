Feature: Home negativo

  @testCase_3
  Scenario Outline: Validar home negativo
    Given abrir el navegador en la url " https://practicetestautomation.com/"
    And ingreso el nombre "<nombre>"
    And ingreso el correo "<email>"
    And presiono el boton "Get XPath cheat sheet"
    And ingreso "ABCD" en el campo CAPTCHA
    And presiono el boton "Get XPath cheat sheet"
    Then se valida el mensaje home "This field is required."
    Examples:
      | nombre  | email            |
      | Leslie  | leslie.leslie@gmail.com |