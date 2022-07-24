public class Main {
    public static void main(String[] args) {
        Cliente cliente = new Cliente();
        cliente.edad = 29;
        cliente.telefono = 943552659;
        cliente.nombre = "Jack";
        cliente.credito = 5;

        System.out.println("Nombre: "+cliente.nombre);
        System.out.println("Telefono: "+cliente.telefono);
        System.out.println("Edad: "+cliente.edad);
        System.out.println("Credito: "+cliente.credito+"%");
        System.out.println("-----------");

        Trabajador trabajador = new Trabajador();
        trabajador.edad = 40;
        trabajador.telefono = 943552659;
        trabajador.nombre = "Cosme";
        trabajador.salario = 2500;
        System.out.println("Nombre: "+trabajador.nombre);
        System.out.println("Telefono: "+trabajador.telefono);
        System.out.println("Edad: "+trabajador.edad);
        System.out.println("Salario: S/."+trabajador.salario);
    }
}

class Persona{
    int edad;
    String nombre;
    int telefono;
}

class Cliente extends Persona{
    int credito;
}

class Trabajador extends Persona{
    int salario;
}