# Proyecto de Evaluación - Java I y II

## Descripción
Este proyecto es una aplicación de escritorio en Java que simula la gestión de un comercio y la compra de productos por un cliente. Implementa conceptos fundamentales de Java, incluyendo encapsulamiento, herencia, interfaces y estructuras de datos.

## Objetivo
Desarrollar una aplicación que permita:
- Gestionar productos en un almacén.
- Administrar clientes y sus compras.
- Aplicar descuentos automáticos según las condiciones del producto.
- Mostrar información estructurada de los productos y pedidos.

## Estructura del Proyecto
El proyecto está compuesto por las siguientes clases e interfaces:

### Interfaces
- `GestionProductos`: Define métodos para gestionar el stock y el precio de los productos.
- `GestionClientes`: Define métodos para gestionar la información del cliente y su carrito de compras.

### Clases Principales
- `Producto`: Implementa `GestionProductos` y maneja atributos como código, nombre, precio y stock.
- `Perecedero`: Extiende `Producto` y agrega la variable `diasCaducar`, afectando los descuentos.
- `NoPerecedero`: Extiende `Producto` y aplica descuentos específicos.
- `Persona`: Representa a una persona con nombre, DNI y dirección.
- `Cliente`: Implementa `GestionClientes`, permitiendo gestionar la información del cliente y su carrito.
- `Utilidades`: Contiene métodos estáticos para gestionar productos y realizar operaciones como agregar productos al carrito y mostrar inventario.
- `AppComercio`: Clase principal que orquesta la aplicación.

## Funcionalidades Principales
1. **Gestor de productos:**
    - Incrementar o disminuir stock.
    - Aplicar descuentos automáticos según el tipo de producto.
    - Mostrar información detallada del producto.

2. **Carrito de compras:**
    - Agregar productos al carrito.
    - Ordenar los productos en el carrito por precio de mayor a menor.
    - Calcular y mostrar el total del carrito.

3. **Gestor de pedidos:**
    - Enviar pedido con la información del cliente.
    - Actualizar stock tras la compra.

## Requisitos
- Java 8 o superior.
- IDE de desarrollo (Eclipse, IntelliJ IDEA, NetBeans, etc.).
- Conocimientos básicos de POO en Java.

## Instalación y Ejecución
1. Clonar este repositorio:
   ```bash
   git clone https://github.com/IsamarRB/AppComercio.git
   ```
2. Abrir el proyecto en tu IDE favorito.
3. Compilar y ejecutar `AppComercio.java`.

## Contribución
Si deseas mejorar este proyecto, puedes seguir estos pasos:
1. Realizar un fork del repositorio.
2. Crear una rama con tu mejora o corrección.
3. Hacer un pull request explicando los cambios.

## Autor
Desarrollado como parte del curso de Java I y II.

## Licencia
Este proyecto se distribuye bajo la licencia MIT. Puedes ver los detalles en el archivo `LICENSE`.

## Copyright
© 2025 Propiedad intelectual de Isamar Romero Bellorin. Todos los derechos reservados.

