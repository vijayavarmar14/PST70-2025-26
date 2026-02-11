package Pattern;
import java.util.Scanner;
class patten{
	static void star(int n) {
		for (int i=1 ;i<=n;i++) {
			System.out.println("*");
		}
}
public class Vertical_pattern {
	public static void main(String[] args) {
		Scanner in =new Scanner(System.in);
		System.out.print("Enter the number:");
		int input_valu=in.nextInt();
		patten.star(input_valu);
		in.close();
	}
  }
}