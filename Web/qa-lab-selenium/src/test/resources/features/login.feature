#language: es
@testfeature
Característica: Pagina Platanitos
  Automatización de la pagina platanitos


  Escenario: Agregar Producto a Carrito
    Dado que me encuentro en la página de Platanitos
    Y le doy al boton cuenta
    Y inicio sesión con las credenciales usuario: "ricardoJraf1999@gmail.com" y contraseña: "Prueba123@" en Platanitos
    Y verifico que estoy dentro de la cuenta
    Cuando presiono las ofertas
    Y seleciono un producto
    Y agrego al carrito el producto
    Entonces doy click al al icono del carrito
    Y verifico que este mi producto agregado
