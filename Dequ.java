import java.util.*;  
public class Dequ{  
   public static void main(String[] args) {  
   Deque<String> deque = new ArrayDeque<String>();  
   deque.add("Ram");    
   deque.add("Shyam");     
   deque.add("Aman");    
   for (String str : deque) {  
   System.out.println(str);  
   }  
   }  
}  