
1 

Write a program if the given number is positive or negative 

 

If Statement 





import java.util.*;
class P21
{
   public static void main(String[] args)
   {    int a=Integer.parseInt(args[0]);
       if(a>0)
         {
            System.out.println("positive");
         }
       else if(a<0)
          {
               System.out.println("negative");
         }
       else
          {
             System.out.println("zero");
           }
    }
}