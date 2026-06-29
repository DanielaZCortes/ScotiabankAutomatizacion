@MasSueldo
Feature: Más sueldo
  Scenario:Validar formulario unete a Scotia
    Given abrir el navegador en la url "https://www.scotiabankchile.cl/mas-sueldo"
    When ingreso al menu Mas Sueldo
    And hago clic en el boton "Unete a Scotia"
    Then verifico que se muestre el formulario de ingreso
    And ingreso un RUT "12345678-9"
    And ingreso el numero de serie "123456789"
    And ingreso la renta líquida "1000000"
    And selecciono la nacionalidad
    And selecciono la situacion laboral
    And selecciono la ocupacion
    And ingreso un referido opcional "12345678-9"
    When hago click en el enlace AcuerdodePrivacidad
    And hago clic en el boton Autorizar y Continuar
    Then verifico que se muestre el mensaje "Algunos datos presentan problemas"
    When ingreso un RUT invalido
    Then verifico que se muestre el mensaje "Ingresa un RUT valido"
    And verifico que el boton Continuar permanezca deshabilitado, hasta que se ingresen datos validos.
    When hago clic en el icono de ayuda de Renta Liquida
    Then verifico que se muestre el mensaje "¿No tienes renta liquida?"
    And  verifico que se muestre el texto "Si no tienes un sueldo formal,ingresa tu gasto promedio en movilizacion y alimentacion."
    When hago clic en el ícono informativo del numero de serie
    Then verifico que se muestre la información del numero de serie
    When hago clic en el enlace Acuerdo de privacidad
    Then verifico que se muestre el acuerdo de privacidad

  @caso2
  Scenario:Validar todos los beneficios
    Given abro el navegador en la url "https://www.scotiabankchile.cl/mas-sueldo"
    When ingreso al menú Mas Sueldo
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
    And verifico que se muestren los beneficios para clientes con tarjeta de credito
    And verifico que se muestren los beneficios para clientes sin tarjeta de credito


  @caso4
  Scenario: Revisar la informacion de los planes disponibles
    Given abro el navegador en la url "https://www.scotiabankchile.cl/planes-cuenta-corriente"
    When ingreso al menu Mas Sueldo
    And selecciono la opcion "Conoce los Planes"
    Then verifico que se muestre la pagina de planes
    And verifico el titulo "Conoce nuestros planes"
    And verifico el texto informativo de los planes
    And reviso la informacion del Plan Futuro
    And reviso la informacion del Plan Scotiabank
    And reviso la informacion del Plan Scotiabank Plus
    And verifico que se muestre el boton "Hazte Cliente aqui"
    And verifico el mensaje informativo al final de la pagina










