class Mascota {
    String nombre;
    String tipo;
    int edad;
    int energia;

    Mascota(String nombre, String tipo, int edad) {
        this.nombre = nombre;
        this.tipo = tipo;
        this.edad = edad;
        this.energia = 50;
    }

    void presentarse() {
        System.out.println("Hola, soy " + nombre + ". Soy un " + tipo + " y mi edad es " + edad + ".");
    }

    void comer() {
        energia = energia + 20;
        System.out.println(nombre + " come. Energia: " + energia);
    }

    void jugar() {
        if (energia >= 30) {
            energia = energia - 30;
            System.out.println(nombre + " juega feliz. Energia: " + energia);
        } else {
            System.out.println(nombre + " necesita descansar. Energia: " + energia);
        }
    }

    void celebrarCumple() {
        edad = edad + 1;
        System.out.println(nombre + " celebra su cumple. Nueva edad: " + edad);
    }
}

public class Main {
    public static void main(String[] args) {
        Mascota luna = new Mascota("Luna", "gato", 3);
        Mascota toby = new Mascota("Toby", "perro", 5);

        luna.presentarse();
        luna.jugar();
        luna.comer();

        System.out.println("---");

        toby.presentarse();
        toby.jugar();
        toby.jugar();
        toby.celebrarCumple();
        toby.presentarse();
    }
}
