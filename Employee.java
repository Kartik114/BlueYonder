class Employee
{
  String name;
  int id;
  int age;
  int salary = 50000;
  String designation = "Developer";
  Scanner sc;
  Employee()
  {
        sc = new Scanner(System.in);
        System.out.println("Enter id");
        id = sc.nextInt();
        System.out.println("Enter age");
        age = sc.nextInt();
        System.out.println("Enter name");
        name = sc.next();
  }
  void display()
  {
       System.out.println("id: "+id);
        System.out.println("age"+age);
        System.out.println("name"+name);

  }
}
