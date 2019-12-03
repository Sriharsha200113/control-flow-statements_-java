Write a Java program to find if the given number is palindrome or not 

 

Example1: 

 

     C:\>java Sample 110011 

 

     O/P Expected : 110011 is a palindrome 

 

Example2: 

 

     C:\>java Sample 1234 

 

     O/P Expected : 1234 is not a palindrome 











import java.util.*;
public class P218 {
    public static void main(String[] args) {
        Scanner sc= Scanner(System.in);
    int num=sc.nextInt(), reversedInteger = 0, remainder, originalInteger;
        originalInteger = num;
        // reversed integer is stored in variable 
        while( num != 0 )
        {
            remainder = num % 10;
            reversedInteger = reversedInteger * 10 + remainder;
            num  /= 10;
        }
        // palindrome if orignalInteger and reversedInteger are equal
        if (originalInteger == reversedInteger)
            System.out.println(originalInteger + " is a palindrome.");
        else
            System.out.println(originalInteger + " is not a palindrome.");
    }
}