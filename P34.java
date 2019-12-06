//Initialize an integer array with ascii values and print the corresponding character values in a single row





import java.util.*;
class P34
{
   public static void main(String[] args)
    {
        Scanner sc =new Scanner(System.in);
     int i,n;
   n=sc.nextInt();
    int[] a=new int[n];
   
  
for(i=0;i<n;i++)
   {
     a[i]=sc.nextInt();
    }
for(i=0;i<n;i++)
   {
     System.out.println((char)a[i]);
    }
   }
}