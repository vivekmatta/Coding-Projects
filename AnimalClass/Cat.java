public class Cat extends Animal {

    // Attributes
    private String breed;
    private boolean friendly;

    // Constructor
    public Cat(int w, String c, String s, boolean f, String a) {
        super(w, c, s);
        friendly = f;
        breed = a;
    }

    // Methods
    public String bark() {
        return super.makeSound();
    }

    public String toString() {
        return super.toString() + " Friendly: " + friendly + " Breed: " + breed;
    }

}
