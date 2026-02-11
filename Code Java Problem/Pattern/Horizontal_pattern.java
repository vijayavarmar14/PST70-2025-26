package Pattern;
import java.util.Scanner;
class Pattern{
	static void star(int n) {
		for(int i=0;i<n;i++) {
			System.out.print("*");
		}
	}
}
public class Horizontal_pattern {

		public static void main(String[] args) {
			Scanner in =new Scanner(System.in);
			System.out.print("Enter the number:");
			int input_valu=in.nextInt();
			Pattern.star(input_valu);
			in.close();
		}
}