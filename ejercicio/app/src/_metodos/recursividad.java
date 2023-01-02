package _metodos;

public class recursividad {
    public static void main(String[] args) {
        factorial(8);
    }

    // ? Calcular el factorial de forma recursiva
    public static int factorial(int numero) {
        int resultado;
        if (numero == 1) {
            return 1;
        }

        // * la funcion se invoca asi misma hasta que se cumpla la condicion
        resultado = factorial(numero - 1) * numero;
        return resultado;
    }

    // ? Calcular el factorial de forma no recursiva
    public static int factorialNR(int numero) {
        int temp;
        int resultado = 1;

        for (temp = 1; temp <= numero; temp++) {
            resultado = resultado * temp;
        }
        return resultado;
    }

}
