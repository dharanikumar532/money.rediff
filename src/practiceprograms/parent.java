package practiceprograms;

public interface parent {
	public void m1();
	public void m2();
	public void m3();
	public static void main(String[] args) {
		
	}
	
}
class child1 implements parent
{
	public void m1()
	{
		System.out.println("this is child class1");
	}
	public void m2()
	{
		System.out.println("this is child class2");
	}
	public void m3()
	{
		System.out.println("this is child class3");
	}
	public static void main(String[] args) {
		
	}
}
class child2  implements parent
{
	public void m1()
	{
		System.out.println("this is child class11");
	}
	public void m2()
	{
		System.out.println("this is child class22");
	}
	public void m3()
	{
		System.out.println("this is child class33");
	}
	public static void main(String[] args) {
		
	}
}
class child4
{
	public static void main(String[] args) {
		parent p=new child1();
		p.m1();
	}
}
