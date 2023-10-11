# EJERCICIOS PATRONES DE DISEÑO

# Ejercicio 1: Sistema de Procesamiento de Pedidos en Línea

## Contenido
[Introducción](#introduccion)

[Tecnologias usadas](#tecnologias)

[Instalacion](#instalacion)

### <a name="introduccion"></a>
## Introducción

Teniendo en cuenta el ejercicio 1:
SPPL (Sistema de Procesamiento de Pedidos en Línea)
L@ llamaron para desarrollar un sistema de comercio electrónico para una tienda en línea que vende una variedad de productos, como electrónicos, ropa y productos alimenticios.
Cada tipo de producto tiene un proceso de procesamiento de pedidos ligeramente diferente debido a los requisitos únicos de cada categoría. Sin embargo, hay algunos pasos generales que se aplican a todos los tipos de productos, como la verificación de inventario, la facturación y la notificación al cliente.
El problema radica en la necesidad de implementar este sistema de procesamiento de pedidos con múltiples pasos, pero permitiendo variaciones específicas para cada tipo de producto. Además, también debes considerar la posibilidad de futuras expansiones en la variedad de productos y pasos adicionales en el proceso de procesamiento.
El patrón de diseño que escoja debe permitir manejar la complejidad de la variación en el proceso de procesamiento de pedidos, al tiempo que garantiza que los pasos generales sean consistentes para todos los tipos de productos. Recuerde que busca facilitar la extensión del sistema a medida que la tienda en línea crece y se diversifica.

A continuación encontrará un proyecto construido en Java , el cual es un Sistema de Procesamiento de Pedidos en Línea, en donde la compañía vende una viariedad de productos (electronivos, ropa y productos alimenticios), cada tipo de producto tiene un procesamiento de pedidos de a cuerdo a sus características existiendo pasos generales que se aplican a todos los tipos de productos y otros que no.
Dicho sistema permite visualizar mensajes durante el proceso de procesamiento del pedido segun validaciones en el stock de la cantidad solicitada del producto y demás validaciones según el tipo de producto.

En el proyecto mencionado, se usó el patrón de comportamiento Template Method.

Template Method es un patrón de diseño de comportamiento que define el esqueleto de un algoritmo en la superclase pero permite que las subclases sobrescriban pasos del algoritmo sin cambiar su estructura
https://refactoring.guru/es/design-patterns/template-method


### <a name="tecnologias"></a>
## Tecnologias usadas

* Java 21 (JDK 21)
    * [JDK Development Kit 21](https://www.oracle.com/co/java/technologies/downloads/#jdk21-windows)

### <a name="instalacion"></a>
## Instalacion

Para la istalación del proyecto:
-Clone el proyecto ejecutando el siguiente comando:
```bash
git clone git@github.com:angiekroll/patrones-diseno.git
```
- Abra el proyecto con el IDE de su preferencia
- Ejecute la clase principal "Main" del paquete "ejerciciouno".

