Write a program that displays a menu with options 1. Add 2. Sub 

Based on the options chosen, read 2 numbers and perform the relevant operation. After performing the operation, the program should ask the user if he wants to continue. If the user presses y or Y, then the program should continue displaying the menu else the program should terminate. 

[ Note: Use Scanner class, you can take help from the trainer regarding the same ] 








import java.util.*;
class P220
{
public static void main(String a[])
{
int n,m,t,r=0;
Scanner sc=new Scanner(System.in);
do{
System.out.println("1.Add\n2.Sub");
n=sc.nextInt();
System.out.println("Entre the numbers:");
m=sc.nextInt();
t=sc.nextInt();
if(n==1)
{
System.out.println("The selected option is Addtion and Result is:"+ (m+t));
break;
}
else
{
if(m>t)
{
r=m-t;
//System.out.println("The selected option is Substraction and Result is:"+ r);
}
else
r=t-m;
}
System.out.println("The selected option is Substraction and Result is:"+ r);

}while(n!=0&&n<=2);
}
}