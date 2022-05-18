Feature: realizar la compra de productos
  Yo como usuario requiero realizar la compra de varios productos

  @scenario1
  Scenario: realizar la seleccion de productos
    Given el usuario debe estar en la aplicacion https://www.linio.com.co
    When el usuario ingresa la categoria y seccion
    And el usuario selecciona el producto y su cantidad "Super Mega Combo Azul Queen 160x190 Resortado Marshall" "3"
    Then el usuario da click para agregar al carrito
    And el usuario deberia ver el producto la cantidad y su valor

  @scenario2
  Scenario: validar producto seleccionado (carrito)
    Given el usuario debe estar en la aplicacion https://www.linio.com.co
    When el usuario ingresa la categoria y seccion
    And el usuario selecciona el producto y su cantidad "Super Mega Combo Azul Queen 160x190 Resortado Marshall" "3"
    Then el usuario da click para ir al carrito y eliminar el producto
    And  el usuario deberia ver un mensaje "No hay productos en tu carrito"
