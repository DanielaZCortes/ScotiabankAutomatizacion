@MasSueldo
Feature: Mas sueldo
  @caso1
  Scenario: Validar formulario Únete a Scotia
    Given abro el navegador en la url "https://www.scotiabankchile.cl"
    When ingreso al menu Mas Sueldo
    And hago clic en el boton "Únete a Scotia"
    Then verifico que se muestre el Formulario de Ingreso
    And ingreso un RUT "12345678-9"
    And ingreso el numero de serie "123456789"
    And ingreso la renta liquida "1000000"
    And selecciono la nacionalidad "Chile"
    And selecciono la situacion laboral "Cesante"
    And selecciono la ocupacion "Abogado"
    And ingreso un referido opcional "12345678-9"
    Then verifico que se muestre el acuerdo de privacidad
    When hago clic en el boton "Autorizar y Continuar"
    Then verifico que se muestre el mensaje "Algunos datos presentan problemas"



  @caso2
  Scenario: Validar todos los beneficios
    Given abro el navegador en la url "https://www.scotiabankchile.cl/mas-sueldo"
    And hago scroll hasta beneficios
    And despliego los beneficios
    Then verifico que se muestre el beneficio "Hasta 50.000 ScotiaPesos"
    And verifico que se muestre el beneficio "18 Cuotas Sin Interes"
    And verifico que se muestre el beneficio "50% extra en la acumulacion"
    And verifico que se muestre el beneficio "Beneficios en Inversiones"
    And verifico que se muestre el beneficio "Tasas Preferenciales:"
    And verifico que se muestre el beneficio "Seguro de Cesantia:"
    And verifico que se muestre el beneficio "Misiones ScotiaRewards:"

  @caso3
  Scenario: Revisar los beneficios que se muestran para clientes con y sin tarjeta de credito
    Given abro el navegador en la url "https://www.scotiabankchile.cl/mas-sueldo"
    When ingreso al menu Mas Sueldo
    Then visualizo la tabla de beneficios



  @MasSueldo
  @caso4
  Scenario Outline: Validar la informacion de los planes disponibles
    Given abro el navegador en la url "https://www.scotiabankchile.cl/planes-cuenta-corriente"
    When ingreso al menu Mas Sueldo
    And hago clic en la opcion "Conoce los Planes"
    Then verifico que se cargue la pagina de planes
    And valido el titulo "Conoce nuestros Planes"
    And valido el texto descriptivo de los planes
    Then valido el plan "<Plan>"
    And verifico que contenga "<Condicion1>"
    And verifico que contenga "<Condicion2>"
    And verifico que contenga "<Condicion3>"

    Examples:
      | Plan | Condicion1 | Condicion2 | Condicion3 |
      | Plan Futuro | Abono mensual | Inversiones en Depósito a plazo | 1 Pago Automático |
      | Plan Scotiabank | Abono mensual | Inversiones en DAP o FFMM | 3 Pagos Automático |
      | Plan Scotiabank Plus | Abono mensual | Inversiones en DAP o FFMM | 3 Pagos Automático |



