public class Main {
    public static void main(String[] args) {
        string nombre = "Alex";
        int edad = 15
        System.out.println(nombre + " tiene " + edad);

        if (edad = 15) {
            System.out.println("Tienes 15");
        }

        int[] notas = {18, 15, 14};
        int suma = 0;
        for (int i = 0; i <= notas.length; i++) {
            suma = suma + notas[i];
        }
        double promedio = suma / notas.length;
        System.out.println("Promedio: " + promedio);
    }
}
