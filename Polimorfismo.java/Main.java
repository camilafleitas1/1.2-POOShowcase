// Ejemplo de Polimorfismo (Del PDF de CREA)
abstract class Animal {
    public abstract void hacerSonido();
}

class Perro extends Animal {
    @Override
    public void hacerSonido() {
        System.out.println("El perro hace: ¡Guau! ¡Guau!");
    }
}

class Gato extends Animal {
    @Override
    public void hacerSonido() {
        System.out.println("El gato hace: ¡Miau! ¡Miau!");
    }
}

public class Main {
    public static void main(String[] args) {
        Animal[] animales = new Animal[2];
        animales[0] = new Perro();
        animales[1] = new Gato();

        for (Animal a : animales) {
            a.hacerSonido(); // Comportamiento distinto para el mismo método
        }
    }
}