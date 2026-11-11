public class Main {
    public static void main(String[] args) {
        int edad = 15;

        if (edad >= 12) {
            System.out.println("Puedes ver la pelicula.");
        } else {
            System.out.println("Esta pelicula es para mayores.");
        }

        for (int i = 1; i <= 5; i++) {
            System.out.println("Numero: " + i);
        }

        int cuenta = 3;
        while (cuenta >= 1) {
            System.out.println(cuenta);
            cuenta--;
        }
        System.out.println("Despegue!");

        // Reto extra: tabla del 3
        for (int i = 1; i <= 5; i++) {
            System.out.println("3 x " + i + " = " + (3 * i));
        }
    }
}