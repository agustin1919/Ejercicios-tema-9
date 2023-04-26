// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
     //Crea una clase Persona con las siguientes variables:
        //La edad
        //El nombre
        //El teléfono
        //Una vez creada la clase, crea una nueva clase Cliente que herede de Persona,
        //esta nueva clase tendrá la variable credito solo para esa clase.
        //Crea ahora un objeto de la clase Cliente que debe tener como propiedades la edad,
        //el telefono, el nombre y el credito, tienes que darles valor y mostrarlas por pantalla.
        //Una vez hecho esto, haz lo mismo con la clase Trabajador que herede de Persona, y con una
        //variable salario que solo tenga la clase Trabajador.

        //Cliente
        Cliente cliente = new Cliente();
        cliente.setNombre("Facundo");
        cliente.setEdad(23);
        cliente.setTelefono(1140804114);
        cliente.setCredito(79.9f);
        System.out.println(cliente.getNombre());
        System.out.println(cliente.getEdad());
        System.out.println(cliente.getTelefono());
        System.out.println(cliente.getCredito());

        // Trabajador
        Trabajador trabajador = new Trabajador();
        trabajador.setNombre("Agustin");
        trabajador.setEdad(25);
        trabajador.setTelefono(1144446666);
        trabajador.setSalario(2100f);
        System.out.println(trabajador.getNombre());
        System.out.println(trabajador.getEdad());
        System.out.println(trabajador.getTelefono());
        System.out.println(trabajador.getSalario());
    }
}

class Persona {
    String nombre;
    int edad;
    int telefono;

    public void setNombre(String nombre){
        this.nombre = nombre;
    }
    public String getNombre(){
        return this.nombre;
    }
    public void setEdad(int edad){
        this.edad = edad;
    }
    public int getEdad(){
        return this.edad;
    }
    public void setTelefono(int telefono){
        this.telefono = telefono;
    }
    public int getTelefono(){
        return this.telefono;
    }
}
class Cliente extends Persona {
    private float credito;
    public void setCredito(float credito){
        this.credito = credito;
    }
    public float getCredito(){
        return this.credito;
    }
}
class Trabajador extends Persona{
    private float salario;
    public void setSalario(float salario){
        this.salario = salario;
    }
    public float getSalario(){
        return this.salario;
    }
}