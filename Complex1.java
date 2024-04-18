class Complex1
{
  double r;
  double a;
  Complex1(double c,double b)
   {
     r=c;
     a=b;
   }
  public static void main(String a[])
    {
      Complex1 n1=new Complex1(2.4,3.4);
      Complex1 n2=new Complex1(3.6,5.6);
      double v1=add(n1.r,n1.a);
      double v2=add(n2.r,n2.a);
      System.out.println(+v1+"+"+v2+"i");
    }
    static double add(double p,double q )
    {
      double f=p+q;
      return f;
    }
 }
