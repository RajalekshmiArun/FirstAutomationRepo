package collection;

import java.util.Iterator;
import java.util.LinkedList;

public class CollectionLinkedlist {

	public static void main(String[] args) {
		
	LinkedList<String> l= new LinkedList<String>();	
	l.add("Linked");
	l.add("List");
	l.add("Iterator");
	Iterator<String> it=l.iterator();
	while(it.hasNext())
	{
		System.out.println(it.next());
		
	}
	it.remove();//removes last element in the list
	System.out.println(l);
	
	/*while(it.hasNext())
	{
		System.out.println(it.next());
		
	}*/
		
	}

}
