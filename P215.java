
15 

 Write a program to add all the values in a given number and print. Ex: 1234->10 







import java.util.*;
class P215
{
    public static void main(String[] args)
     {
        Scanner sc =new Scanner(System.in);
            int n=sc.nextInt(),sum=0,r;
         while (n>0)
          {
             r=n%10;
             sum=sum+r;
            n=n/10;
           }
         System.out.println(sum);
      }
}