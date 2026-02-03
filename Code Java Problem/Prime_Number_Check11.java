package practise_java;
import java.util.Scanner;
public class Prime_Number_Check11 {
		public static void main(String[] args) {
	    Scanner sc = new Scanner(System.in);
	    System.out.print("Enter a number: ");
	    int num = sc.nextInt();
	    int i = 2;
	    boolean isPrime = true;
	    if (num <= 1) {
	    	isPrime = false;
	    } 
	    else {
	    	while (i <= num / 2) {
	    		if (num % i == 0) {
	    			isPrime = false;
	    		 }
	    		 i++;
	    	}
	    }
	    if (isPrime) {
	    	System.out.println(num+"is a Prime number");
	    } 
	    else {
	    	System.out.println(num+"is not a prime number");
	    	sc.close();
	     }
	 }
}