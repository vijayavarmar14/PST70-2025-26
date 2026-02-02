package practise_java;
// To find given number is even or odd
import java.util.Scanner;
public class EvenOrOdd {

	public static void main(String[] args) {
		Scanner num= new Scanner(System.in);
		System.out.println("Enter the number:");
		int a = num.nextInt();
		if(a/2==0) {
		System.out.println("number is even");
	}
		else {
		System.out.println("number is odd");	
		}
	num.close();	
	}

}
