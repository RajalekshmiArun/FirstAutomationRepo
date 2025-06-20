package collection;

import java.util.HashSet;
import java.util.Iterator;

public class HashSetDemo {

	public static void main(String[] args) {
		
		HashSet<String> hs=new HashSet<String>();
		hs.add("HashSet");
		hs.add("Elements");
		hs.add("demo");
		HashSet<String> hs1=new HashSet<String>();
		hs1.add("HashSet1");
		hs1.add("Elements1");
		hs1.add("demo1");
		
		hs.addAll(hs1);//it combines two sets together
		System.out.println(hs);
		hs.removeAll(hs);
		System.out.println(hs);
		
		/*Iterator<String> it=hs.iterator();
		while(it.hasNext()) {
			System.out.println(it.next());
			}
		
		it.remove();
		System.out.println(hs);*/
		
		
	}

}
