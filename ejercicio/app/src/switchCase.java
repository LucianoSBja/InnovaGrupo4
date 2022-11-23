public class switchCase {

    public static void main(String[] args) throws Exception {

        var estacion = "VERANO";

        switch (estacion) {
            case "VERANO":
                System.out.println("es verano");
                break;
            case "INVIERNO":
                System.out.println("es invierno");
                break;
            default:
                System.out.println(estacion);

                /*
                 * OTRO EJEMPLO
                 * 
                 * var hoy_es = "Martes";
                 * 
                 * switch (hoy_es) {
                 * case "LUNES":
                 * case "Martes":
                 * case "MIERCOLES":
                 * case "JUEVES":
                 * case "VIERNES":
                 * System.out.println("hoy es laborable");
                 * break;
                 * case "SABADO":
                 * case "DOMINGO":
                 * System.out.println("hoy NO es laborable");
                 * break }
                 */
        }

    }

}
