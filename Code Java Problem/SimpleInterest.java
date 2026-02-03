package practise_java;
import java.util.Scanner;
public class SimpleInterest {

	public static void main(String[] args) {
	  Scanner num = new Scanner(System.in);
	  int P,R,T,S;
	  P=num.nextInt();
	  System.out.println("Enter the Prinsciple;"+P);
	  R=num.nextInt();
	  System.out.println("Enter the Rate of intrest;"+R);
	  T=num.nextInt();
	  System.out.println("Enter the Rate of Time period;"+T);
	  S=(P*R*T)/100;
	  System.out.println("Simple Intrest:"+S);
	num.close();
	}

}
