public class RefMethod {  
    public void printnMsg(){  
        System.out.println("Hello, this is instance method");  
    }  
    public static void main(String[] args) {  
    Thread t2=new Thread(new RefMethod()::printnMsg);  
        t2.start();       
    }  
}  