
7 

 Write a program to convert from upper case to lower case and vice versa of an alphabet and print the old character and new character as shown in example (Ex: a->A, M->m). 

If Statement 







import java.util.*;
class P27
{
   public static void main(String[] args)
     {
        char s=args[0].charAt(0);
         if(Character.isLowerCase(s))
      {
        System.out.println(args);
           System.out.println(Character.toUpperCase(s));
       }
         else
      {
           System.out.println(args);
           System.out.println(Character.toLowerCase(s));
       }
		
        
     	
   }
}					