package _metodos;

public class metodos {
    public static void main(String[] args) {
        // * Creamo una instancia
        Coche coche = new Coche();

        // * Invocamos al metodo (Acelerar)
        coche.Acelerar(50);
    }
}

interface Vehiculo {
    void Acelerar(int cuantaVelocidad);

    void Frenar(int cuantaVelocidad);
}

// ? 'implements' utilizamos cuando creamos una iterface
class Coche implements Vehiculo {
    public void Acelerar(int cuantaVelocidad) {

    }

    public void Frenar(int cuantaVelocidad) {

    }
}