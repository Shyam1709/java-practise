import java.util.*;
class TreeMa{
	public static void main(String args[]){
		Map<Integer,String> map = new TreeMap<Integer,String>();
          map.put(1,"A");
          map.put(2,"B");
          map.put(3,"C");
          map.put(4,"D");

	
	for(Map.Entry m:map.entrySet()){
		System.out.println(m.getKey()+ " " + m.getValue());
	}
}
}