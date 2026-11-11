import java.util.Scanner;

public class Main {

    static void saludar(String nombre) {
        System.out.println("Hola, " + nombre + "!");
    }

    static int sumar(int a, int b) {
        return a + b;
    }

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        System.out.println("Como te llamas?");
        String nombre = entrada.nextLine();
        saludar(nombre);

        System.out.println("Que edad tienes? (escribe un numero)");
        int edad = entrada.nextInt();
        System.out.println("En tu proximo cumpleanos tendras " + sumar(edad, 1) + ".");
    }
}