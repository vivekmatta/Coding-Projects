public class Poodle extends Dog {

    // Attributes
    private String name;
    private boolean rabies;

    // Constructor
    public Poodle(int w, String c, String s, boolean f, String b, String n, boolean r) {
        super(w, c, s, f, b);
        name = n;
        rabies = r;

    }

    // Methods
    public String bark() {
        return super.makeSound();
    }

    public String toString() {
        return super.toString() + " Name : " + name + " Rabies: " + rabies;
    }

}
