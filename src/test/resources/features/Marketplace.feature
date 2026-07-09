@Marketplace
Feature: Comprar producto en Audiomusica
  Scenario: Buscar y agregar un producto
    Given abro el navegador en la url "https://www.audiomusica.com"
    When hago clic en el buscador
    And escribo "ARX"
    And presiono Enter
    Then valido que existan productos
    When selecciono el primer producto
    And agrego el producto al carrito
    Then valido que el carrito tenga el producto
 # @TC-002
  #Scenario: Navegación por categoría
   # Given abro el navegador en la url "https://www.audiomusica.com"
    #When selecciono la categoría "Guitarras"
    #Then valido que estoy en la categoría

  @TC-005
  Scenario: Buscar un producto inexistente
    Given abro el navegador en la url "https://www.audiomusica.com"
    When hago clic en el buscador
    And escribo "zzzdddd123"
    And presiono Enter
    Then valido que no existan productos

  @TC-006
  Scenario: Agregar producto al carrito
    Given abro el navegador en la url "https://www.audiomusica.com"
    When hago clic en el buscador
    And escribo "ARX"
    And presiono Enter
    Then valido que existan productos
    When selecciono el primer producto
    And agrego el producto al carrito
    Then valido que el producto esté en el carrito

  @TC-007
  Scenario: Agregar múltiples unidades
    Given abro el navegador en la url "https://www.audiomusica.com"
    When hago clic en el buscador
    And escribo "ARX"
    And presiono Enter
    Then valido que existan productos
    When selecciono el primer producto
    And agrego el producto al carrito
    And ingreso al carrito
    And aumento la cantidad del producto
    Then valido que la cantidad sea 2
    And valido que el subtotal se actualice

  @TC-008
  Scenario: Eliminar producto del carrito
    Given abro el navegador en la url "https://www.audiomusica.com"
    When hago clic en el buscador
    And escribo "ARX"
    And presiono Enter
    Then valido que existan productos
    When selecciono el primer producto
    And agrego el producto al carrito
    And ingreso al carrito
    When elimino el producto
    Then valido que el carrito quede vacío

  @TC-009
  Scenario: Carrito persistente
    Given abro el navegador en la url "https://www.audiomusica.com"
    When hago clic en el buscador
    And escribo "ARX"
    And presiono Enter
    Then valido que existan productos
    When selecciono el primer producto
    And agrego el producto al carrito
    And ingreso al carrito
    When refresco la página
    Then valido que el producto permanezca en el carrito

  @TC-010
  Scenario: Login exitoso
    Given abro el navegador en la url "https://www.audiomusica.com"
    When ingreso al login
    And escribo el correo "correo@gmail.com"
    And escribo la contraseña "Password123"
    And presiono el botón Entrar
    Then valido que el usuario inició sesión

  @TC-013
  Scenario: Login inválido
    Given abro el navegador en la url "https://www.audiomusica.com"
    When ingreso al login
    And escribo el correo "lesliedelabarrera3@gmail.com"
    And escribo la contraseña "PasswordIncorrecta123"
    And presiono el botón Entrar
    Then valido que aparece el mensaje de error

    And valido que el usuario permanezca sin sesión


  @TC-014
  Scenario: Inicio de Checkout
    Given abro el navegador en la url "https://www.audiomusica.com"
    When hago clic en el buscador
    And escribo "ARX"
    And presiono Enter
    Then valido que existan productos
    When selecciono el primer producto
    And agrego el producto al carrito
    And ingreso al carrito
    And presiono completar la compra
    Then valido que ingreso al checkout

  @TC-019
  Scenario: Validar campos obligatorios del checkout
    Given abro el navegador en la url "https://www.audiomusica.com"
    When hago clic en el buscador
    And escribo "ARX"
    And presiono Enter
    Then valido que existan productos
    When selecciono el primer producto
    And agrego el producto al carrito
    And presiono proceder al pago
    And presiono continuar sin completar los datos
    Then valido mensaje de campos obligatorios


  @TC-018
  Scenario: Validar formato de correo
    Given abro el navegador en la url "https://www.audiomusica.com"
    When hago clic en el buscador
    And escribo "ARX"
    And presiono Enter
    Then valido que existan productos
    When selecciono el primer producto
    And agrego el producto al carrito
    And presiono proceder al pago
    And escribo el correo "correo@"
    And presiono continuar
    Then valido mensaje de correo invalido

