Feature: funcionalidad de login
@testCase_1 @rutaCritica
Scenario: Validar login
Given abrir el navegador en la url "https://practicetestautomation.com/practice-test-login/"
And ingresar el usuario "student"
And ingresar la pass "Password123"
When presiono el boton Submit
Then se valida el mensaje de login exitoso "Logged In Successfully"

 #casos negativos de login en un soloscenario outline
@testCase_2 @rutaCritica
Scenario Outline: Validar login negativo
Given abrir el navegador en la url "https://practicetestautomation.com/practice-test-login/"
And ingresar el usuario "<usuario>"
And ingresar la pass "<password>"
When presiono el boton Submit
Then se valida el mensaje "<mensaje>"

Examples:
  | usuario | password    | mensaje                   |
  | wrong    | Password123 | Your username is invalid! |
  | student  | wrongPass   | Your password is invalid! |


















