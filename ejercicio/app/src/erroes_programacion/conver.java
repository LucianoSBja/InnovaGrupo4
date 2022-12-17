package erroes_programacion;

public class conver {

    public static void main(String[] args) {
        double euros = 15.999;
        int eurosInt;

        eurosInt = (int) euros;
        imprimeEuros(eurosInt);

        // Solucion correcta dandole el tipo de dato correcto
        correccion(euros);
    }

    public static void imprimeEuros(int valor) {
        // Compila el codigo pero me da informacion erronea porque es un float y no un
        // entero.
        System.out.println(valor);

    }

    public static void correccion(double valor) {
        // Compila el codigo pero me da informacion erronea porque es un float y no un
        // entero.
        System.out.println(valor);

    }
}
