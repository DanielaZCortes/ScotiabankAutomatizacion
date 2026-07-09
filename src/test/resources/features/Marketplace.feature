@Marketplace
Feature: Comprar producto en Audiomusica

  @TC-001
Scenario Outline: Buscar y agregar un producto
Given abro el navegador en la url "https://www.audiomusica.com"
When hago clic en el buscador
And escribo "<producto>"
And presiono Enter
Then valido que existan productos
When selecciono el primer producto
And agrego el producto al carrito
Then valido que el carrito tenga el producto
    Examples:
| producto             |
| ARX                  |
| guitarra electrica   |



  @TC-005
  Scenario Outline: Buscar un producto inexistente
    Given abro el navegador en la url "https://www.audiomusica.com"
    When hago clic en el buscador
    And escribo "<producto>"
    And presiono Enter
    Then valido que no existan productos
    Examples:
      | producto    |
      | zzzdddd123  |
      | qwerty98765 |
      | abcxyz000   |

  @TC-006
  Scenario Outline: Agregar producto al carrito
    Given abro el navegador en la url "https://www.audiomusica.com"
    When hago clic en el buscador
    And escribo "<producto>"
    And presiono Enter
    Then valido que existan productos
    When selecciono el primer producto
    And agrego el producto al carrito
    Then valido que el producto esté en el carrito

    Examples:
      | producto            |
      | ARX                 |
      | guitarra electrica  |
  @TC-007
  Scenario Outline: Agregar múltiples unidades
    Given abro el navegador en la url "https://www.audiomusica.com"
    When hago clic en el buscador
    And escribo "<producto>"
    And presiono Enter
    Then valido que existan productos
    When selecciono el primer producto
    And agrego el producto al carrito
    And ingreso al carrito
    And aumento la cantidad del producto
    Then valido que la cantidad sea 2
    And valido que el subtotal se actualice
    Examples:
      | producto            |
      | ARX                 |
      | guitarra electrica  |

  @TC-008
  Scenario Outline: Eliminar producto del carrito
    Given abro el navegador en la url "https://www.audiomusica.com"
    When hago clic en el buscador
    And escribo "<producto>"
    And presiono Enter
    Then valido que existan productos
    When selecciono el primer producto
    And agrego el producto al carrito
    And ingreso al carrito
    When elimino el producto
    Then valido que el carrito quede vacío
    Examples:
      | producto            |
      | ARX                 |
      | guitarra electrica  |

  @TC-009
  Scenario Outline: Carrito persistente
    Given abro el navegador en la url "https://www.audiomusica.com"
    When hago clic en el buscador
    And escribo "<producto>"
    And presiono Enter
    Then valido que existan productos
    When selecciono el primer producto
    And agrego el producto al carrito
    And ingreso al carrito
    When refresco la página
    Then valido que el producto permanezca en el carrito
    Examples:
      | producto            |
      | ARX                 |
      | guitarra electrica  |

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
  Scenario Outline: Inicio de Checkout
    Given abro el navegador en la url "https://www.audiomusica.com"
    When hago clic en el buscador
    And escribo "<producto>"
    And presiono Enter
    Then valido que existan productos
    When selecciono el primer producto
    And agrego el producto al carrito
    And ingreso al carrito
    And presiono completar la compra
    Then valido que ingreso al checkout

    Examples:
      | producto            |
      | ARX                 |
      | guitarra electrica  |

  @TC-018
  Scenario Outline: Validar formato de correo
    Given abro el navegador en la url "https://www.audiomusica.com"
    When hago clic en el buscador
    And escribo "<producto>"
    And presiono Enter
    Then valido que existan productos
    When selecciono el primer producto
    And agrego el producto al carrito
    And presiono proceder al pago
    And escribo el correo "correo@"
    And presiono continuar
    Then valido mensaje de correo invalido
    Examples:
      | producto            |
      | ARX                 |
      | guitarra electrica  |


  @TC-019
  Scenario Outline: Validar campos obligatorios del checkout
    Given abro el navegador en la url "https://www.audiomusica.com"
    When hago clic en el buscador
    And escribo "<producto>"
    And presiono Enter
    Then valido que existan productos
    When selecciono el primer producto
    And agrego el producto al carrito
    And presiono proceder al pago
    And presiono continuar sin completar los datos
    Then valido mensaje de campos obligatorios
    Examples:
      | producto            |
      | ARX                 |
      | guitarra electrica  |

