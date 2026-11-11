# Curso de Java para principiantes

Curso en video de aproximadamente una hora para estudiantes de 12 a 17 años que nunca han programado. Se aprenden los fundamentos de Java y de la programación orientada a objetos **sin instalar nada**: todas las prácticas se hacen en el navegador con [OnlineGDB](https://www.onlinegdb.com/), sin crear una cuenta.

El plan completo del curso, con los videos y los enlaces de cada práctica, está en [`course-plan.md`](course-plan.md).

## Lecciones

| N.º | Lección | Duración aprox. | Práctica |
|---|---|---|---|
| 1 | ¿Qué es Java y la programación? | 7 min 28 s | Hola, mundo |
| 2 | Variables, tipos de datos y operadores | 10 min 31 s | Variables y operadores |
| 3 | Estructuras de control: decisiones y bucles | 9 min 11 s | Decisiones y bucles |
| 4 | Métodos y entrada de datos | 6 min 09 s | Métodos y `Scanner` |
| 5 | Clases y objetos: tu primera mascota virtual | 6 min 03 s | Mascota virtual |
| 6 | Encapsulación, arreglos y tu primer programa | 7 min 15 s | Registro de estudiantes |
| 7 | Errores comunes, buenas prácticas y próximos pasos | 5 min 59 s | Corrige el programa |

## Cómo usar este curso

1. Mira el video de la lección.
2. Cuando el video lo indique, pausa y abre el enlace **Starter** de la descripción. Se abre en OnlineGDB con el código inicial.
3. Completa las líneas que empiezan con `// Practica` y presiona **Run**.
4. Si te atascas, compara tu código con el enlace **Completed** o con la carpeta `completed-examples` de este repositorio.

> El archivo siempre se llama `Main.java`. Si copias el código en otro editor, conserva ese nombre.

## Estructura del repositorio

```text
.
├── course-plan.md          # Plan del curso con videos y enlaces de práctica
├── scripts/                # Guion de cada video (pantalla y narración)
│   └── lesson-0N.md
├── starter-files/          # Código inicial que abre el estudiante
│   └── lesson-0N/Main.java
└── completed-examples/     # Solución completa de cada práctica
    └── lesson-0N/Main.java
```

## Probar los programas en tu computadora (opcional)

No es necesario para seguir el curso. Si tienes Java 11 o superior instalado, puedes ejecutar cualquier ejemplo directamente:

```bash
java completed-examples/lesson-05/Main.java
```

## Cómo colaborar

El equipo trabaja con GitFlow:

- `main` contiene solo lo entregado y `develop` integra el trabajo terminado. Ambas ramas están protegidas.
- Cada lección se trabaja en una rama `feature/lesson-0N-...` y entra a `develop` por un pull request revisado por otra persona del equipo.
- Los mensajes de commit siguen [Conventional Commits](https://www.conventionalcommits.org/) en inglés, por ejemplo `feat(lesson-05): add starter files` o `docs(scripts): add lesson 05 script`.
- En el código no se usan tildes ni la letra eñe, para evitar problemas de codificación en el editor en línea.

## Equipo

Universidad Peruana de Ciencias Aplicadas · Ingeniería de Software
1ASI0729 Desarrollo de Aplicaciones Open Source · NRC 7729 · Período 202620

**Equipo NexoStock**

| Integrante | Lecciones |
|---|---|
| Vizcarra Mamani, Candy Milagros (líder) | 1 y 2 |
| Tuesta Girón, Kiara Lucia | 3 y 4 |
| Crispin Valdivia, Angel Gabriel | 5 |
| Lopez Rimachi, Sebastian Leonardo | 6 |
| Montañez Salinas, Lorena Ariana | 7 |
