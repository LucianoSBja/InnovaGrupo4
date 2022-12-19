package polimorfismo;

public class polimorfismo {
    public static void main(String[] args) {
        Coche coche = new Coche();
        coche.diHola();
    }
}

// !Si borro la clase COCHE el codigo seguira porque el Padre no se elimino
class Vehiculo {
    public void diHola() {
        System.out.println("Hola!");
    }
}

// ? Lo cambiara porque asi funciona el POLIMORFISMO
class Coche extends Vehiculo {
    public void diHola() {
        System.out.println("Soy un coche");
    }
}