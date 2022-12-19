package clases;

public class abstracta {
    public static void mainj(String[] args) {
        Coche coche = new Coche();
        coche.setSonido("brr");
        System.out.println(coche.getSonido());

    }
}

// ? Las clases abtractas no tienen cuerpo
// ? lo que herede de la clase abtracta tiene que implementar en la clase nueva
abstract class Vehiculo {
    int velocidadMaxima;
    String matricula;
    String sonido;

    public Vehiculo() {
        System.out.println("estoy en el constructor de Vehiculo");
    }

    // ? No tiene cuerpo de funcion entonces les decime que lo que herede de esta
    // ? lo va a tener que implementar si o si en las clases que cree
    abstract public void setSonido(String sonido);

    abstract public String getSonido();
}

class Coche extends Vehiculo {

    public void setSonido(String sonido) {
        this.sonido = sonido;
    }

    public String getSonido() {
        return "Soy un super sonido: " + this.sonido;
    }

}

class Moto extends Vehiculo {

    public void setSonido(String sonido) {
        this.sonido = sonido;
    }

    public String getSonido() {
        return "Soy un sonido de moto: " + this.sonido;
    }

}