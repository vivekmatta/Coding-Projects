public class AnimalClassRunner {
    public static void main (String [] args) {

        // Main class - sub-class of Object
        System.out.println("Class: Animal");
        Animal a = new Animal(34, "Blue", "Woof");
        System.out.println(a);
        System.out.println();

        // Sub-class of Animal
        System.out.println("Class: Cat");
        Cat c = new Cat(54, "Red", "Woof", true, "Siamese");
        System.out.println(c);
        System.out.println();

        // Sub-class of Animal
        System.out.println("Class: Dog");
        Dog d = new Dog(54, "Red", "Woof", true, "Poodle");
        System.out.println(d);
        System.out.println();

        // Sub-class of Dog
        System.out.println("Class: Poodle");
        Poodle p = new Poodle(27, "Red", "Bark", true, "Fluff", "Sally", true);
        System.out.println(p);
        System.out.println();

    }
}
