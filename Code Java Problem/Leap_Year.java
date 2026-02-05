package practise_java;
//leap year
import java.util.Scanner;
public class Leap_Year {

	public static void main(String[] args) {
    Scanner year = new Scanner(System.in);
    System.out.println("Enter the Year");
    int y=year.nextInt();
    if (y>0) {
    	if(y%4==0 && y% 100!=0) {
    		System.out.print("It is a Leap year");
    	}
    	else if(y%400==0){
    		System.out.print("It is a Leap year");
    	}
    	else {
    		System.out.println("It is not a Leap year");
    	}
    }
    else {
    	System.out.println("Invalid input");
    }
	year.close();
	}

}
