package fr.dauphine.ja.tiacohalban.td00;
import java.util.*;

/**
 * Hello world!
 *
 */
public class PrimeCollection 
{
	static ArrayList<Integer> numbers = new ArrayList<Integer>();
	//Constructeur par défaut
	/*public PrimeCollection()
	{
		numbers = new ArrayList<Integer>();
	}*/
	//Main
    public static void main( String[] args )
    {
        System.out.println( "Bonjour!" );
        initRandom(100,2000);
        printPrimes(numbers);
    }
    //Méthodes 
	public static void initRandom(int n, int m)
	{
		for (int i=0;i<n;i++)
		{
			Random rand = new Random();
			int nombreAleatoire = rand.nextInt(m);
			numbers.add(nombreAleatoire);
		}
	}
	private static boolean isPrime(int p)
	{
		boolean isprime=true;
		double rest;
		for (int x=2;x<Math.sqrt((float)(p));x++)
		{
			rest=(float)p%(float)x;
		if (rest==0)
			isprime=false;
		}
		return isprime;
	}
	private static void printPrimes(ArrayList<Integer> pnumb)
	{
		for (Integer numb : pnumb)
		{
			if (isPrime(numb))
				System.out.println(numb);
		}
	}
}
