# Lección 5: Clases y objetos: tu primera mascota virtual

- **Duración estimada:** 8 minutos y 50 segundos
- **Herramienta:** OnlineGDB
- **Práctica:** `starter-files/lesson-05`
- **Solución:** `completed-examples/lesson-05`

## Objetivo

Comprender qué son una clase y un objeto, declarar atributos, escribir un constructor con `this`, crear objetos con `new` y darles acciones con métodos, construyendo una mascota virtual.

**Indicaciones de producción:** Las marcas de tiempo son una propuesta de distribución y deben comprobarse con el video real. La sección **Pantalla** explica qué mostrar, escribir y resaltar. La sección **Narración** contiene el texto preparado para Camila, la voz virtual de Clipchamp. Los términos técnicos se escriben correctamente en el código, pero se adaptan fonéticamente en la narración. En el código se escribe sin tildes ni eñes, y en OnlineGDB el archivo se llama `Main.java`.

---

### Escena 1 · 0:00–0:25 · Introducción y repaso

**Pantalla:**

Mostrar la tarjeta «Lección 5 de 7: Clases y objetos».

Mostrar durante unos segundos el método `saludar` de la lección anterior.

**Narración:**

Bienvenido a la quinta lección de nuestro curso de Java. En la lección anterior creaste métodos, que son tareas con nombre. Hoy empieza lo más importante del curso: la programación orientada a objetos. Vas a crear tu primera mascota virtual, con su nombre, su edad y sus propias acciones.

### Escena 2 · 0:25–1:05 · ¿Qué es un objeto?

**Pantalla:**

Mostrar la imagen de un gato con dos columnas:

| Lo que tiene | Lo que hace |
|---|---|
| nombre: Luna | come |
| edad: 3 | juega |
| energía: 50 | se presenta |

Resaltar el título de cada columna: «Atributos» y «Métodos».

**Narración:**

Mira a tu alrededor. Todo lo que ves es un objeto: tu celular, tu mochila, tu mascota. Cada objeto tiene características y puede hacer acciones. Por ejemplo, una gata llamada Luna tiene un nombre, una edad y un nivel de energía. Y también puede comer, jugar y presentarse. En Java, las características se llaman atributos, y las acciones se llaman métodos.

### Escena 3 · 1:05–1:45 · Clase = molde, objeto = cosa creada

**Pantalla:**

Mostrar un molde de galletas con la etiqueta «Clase» y tres galletas con la etiqueta «Objetos».

Después, reemplazar la imagen por un molde con la palabra `Mascota` y dos tarjetas: «Luna, gato, 3» y «Toby, perro, 5».

Resaltar el texto «Clase = molde · Objeto = cosa creada con el molde».

**Narración:**

Para crear objetos, primero necesitamos un molde. Piensa en un molde de galletas: con un solo molde puedes hacer muchas galletas. En Java, ese molde se llama clase. Y cada galleta que sale del molde es un objeto. Con una clase Mascota podemos crear a Luna, a Toby y a todas las mascotas que queramos. Todas tienen la misma forma, pero cada una guarda sus propios datos.

### Escena 4 · 1:45–2:35 · Crear la clase y sus atributos

**Pantalla:**

En OnlineGDB, encima de `public class Main`, escribir:

```java
class Mascota {
    String nombre;
    String tipo;
    int edad;
    int energia;
}
```

Resaltar `class` y el nombre `Mascota` con mayúscula inicial. Después, resaltar los cuatro atributos con la etiqueta «Atributos».

**Narración:**

Vamos a escribir nuestra clase. Usamos la palabra clas y el nombre Mascota, que empieza con mayúscula. Dentro de las llaves escribimos los atributos: son variables que pertenecen a cada mascota. Un estring para el nombre, otro para el tipo de animal, y dos números enteros para la edad y la energía. Fíjate que todavía no tienen valores: el molde solo dice qué datos tendrá cada mascota.

### Escena 5 · 2:35–3:35 · El constructor y la palabra this

**Pantalla:**

Dentro de la clase, debajo de los atributos, escribir:

```java
Mascota(String nombre, String tipo, int edad) {
    this.nombre = nombre;
    this.tipo = tipo;
    this.edad = edad;
    this.energia = 50;
}
```

Resaltar que el constructor tiene el mismo nombre que la clase y no lleva `void`. Después, unir con una flecha `this.nombre` con el atributo y `nombre` con el parámetro. Añadir la etiqueta «this = esta mascota».

**Narración:**

Ahora escribimos el constructor. Es un método especial que se ejecuta al crear cada mascota y le da sus primeros datos. Se reconoce porque tiene el mismo nombre que la clase y no lleva voi. Recibe el nombre, el tipo y la edad. Dentro usamos la palabra dis, que significa esta mascota. Así, dis punto nombre es el atributo de la mascota, y nombre, sin dis, es el dato que recibimos. Además, toda mascota nueva empieza con cincuenta de energía.

### Escena 6 · 3:35–4:15 · Crear un objeto con new

**Pantalla:**

En `main`, escribir:

```java
Mascota luna = new Mascota("Luna", "gato", 3);
```

Resaltar sucesivamente `Mascota` («tipo»), `luna` («nombre del objeto»), `new` («crea el objeto») y los valores entre paréntesis («datos para el constructor»).

**Narración:**

Ya tenemos el molde. Ahora creamos nuestra primera mascota. Escribimos el tipo, que es Mascota, y un nombre para el objeto: luna. Después usamos la palabra niú, que significa crear algo nuevo con el molde, y le pasamos al constructor el nombre, el tipo y la edad. Con esta sola línea, Luna ya existe en la memoria de la computadora.

### Escena 7 · 4:15–5:25 · Métodos: las acciones de la mascota

**Pantalla:**

Dentro de la clase, debajo del constructor, escribir:

```java
void presentarse() {
    System.out.println("Hola, soy " + nombre + ". Soy un " + tipo + " y mi edad es " + edad + ".");
}

void comer() {
    energia = energia + 20;
    System.out.println(nombre + " come. Energia: " + energia);
}

void jugar() {
    if (energia >= 30) {
        energia = energia - 30;
        System.out.println(nombre + " juega feliz. Energia: " + energia);
    } else {
        System.out.println(nombre + " necesita descansar. Energia: " + energia);
    }
}
```

En `main`, escribir y ejecutar:

```java
luna.presentarse();
luna.jugar();
luna.comer();
```

Resaltar el punto entre `luna` y el método. Mostrar en la consola:

```text
Hola, soy Luna. Soy un gato y mi edad es 3.
Luna juega feliz. Energia: 20
Luna come. Energia: 40
```

**Narración:**

Una mascota sin acciones sería aburrida. Así que le damos tres métodos. Presentarse muestra sus datos. Comer le suma veinte de energía. Y jugar usa un if, como en la lección tres: si tiene al menos treinta de energía, juega y gasta treinta; si no, necesita descansar. Para usar un método, escribimos el nombre del objeto, un punto y el nombre del método. Luna se presenta, juega, y después come para recuperar energía.

### Escena 8 · 5:25–6:10 · Cada objeto guarda sus propios datos

**Pantalla:**

Escribir en `main`:

```java
Mascota toby = new Mascota("Toby", "perro", 5);
toby.jugar();
toby.jugar();
```

Ejecutar. Mostrar en pantalla, lado a lado, dos tarjetas: «Luna · energía 40» y «Toby · energía 20». Resaltar el mensaje «Toby necesita descansar».

**Narración:**

Ahora creamos un segundo objeto con el mismo molde: Toby, un perro de cinco años. Toby juega dos veces. La primera vez juega feliz, pero la segunda ya no tiene energía suficiente y necesita descansar. Fíjate en algo muy importante: la energía de Luna no cambió. Cada objeto guarda sus propios datos, aunque los dos salieron de la misma clase.

### Escena 9 · 6:10–8:20 · Práctica del estudiante

**Pantalla:**

Mostrar una tarjeta amarilla con el aviso:

**⏸️ Pausa el video y practica**

Presentar las tres actividades:

1. Crear tu propia mascota con `new`.
2. Crear el método `celebrarCumple()`, que suma 1 a la edad y muestra un mensaje.
3. Llamar a `celebrarCumple()` y después a `presentarse()` con tu mascota.

Mostrar el enlace Starter y un cronómetro visible de **90 segundos**. Durante el cronómetro no debe haber narración.

**Narración:**

Ahora te toca a ti. Abre el enlace Starter de la descripción. Ahí ya está la clase Mascota y la gata Luna. Primero, crea tu propia mascota con niú: puede ser un perro, un loro o el animal que quieras. Segundo, dentro de la clase, crea el método celebrar cumple, que sume uno a la edad y muestre un mensaje. Y tercero, llama a celebrar cumple y luego a presentarse con tu mascota. Presiona Run y comprueba que la edad aumentó. Sigue con el video cuando termines.

**[Silencio de práctica: 90 segundos. Mostrar cronómetro y las tres instrucciones.]**



### Escena 10 · 8:20–8:50 · Conclusiones

**Pantalla:**

Mostrar una tarjeta titulada:

**Lo que aprendiste hoy**

- Una clase es un molde y un objeto es una cosa creada con ese molde.
- Los atributos guardan los datos y los métodos son las acciones.
- El constructor da los primeros datos, y `new` crea el objeto.

En la parte inferior:

**Siguiente: Lección 6 — Encapsulación y arreglos**

**Narración:**

Excelente trabajo. Hoy aprendiste que una clase es un molde y un objeto es lo que creas con él. Los atributos guardan los datos, los métodos son las acciones, el constructor da los primeros datos y niú crea el objeto. En la próxima lección vas a proteger los datos de tus mascotas y a guardar muchos objetos juntos. ¡Nos vemos!

---

## Repositorio del curso

https://github.com/NexoStock/java-fundamentals-course-nexostock

## Enlaces de práctica verificados en el plan

- **Starter:** https://onlinegdb.com/jFV0FlGWt
- **Completed:** https://onlinegdb.com/4hrZk1ox5
