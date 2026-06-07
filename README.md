# TecnoStore - Sistema de Venta de Celulares

TecnoStore es un sistema de consola desarrollado en Java para gestionar celulares, clientes, ventas, reportes, archivos y persistencia en base de datos MySQL.

El proyecto aplica Programación Orientada a Objetos, arquitectura MVC, colecciones, Stream API, JDBC, manejo de excepciones y patrones de diseño.

## Estructura del proyecto

```text
src/
├── main/
├── vista/
├── controlador/
├── servicio/
├── dao/
├── modelo/
├── util/
└── patron/

```md
## Descripción de paquetes

- `main`: contiene la clase principal que inicia la aplicación.
- `vista`: contiene los menús de consola.
- `controlador`: conecta las vistas con la lógica del sistema.
- `servicio`: contiene las reglas de negocio.
- `dao`: contiene las clases JDBC para MySQL.
- `modelo`: contiene las entidades del negocio.
- `util`: contiene validaciones, reportes, archivos e inicialización.
- `patron`: contiene el patrón Factory aplicado a celulares.

## Requisitos

- Java 17 o superior
- NetBeans, IntelliJ IDEA o Eclipse
- MySQL Server
- MySQL Connector/J agregado al proyecto
- Base de datos creada previamente

## Configuración de la base de datos

Crear la base de datos:

```sql
CREATE DATABASE tecnostore;
```

Configurar los datos de conexión en:

```text
dao/ConexionDB.java
```

Ejemplo:

```java
private static final String URL = "jdbc:mysql://localhost:3306/tecnostore";
private static final String USER = "root";
private static final String PASSWORD = "tu_password";
```

## Ejecución

1. Ejecutar la clase:

```text
main/Main.java
```

2. El sistema cargará automáticamente:
   - Clientes desde MySQL.
   - Celulares desde MySQL.
   - Ventas desde MySQL.

3. Navegar por los menús para gestionar la información.

## Funcionalidades

### Gestión de celulares

- Registrar celulares.
- Listar celulares.
- Actualizar precio y stock.
- Eliminar celulares sin ventas asociadas.
- Persistencia en MySQL.

### Gestión de clientes

- Registrar clientes.
- Listar clientes.
- Validación de correo electrónico.
- Persistencia en MySQL.

### Gestión de ventas

- Registrar ventas.
- Listar ventas.
- Control de stock disponible.
- Actualización automática de inventario.
- Persistencia en MySQL.

### Reportes

- Celulares con stock bajo.
- Top 3 celulares más vendidos.
- Ventas totales por mes.
- Generación de archivo:

```text
reporte_ventas.txt
```

### Persistencia

- Carga automática de datos desde MySQL al iniciar.
- Sincronización entre memoria y base de datos.

## Programación Orientada a Objetos (POO)

El proyecto aplica los siguientes conceptos de POO:

### Clases y objetos

- Celular
- Cliente
- Venta
- ItemVenta

### Encapsulamiento

Los atributos son privados y se accede a ellos mediante métodos públicos (getters y setters).

### Composición

Una venta está compuesta por uno o varios objetos `ItemVenta`.

### Enumeraciones

Se utiliza `CategoriaGama` para clasificar los celulares.

### Colecciones

Se utilizan estructuras `ArrayList` para almacenar clientes, celulares y ventas.

### Excepciones

Se utilizan excepciones para validar:

- Correos inválidos.
- Stock insuficiente.
- Clientes inexistentes.
- Celulares inexistentes.
- Eliminación de celulares con ventas asociadas.

## Patrones de Diseño Aplicados

### Singleton

Clase:

```text
ScannerManager
```

Se utiliza una única instancia compartida de `Scanner` para toda la aplicación.

### Factory Method

Clase:

```text
FactoryCelular
```

Se utiliza para centralizar la creación de objetos `Celular`.

## Tecnologías Utilizadas

- Java 8
- MySQL
- JDBC
- Stream API
- Lambda Expressions
- Arquitectura MVC
- Programación Orientada a Objetos
- Patrones de Diseño