package practise_java;
import java.util.Scanner;
public class Multiplication_Table {

	public static void main(String[] args) {
		Scanner in=new Scanner(System.in);
		System.out.println("Enter a number:");
		int a=in.nextInt();
		for(int i=1;i<=10;i++) {
			System.out.println(a+"x"+i+"="+(a*i));
		}
in.close();
	}

}
