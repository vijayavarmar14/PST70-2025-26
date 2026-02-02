package practise_java;
import java.util.Scanner;
public class Largest_of_three_num {

	public static void main(String[] args) {
	   Scanner in= new Scanner(System.in);
	   System.out.println("Enter the three numbers:");
	   int a=in.nextInt();
	   int b=in.nextInt();
	   int c=in.nextInt();
	   if (a>b && a>c) {
		   System.out.println(a + "is Largers");
	   }
	   else if(b>a && b>c) {
		   System.out.println(b + "is Largest");
	   }
	   else {
		   System.out.println(c + "is Largest");
	   }
in.close();
	}

}
