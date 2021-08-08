public class Main {

    public static void main(String[] args) {
        // you can test how your classes work here
        NoiseCapable dog = new Dog();
        dog.makeNoise();

        NoiseCapable cat = new Cat("Garfield");
        cat.makeNoise();
        // cat.purr() => Fails because cat is NoiseCapable, not Cat type.
        // For that to work, first need to assign it the type Cat.
        Cat c = (Cat) cat;
        c.purr();
    }

}
