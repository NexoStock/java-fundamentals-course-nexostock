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

    void setNota(int nota) {
        if (nota >= 0 && nota <= 20) {
            this.nota = nota;
        } else {
            System.out.println("Nota no valida: " + nota);
        }
    }
}

public class Main {
    public static void main(String[] args) {
        Estudiante[] clase = new Estudiante[3];
        clase[0] = new Estudiante("Ana", 18);
        clase[1] = new Estudiante("Luis", 14);
        clase[2] = new Estudiante("Mia", 16);

        clase[1].setNota(25);
        clase[1].setNota(15);

        int suma = 0;
        for (int i = 0; i < clase.length; i++) {
            Estudiante e = clase[i];
            System.out.println(e.getNombre().toUpperCase() + ": " + e.getNota());
            suma = suma + e.getNota();
        }

        double promedio = (double) suma / clase.length;
        System.out.println("Promedio del grupo: " + promedio);
    }
}