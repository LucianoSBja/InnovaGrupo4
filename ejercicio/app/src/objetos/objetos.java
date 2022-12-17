package objetos;

public class objetos {

    public static void main(String[] args) {

        Coche coche = new Coche();
        System.out.println("Coche primero " + coche.numeroDePuertas);
        System.out.println("Coche primero " + coche.velocidadMaxima);
        System.out.println("Coche primero " + coche.velocidadActual);

        Coche coche2 = new Coche(2, 90);
        System.out.println("Coche primero " + coche2.numeroDePuertas);
        System.out.println("Coche primero " + coche2.velocidadMaxima);
        System.out.println("Coche primero " + coche2.velocidadActual);
    }
}

class Coche {
    // Propiedades
    int numeroDePuertas;
    int velocidadMaxima;
    float velocidadActual;

    // Constructor

    // Sin parametros
    public Coche() {
        numeroDePuertas = 5;
        velocidadMaxima = 120;
        System.out.println("Estoy en el contructor ***sin nadad***");
    }

    // Con parametros
    public Coche(int puertas, int velocidad) {
        numeroDePuertas = puertas;
        velocidadMaxima = velocidad;
        System.out.println("Estoy en el contructor CON PARAMETROS");
    }

    // Funciones
    public void acelerar() {
        velocidadActual += 15;
    }

    public void decelerar() {

    }
}
