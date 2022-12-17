package clases;

public class publico {
    public static void main(String[] args) {
        Vehiculo vehiculo = new Vehiculo();
        vehiculo.tipo = "Coche";
        System.out.println(vehiculo.tipo);
    }

}

class Vehiculo {
    String tipo;
}