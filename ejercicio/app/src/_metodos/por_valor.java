package _metodos;

public class por_valor {

    public static void main(String[] args) {
        int valA = 5;
        int valB = 10;

        suma(valA, valB);

        System.out.println(valA);
        System.out.println(valB);
    }

    public static int suma(int a, int b) {
        return a + b;
    }
}
