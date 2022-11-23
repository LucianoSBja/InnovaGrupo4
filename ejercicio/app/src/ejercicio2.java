public class ejercicio2 {

    public static void main(String[] args) throws Exception {

        int numeroif = -12;
        int numWhil = -2;
        int numDoWhil = -1;
        var estacion = "verano";

        // Uso if
        if (numeroif > 0) {
            System.out.println("es positivo");
        } else if (numeroif == 0) {
            System.out.println("es CERO");
        } else {
            System.out.println("es negativo");
        }

        // Uso While
        while (numWhil < 3) {
            numWhil++;
            System.out.println(numWhil);
        }

        // Uso Do While
        do {
            numDoWhil++;
            System.out.println(numDoWhil);
        } while (numDoWhil < 3);

        // Uso For
        for (int numFor = 0; numFor <= 3; numFor++) {
            System.out.println(numFor);
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