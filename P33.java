//Write a program to initialize an integer array with values and check if a given number is present in the array or not. If the number is not found, it will print -1 else it will print the index value of the given  number in the array  

Ex1) Array elements are  {1,4,34,56,7} and the search element is 90   

O/P: -1 

Ex2)Array elements are  {1,4,34,56,7} and the search element is 56 

O/P: 4  





import java.util.*;
import java.lang.*;
class P33
{
    public static void main(String[] args)
  {
    Scanner sc =new Scanner(System.in);
 int i,n,c=0,su;
    n=sc.nextInt();
    su=sc.nextInt();
    int[] a=new int[n];
  
for(i=0;i<n;i++)
   {
     a[i]=sc.nextInt();
    }
    for(i=0;i<n;i++)
     {
        if(a[i]==su)
           {
                System.out.println("found");
                  break;
            }
           else
             {
                c++;
              }
       }
    if(c>0)
      {
            System.out.println("not found");
       }
   }
}
