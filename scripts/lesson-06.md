# Lección 6: Encapsulación, arreglos y tu primer programa

**Duración prevista:** aproximadamente 11 minutos.
**Herramienta:** OnlineGDB.
**Práctica:** starter-files/lesson-06/Main.java
**Solución:** completed-examples/lesson-06/Main.java

**Objetivo:** proteger los atributos de una clase con private,
getters y setters, usar un arreglo de objetos y construir
un registro de estudiantes.

Pantalla indica qué mostrar y hacer.
Voz contiene únicamente el texto para generar la narración.
Los tiempos son orientativos y se ajustan durante la edición.
En el código se escribe sin tildes ni eñes.
En OnlineGDB, el archivo se llama Main.java.

## Escena 1 · Repaso
Tiempo orientativo: 0:00–0:28

**Pantalla:**
Mostrar la portada de la lección durante 3 segundos.
Después, mostrar en OnlineGDB la clase Mascota
del ejemplo terminado de la Lección 5.

**Voz:**
En la lección anterior creaste la clase Mascota y dos objetos.
Hoy vas a dar dos pasos más:
aprender a proteger los datos de tus objetos,
y guardar muchos objetos juntos.
Con eso, vas a construir un programa completo:
un registro de estudiantes.

## Escena 2 · El problema de los datos sin protección
Tiempo orientativo: 0:28–1:02

**Pantalla:**
En una copia de demostración del ejemplo de Mascota,
escribir en main:

luna.edad = -50;

Mostrar la edad después del cambio con println
y ejecutar para comprobar que acepta el valor.
Texto en pantalla:
«¡Una edad negativa no tiene sentido!».

**Voz:**
Mira este problema.
En la clase Mascota, cualquier parte del programa
puede cambiar la edad.
Si alguien escribe menos cincuenta,
Java lo acepta sin quejarse,
aunque una mascota no puede tener una edad negativa.
En programas grandes, esto causa errores
difíciles de encontrar.
Necesitamos un guardia que revise los datos
antes de aceptarlos.

## Escena 3 · Encapsulación: private, get y set
Tiempo orientativo: 1:02–1:49

**Pantalla:**
Mostrar una caja fuerte con una ventanilla.
Señalar los rótulos:
- private = caja cerrada.
- get = mirar por la ventanilla.
- set = pedir un cambio con revisión.

Mostrar en el editor:
private String nombre;
private int nota;

**Voz:**
La solución se llama encapsulación.
Es como guardar tus cosas en una caja fuerte
con una ventanilla.
Los atributos se marcan como práivet,
que significa privado:
nadie desde afuera puede tocarlos directamente.
Para mirar el dato, creamos un método
con la palabra guet, que significa obtener.
Para cambiarlo, creamos un método
con la palabra set, que significa establecer,
y ahí dentro revisamos que el nuevo valor sea correcto.
Los guet y los set se llaman getters y setters.

## Escena 4 · La clase Estudiante
Tiempo orientativo: 1:49–2:26

**Pantalla:**
Mostrar la clase Estudiante con:
- private String nombre.
- private int nota.
- Constructor que recibe nombre y nota.
- getNombre().
- getNota().

Resaltar cada parte mientras se explica.
Texto en pantalla: «Nota de 0 a 20».

**Voz:**
Vamos a construir la clase Estudiante.
Sus atributos son privados: un nombre y una nota.
La nota va de cero a veinte, como en tu colegio.
Escribo el constructor, que guarda ambos datos.
En este ejemplo, las notas iniciales ya están
dentro del rango permitido.
Y escribo dos getters:
uno devuelve el nombre y otro devuelve la nota.
Así otras partes del programa pueden leer los datos,
pero no cambiarlos directamente.

## Escena 5 · El setter con validación
Tiempo orientativo: 2:26–3:11

**Pantalla:**
Agregar este método dentro de Estudiante:

void setNota(int nota) {
    if (nota >= 0 && nota <= 20) {
        this.nota = nota;
    } else {
        System.out.println("Nota no valida: " + nota);
    }
}

Resaltar las dos condiciones.
Texto en pantalla:
«&& = y: ambas condiciones deben cumplirse».
Después:
«El setter es el guardia».

**Voz:**
Ahora el setter, que será nuestro guardia.
Recibe una nota nueva,
y con un if revisa que sea mayor o igual a cero
y, al mismo tiempo, menor o igual a veinte.
Los dos signos de y comercial significan y:
se deben cumplir las dos condiciones.
Si la nota es válida, la guarda.
Si no, muestra un aviso y no cambia nada.
Así, este método no acepta cambiar la nota
de un estudiante a veinticinco.

## Escena 6 · Arreglos: muchos objetos juntos
Tiempo orientativo: 3:11–3:56

**Pantalla:**
Mostrar en main:

Estudiante[] clase = new Estudiante[3];
clase[0] = new Estudiante("Ana", 18);
clase[1] = new Estudiante("Luis", 14);
clase[2] = new Estudiante("Mia", 16);

Acompañar con tres casilleros numerados 0, 1 y 2.
Texto en pantalla: «Las posiciones empiezan en 0».

**Voz:**
Un registro necesita muchos estudiantes.
Para guardar varios objetos juntos usamos un arreglo,
que es una fila de casilleros numerados.
Escribo el tipo Estudiante con corchetes,
el nombre clase, y creo un arreglo de tres casilleros.
Ojo, porque los casilleros se numeran desde cero:
el primero es cero,
el segundo es uno y el tercero es dos.
En cada casillero guardo un estudiante:
Ana con dieciocho,
Luis con catorce y Mia con dieciséis.

## Escena 7 · Recorrer el arreglo
Tiempo orientativo: 3:56–4:42

**Pantalla:**
Agregar en main:

clase[1].setNota(25);
clase[1].setNota(15);

int suma = 0;
for (int i = 0; i < clase.length; i++) {
    Estudiante e = clase[i];
    System.out.println(e.getNombre().toUpperCase() + ": " + e.getNota());
    suma = suma + e.getNota();
}

Ejecutar y mostrar:
Nota no valida: 25
ANA: 18
LUIS: 15
MIA: 16

Señalar:
- length: cantidad de casilleros.
- toUpperCase(): pasa el texto a mayúsculas.

**Voz:**
Probemos el guardia.
Intento ponerle veinticinco a Luis:
el programa avisa que la nota no es válida.
Ahora le pongo quince, y sí la acepta.
Para mostrar a todos,
uso un for que recorre los casilleros,
desde cero hasta que el contador
sea menor que la longitud del arreglo.
En cada vuelta tomo el estudiante,
muestro su nombre en mayúsculas,
con el método to upper case, y su nota.
También voy sumando las notas.

## Escena 8 · Los textos también son objetos
Tiempo orientativo: 4:42–5:25

**Pantalla:**
Agregar temporalmente dentro de main:

String nombre = "Alex";
System.out.println(nombre.length());
System.out.println(nombre.toUpperCase());

Ejecutar y mostrar:
4
ALEX

Texto en pantalla: «Los String tienen métodos».
Distinguir:
- clase.length: longitud del arreglo.
- nombre.length(): longitud del texto.

Eliminar estas tres líneas al terminar la demostración.

**Voz:**
Un dato curioso: los textos también son objetos.
Un estring tiene métodos que puedes usar con un punto,
igual que con tus propios objetos.
Por ejemplo, length te dice la longitud del texto,
y to upper case lo pasa a mayúsculas.
Los probamos en un rincón del editor:
Alex tiene cuatro letras,
y en mayúsculas es ALEX.
Es justo lo que usamos hace un momento
para mostrar los nombres.
Fíjate en una diferencia:
en el arreglo usamos length sin paréntesis,
y en el texto usamos length con paréntesis.

## Escena 9 · El promedio
Tiempo orientativo: 5:25–6:04

**Pantalla:**
Después del for, agregar:

double promedio = (double) suma / clase.length;
System.out.println("Promedio del grupo: " + promedio);

Ejecutar.
Resultado:
Promedio del grupo: 16.333333333333332

Texto en pantalla:
«(double) convierte a decimal antes de dividir».

**Voz:**
Para terminar, calculo el promedio del grupo:
la suma dividida entre la cantidad de estudiantes.
Como vimos,
si divides dos enteros pierdes los decimales.
Por eso escribo, antes de la suma,
la palabra dóbol entre paréntesis,
que convierte el número a decimal.
Ejecuto:
el promedio es aproximadamente dieciséis punto treinta y tres.
¡Ya tienes un programa completo,
hecho con clases, objetos, arreglos y bucles!

## Escena 10 · Cómo planear un programa
Tiempo orientativo: 6:04–6:49

**Pantalla:**
Mostrar esta lista progresivamente:
1. ¿Qué datos necesito? Nombre y nota.
2. ¿Qué clase los agrupa? Estudiante.
3. ¿Qué hace cada objeto? Getters y setter.
4. ¿Cómo guardo varios? Arreglo.
5. ¿Qué cuentas hago? Promedio.

**Voz:**
Antes de despedirnos de este programa,
mira cómo se pensó.
Primero: ¿qué datos necesito?
Un nombre y una nota.
Segundo: ¿qué clase los agrupa?
Estudiante.
Tercero: ¿qué debe poder hacer?
Dar su nombre y su nota,
y cambiar la nota con revisión.
Cuarto: ¿cómo guardo varios?
En un arreglo.
Y quinto: ¿qué cuentas hago?
El promedio.
Esa es la forma de pensar de quien programa:
dividir un problema grande en pasos pequeños.

## Escena 11 · Práctica
Tiempo orientativo: 6:49–10:05

**Pantalla:**
Mostrar el aviso «Pausa el video y practica»
y el enlace real al Starter de la Lección 6.

Mostrar las instrucciones:
1. Crea setNota con validación de 0 a 20.
2. Recorre el arreglo con un for.
3. Muestra el nombre y la nota de cada estudiante.
4. Calcula y muestra el promedio.

Reto adicional: agrega un cuarto estudiante.

Dejar 150 segundos de práctica sin narración,
con el Starter visible y un cronómetro.

**Voz:**
Tu turno, el más importante del curso.
Pausa el video y abre el link de la práctica.
Primero, escribe el método set nota,
con la validación de cero a veinte.
Segundo, recorre el arreglo con un for
y muestra el nombre y la nota de cada estudiante.
Tercero, calcula y muestra el promedio.
Y si quieres un reto, agrega un cuarto estudiante.
Tómate el tiempo que necesites
y sigue con el video cuando termines.

**Silencio de práctica:** 150 segundos.

## Escena 12 · Cierre
Tiempo orientativo: 10:05–10:32

**Pantalla:**
Mostrar la tarjeta «Lo que aprendiste hoy»:
- private protege los atributos.
- Los getters permiten leer y el setter valida los cambios.
- Un arreglo guarda varios objetos y empieza en 0.
- Construiste un registro de estudiantes.

Cerrar con:
«Siguiente: Lección 7, errores comunes y próximos pasos».

**Voz:**
¡Felicitaciones!
Hoy aprendiste a proteger los datos
con práivet, guet y set,
a guardar muchos objetos en un arreglo,
y construiste tu primer programa completo.
En la última lección te mostraré
los errores más comunes
y cómo encontrarlos rápido.
Hasta pronto.