public class Animal {

    // Attributes
    private int weight;
    private String color;
    private String sound;

    // Constructor
    public Animal(int w, String c, String s) {
        weight = w;
        color = c;
        sound = s;
    }

    // Methods
    public String makeSound() {
        return sound;
    }

    public String getColor() {
        return color;
    }

    public String getSound() {
        return sound;
    }

    public int getWeight() {
        return weight;
    }

    public String toString() {
        return "Weight: " + weight + " Color: " + color + " Sound: " + sound;
    }

}
