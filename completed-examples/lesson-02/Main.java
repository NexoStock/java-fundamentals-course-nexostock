
public class Main {
    public static void main(String[] args) {
        String nombre = "Alex";
        int edad = 15;
        double altura = 1.62;
        boolean estudiante = true;

        System.out.println("Nombre: " + nombre);
        System.out.println("Edad: " + edad);
        System.out.println("Altura: " + altura + " m");
        System.out.println("Es estudiante: " + estudiante);

        int meses = edad * 12;
        int doble = edad * 2;
        int mitad = edad / 2;
        double mitadExacta = edad / 2.0;
        int resto = edad % 4;

        System.out.println("Meses vividos: " + meses);
        System.out.println("Doble de la edad: " + doble);
        System.out.println("Mitad (entero): " + mitad);
        System.out.println("Mitad (con decimales): " + mitadExacta);
        System.out.println("Resto de dividir entre 4: " + resto);
    }
}
