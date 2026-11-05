import java.util.Scanner;

public class Main {

    // Metodo que muestra un saludo y no devuelve nada
    static void saludar(String nombre) {
        System.out.println("Hola, " + nombre + "!");
    }

    // Practica 1: crea un metodo sumar(int a, int b) que devuelva la suma de los dos numeros

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        System.out.println("Como te llamas?");
        String nombre = entrada.nextLine();
        saludar(nombre);

        // Practica 2: pregunta la edad con entrada.nextInt() y muestra tu proxima edad usando sumar(edad, 1)
    }
}