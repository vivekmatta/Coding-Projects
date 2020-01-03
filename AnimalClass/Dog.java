public class Dog extends Animal {

    // Attributes
    private String breed;
    private boolean friendly;

    // Constructor
    public Dog(int w, String c, String s, boolean f, String b) {
        super(w, c, s);
        friendly = f;
        breed = b;
    }

    // Methods
    public String bark() {
        return super.makeSound();
    }

    public String toString() {
        return super.toString() + " Friendly: " + friendly + " Breed: " + breed;
    }

}
