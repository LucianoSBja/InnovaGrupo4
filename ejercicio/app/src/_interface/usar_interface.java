package _interface;

public class usar_interface {
    public static void main(String[] args) {
        Coche coche = new Coche();
        Moto moto = new Moto();

        EjecutaAcelerar(coche);
        EjecutaAcelerar(moto);
    }

    // * Llamo y le doy un parametro igual que la interface
    public static void EjecutaAcelerar(Vehiculo vehiculo) {

        // ? Paso el nombre de la clase que implemente esa interfas
        vehiculo.Acelerar(15);
    }
}

interface Vehiculo {
    void Acelerar(int cuantaVelocidad);

    void Frenar(int cuantaVelocidad);
}

// ? 'implements' utilizamos cuando creamos una iterface
class Coche implements Vehiculo {

    public void Acelerar(int cuantaVelocidad) {
        System.out.println("Coche() -> Acelerar()");
    }

    public void Frenar(int cuantaVelocidad) {
        System.out.println("Coche() -> Frenar()");
    }
}

class Moto implements Vehiculo {

    public void Acelerar(int cuantaVelocidad) {
        System.out.println("Moto() -> Acelerar()");
    }

    public void Frenar(int cuantaVelocidad) {
        System.out.println("Moto() -> Frenar()");
    }
}