package arrays;

import java.util.Arrays;

public class ArrayIntro {

	public static void main(String[] args) {
		
		//Array Declaration 
		
		int[] num;
		
		//System.out.println(num.length);  //Compile time error
		
		//Declaration and Initialization 
		
		String[] name = new String[5];
		System.out.println(name.length);
		System.out.println(name[1]); //null 
		
		name[0] = "Ram";
		name[1] = "Sita";
		name[2] = "Mohan";
		name[3] = "RS";
		name[4] = " ";
		
		System.out.println(Arrays.toString(name));
		
		for(String names:name) {
			System.out.println(names);
		}
		
		//Updating the values
		name[4] = "Roshin";
		
		System.out.println(Arrays.toString(name));
		
		//Removing the element from the Array
		name[3] = "";
		System.out.println(Arrays.toString(name));
		
		System.out.println(name[6]);
		

	}

}
