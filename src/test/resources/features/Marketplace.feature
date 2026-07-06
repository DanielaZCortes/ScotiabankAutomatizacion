@Marketplace
Feature: Comprar producto en Audiomusica
  Scenario: Buscar y agregar un producto
    Given abro el navegador en la url "https://www.audiomusica.com"
    When hago clic en el buscador
    And escribo "guitarra electrica"
    And presiono Enter
    Then valido que existan productos
    When selecciono el primer producto
    And agrego el producto al carrito
    Then valido que el carrito tenga el producto