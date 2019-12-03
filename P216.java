Write a program to print * in Floyds format (using for and while loop) 

* 

*  * 

*  *   * 

 

 

 

Example1: 

 

     C:\>java Sample  

 

     O/P Expected : Please enter an integer number 

 

Example1: 

 

     C:\>java Sample 3 

 

     O/P Expected : 

                   * 

                   *  *  

                   *  *  * 






import java.util.*;
class P216
{
    public static void main(String[] args)
      { 
        Scanner sc=new Scanner(System.in);
          int n=sc.nextInt();
          int i,j;
        for(i=0;i<n;i++)
           {
             for(j=0;j<n;j++)
              {
                if(j<=i)
                    {
                        System.out.print("*");
                 
                    }
             }
System.out.println();
             
         }

     }
}


         