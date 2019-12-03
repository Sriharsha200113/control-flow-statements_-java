 Write a program to print month in words, based on input month in numbers 

Example1: 

 

     C:\>java Sample 12 

 

     O/P Expected : December 

 

Example2: 

 

     C:\>java Sample  

 

     O/P Expected : Please enter the month in numbers 

 

Example3: 

 

     C:\>java Sample 15 

 

     O/P Expected : Invalid month 






import java.util.*;
import java.lang.*;
class P29
{
    public static void main(String[] args)
   {
       int s=Integer.parseInt(args[0]);
      switch(s)
         {
       case 1:
           System.out.println("jan");
           break;
      case 2:
           System.out.println("feb");
           break;
      case 3:
           System.out.println("march");
           break;
      case 4:
           System.out.println("april");
           break;     
       case 5:
           System.out.println("may");
           break;
      case 6:
           System.out.println("june");
           break;
      default:
          System.out.println("invalid ");
          break;
         }
     }
}