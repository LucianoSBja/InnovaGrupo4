package polimorfismo;

public class ejemplo {
    public static void main(String[] args) {
        Coche coche = new Coche();

        // * Andara normalmente porque los parametros pedidos son diferentes
        coche.sumaNumeros(3, 4);
        coche.sumaNumeros((float) 3, (float) 4);
        coche.sumaNumeros(4.23, 3.5);
    }
}

class Vehiculo {
    public void diHola() {
        System.out.println("Hola!");
    }
}

// ? Puedo crear funciones con el mismo nombre pero los parametros cambian
class Coche extends Vehiculo {
    public void diHola() {
        System.out.println("Soy un coche");
    }

    public int sumaNumeros(int a, int b) {
        return a + b;
    }

    public float sumaNumeros(float a, Float b) {
        return a + b * (float) 9.0;
    }

    public void sumaNumeros(double a, double b) {
        System.out.println("El resultado es: " + (a + b));
    }
}