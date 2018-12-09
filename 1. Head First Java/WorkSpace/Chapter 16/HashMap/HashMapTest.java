import java.util.*;
public class HashMapTest{
	public static void main(String[] args){
		HashMap<String, Integer> hashMapp = new HashMap<String, Integer>();
		hashMapp.put("A",10);
		hashMapp.put("B",20);
		hashMapp.put("C",30);
		System.out.println(hashMapp);
		System.out.println(hashMapp.get("A"));
	}
}