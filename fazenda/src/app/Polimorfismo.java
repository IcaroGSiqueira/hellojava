package app;
import classes.*;

public class Polimorfismo {
    public static void main(String[] args) throws Exception {

        Animal animal1 = new Cachorro(4, 30, 4, false);
        Animal animal2 = new Gato(3, 3, 4, false);
        Animal animal3 = new Pato(2, 6, 2, true);
        Animal animal4 = new Cachorro(7, 25, 3, false);

        animal1.som();
        animal2.som();
        animal3.som();
        animal4.som();
    }
}
