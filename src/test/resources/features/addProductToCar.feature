Feature: Agregar producto
  Scenario: Agregar producto de la pagina al carrito

    Given que el usuario ingresa a la pagina web
    When el usuario ingresa al menu
    And Busca la categoria y subcategoria
    And Selecciona el producto
    And Dar click en el boton de agregar al carrito
    Then Se podra visualizar el producto en el carrito de compras