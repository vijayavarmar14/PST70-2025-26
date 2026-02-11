package Ascii;

import java.util.Scanner;

public class Value_char {
	
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter the character: ");
        int chr = in.next().charAt(0); 
        acsii(chr); 
        in.close();
    }
    static void acsii(int chr) {
        int asciiValue = (int) chr; 
        System.out.println("The ASCII value is " + asciiValue);
    }
}
