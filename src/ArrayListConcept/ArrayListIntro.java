package ArrayListConcept;

import java.util.ArrayList;
public class ArrayListIntro {

	public static void main(String[] args) {
		
		
		ArrayList al = new ArrayList();
		
		//Adding elemnet to an ArrayList
		
		al.add(10);
		al.add("Ram");
		al.add('A');
		al.add(10.55);
		al.add(true);
		
		System.out.println(al.size());
		
		System.out.println(al.get(0));
		System.out.println(al.get(1));
		System.out.println(al.get(2));
		System.out.println(al.get(3));
		System.out.println(al.get(4));
		
		System.out.println(al);
		
		for(int index = 0; index<al.size(); index++) {
			System.out.println(al.get(index));
		}
		
		System.out.println("-------------");
		
		for(Object e: al) {
			System.out.println(e);
		}
	}

}
