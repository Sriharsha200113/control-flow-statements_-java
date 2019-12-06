
Write a Program to accept two integers through the command line  

argument and print the sum of the two numbers 

 

Example:    c 

 

     C:\>java Sample 10 20 

 

     O/P Expected : The sum of 10 and 20 is 30 




import java.util.*;
class Pro3
{
   public static void main(String[] args)
     {
        int a=Integer.parseInt(args[0]);
       int b=Integer.parseInt(args[1]);
          int c;         
     c=a+b;
        System.out.println("the sum of"+a+"and"+b+"is"+c);
     }
}