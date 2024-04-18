import java.util.*;
class Input
 {
 public static void main(String a[])
 {
  try
   {
      input();
      Scanner s=new Scanner(System.in);
      System.out.println("Enter your name");
      String name=s.nextLine();
      System.out.println("enter your age");
      int age=s.nextInt();
      Input i=new Input();
      i.output(name,age); 
    }
   catch(Exception e)
    {
      System.out.println("please enter correctly");
    }
    }
     static void input()
     {
       System.out.println("enter the given details");
     }
     void output(String n,int a)
     {
       System.out.println("my name is "+n);
       System.out.println("my age is "+a);
     }
     }
