import java.io.FileInputStream;  
public class FileIn{  
    public static void main(String args[]){    
           try{    
             FileInputStream fin=new FileInputStream("test.txt");    
             int x=fin.read();    
             fin.close();    
             System.out.println("success..."); 
             System.out.println(x);   
            }catch(Exception e){System.out.println(e);}    
      }    
}  