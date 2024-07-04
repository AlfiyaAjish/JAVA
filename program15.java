 import java.util.Scanner;
 class Neg extends Exception
 {
   Neg(String msg)
   {
     super(msg);
    }
  }
  
 class program15
 {
   public static void main(String arg[])
   {  
      Scanner s=new Scanner(System.in);
      int n;
      System.out.println("enter the limit");
      n=s.nextInt();
      int a[]=new int[n];
      System.out.println("enter the array");
      for(int i=0;i<n;i++)
      {
        System.out.println("enter the number "+i);
        int b=s.nextInt();
        try 
        {
          if (b<0)
          {
            i=i-1;
            throw new Neg("negative");
           } 
          else 
            a[i]=b;
        }
        catch(Neg x)
        {
          System.out.println(x);
        }
       }
       int sum=0;
      for(int i=0;i<n;i++)
      {
       sum=sum+a[i];
      }
      System.out.println("sum"+sum);
      System.out.println("Average ="+sum/n);
   }
 }
      
           
