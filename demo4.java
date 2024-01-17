class Emp
{
   byte a = 127;
   short s = 32766;
   long i = 988882828222L;
   float f = 10/3f;
   double d = 10/3d;
   int a2=100;
   void display()
   {
     System.out.println(a);
     System.out.println(s);
     System.out.println(i);
     System.out.println(f);
     System.out.println(d);
     System.out.println(a2);

   }
}

class Demo4
{
  public static void main(String args[])
  {
      Emp a = new Emp();
      a.display();
  }
 
}