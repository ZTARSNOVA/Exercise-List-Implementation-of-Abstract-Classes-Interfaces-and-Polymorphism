public class Main {
    public static void main(String[] args) {
        Animal[] animales = { new Perro(), new Gato(), new Leon() };

        for (Animal animal : animales) {
            animal.hacerSonido();
        }
    }
}
