public class Passing
{
	public static void main(String[] args)
	{	
		int i, j;
		i = 5;
		j = 10;
		System.out.println( "I will pass " + i + " and " + j + " to the passed function.");
		factorial(i, j);
	}
	
	public static void factorial(int m, int n)
	{
		System.out.println("What did I get?");
		System.out.println("I got " + m + " and " + n);
		
	}
}