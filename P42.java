import java.util.*;
import java.lang.Math;
class Cal
{
    public static double Powerint(int a,int b)
    {
       double p1;
       p1=Math.pow(a,b);
       return p1;
    }
   public static double powerdouble(double c,int d)
    {
        double p2;
        p2=Math.pow(c,d);
        return p2;
     }
   }
class P42
   {
      public static void main(String[] args)
        {
            Scanner sc=new Scanner(System.in);
             int a,b,d;
             double c;
          a=sc.nextInt();
          b=sc.nextInt();
          c=sc.nextDouble();
        d=sc.nextInt();
      System.out.println(Cal.Powerint(a,b));
      System.out.println(Cal.powerdouble(c,d));
      }
   }
            
