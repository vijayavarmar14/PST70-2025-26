package Ascii;

import java.util.Scanner;

public class Sum_of_String {

	public static void main(String[] args) {
		Scanner in=new Scanner(System.in);
		System.out.print("Enter the string: ");
		String str = in.nextLine();
		sum(str);
		in.close();
	}
	static void sum(String str) {
		int a = 0;
		for(int i=0;i<str.length();i++) {
			a+=str.charAt(i);
		System.out.println("Sum of String : "+a);
		}
	}
}