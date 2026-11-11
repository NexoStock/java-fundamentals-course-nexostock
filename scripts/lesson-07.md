# Lección 7: Errores comunes, buenas prácticas y próximos pasos

**Duración:** ~9 minutos · **Herramienta:** OnlineGDB (editor en línea) · **Práctica:** `starter-files/lesson-07`

**Objetivo:** que el estudiante reconozca cinco errores típicos, aprenda a leer los mensajes del compilador, conozca buenas prácticas y sepa cómo seguir aprendiendo.

> **Pantalla** es lo que se muestra y se hace; **Voz** es el texto que se pega en el generador de voz. Los términos de Java están escritos como suenan en la parte **Voz** (por ejemplo, «estring» para `String`). En el programa se escribe sin tildes ni eñes para que la consola no muestre símbolos raros.


---

## Escena 1 · 0:00–0:25 · Introducción

**Pantalla:** Tarjeta «Lección 7 de 7: Errores comunes, buenas prácticas y próximos pasos». Después, el editor con el programa con errores de `starter-files/lesson-07`.

**Voz:**
> Ya sabes escribir programas completos. En esta última lección vas a aprender algo que usan todas las personas que programan: encontrar y corregir errores. Porque todo el mundo se equivoca, y no hay nada de malo en eso.

---

## Escena 2 · 0:25–1:12 · Leer el mensaje del compilador

**Pantalla:** Pulsar «Run» con el programa con errores. Mostrar el mensaje `Main.java:4: error: ';' expected`. Rotular: «archivo», «número de línea», «qué pasó». Texto en pantalla: «El error te dice dónde y qué».

**Voz:**
> Cuando algo sale mal, el compilador, que es el programa que revisa tu código, te muestra un mensaje en inglés. No te asustes: es tu mejor amigo. Tiene tres datos: el archivo, el número de línea donde encontró el problema, y qué problema es. Mira este: en la línea cuatro, se esperaba un punto y coma. Es el error número uno: olvidar el punto y coma al final de la línea. Lo agrego y ejecuto otra vez.

---

## Escena 3 · 1:12–2:04 · Errores de escritura

**Pantalla:** Ejecutar y mostrar los dos errores: `cannot find symbol ... class string` y `incompatible types: int cannot be converted to boolean`. Corregir `string` por `String` y `edad = 15` por `edad == 15`. Rotular cada corrección.

**Voz:**
> Ahora aparecen dos errores nuevos. El primero dice que no encuentra un símbolo llamado string con minúscula. El tipo de texto se escribe estring, con la ese mayúscula: Java distingue entre mayúsculas y minúsculas. Es el error número dos. El segundo dice que un número no se puede convertir a verdadero o falso. Mira el if: escribí un solo signo igual, que guarda un valor, en vez de dos signos, que comparan. Es el error número tres, y ya lo habíamos mencionado. Corrijo los dos.

---

## Escena 4 · 2:04–2:54 · Errores que aparecen al ejecutar

**Pantalla:** Ejecutar: el programa muestra dos líneas y luego `Exception in thread "main" java.lang.ArrayIndexOutOfBoundsException: Index 3 out of bounds for length 3`. Dibujar el arreglo con tres casilleros (0, 1, 2) y una flecha al casillero 3 inexistente. Corregir `<=` por `<`.

**Voz:**
> Ahora el programa compila, pero se detiene con un error al ejecutar. Dice que el índice tres está fuera de los límites de un arreglo de longitud tres. Recuerda: los casilleros se numeran desde cero, así que un arreglo de tres tiene los casilleros cero, uno y dos. El casillero tres no existe. El problema está en el for: usé menor o igual en vez de menor. Es el error número cuatro, y es de los más comunes. Lo corrijo y ejecuto.

---

## Escena 5 · 2:54–3:48 · Errores que no avisan

**Pantalla:** Ejecutar: `Promedio: 15.0`. Texto en pantalla: «¿18 + 15 + 14 = 47; 47 / 3 = 15.67!». Corregir con `(double) suma / notas.length` y ejecutar de nuevo (`Promedio: 15.666666666666666`).

**Voz:**
> El programa ya funciona, pero mira el promedio: quince punto cero. Hagamos la cuenta: dieciocho más quince más catorce, cuarenta y siete, dividido entre tres, da quince punto sesenta y siete. El programa mostró otro número, y no avisó. Este es el error número cinco, y es el más difícil de encontrar, porque no hay mensaje. La causa: dividir dos enteros descarta los decimales. Se arregla convirtiendo uno de los números a dóbol, como hicimos en la lección anterior. Ahora sí: quince punto seis seis seis, con muchos decimales.

---

## Escena 6 · 3:48–4:28 · Imprimir para investigar

**Pantalla:** En el editor agregar una línea `System.out.println("suma vale: " + suma);` dentro del bucle y mostrar cómo cambia en cada vuelta. Texto en pantalla: «println también sirve para investigar».

**Voz:**
> Cuando un error no avisa, hay un truco: usar print ele ene como si fuera una linterna. Agregas una línea que muestre el valor de una variable en un punto del programa, ejecutas, y miras si es el valor que esperabas. Aquí muestro la suma en cada vuelta del bucle y puedo seguir cómo va creciendo. Cuando encuentres el problema, borras esas líneas de investigación.

---

## Escena 7 · 4:28–5:15 · Buenas prácticas

**Pantalla:** Tarjeta con cuatro ítems y ✅: «Nombres claros: edad, nombreCompleto», «Clases con mayúscula inicial: Mascota, Estudiante», «Código ordenado, con sangría», «Comentarios cortos que explican el porqué». Mostrar un ejemplo ordenado frente a uno desordenado.

**Voz:**
> Para evitar errores, sigue estas buenas prácticas. Primero, usa nombres claros: edad es mejor que equis. Segundo, las clases se escriben con mayúscula inicial, como Mascota, y las variables y métodos con minúscula. Tercero, ordena tu código con sangría, para que se vea la estructura. Y cuarto, escribe comentarios cortos que expliquen para qué sirve cada parte. Además, ejecuta tu programa con frecuencia, a cada paso pequeño, en vez de escribir cien líneas y probar al final.

---

## Escena 8 · 5:15–6:00 · Cómo pedir ayuda

**Pantalla:** Tarjeta con tres pasos: «1. Lee el mensaje de error», «2. Copia el mensaje y búscalo en internet», «3. Pregunta a tu profesor o a un compañero, mostrando tu código». Texto en pantalla: «Un buen detective describe el problema».

**Voz:**
> Si te atascas, sigue tres pasos. Primero, lee con calma el mensaje de error y fíjate en el número de línea. Segundo, copia el mensaje y búscalo en internet: lo más probable es que a otras personas les haya pasado lo mismo. Y tercero, pregunta a tu profesor o a un compañero, y muéstrales tu código y el mensaje. Una buena pregunta describe qué querías hacer, qué pasó en realidad y qué intentaste.

---

## Escena 9 · 6:00–8:02 · Práctica

**Pantalla:** Aviso: «⏸️ Pausa el video y practica». Mostrar el cronómetro de 90 segundos con la lista: «1) Abre el link: el programa tiene 5 errores. 2) Encuéntralos uno por uno. 3) Cuando funcione, compara con la versión corregida». Dejar 90 segundos en silencio.

**Voz:**
> Tu turno, como detective. Pausa el video y abre el link de la práctica. El programa tiene los cinco errores que acabamos de ver, y tu trabajo es corregirlos. Ejecuta, lee el mensaje, corrige y vuelve a ejecutar. Cuando funcione, compara con la versión corregida. Sigue con el video cuando termines.

*(Silencio de 90 segundos.)*

---

## Escena 10 · 8:02–9:02 · Próximos pasos y despedida

**Pantalla:** Tarjeta «Lo que aprendiste en el curso» con siete líneas, una por lección. Después: «¿Qué sigue?» con tres ideas: «Practica con tus propios programas», «Explora la documentación oficial de Java», «Aprende más sobre clases y objetos». Pantalla final: «¡Gracias por completar el curso!».

**Voz:**
> Y llegamos al final del curso. En siete lecciones aprendiste qué es Java, a guardar datos con variables, a decidir y repetir, a crear métodos, a usar clases y objetos, a proteger tus datos y a encontrar errores. ¿Qué sigue? Primero, practica creando tus propios programas: un juego de adivinanzas, un registro de tus amigos, lo que se te ocurra. Segundo, visita la documentación oficial de Java: en la descripción tienes el link. Y tercero, sigue aprendiendo sobre clases y objetos, que es la base de casi todo en Java. Gracias por completar el curso, y sigue practicando.

## Enlaces de práctica verificados en el plan

- **Starter:** https://onlinegdb.com/b7-OKiz1XT
- **Completed:** https://onlinegdb.com/hXj1imdqn
