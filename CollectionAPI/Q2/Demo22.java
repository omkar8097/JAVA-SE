package Q2;


import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;


public class Demo22 
{
	

	public static void main(String[] args) 
	{
		Map<Integer,String> m=new HashMap <Integer,String>(); 
		m.put(1, "A");
		m.put(2, "b");
		m.put(3, "c");
		m.put(4, "d");
		m.put(5, "e");
		m.put(6, "r");
		m.put(7, "t");
		m.put(8, "u");
		m.put(9, "q");
		m.put(10, "e");
		
		
		Set<Entry<Integer, String>> set=m.entrySet();
		// get an iterator
		Iterator<Entry<Integer, String>> i=set.iterator();
		// display elements
		while(i.hasNext())
		{
			Map.Entry<Integer, String> me=(Entry<Integer, String>)i.next();
			System.out.print(me.getKey()+ " : ");
			System.out.println(me.getValue());
		}
		
	}
	
}
