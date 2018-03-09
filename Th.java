// class Th extends Thread{
// 	public void run(){
// 	System.out.print("Hello");
// 	}
// }

// class Mine{
// 	public static void main(String args[]){
// Th a = new Th();
// a.run();
// 	}
// }

class Th implements Runnable{
	public void run(){
		System.out.print("Hello");
	}
}

class Mine{
	public static void main(String args[]){
Th a = new Th();
Thread b= new Thread(a);
b.start();
	}
}
