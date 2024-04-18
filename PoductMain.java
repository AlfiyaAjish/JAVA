import java.util.Scanner;
class PoductMain
 {
   public static void main(String a[])
    {
      Product p1=new Product();
      Product p2=new Product();
      Product p3=new Product();
      float v1=p1.accept();
      float v2=p2.accept();
      float v3=p3.accept();
      if(v1<v2 && v1<v3)
      {
       System.out.println("The product having the lowest price:");
       p1.show();
      }
      else if(v2<v3)
      {
       System.out.println("The product having the lowest price:");
       p2.show();
      }
      else
      {
       System.out.println("The product having the lowest price:");
       p3.show();
      }
    }
 }

class Product
 {
  int pcode;
  float price;
  String pname;
  float accept()
   {
    Scanner s= new Scanner(System.in);
    System.out.println("enter the product details");
    System.out.println("---------------------------");
    System.out.println("enter the product code");
    pcode=s.nextInt();
    s.nextLine();
    System.out.println("enter the product name");
    pname=s.nextLine();
    System.out.println("enter the product price");
    price=s.nextFloat();
    return price;
   }
  void show()
   {
    System.out.println("product Code: "+pcode);
    System.out.println("product Name: "+pname);
    System.out.println("product Name: "+price);
   }
  }
