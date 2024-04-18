import java.util.Scanner;
interface areaperimeter
{ 
  void area(int a);
  double perimeter(int b);
   
}
class circle implements areaperimeter
{
  int r;
  public void area(int a)
  { 
    int r=a;
    System.out.println(3.14*r*r);
  }
  public double perimeter(int b)
  {
     int r=b;
     return 2*3.14*r;
  }
}

class interface_main
{ 
  public static void main (String a[])
  { 
    int n;
    int x;
    Scanner s=new Scanner(System.in);
    circle c=new circle();
    while(true)
    {
    System.out.println("select the below option\n");
    System.out.println("1:area of circle\n");
    System.out.println("2:primeter of circle\n");
    System.out.println("eneter the choice");
    n=s.nextInt();
    s.nextLine();
     if(n==1)
     { 
        System.out.println("enter radius");
        x=s.nextInt();
        c.area(x);
     }
    }
    
  }
  
}

