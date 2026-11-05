# Lección 3: Estructuras de control: decisiones y bucles

**Duración:** ~8 minutos · **Herramienta:** OnlineGDB (editor en línea) · **Práctica:** `starter-files/lesson-03`

**Objetivo:** que el estudiante use if-else para tomar decisiones y for y while para repetir tareas.

---

## Escena 1 · 0:00–0:21 · Repaso

**Pantalla:** El editor con las variables de la lección 2 y sus resultados.

**Narración:**
Ya sabes guardar datos en variables. Pero hasta ahora tu programa siempre hace lo mismo, de arriba hacia abajo. Hoy le vas a enseñar dos habilidades nuevas: tomar decisiones y repetir tareas.

---

## Escena 2 · 0:21–0:55 · Tomar decisiones con if

**Pantalla:** Diagrama de flujo sencillo: un rombo «¿edad ≥ 12?» con dos caminos: «Sí → Puedes ver la película» y «No → Es para mayores». Texto en pantalla: «if = si · else = si no».

**Narración:**
Piensa en la entrada de un cine. Si tienes doce años o más, puedes ver la película. Si no, no puedes. Eso es una decisión, y en Java se escribe con la palabra if, que significa si. Y con la palabra els, que significa si no, indicas qué hacer en el otro caso.

---

## Escena 3 · 0:55–1:37 · Escribir un if-else

**Pantalla:** Escribir en el editor `int edad = 15;` y el bloque `if (edad >= 12) { ... } else { ... }` con los dos mensajes. Resaltar con recuadros: la condición entre paréntesis y las llaves. Ejecutar (muestra «Puedes ver la película.»). Cambiar la edad a 10 y ejecutar de nuevo.

**Narración:**
Vamos a escribirlo. Después de if, entre paréntesis, va la condición: edad mayor o igual a doce. Si la condición es verdadera, se ejecuta lo que está entre las llaves. Después va els, con sus propias llaves, para el otro caso. Ejecuto: Puedes ver la película. Ahora cambio la edad a diez y ejecuto otra vez: Esta película es para mayores. El mismo programa, pero con otra decisión.

---

## Escena 4 · 1:37–2:18 · Comparar valores

**Pantalla:** Tabla en pantalla: `>` mayor que, `<` menor que, `>=` mayor o igual, `<=` menor o igual, `==` igual a, `!=` distinto de. Resaltar con un recuadro rojo: «¡Dos signos igual para comparar!».

**Narración:**
Para comparar valores usas estos símbolos: mayor que, menor que, mayor o igual, menor o igual, y distinto de. Y atención a este: para preguntar si dos valores son iguales se usan dos signos igual seguidos. Un solo signo igual sirve para guardar un valor, no para comparar. Es uno de los errores más comunes, y lo vamos a ver otra vez al final del curso.

---

## Escena 5 · 2:18–3:00 · Más de dos caminos: else if

**Pantalla:** Escribir `if (edad >= 18) { ... } else if (edad >= 12) { ... } else { ... }` con tres mensajes (adulto, adolescente, niño). Mostrar un diagrama con tres caminos. Cambiar la edad y ejecutar dos veces.

**Narración:**
A veces hay más de dos caminos. Por ejemplo: si tienes dieciocho o más, eres adulto; si no, pero tienes doce o más, eres adolescente; y si no, eres niño. Para eso se agrega els if, que significa si no, pero si. Java revisa las condiciones en orden, y ejecuta solo el primer camino que se cumple. Cambio la edad y ejecuto dos veces para ver distintos caminos.

---

## Escena 6 · 3:00–3:41 · Combinar condiciones: y, o

**Pantalla:** Escribir `if (edad >= 12 && edad <= 17)` y rotular `&&` como «y: las dos deben cumplirse». Escribir también `if (esFinDeSemana || estaDeVacaciones)` y rotular `||` como «o: basta que se cumpla una». Tabla en pantalla con ejemplos de verdadero y falso.

**Narración:**
También puedes combinar condiciones. Dos signos de y comercial significan y: se tienen que cumplir las dos. Por ejemplo, edad mayor o igual a doce, y edad menor o igual a diecisiete, solo es verdadero para adolescentes. Dos barras verticales significan o: basta con que se cumpla una. Por ejemplo, es fin de semana o estás de vacaciones: con una de las dos, ya puedes descansar.

---

## Escena 7 · 3:41–4:35 · Repetir con for

**Pantalla:** Animación de una persona haciendo cinco abdominales con un contador en pantalla. Después escribir `for (int i = 1; i <= 5; i++) { System.out.println("Numero: " + i); }`, rotulando con tres flechas: «empieza en 1», «mientras sea ≤ 5», «sube de 1 en 1». Ejecutar.

**Narración:**
Ahora, repetir tareas. Imagina que tu profesor de educación física te pide cinco abdominales. No te dice haz una, haz otra, haz otra. Dice: repite cinco veces. Los bucles hacen eso. El bucle for tiene tres partes entre paréntesis. Primero, dónde empieza el contador: i igual a uno. Segundo, hasta cuándo sigue: mientras i sea menor o igual a cinco. Y tercero, cómo cambia: i más más, que significa sube de uno en uno. Ejecuto, y el mensaje se repite cinco veces, con los números del uno al cinco.

---

## Escena 8 · 4:35–5:22 · Repetir con while

**Pantalla:** Escribir `int cuenta = 3; while (cuenta >= 1) { System.out.println(cuenta); cuenta--; } System.out.println("Despegue!");` y ejecutar (3, 2, 1, Despegue!). Texto en pantalla: «while = mientras».

**Narración:**
Hay otro bucle, el guáil, que significa mientras. Repite una tarea mientras una condición sea verdadera. Hagamos una cuenta regresiva de cohete. Empiezo con cuenta igual a tres. Mientras la cuenta sea mayor o igual a uno, la muestro y le resto uno. Al terminar, escribo Despegue. Ejecuto: tres, dos, uno, ¡despegue! Cuidado: si te olvidas de restar uno, la condición nunca deja de ser verdadera y el programa no termina. Eso se llama un bucle infinito.

---

## Escena 9 · 5:22–5:42 · ¿for o while?

**Pantalla:** Dos columnas: «for → cuando sabes cuántas veces» con el ejemplo «5 abdominales»; «while → cuando depende de una condición» con el ejemplo «hasta que se acabe el tiempo».

**Narración:**
¿Cuál usar? Usa for cuando sabes cuántas veces vas a repetir, como cinco abdominales. Usa guáil cuando la repetición depende de una condición, como seguir jugando mientras te queden vidas.

---

## Escena 10 · 5:42–7:55 · Práctica

**Pantalla:** Aviso: «⏸️ Pausa el video y practica». Mostrar el cronómetro de 90 segundos con la lista: «1) Escribe un if-else con tu edad. 2) Escribe un for del 1 al 5. 3) Escribe un while que cuente de 3 a 1 y al final muestre Despegue. Reto: la tabla del 3». Dejar 90 segundos en silencio.

**Narración:**
Tu turno. Pausa el video y abre el link de la práctica. Primero, escribe un if y un els que comparen tu edad con doce. Segundo, escribe un for que muestre los números del uno al cinco. Tercero, escribe un guáil que cuente de tres a uno y termine con Despegue. Y si quieres un reto, muestra la tabla del tres con un for. Sigue con el video cuando termines.

*(Silencio de 90 segundos.)*

---

## Escena 11 · 7:55–8:21 · Cierre

**Pantalla:** Tarjeta «Lo que aprendiste hoy»: «if y else toman decisiones», «for repite un número conocido de veces», «while repite mientras se cumpla una condición». Debajo: «Siguiente: Lección 4, métodos y entrada de datos».

**Narración:**
Muy bien. Hoy tu programa aprendió a decidir con if y els, y a repetir con for y guáil. En la lección siguiente aprenderás a organizar tu código en métodos y a conversar con el usuario, pidiéndole datos. Nos vemos.