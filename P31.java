// Write a program to initialize an integer array and print the sum and average of the array 



import java.util.*;
class P31
{
    public static void main(String[] args)
  {
    Scanner sc =new Scanner(System.in);
 int i,n,sum=0,avg;
    n=sc.nextInt();

    int[] a=new int[n];
  
for(i=0;i<n;i++)
   {
     a[i]=sc.nextInt();
       sum=sum+a[i];
    }
  avg=sum/n;
 System.out.println(sum);
 System.out.println(avg);
  }
}
   
   
