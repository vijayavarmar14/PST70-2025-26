package Ascii;
import java.util.Scanner;
public class Char_Value {

	public static void main(String[] args) {
		Scanner in=new Scanner(System.in);
		System.out.print("Enter the ACSII valu: ");
		int value = in.next().charAt(0);
		chr(value);
		in.close();
	}
	static void chr(int value) {
		char character = (char) value; 
        System.out.println("The Character is: " + character);
    }
}