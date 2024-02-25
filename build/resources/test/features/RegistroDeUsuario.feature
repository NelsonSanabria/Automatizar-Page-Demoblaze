#language: es

Característica: Registro de usuario
  Yo como usuario quiero inscribirme en la página Demoblaze

  @RegistroExitoso
  Esquema del escenario: Registro de usuario exitoso
    Dado que el usuario abre la página de Demoblaze
    Y pulsar el boton de Acceso.
    Cuando el usuario ingresa la informacion de registro
      | Email   | Contraseña |  |  |
      | <email> | <Garma123>        |  |  |
    Entonces  verá el panel de Tienda de Productos Demoblaze
    Ejemplos:
      | email                       | Contraseña |  |  |
      | gamevehoxu-7813@yopmail.com | Garma123   |  |  |