package practiceprograms;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

import org.apache.commons.collections4.map.HashedMap;

public class demomap {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HashMap<Integer,String> m=new HashMap<>();
		m.put(101,"kajal");
		m.put(102,"hansika");
		m.put(103,"mehreen");
		System.out.println(m);
		m.replace(102,"Tamannah");
		System.out.println(m);
		m.put(104," value");
		System.out.println(m);
		m.remove(104," value");
		System.out.println(m);
		
		for(int value:m.keySet())
		{
			System.out.println(value);
		}
		for(String value:m.values())
		{
			System.out.println(value);
		}
		
		for(Map.Entry value:m.entrySet())
		{
			System.out.println(value);
			System.out.println(value.getKey());
			System.out.println(value.getValue());
		
		}
	}

}
