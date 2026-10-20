# Lección 2: Variables, tipos de datos y operadores

- **Duración estimada:** 5 minutos y 24 segundos
- **Herramienta:** OnlineGDB
- **Práctica:** `starter-files/lesson-02`

## Objetivo

Comprender qué son las variables en Java, identificar los tipos de datos básicos y utilizar operadores matemáticos para realizar cálculos y mostrar resultados en la consola.

**Indicaciones de producción:** Las marcas de tiempo son una propuesta de distribución y deben comprobarse con el video real. La sección **Pantalla** explica qué mostrar, escribir y resaltar. La sección **Narración** contiene el texto preparado para Camila, la voz virtual de Clipchamp. Los términos técnicos se escriben correctamente en el código, pero se adaptan fonéticamente en la narración.

---

### Escena 1 · 0:00–0:24 · Introducción y repaso

**Pantalla:**

Mostrar la tarjeta «Lección 2 de 7: Variables, tipos de datos y operadores».

Presentar brevemente el código «Hola, mundo!» de la lección anterior y su resultado en la consola.

**Narración:**

Bienvenido a la segunda lección de nuestro curso de Java. En la lección anterior aprendimos a mostrar mensajes en la consola. Hoy conoceremos las variables, los tipos de datos y los operadores matemáticos. Con ellos podremos guardar información y realizar nuestros primeros cálculos.

### Escena 2 · 0:24–0:54 · ¿Qué es una variable?

**Pantalla:**

Mostrar una caja con la etiqueta «edad» y el número 15 en su interior.

Animar el cambio del número 15 a 16. Resaltar el texto «Variable = caja con nombre».

**Narración:**

Una variable es como una caja donde podemos guardar información. Cada caja tiene una etiqueta que nos permite identificar su contenido. Por ejemplo, podemos tener una variable llamada edad, donde guardamos el número quince. Lo interesante es que ese valor puede cambiar. Si cumplimos años, podemos actualizarlo a dieciséis sin crear otra variable.

### Escena 3 · 0:54–1:22 · ¿Cómo declarar una variable?

**Pantalla:**

Escribir en el editor:

```java
int edad = 15;
```

Resaltar sucesivamente `int`, `edad`, `=`, `15` y `;`. Añadir etiquetas: «tipo», «nombre», «asignación», «valor» y «fin de instrucción».

**Narración:**

Para crear una variable en Java necesitamos indicar el tipo de dato, su nombre y el valor que queremos guardar. Observa este ejemplo: int edad igual a quince. La palabra int indica que almacenaremos un número entero. Edad es el nombre de la variable, y quince es el valor asignado. Al final colocamos un punto y coma.

### Escena 4 · 1:22–1:45 · Cambiar el valor de una variable

**Pantalla:**

Mostrar primero `int edad = 15;` y después `edad = 16;`.

Resaltar que en la segunda instrucción no se repite `int`. Mostrar la salida de la consola correspondiente al nuevo valor.

**Narración:**

Las variables también pueden actualizarse. Si queremos cambiar la edad de quince a dieciséis, escribimos su nombre y asignamos el nuevo valor. No necesitamos repetir el tipo de dato porque la variable ya fue creada. Así, Java utilizará el valor actualizado.

### Escena 5 · 1:45–2:22 · Tipos de datos en Java

**Pantalla:**

Mostrar una tabla con cuatro tipos y ejemplos:

| Tipo | Uso | Ejemplo |
|---|---|---|
| `int` | Número entero | `15` |
| `double` | Número decimal | `1.62` |
| `String` | Texto | `"Alex"` |
| `boolean` | Verdadero o falso | `true` |

En el editor, escribir las variables correspondientes, resaltando cada tipo mientras se explica.

**Narración:**

Java permite guardar distintos tipos de información. Int almacena números enteros, como quince. Dóbol permite almacenar números decimales, como uno punto sesenta y dos. Estring se utiliza para guardar textos, como el nombre Alex, que escribimos entre comillas. Finalmente, búlean representa valores verdaderos o falsos. Recuerda que cada tipo de dato tiene una función diferente y nos ayuda a organizar mejor nuestra información.

### Escena 6 · 2:22–2:48 · Unir textos y variables

**Pantalla:**

Mostrar este ejemplo:

```java
System.out.println("Nombre: " + nombre);
System.out.println("Edad: " + edad);
```

Resaltar el signo `+` y añadir «Con texto: unir». Mostrar en la consola:

```text
Nombre: Alex
Edad: 15
```

**Narración:**

En Java, el signo más tiene dos usos importantes. Cuando trabajamos con números, sirve para sumar. Pero cuando trabajamos con textos, nos permite unir información. A esto lo llamamos concatenación. Así podemos mostrar un mensaje con el nombre o la edad de una persona de forma clara y ordenada.

### Escena 7 · 2:48–3:26 · Operadores matemáticos

**Pantalla:**

Mostrar los operadores:

| Operador | Operación |
|---|---|
| `+` | Suma |
| `-` | Resta |
| `*` | Multiplicación |
| `/` | División |
| `%` | Resto de una división |

Resaltar en el editor:

```java
int doble = edad * 2;
int mitad = edad / 2;
double mitadExacta = edad / 2.0;
int resto = edad % 4;
```

Utilizar `edad = 15` para esta demostración. Mostrar los resultados 30, 7, 7.5 y 3.

**Narración:**

Los operadores matemáticos nos permiten hacer cálculos. Tenemos suma, resta, multiplicación y división. También existe el operador porcentaje, que obtiene el resto de una división.

Por ejemplo, quince multiplicado por dos da treinta. Si dividimos quince entre dos, ambos números enteros, obtenemos siete porque Java descarta la parte decimal en una división de enteros.

Para conservar los decimales, podemos realizar la operación utilizando un valor decimal de tipo dóbol. Así obtenemos siete punto cinco.

### Escena 8 · 3:26–3:48 · Reglas para nombrar variables

**Pantalla:**

Mostrar ejemplos con símbolos verdes y rojos:

- Correcto: `edad`
- Correcto: `nombreCompleto`
- Incorrecto: `2amigos`
- Incorrecto: `mi edad`

Resaltar «Nombres claros y sin espacios».

**Narración:**

Cuando creamos variables debemos utilizar nombres fáciles de entender. No pueden comenzar con números ni contener espacios. También recomendamos evitar tildes y la letra eñe. Por ejemplo, nombreCompleto, escrito sin espacios y con la segunda palabra iniciando con mayúscula, es un nombre más descriptivo que utilizar una sola letra.

### Escena 9 · 3:48–5:08 · Práctica del estudiante

**Pantalla:**

Mostrar una tarjeta amarilla con el aviso:

**⏸️ Pausa el video y practica**

Presentar las tres actividades:

1. Crear una variable `double` llamada `altura`.
2. Crear una variable `boolean` llamada `estudiante`.
3. Calcular los meses vividos multiplicando `edad * 12`.

Mostrar el enlace Starter y un cronómetro visible de **60 segundos**. Durante el cronómetro no debe haber narración.

**Narración:**

Ahora te toca practicar. Abre el enlace Starter de la descripción. Primero, crea una variable dóbol llamada altura. Después, una variable búlean llamada estudiante. Finalmente, calcula los meses vividos multiplicando tu edad por doce. Muestra los resultados en la consola y presiona Run. ¡Tú puedes hacerlo!

**[Silencio de práctica: 60 segundos. Mostrar cronómetro y las tres instrucciones.]**

**Starter:** https://onlinegdb.com/EYA0I23Yb

**Completed:** https://onlinegdb.com/e05iEvVF7

### Escena 10 · 5:08–5:24 · Conclusiones

**Pantalla:**

Mostrar una tarjeta titulada:

**Lo que aprendiste hoy**

- Una variable permite guardar información.
- `int`, `double`, `String` y `boolean` representan distintos tipos de datos.
- Los operadores matemáticos permiten realizar cálculos.

En la parte inferior:

**Siguiente: Lección 3 — Decisiones y bucles**

**Narración:**

Hoy aprendimos a utilizar variables, reconocer diferentes tipos de datos y realizar operaciones matemáticas. En la próxima lección descubriremos cómo tomar decisiones y repetir instrucciones con Java. ¡Nos vemos pronto!

---

## Repositorio del curso

https://github.com/NexoStock/java-fundamentals-course-nexostock