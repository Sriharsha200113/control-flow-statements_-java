import java.util.*;
class P41
{
    public double dim(double a,double b,double c)
      {
          return a*b*c;
       }
    public static void main(String[] args)
     {
        
      P41 obj=new P41();
      double a,b,c,vol;
     Scanner sc=new Scanner(System.in);
        a=sc.nextDouble();
        b=sc.nextDouble();
        c=sc.nextDouble();
       vol=obj.dim(a,b,c);
         System.out.println(vol);
     }
}