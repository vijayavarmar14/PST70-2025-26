package practise_java;
import java.util.Scanner;
public class Armstrong_number {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.println("Enter the number");
		int a=in.nextInt();
		int x=a;
		int sum=0,count=0;
		int temp=a;
		
	     {
	      while (temp > 0) {
	       temp = temp / 10; 
	       count++;
	       }
	    }
	     while (a>0) {
	    	 sum+=(int)Math.pow(a%10,count);
	    	 a/=10;
	     }
	     if (x==sum)
	     System.out.println("Armstrong");
	     else
	    	 System.out.println("Not armstrong");
		in.close();
	}

}
