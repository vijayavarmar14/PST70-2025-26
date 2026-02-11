package numbers;
import java.util.Scanner;
public class Automorphic_number {

	public static void main(String[] args) {
		Scanner in =new Scanner(System.in);
		System.out.println("Enter the Number:");
		int a=in.nextInt();
		int count = 0;
	    int temp = a;
	    double check=1;
	    //count
	    if (temp == 0) {
	        count = 1;
	    } 
	    else {
	      while (temp > 0) {
	    	  temp = temp / 10;
	    	  count++;
	    	  }
	      }
	    //square
	    int digit= a*a;
	    //check
	    check= digit % (Math.pow(10, count));
	    if(check==a) {
	    	System.out.println(a+ "is a automorphic number");
	    	}
	    else {
	    	System.out.println(a+ "is not a automorphic number");
	    	}
	    in.close();
	}
}