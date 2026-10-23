// Ejemplo de Encapsulamiento
class Mascota {
    private String nombre;
    private int edad; // Atributo privado

    public Mascota(String nombre, int edad) {
        this.nombre = nombre;
        setEdad(edad);
    }

    public String getNombre() { return nombre; }
    public int getEdad() { return edad; }

    // Control y validación mediante setter
    public void setEdad(int nuevaEdad) {
        if (nuevaEdad >= 0) {
            this.edad = nuevaEdad;
        } else {
            System.out.println("Error: La edad no puede ser negativa.");
        }
    }
}

public class Main {
    public static void main(String[] args) {
        Mascota miMascota = new Mascota("Bobi", 4);
        System.out.println("Edad inicial de " + miMascota.getNombre() + ": " + miMascota.getEdad());

        miMascota.setEdad(-2); // Intento de asignación inválida
        miMascota.setEdad(5);  // Asignación válida
        System.out.println("Nueva edad de " + miMascota.getNombre() + ": " + miMascota.getEdad());
    }
}