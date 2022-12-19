package ejercicios;

public class ejercicio_tema_9 {
    public static void main(String[] args) {
        Cliente cliente = new Cliente();
        Trabajador trabajador = new Trabajador();

        cliente.setNombre("luciano");
        cliente.setEdad(27);
        cliente.setTelefono(12345);
        cliente.setCredito(125.5);

        System.out.println("Soy " + cliente.getNombre() + ", tengo " + cliente.getEdad() + " años y mi telefono es "
                + cliente.getTelefono() + " y mi credito disponible es " + cliente.getCredito() + "$ARG");

        trabajador.setNombre("Ezequiel");
        trabajador.setEdad(29);
        trabajador.setTelefono(54321);
        trabajador.setSalario(30.000);

        System.out
                .println("Soy " + trabajador.getNombre() + ", tengo " + trabajador.getEdad() + " años y mi telefono es "
                        + trabajador.getTelefono() + " y mi salario disponible es " + trabajador.getSalario() + "$ARG");

    }
}

class Persona {
    String nombre;
    int edad;
    int telefono;

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getNombre() {
        return this.nombre;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public int getEdad() {
        return this.edad;
    }

    public void setTelefono(int telefono) {
        this.telefono = telefono;
    }

    public int getTelefono() {
        return this.telefono;
    }
}

class Cliente extends Persona {
    double credito;

    public void setCredito(double credito) {
        this.credito = credito;
    }

    public double getCredito() {
        return this.credito;
    }
}

class Trabajador extends Persona {
    double salario;

    public void setSalario(double salario) {
        this.salario = salario;
    }

    public double getSalario() {
        return this.salario;
    }
}
