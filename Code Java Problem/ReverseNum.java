package practise_java;

public class ReverseNum {
    public static void main(String[] args) {
        int a = 4932;
        int Num = 0;
        while (a != 0) {
            int digit = a % 10;          
           Num = Num * 10 + digit;
            a /= 10;  }             
     System.out.println("Reversed number:"+Num);
}
}

