import java.util.Scanner;
public class Converter {
	public static void main(String [] args) {
    	int a;
    	Scanner scan = new Scanner (System.in);
    	System.out.println("What do you want to convert? Distance or Temperature? Enter 1 for Distance and 2 for Temperature.");
    	a = scan.nextInt();
    	if (a == 1) 
        	doDistance();
    	else
        	doTemperature();
	}

public static void doTemperature() {	
	int a;
	double f,c;
    f = c = 0.0;
	Scanner scan = new Scanner (System.in);
	System.out.println("What would you like to convert to? Enter 1 for Fahrenheit and 2 for Celsius.");
    a = scan.nextInt();
	if (a == 1) {
    	System.out.println("Please enter degrees F");
    	f = scan.nextDouble();
    	c = (5.0/9.0)*(f-32);
    	System.out.println(f + " degrees F is " + c + " degrees C.");
    }
	else if  (a == 2) {
    	System.out.println("Please enter degrees C");
    	c = scan.nextDouble();
    	f = c*(9.0/5.0)+32;
    	System.out.println(c + " degrees C is " + f + " degrees F.");	
    }	
    else {
    	System.out.println("Unknown Input. Restart and try again.");
    }
}

public static void doDistance () {
	int a;
	double m, km;
    m = km = 0.0;
	Scanner scan = new Scanner (System.in);
	System.out.println("What would you like to convert? Enter 1 for Miles and 2 for Kilometers.");
    a = scan.nextInt();
	if (a == 1) {
    	System.out.println("Please enter degrees M");
    	m = scan.nextDouble();
    	km = (1.609)*(m);
    	System.out.println(m + " miles is " + km + " kilometers.");
    }
	else if (a == 2) {
    	System.out.println("Please enter KM");
    	km = scan.nextDouble();
    	m = km/(1.609);
    	System.out.println(km + " kilometers is " + m + " miles.");
    }
    else {
    	System.out.println("Unknown Input. Restart and try again.");
    }
}		
}
