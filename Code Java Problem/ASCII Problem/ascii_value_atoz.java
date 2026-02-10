package Ascii;

public class ascii_value_atoz {

	public static void main(String[] args) {
		Uppercase();
		Lowercase();
	}
	static void Uppercase() {
		for (char ch = 'A'; ch <= 'Z'; ch++) {
        System.out.println(ch + " : " + (int) ch);
        }
	}
	static void Lowercase() {
		for (char ch = 'a'; ch <= 'z'; ch++) {
	    System.out.println(ch + " : " + (int) ch);
	    }
	}
}