package practise_java;
import java.util.Scanner;
public class Digit_Count {

	public static void main(String[] args) {
		Scanner in= new Scanner(System.in);
		System.out.println("Enter the number:");
		int num=in.nextInt();
		int count = 0;
	    int temp = num; 
	    if (temp == 0) {
	        count = 1;
	    } 
	    else {
	      while (temp > 0) {
	       temp = temp / 10; 
	       count++;         
	    }
	    }
	    System.out.println("The number of digits is: " + count);
	    in.close();
	}
	}
