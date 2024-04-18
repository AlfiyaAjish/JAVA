class Complex1
{ 
  double r;
  double a;
  Complex1(double c, double d)
    { 
      r=c;
      a=d;
    }
    public static Complex1 add(Complex1 tm,Complex1 tp)
     { 
     Complex1 cx=new Complex1(0,0);
       cx.r=tm.r+tm.a;
       cx.a=tp.r+tp.a;  
       return cx;
      }
  }
  
 class Complex
 {  
   public static void main(String a[])
    {
      Complex1 n1=new Complex1(2.2,3.2);
      Complex1 n2=new Complex1(3.3,5.3);
      Complex1 temp;
      temp=Complex1.add(n1,n2);
      System.out.println(+temp.r+"+"+temp.a+"i");
     }
 }
