package Ascii;

import java.util.Scanner;

public class ascii_case {
	public static void main(String[] args) {
		Scanner in=new Scanner(System.in);
		System.out.print("Enter the character: ");
		 int chr = in.next().charAt(0);
		 acsii(chr);
		 in.close();
		 }
	static void acsii(int chr) {
		if (chr >= 65 && chr <= 90) {
			System.out.println("Character is Upper case");
		}
		else if (chr >= 97 && chr <= 122) {
			System.out.println("Character is Lower case");
		}
		else {
			System.out.println("Invalid");
		}
	}
}