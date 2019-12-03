
13 

 Write a program to print prime numbers between 10 and 99. 

For Loop 






import java.util.*;
class P213
{
  public static void main(String[] args)
    {
         int c,i,j,d=0;
   for(j=10;j<=99;j++)
     {  
              c=0;
        for(i=2;i<=j/2;i++)
           { 
               if(j%i==0)
                  {
                     c++;
                  }
            }
            
            if(c==0)
              {
               
                  System.out.println(j);
              }
           
           }
      }
           
}


