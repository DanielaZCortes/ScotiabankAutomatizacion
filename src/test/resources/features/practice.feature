Feature: Practice Automation
@testCase_4
Scenario: TestExceptions
Given abrir el navegador en la url "https://practicetestautomation.com/practice/"
And ingresar el test exceptions
When presionar el boton Add
Then se valida mensaje de confirmacion


  @testCase_5
  Scenario: ElementNotInteractableException
    Given abrir el navegador en la url "https://practicetestautomation.com/practice/"
    And ingresar el test exceptions
    And presionar el boton Add
    When presionar el boton Save

