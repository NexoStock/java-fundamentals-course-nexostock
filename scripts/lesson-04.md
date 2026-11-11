# Lección 4: Métodos y entrada de datos

**Duración:** ~8 minutos · **Herramienta:** OnlineGDB (editor en línea) · **Práctica:** `starter-files/lesson-04`

**Objetivo:** que el estudiante cree métodos con parámetros y valor de retorno, y lea datos del usuario con Scanner.

---

## Escena 1 · 0:00–0:25 · Repaso

**Pantalla:** El editor con el programa de la lección 3 (if y bucles).

**Narración:**
Ya sabes decidir y repetir. Pero a medida que tu programa crece, el código se llena de líneas y se vuelve difícil de leer. Hoy aprenderás a ordenarlo con métodos, y a hacer que tu programa converse contigo.

---

## Escena 2 · 0:25–1:05 · ¿Qué es un método?

**Pantalla:** Animación: una licuadora con la etiqueta «sumar»; entran dos números por arriba y sale el resultado por abajo. Texto en pantalla: «Método = tarea con nombre que puedes usar muchas veces».

**Narración:**
Un método es una tarea con nombre. Piensa en una licuadora: pones las frutas, la enciendes y obtienes el jugo. No necesitas construir la licuadora cada vez; solo la usas. En programación, escribes la tarea una vez, le pones un nombre, y después la usas las veces que quieras. Ya usaste uno sin saberlo: print ele ene es un método que alguien escribió para ti.

---

## Escena 3 · 1:05–1:48 · Por qué usar métodos

**Pantalla:** Mostrar dos versiones de un programa: a la izquierda, cuatro veces el mismo bloque de tres líneas copiado; a la derecha, un método llamado cuatro veces. Texto en pantalla: «No repitas código».

**Narración:**
¿Para qué sirven los métodos? Primero, para no repetir código. Si necesitas la misma tarea cuatro veces, no copias el bloque cuatro veces: escribes un método y lo llamas cuatro veces. Segundo, para corregir en un solo lugar. Si encuentras un error, lo arreglas una vez, y queda arreglado en todas partes. Y tercero, para que tu código se lea mejor: un nombre como saludar se entiende al instante.

---

## Escena 4 · 1:48–2:39 · Crear un método con parámetros

**Pantalla:** Escribir `static void saludar(String nombre) { System.out.println("Hola, " + nombre + "!"); }` y rotular: «static void», «nombre del método», «parámetro». Escribir dentro de `main` las llamadas `saludar("Alex");` y `saludar("Mia");` y ejecutar.

**Narración:**
Vamos a crear uno. Escribo státic voi, y luego el nombre del método: saludar. Entre paréntesis va el parámetro, que es el dato que el método necesita para trabajar. Aquí, un texto llamado nombre. Entre llaves va lo que hace: muestra Hola, y el nombre. La palabra voi significa que este método no devuelve ningún resultado, solo hace algo. Ahora lo uso, escribiendo su nombre y entre paréntesis el dato. Saludar de Alex, saludar de Mia. Ejecuto: dos saludos distintos con el mismo método.

---

## Escena 5 · 2:39–3:24 · Métodos que devuelven un resultado

**Pantalla:** Escribir `static int sumar(int a, int b) { return a + b; }`. Rotular: «int = tipo del resultado» y «return = devolver». Escribir `int total = sumar(4, 3);` y mostrarlo. Ejecutar (7).

**Narración:**
Otros métodos devuelven un resultado, como la licuadora devuelve el jugo. Mira este: en lugar de voi, escribo int, porque va a devolver un número entero. Tiene dos parámetros: a y b. Y con la palabra ritérn, que significa devolver, entrega la suma. Lo uso así: guardo en la variable total el resultado de sumar cuatro y tres. Ejecuto: siete. Un método con voi hace algo; un método con tipo devuelve algo.

---

## Escena 6 · 3:24–4:13 · Pedir datos con Scanner

**Pantalla:** Escribir en la parte de arriba `import java.util.Scanner;` y dentro de `main`: `Scanner entrada = new Scanner(System.in);`, `String nombre = entrada.nextLine();`. Mostrar la consola con el cursor esperando y escribir «Alex» + Enter. Texto en pantalla: «nextLine = leer texto · nextInt = leer un número entero».

**Narración:**
Ahora vamos a hacer que el programa converse. Para leer lo que escribe el usuario usamos una herramienta de Java llamada escáner, que se lee escáner. Primero hay que traerla con una línea de importación, arriba del todo. Después creamos un escáner que escuche el teclado. Con next línea leemos un texto completo, y con next int leemos un número entero. Mira: al ejecutar, la consola se queda esperando. Escribo Alex, pulso Enter, y el programa recibe el dato.

---

## Escena 7 · 4:13–4:53 · Leer otros tipos de datos

**Pantalla:** Tabla en pantalla: `nextLine()` texto, `nextInt()` entero, `nextDouble()` decimal, `nextBoolean()` verdadero o falso. Texto: «Escribe el dato en la consola y pulsa Enter».

**Narración:**
El escáner puede leer distintos tipos de datos. Para un texto completo, next línea. Para un número entero, next int. Para un número con decimales, next double. Y para verdadero o falso, next boolean. Elige el que corresponda al dato que esperas. Si el usuario escribe algo que no coincide, por ejemplo letras donde esperabas un número, el programa se detiene con un error.

---

## Escena 8 · 4:53–5:24 · Todo junto

**Pantalla:** Mostrar el programa completo de `completed-examples/lesson-04`. Ejecutar: preguntar el nombre, saludar, preguntar la edad, mostrar «En tu próximo cumpleaños tendrás 16.» usando `sumar(edad, 1)`. Rotular cada método con flechas.

**Narración:**
Juntemos todo. El programa pregunta cómo te llamas, y usa el método saludar. Luego pregunta tu edad, y usa el método sumar para calcular tu edad del próximo cumpleaños. Fíjate qué ordenado queda: cada tarea tiene su método, y la parte principal se lee casi como una conversación.

---

## Escena 9 · 5:24–7:30 · Práctica

**Pantalla:** Aviso: «⏸️ Pausa el video y practica». Mostrar el cronómetro de 90 segundos con la lista: «1) Crea el método sumar con dos parámetros. 2) Pregunta tu edad con nextInt. 3) Muestra tu próxima edad usando sumar». Dejar 90 segundos en silencio.

**Narración:**
Tu turno. Pausa el video y abre el link de la práctica. Ahí ya está el método saludar. Primero, crea tú el método sumar, con dos parámetros y que devuelva la suma. Segundo, pregunta la edad al usuario con next int. Y tercero, muestra la edad del próximo cumpleaños usando tu método. Sigue con el video cuando termines.

*(Silencio de 90 segundos.)*

---

## Escena 10 · 7:30–7:58 · Cierre

**Pantalla:** Tarjeta «Lo que aprendiste hoy»: «Un método es una tarea con nombre», «void hace algo; return devuelve algo», «Scanner lee lo que escribe el usuario». Debajo: «Siguiente: Lección 5, clases y objetos».

**Narración:**
Excelente. Hoy aprendiste que un método es una tarea con nombre, que voi hace algo y ritérn devuelve algo, y que escáner permite leer datos del usuario. En la siguiente lección empieza lo más importante del curso: la programación orientada a objetos. Te espero.

---
## Repositorio del curso

https://github.com/NexoStock/java-fundamentals-course-nexostock

## Enlaces de práctica verificados en el plan

- **Starter:** https://onlinegdb.com/7OKjzEcrg
- **Completed:** https://onlinegdb.com/oPTjaj_KF
