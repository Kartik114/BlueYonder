import java.util.Scanner;

class Employee
{
    public int id;
    public String name;
    public int age;
    public int salary;
    public String designation;
   

    Employee()
    {}



     void display(){
        System.out.println("ID : " + id);
        System.out.println("Name : " + name);
        System.out.println("Age : " + age);
        System.out.println("Salary : " + salary);
        System.out.println("Designation : " + designation);
    }
}

class Developer extends Employee{
  
    Developer()
   {
    super.salary = 50000;
    designation = "Developer";
    }
    
   // super.salary = 100;
   
}

class Clerk extends Employee{
    Clerk(){
    salary = 250000;
    designation = "Clerk";
 }

  
}
class Manager extends Employee{
  
    Manager(){
    salary = 90000;
    designation = "Manager";
 }

    
}
class Tester extends Employee{

   Tester(){
    salary = 40000;
    designation = "Tester";
   

}

public class practice1 {
    public static void main(String args[]){
        Employee d = new Developer();
        Employee t = new Tester();
        Employee m = new Manager();
        Employee c = new Clerk();

        int ch1 = 0;

        do{
            Scanner sc = new Scanner(System.in);

            System.out.println("1) Create");
            System.out.println("2) Display");
            System.out.println("3) Exit");

            System.out.println("Enter your choice.....");
            ch1 = sc.nextInt();

            if(ch1 == 1){ //create
                int ch2 = 0;

                System.out.println("1) Developer");
                System.out.println("2) Clerk");
                System.out.println("3) Tester");
                System.out.println("4) Manager");
                System.out.println("5) Exit to main menu");

                System.out.print("Enter your choice : ");
                ch2 = sc.nextInt();

                if(ch2 == 1){ //developer
                    System.out.println("Id: ");
                    int id = sc.nextInt();
                    System.out.println("Name: ");
                    String name = sc.next();
                    System.out.println("Age: ");
                    int age = sc.nextInt();

                    d.name = name;
                    d.id = id;
                    d.age = age;
                }
                if(ch2 == 2){ //Clerk
                    System.out.println("Id: ");
                    int id = sc.nextInt();
                    System.out.println("Name: ");
                    String name = sc.next();
                    System.out.println("Age: ");
                    int age = sc.nextInt();

                    c.name = name;
                    c.id = id;
                    c.age = age;
                }
                if(ch2 == 3){ //Tester
                    System.out.println("Id: ");
                    int id = sc.nextInt();
                    System.out.println("Name: ");
                    String name = sc.next();
                    System.out.println("Age: ");
                    int age = sc.nextInt();

                    t.name = name;
                    t.id = id;
                    t.age = age;
                }
                if(ch2 == 4){ //Manager
                    System.out.println("Id: ");
                    int id = sc.nextInt();
                    System.out.println("Name: ");
                    String name = sc.next();
                    System.out.println("Age: ");
                    int age = sc.nextInt();

                    m.name = name;
                    m.id = id;
                    m.age = age;
                }
                if(ch2 == 5){ //exit to main menu
                    continue;
                }
            }
            if(ch1 == 2){ //display
                int ch2 = 0;

                System.out.println("1) Developer");
                System.out.println("2) Clerk");
                System.out.println("3) Tester");
                System.out.println("4) Manager");
                System.out.println("Exit to main menu");

                System.out.print("Enter your choice : ");
                ch2 = sc.nextInt();

                if(ch2 == 1){ //developer
                    if(d.id != 0)
                        d.display();
                    else
                        System.out.println("Developer Not yet registered");
                }
                if(ch2 == 2){ //Clerk
                    if(c.id != 0)
                        c.display();
                    else
                        System.out.println("Clerk Not yet registered");
                }
                if(ch2 == 3){ //Tester
                    if(t.id != 0)
                        t.display();
                    else
                        System.out.println("Tester Not yet registered");
                }
                if(ch2 == 4){ //Manager
                    if(m.id != 0)
                        m.display();
                    else
                        System.out.println("Manager Not yet registered");
                }
                if(ch2 == 5) { //exit to main menu
                    continue;
                }
            }
            if(ch1 == 3) {
                System.exit(0);
            }
        }while(ch1 != 5);
    }
}

}
