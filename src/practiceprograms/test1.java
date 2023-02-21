package practiceprograms;

import javax.xml.bind.helpers.DefaultValidationEventHandler;

public class test1
{
	 int b=5;
 String S="Black";
	int add(int a,int b)
	{
		int c=a+b;
		return c;
	} 
	int sub(int c,int d) 
	{
		int e=c-d;
		return e;
	}
	int multiple(int f,int g)
	{
		int m=f*g;
		return m;
	}
	float Devid(int x, int y)
	{
		float z=x/y;
		return z;
	}
	public static void main(String[] args) {
		test1 t1 = new test1();
		System.out.println(t1.Devid(10, 5));
				

	}
}
		

	
		
	



