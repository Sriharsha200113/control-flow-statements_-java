Write a program to reverse a given number and print 

Eg1) 

I/P: 1234 

O/P:4321 

Eg2) 

I/P:10040 

O/P:4001 






import java.util.*;

public class P217 {
    public static void main(String[] args) {
      Scanner sc=new Scanner(System.in);      
 int num =sc.nextInt(), reversed = 0;
        while(num != 0) {
            int digit = num % 10;
            reversed = reversed * 10 + digit;
            num /= 10;
        }
        System.out.println("Reversed Number: " + reversed);
    }
}