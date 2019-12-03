IIntialize  two character variables in a program and display the character in alphabetical order cc 

Ex:1.if first character is s and second is e 

o/p:e,s 

Ex:2. If first character is a and second is e 

o/p:a,e  





import java.util.*;
import java.lang.*;
class P24
{
   public static void main(String[] args)
     {
         char c= args[0].charAt(0);
         char d=args[1].charAt(0);
       if((int)c>(int)d)
        {
            System.out.print(d+","+c);
         }
      else
         {
            System.out.println(c+","+d);
         }
     }
}
