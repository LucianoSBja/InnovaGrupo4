public class ejercicio2 {

    public static void main(String[] args) throws Exception {

        int numeroIf = -12;
        int numWhil = -2;
        int numDoWhil = -1;
        var estacion = "verano";

        // Uso if
        if (numeroIf > 0) {
            System.out.println("La variable numeroIf " + numeroIf + " es positivo");
        } else if (numeroIf == 0) {
            System.out.println("La variable numeroIf es 0");
        } else {
            System.out.println("La variable numeroIf " + numeroIf + " es negativo");
        }

        // Uso While
        while (numWhil < 3) {
            numWhil++;
            System.out.println("La variable numeroWhile es: \n" + numWhil);
        }

        // Uso Do While
        // Al no cumplirse la condición, solo entra en el bucle una vez
        do {
            numDoWhil++;
            System.out.println(numDoWhil);
        } while (numDoWhil < 3);

        // Uso For
        for (int numFor = 0; numFor <= 3; numFor++) {
            System.out.println("La variable numeroFor es: " + numFor);
        }

        // Uso Switch

        switch (estacion) {
            case "primavera":
                System.out.println("es Primavera");
                break;
            case "verano":
                System.out.println("es Verano");
                break;
            case "otoño":
                System.out.println("es Otoño");
                break;
            case "invierno":
                System.out.println("es Invierno");
                break;
            default:
                System.out.println("No es una estacion");

        }

    }
}