import java.util.concurrent.ExecutorService;  
import java.util.concurrent.Executors;  
class WorkThread implements Runnable {  
    private String message;  
    public WorkThread(String s){  
        this.message=s;  
    }  
     public void run() {  
        System.out.println(Thread.currentThread().getName()+" (Start) message = "+message);  
        processmessage();
        System.out.println(Thread.currentThread().getName()+" (End)");
    }  
    private void processmessage() {  
        try {  Thread.sleep(5000);  } catch (InterruptedException e) { e.printStackTrace(); }  
    }  
}  
