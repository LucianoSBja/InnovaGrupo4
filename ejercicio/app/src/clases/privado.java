package clases;

public class privado {

    public static void main(String[] args) {
        // * Con SETTER establecemo la propiedad de forma indirecta
        Vehiculo coche = new Vehiculo();
        coche.setTipo("Coupe");

        Vehiculo moto = new Vehiculo();
        moto.setTipo("Scotter");

        // * Y luego lo imprimimos con GETTER para mostralo en consola
        System.out.println(coche.getTipo());
        System.out.println(moto.getTipo());
    }

}

class Vehiculo {
    private String tipo;

    // ? el SETTER fija un valor
    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    // ? el GETTER devuelve
    public String getTipo() {
        return this.tipo;
    }
}
