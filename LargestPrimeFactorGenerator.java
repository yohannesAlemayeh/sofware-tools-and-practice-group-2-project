package tools;
import java.util.Scanner;
public class LargestPrimeFactorGenerator {
	public static int getLargestPrimeFactor(int n) {
        int largestPrimeFactor = 1;
        while(n % 2 == 0) {
            largestPrimeFactor = 2;
            n = n / 2;
        }
        
        for(int i = 3; i < (Math.sqrt(n) + 1); i = i + 2) {
            while(n % i == 0) {
                largestPrimeFactor = i;
                n = n / i;
            }
        }
        
        if(n > 2) {
            largestPrimeFactor = n;
        }
        return largestPrimeFactor;
    }

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("enter number");
		try (Scanner sc2 = new Scanner(System.in)) {
			int n=sc2.nextInt();
			 System.out.println(getLargestPrimeFactor( n));
		}
		 
	}

}
