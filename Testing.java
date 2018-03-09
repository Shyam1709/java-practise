interface Mine
{

static void show(){
	System.out.print("A");
}
// void display(){
// 	System.out.print("Hello");
// }
}

class Testin implements Mine{
	public void show(){
		System.out.print("Hine");
	}
	public static void main(String args[]){
	Testin ab=new Testin();
        ab.show();
	}
}