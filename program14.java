import java.util.Scanner;
class Auth extends Exception
{
   Auth(String msg)
   { 
     super(msg);
   }
}

class program14
{
  public static void main( String args[])
  {   
     Scanner s=new Scanner(System.in);
     String username="alfiya";
     String password="alfiya@123";
     System.out.println("enetr the username");
     String user=s.nextLine();
     System.out.println("enetr the password");
     String pass=s.nextLine();
     try
     {
       if(user.equals(username) && pass.equals(password))
            throw new Auth("succesfull");
       else
            throw new Auth("failed");
      }
      catch(Auth a)
      {
         System.out.println(a);
      }
      finally
      {
        System.out.println("completed");
      }
   }
}
         
     
     
