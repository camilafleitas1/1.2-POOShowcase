// Ejemplo de Abstracción
abstract class Mascota {
    private String nombre;
    private int edad;

    public Mascota(String nombre, int edad) {
        this.nombre = nombre;
        this.edad = edad;
    }

    public String getNombre() { return nombre; }
    public int getEdad() { return edad; }

    // Método abstracto: define QUÉ hace, no CÓMO lo hace
    public abstract void hacerSonido();
}

class Perro extends Mascota {
    public Perro(String nombre, int edad) {
        super(nombre, edad);
    }

    @Override
    public void hacerSonido() {
        System.out.println(getNombre() + " dice: ¡Guau! ¡Guau!");
    }
}

public class Main {
    public static void main(String[] args) {
        Mascota miMascota = new Perro("Firulais", 3);
        System.out.println("Mascota: " + miMascota.getNombre() + ", Edad: " + miMascota.getEdad());
        miMascota.hacerSonido();
    }
}