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

    // Practica 2: crea el metodo celebrarCumple() que sume 1 a la edad y muestre un mensaje
}

public class Main {
    public static void main(String[] args) {
        Mascota luna = new Mascota("Luna", "gato", 3);

        luna.presentarse();
        luna.jugar();
        luna.comer();

        // Practica 1: crea tu propia mascota con new (por ejemplo, un perro llamado Toby de 5)
        // Practica 3: llama a celebrarCumple() y luego a presentarse() con tu mascota
    }
}
