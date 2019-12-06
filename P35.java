Write a program to find the largest 2 numbers and the smallest 2 numbers in the given array 




import java.util.*;
import java.io.*;
class P35{
public static void main(String k[]){
int[] array=new int[]{1,5,8,6,3};
int n=array.length;
Arrays.sort(array);
for(int i=0;i<n;i++){
System.out.println(""+array[i]);
   }


System.out.println("max1="+array[n-1]);
System.out.println("max2="+array[n-2]);
System.out.println("min1="+array[0]);
System.out.println("min2="+array[1]);


}
}