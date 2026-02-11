package numbers;
import java.util.Scanner;
public class Harshad_number {

	public static void main(String[] args) {
		Scanner in =new Scanner(System.in);
		System.out.print("Enter the number : ");
		int input =in.nextInt();
		sum(input);
		check(input, input);
		in.close();
	}
	 static void sum(int input) {
		int add = 0; 
        while (input != 0) {
            int digit = input % 10;
            add += digit;
            input /= 10;
        }
	}
	 static void check(int add,int input) {
		 if (input%add==0) {
			 System.out.println(input+" is a Harshad number");
		 }
		 else {
			 System.out.println(input+" not a Harshad number");
		 }
	 }
}