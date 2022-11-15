public class App {
    public static void main(String[] args) throws Exception {
        int res = sumaNumero (3, 3, 13);
        System.out.println("El resultado es:" + res);

        //* 4. Crear un Objeto miCoche en el main y agregar una puerta
        coche miCoche = new coche();
        miCoche.agregarP();
        miCoche.agregarP();
        miCoche.agregarP();

        //* 5. Mostrar el numero de puertas que tiene el objeto
        miCoche.mostrarP();
    }

    public static int sumaNumero(int num1, int num2, int num3) {
        int resultado = num1 + num2 + num3;
        
        return resultado;   }
}

