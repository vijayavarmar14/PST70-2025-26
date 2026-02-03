package practise_java;
import java.util.Scanner;
public class SumofTwoDigits {
    public static void main(String[] args) {
    	Scanner in=new Scanner(System.in);
        int a = in.nextInt();
        int sum = 0; 
        while (a != 0) {
            int digit = a % 10;
            sum += digit;
            a /= 10;
        }
        System.out.println("Sum of digits: " + sum);
    in.close();
    } 
} 