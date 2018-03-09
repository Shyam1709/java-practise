import java.io.*;  
class Deserialize{  
 public static void main(String args[])throws Exception{  
    
  ObjectInputStream in=new ObjectInputStream(new FileInputStream("student.txt"));  
  Serialize s=(Serialize)in.readObject();  
  System.out.println(s.contact+" "+s.name + " " + s.rid);  
  
  in.close();  
 }  
}  