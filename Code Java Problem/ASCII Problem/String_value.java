package Ascii;
import java.util.Scanner;
public class String_value {

	public static void main(String[] args) {
		Scanner in=new Scanner(System.in);
		System.out.print("Enter the string: ");
		String str = in.nextLine();
		value(str);
		in.close();
	}
	static void value(String str) {
		for(int i=0;i<str.length();i++) {
			System.out.println(str.charAt(i)+" : "+(int) str.charAt(i));
		}
	}
}