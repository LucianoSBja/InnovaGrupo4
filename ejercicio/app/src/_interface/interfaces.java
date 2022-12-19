package _interface;

public class interfaces {
    public static void main(String[] args) {

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
