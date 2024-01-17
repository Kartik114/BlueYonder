import java.util.Scanner;


public class Demo5
{
  public static void main(String args[])
  {
     Employee e;
     
  
      Scanner sc = new Scanner(System.in);
      while(1)
      {
        System.out.println("enter choice");
        System.out.println("1) Developer");
        System.out.println("2) Clerk");
        System.out.println("3) Manager");
        
        int id = sc.nextInt();
        if(id == 1)
        {
          System.out.println("developer");
        }
        else if(id == 2)
        {
          System.out.println("clerk");
        }
        else if(id == 3)
        {
          System.out.println("manager");
        }
        else
        { 
          System.out.println("doesn't exist");
          break;
        } 
        
      } 

  }

}

