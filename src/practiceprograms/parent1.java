package practiceprograms;

public class parent1 {

	public void m1()
	{
		System.out.println("this is parent method1");
	}
	public void m2()
	{
		System.out.println("this is parent method2");
	}
	public void m4()
	{
		System.out.println("this is parent method4");
	}
	public void m3()
	{
		System.out.println("this is parent method3");
	}
	public static void main(String[] args) {
		
	}
	
}
class child11 extends parent1
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
class child22  extends parent1
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
class child5
{
	public static void main(String[] args) {
		parent1 p=new child11();
		p.m4();
	}
}
