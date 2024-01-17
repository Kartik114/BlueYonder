import java.util.Scanner;

class Employee
{
  String name;
  int id;
  int salary;
  Scanner sc;
  Employee()
  {
     sc = new Scanner(System.in);
     this.name = sc.next();
     this.id = sc.nextInt();
     this.salary = sc.nextInt();
  }
  void display()
  {
      System.out.println("id is "+this.id+" , name is "+this.name+" , salary is "+this.salary);
  }
}

public class Demo3
{
   public static void main(String args[])
   {
         Employee a = new Employee();
         a.display(); 
   }
  
}