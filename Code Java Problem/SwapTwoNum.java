package practise_java;
// to Swap two numbers 
import java.util.Scanner;
public class SwapTwoNum {

	public static void main(String[] args) {
	Scanner in = new Scanner(System.in);
	int a= in.nextInt();
	System.out.println("Enter a:"+a);
	int b= in.nextInt();
	System.out.println("Enter b:"+b);
	b=b+a;
	a=b-a;
	b=b-a;
	System.out.println("After swaping:"+a +b);
	in.close();
	}
}
