
8 

 Write a program to print the color name, based on color code. If color code in not valid then print "Invalid Code". R->Red, B->Blue, G->Green, O->Orange, Y->Yellow, W->White. 

Switch Statement 








import java.util.*;
class P28
{
    public static void main(String[] args)
   {
      char s=args[0].charAt(0);
      switch(s)
         {
       case 'R':
           System.out.println("Red");
           break;
      case 'B':
           System.out.println("blue");
           break;
      case 'G':
           System.out.println("Green");
           break;
      case 'O':
           System.out.println("orange");
           break;     
       case 'Y':
           System.out.println("Yellow");
           break;
      case 'W':
           System.out.println("White");
           break;
      default:
          System.out.println("invalid code");
         }
     }
}