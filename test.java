public class Test{
	int a;

void bi(int a){
	this.a=a;
}	
void display(){
	System.out.print(a);
}

public static void main(String args[]){
	Test a=new Test();
	a.bi(5);
	a.display();
	}
}