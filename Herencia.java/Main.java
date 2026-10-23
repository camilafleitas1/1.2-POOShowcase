// Ejemplo de Herencia (Del PDF de CREA)
class Animal {
    public void hacerSonido() {
        System.out.println("Sonido genérico de animal");
    }
}

class Perro extends Animal {
    @Override
    public void hacerSonido() {
        System.out.println("Guau! Guau!");
    }
}

public class Main {
    public static void main(String[] args) {
        Animal animal = new Animal();
        Perro perro = new Perro();

        System.out.print("Sonido de la clase base (Animal): ");
        animal.hacerSonido();

        System.out.print("Sonido de la clase derivada (Perro): ");
        perro.hacerSonido();
    }
}