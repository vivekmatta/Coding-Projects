public class StudentAthlete extends Student {

    // Attributes
    private String sport;
    private boolean varsity;
    private int experience;

    // Constructors

    public StudentAthlete() {
        sport = "soccer";
        varsity = false;
        experience = 10;
    }

    public StudentAthlete(String s, boolean v, int e) {
        sport = s;
        varsity = v;
        experience = e;
    }

    // Setter and Getter Functions
    public String getSport() {
        return sport;
    }

    public boolean getvarsity() {
        return varsity;
    }

    public int getExperience() {
        return experience;
    }


    public String toString() {
        return super.toString() + " Sport: " + sport + " Varsity: " + varsity + " Experience: " + experience + " years";
    }

}
