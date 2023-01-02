package _metodos;

public class por_referencia {
    public static void main(String[] args) {
        Coche coche = new Coche();

        cocheChanger(coche);
        cocheChanger(coche);

        System.out.println(coche.velocidad);

    }

    public static void cocheChanger(Coche coche) {
        coche.velocidad = coche.velocidad + 50;
    }

}

interface Vehiculo {
    void Acelerar(int cuantaVelocidad);

    void Frenar(int cuantaVelocidad);
}

// ? 'implements' utilizamos cuando creamos una iterface
class Coche implements Vehiculo {
    int velocidad = 0;

    public void Acelerar(int cuantaVelocidad) {

    }

    public void Frenar(int cuantaVelocidad) {

    }
}