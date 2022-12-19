package herencia;

public class herencia_multiple {
    public static void mainj(String[] args) {

    }
}

class Vehiculo {
    int velocidadMaxima;
}

class Motor {
    String tipoMotor;

    public Motor() {
        System.out.println("estoy en el constructor motor");
    }
}

// class Coche extends Vehiculo, Motor {
// }