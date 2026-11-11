class Estudiante {
    private String nombre;
    private int nota;

    Estudiante(String nombre, int nota) {
        this.nombre = nombre;
        this.nota = nota;
    }

    String getNombre() {
        return nombre;
    }

    int getNota() {
        return nota;
    }

    // Practica 1: crea setNota(int nota) que solo acepte valores de 0 a 20
}

public class Main {
    public static void main(String[] args) {
        Estudiante[] clase = new Estudiante[3];
        clase[0] = new Estudiante("Ana", 18);
        clase[1] = new Estudiante("Luis", 14);
        clase[2] = new Estudiante("Mia", 16);

        // Practica 2: recorre el arreglo con un for y muestra el nombre y la nota de cada estudiante
        // Practica 3: calcula y muestra el promedio de las notas
    }
}