//Write a program to initialize an integer array and find the maximum and minimum value of an array




import java.util.*;
class P32
{
    public static void main(String[] args)
  {
    Scanner sc =new Scanner(System.in);
 int i,n,max,min;
    n=sc.nextInt();

    int[] a=new int[n];
  
for(i=0;i<n;i++)
   {
     a[i]=sc.nextInt();
    }
max=a[0];
min=a[0];
    for(i=0;i<n;i++)
      {
            if(a[i]>max)
                {
                   max=a[i];
                   }
              if(a[i]<min)
                 {
                       min=a[i];
                   }
          }
     System.out.println(max);
        System.out.println(min);
   }
}

             