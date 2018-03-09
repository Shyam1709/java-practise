class Buff {
 public static void main(String args[])
 {
  String str = "Hello";
  str.concat("Shyam");
  System.out.println(str);      

  StringBuffer strB = new StringBuffer("Hello");
  strB.append("shyam");
  System.out.println(strB);  
  System.out.println(strB.capacity()); 
 }
}