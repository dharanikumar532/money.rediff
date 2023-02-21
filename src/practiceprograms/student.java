package practiceprograms;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class student {
	int id;
	String  name;
	public student(int id,String name)
	{
		this.id=id;this.name=name;
	}
	public void print()
	{
		System.out.println(id+"  "+name);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		student s1=new student(1,"samantha");
		student s2=new student(2,"krithishetty");
		student s3=new student(3,"charmi");
		List<student> li=new ArrayList<>();
		li.add(s1);
		li.add(s2);
		li.add(s3);
	Iterator it=li.iterator();
	while(it.hasNext())
	{
		student s=(student) it.next();
		s.print();
	}
	for(student s:li)
	{
		s.print();
	}
	}

}
