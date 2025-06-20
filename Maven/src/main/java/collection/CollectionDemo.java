package collection;

import java.util.ArrayList;

public class CollectionDemo {
	
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<String> al=new ArrayList<String>();//it shows an error then import 
		al.add("Hai");//used  to add values to the array
		al.add("Java");
		al.add("World");
		System.out.println(al);
		al.add(2,"Magic");//add value to a specific position
		System.out.println(al);
		System.out.println(al.get(1));//used to get value from a specific index
	for (String s:al)
	{
		System.out.println(s);
	}
		al.set(2, "Hai");//it replace the value with another value
		System.out.println(al);
		al.remove(0);//it removes the value.
		System.out.println(al);
		if(al.contains("Devu"))//contains used to find/search a particular value present in the array list or not
		System.out.println("Value is present");
		else
			System.out.println("Value is not present");
		if(al.isEmpty())//it checks the Array list is empty or not
			System.out.println(" Array Is empty");
		else
			System.out.println("Is not empty");
		al.removeAll(al);//it removes all the values from the array
		System.out.println(al);
		if(al.isEmpty())
			System.out.println("Array Is empty");
		else
			System.out.println("Is not empty");
		

	}

}
