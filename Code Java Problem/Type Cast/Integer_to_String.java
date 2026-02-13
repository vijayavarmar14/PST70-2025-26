package Type_cast;
import java.util.Scanner;
public class Integer_to_String {

	public static void main(String[] args) {
		Scanner in =new Scanner(System.in);
		System.out.print("Enter the Integer : ");
		int a = in.nextInt();
        String str = String.valueOf(a); 
        for(int i = 0; i < str.length(); i++) {
            int digitValue = str.charAt(i) - '0';
            System.out.print(digitValue);
        }
        in.close();
    }
}