public class ExchangeStudent extends Student {

    // Attributes
    private String country;
    private String language;

    // Constructor 1
    public ExchangeStudent(String l, String c) {
        super();
        language = l;
        country = c;
    }

    /* ------------------------------------------------ */
    // Constructor 2
    public ExchangeStudent(String fn, String ln, String l, String c) {
        super(fn, ln);
        language = l;
        country = c;
    }

    /* ------------------------------------------------ */

    // Setter and Getter Functions
    public String getLanguage() {
        return language;
    }

    public String getCountry() {
        return country;
    }


    public String toString() {
        return super.toString() + " Language: " + language + " Country: " + country;
    }





}
