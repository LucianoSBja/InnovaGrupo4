package erroes_programacion;

public class overflow {

    public static void main(String[] args) {
        byte numero = 127;
        System.out.println(numero);

        numero += 5; // ? (+=) significa que suma a la variable 5

        System.out.println(numero);

        // * El problema ocurre cuando le paso uno por encima del maximo y comienza
        // * contando por el minimo
        /*
         * Eso es lo que pasa en el codigo
         * 127 + 1 = -128
         * -128 + 1 = -127
         * -127 + 1 = -126
         * -126 + 1 = -125
         * -125 + 1 = -124
         */

    }

}
