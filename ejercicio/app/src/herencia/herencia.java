package herencia;

public class herencia {
    public static void mainj(String[] args) {
        Coche coche = new Coche();
        coche.velocidadMaxima = 14;
        coche.matricula = "ABC 1234 ES";
    }
}

// ? Esta clase seria la principal que herea a todos sus hujos sus propiedades.
abstract class Vehiculo {
    int velocidadMaxima;
    String matricula;

    public boolean compruebaMatricula(String matricula) {
        if (matricula == "XXX") {
            return true;
        } else {
            return false;
        }
    }
}

// ? para heredar se tiene que poner "extends" y luedo el padre que hereda
class Coche extends Vehiculo {
}

// ? final class es una clase en donde no podemos heredar
final class CocheElectrico extends Vehiculo {
}
