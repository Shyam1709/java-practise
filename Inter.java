 interface Interface1 {

	void method1(String str);
	
	default void log(String str){
		System.out.println("I1 logging::"+str);
	}
}


 class MyClass implements Interface1 {

	
	public void method1(String str) {
	}

	public void log(String str){
		System.out.println("MyClass logging::"+str);

	}
}