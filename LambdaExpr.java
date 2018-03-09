interface Cat{
  void cry();
}

 class Anim{
public static void main(String args[]){
  Cat c=()->{
 System.out.print("Hello Lambda");
};
c.cry();
}
}























