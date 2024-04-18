import java.util.Scanner;
class person
{
  String name;
  String gen;
  String add;
  int age;
  person(String n,String g,String a,int ag)
  {
    name=n;
    gen=g;
    add=a;
    age=ag;
  }
}

class employee extends person
{
  int empid;
  String c_name;
  String quali;
  employee(String n,String g,String a,int ag,int id,String name,String q)
  {
   super(n,g,a,ag);
   empid=id;
   c_name=name;
   quali=q;
  }
}

class teacher extends employee
{
  String sub;
  String dpt;
  int tid;
  teacher(String n,String g,String a,int ag,int id,String name,String q,String s,String d,int tid)
  {
   super(n,g,a,ag,id,name,q);
   sub=s;
   dpt=d;
   tid=tid;
  }
  void show()
  {
    System.out.println("Name         ="+name);
    System.out.println("gender       ="+gen);
    System.out.println("address      ="+add);
    System.out.println("age          ="+age);
    System.out.println("empid        ="+empid);
    System.out.println("c_name       ="+c_name);
    System.out.println("qualification="+quali);
    System.out.println("teacher id   ="+tid);
    System.out.println("subeject     ="+sub);
    System.out.println("department   ="+dpt);
   }
}
class program10
{ 
 public static void main(String ar[])
 {
   //teacher t=new teacher("alfiya","female","vettiyanickal",21,101,"abc","mca","maths","bca",105);
   //t.show();
   Scanner s=new Scanner(System.in);
   System.out.println("Enter the number of teachers");
   int n=s.nextInt();
   s.nextLine();
   teacher t[]=new teacher[n];
   for(int i=1;i<=n;i++)
   {
     System.out.println("enetr the techers details of techer "+i);
     System.out.println("enter the name");
     String name=s.nextLine();
     System.out.println("enter the gender=");
     String gender=s.nextLine();
     System.out.println("enter the address=");
     String address=s.nextLine();
     System.out.println("enter the age=");
     int age=s.nextInt();
     s.nextLine();
     System.out.println("enter the employee id=");
     int empid=s.nextInt();
     s.nextLine();
     System.out.println("enter the company name=");
     String cname=s.nextLine();
     System.out.println("enter the Qualification=");
     String qlty=s.nextLine();
     System.out.println("enetr the subject=");
     String sub=s.nextLine();
     System.out.println(" enetr the deparment=");
     String dpt=s.nextLine();
     System.out.println(" enetr the teacher id=");
     int tid=s.nextInt();
      s.nextLine();
     t[i]=new teacher(name,gender,address,age,empid,cname,qlty,sub,dpt,tid); 
   }
    System.out.println("the details of teachers are");
    for(int i=1;i<=n;i++)
    {  
      System.out.println("techers details of techer "+i);
      t[i].show();
    }
 }
}
























