package practiceprograms;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import java.util.Stack;
import java.util.TreeSet;
import java.util.Vector;

public class prime1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList li=new ArrayList();
		li.add("dha");
		li.add(25);
		li.add(25.35);
		System.out.println(li);
		System.out.println(li.size());
		System.out.println(li.contains("dha"));
		System.out.println(li.remove(2));
		System.out.println(li);
		Vector v1=new Vector<>();
		v1.add(null);
		v1.add("kumar");
		v1.capacity();
		v1.add("samantha");
		System.out.println(v1);
		v1.addAll(li);
		System.out.println(v1.containsAll(li));
		System.out.println(v1);
		v1.removeAll(li);
		System.out.println(v1);
		v1.set(2, "tamanna");
		System.out.println(v1);
		
		
		System.out.println(v1);
	
		Stack<Integer> s=new Stack<>();
		s.push(25);
		s.push(35);
		s.add(45);
		s.add(85);
	s.add(35);
	s.add(77);
	s.add(32);
	System.out.println(s.capacity());
	s.add(47);
	s.add(45);
	s.add(48);
	s.add(28);
System.out.println(s.capacity());
System.out.println(s);
System.out.println(s.peek());
System.out.println(s.pop());
for(Integer value:s)
{
 	System.out.print("\t"+value);
}
System.out.println(s.search(48));
System.out.println(s.empty());
Vector v2=new Vector<>();
System.out.println(v2.isEmpty());
	Set s1=new TreeSet();
	s1.add("dharani");
	s1.add("dharani");
	s1.add("samantha");
	s1.add("nayana");
	s1.add("tara");
	s1.add("rakul");
	s1.add("katrina");
	s1.add("kajal");
	System.out.println(s1);
 	}

}
