 abstract class A
{
 abstract  void callme();
  void test(){
  	System.out.print("Hii");
  }
}
class B extends A
{
 void callme()
 {
  System.out.println("this is callme.");
 }
 public static void main(String[] args)
 {
  B b = new B();
  b.callme();
 }
}