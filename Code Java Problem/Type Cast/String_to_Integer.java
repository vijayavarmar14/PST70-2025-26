package Type_cast;
import java.util.Scanner;
public class String_to_Integer {

	public static void main(String[] args) {
		Scanner in =new Scanner(System.in);
		System.out.print("Enter the String : ");
		String str = in.nextLine();
		for(int i=0; i<str.length();i++) {
			System.out.print((int)str.charAt(i)-48);
		}
		in.close();
	}

} 