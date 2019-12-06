import java.util.*;
class Author
{
   String name;
   String email;
   String gender;
    Author(String a,String b,String c)
     {
System.out.println("author=" + a);
System.out.println("email=" + b);
System.out.println("gender=" + c);

    }
}
class Book
  {
    String name;
    String author;
    double price;
    int gtyInstock;
     public void setprice(double price)
     {
         this.price=price;
    }
    public double getprice()
      {
         return this.price;
     }
 public void setname(String name)
     {
         this.name=name;
    }
    public String getname()
      {
         return this.name;
     }
public void setauthor(String author)
     {
         this.author=author;
    }
    public String getauthor()
      {
         return this.author;
     }
public void setgtyInstock(int gtyInstock)
     {
         this.gtyInstock=gtyInstock;
    }
    public int getgtyInstock()
      {
         return this.gtyInstock;
     }
}
class P5
  {
     public static void main(String[] args)
     {
        Book o1=new Book();
        Author o2=new Author("harsha","abc@gmail.com","m");
        o1.setprice(10000);
         o1.setname("sunny");
        o1.setgtyInstock(10);
         System.out.println(o1.getname());
           System.out.println(o1.getgtyInstock());
       System.out.println(o1.getprice());
       }
   }


         
       
          
