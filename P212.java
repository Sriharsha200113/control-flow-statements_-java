
12 

 Write a program to check if a given number is prime or not 

For Loop 

    




import java.util.*;
class P212
{
  public static void main(String[] args)
    {
       Scanner sc =new Scanner(System.in);
         int a=sc.nextInt(),c=0,i;
        for(i=2;i<=a/2;i++)
           {
               if(a%i==0)
                  {
                     c++;
                  }
            if(c==0)
              {
                   System.out.println("prime");
              }
           else
             {
System.out.println("non prime");
            }
           }
      }
}


