package ArrayListConcept;

import java.util.ArrayList;

public class ArrayListGenerics {

	public static void main(String[] args) {
		
		ArrayList<String> name = new ArrayList<String>();

		intArrayList();
		stringArrayList(name);

	}

	public static void intArrayList() {

		ArrayList<Integer> al = new ArrayList<Integer>();
		al.add(10);
		al.add(10);
		al.add(20);
		al.add(30);
		al.add(40);

		System.out.println(al);

		al.remove(4);

		System.out.println(al);
	}
	
	public static void stringArrayList(ArrayList<String> str) {
		
		str.add("Amar");
		str.add("Roshni");
		str.add("Ram");
		str.add("Home");
		
		for(String e:str) {
			System.out.println(e);
		}
		
	}

}
