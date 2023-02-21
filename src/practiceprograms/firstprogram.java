package practiceprograms;

import java.util.Enumeration;
import java.util.Iterator;
import java.util.ListIterator;
import java.util.Vector;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import net.sourceforge.htmlunit.corejs.javascript.ast.WhileLoop;

public class firstprogram
{

	public static void main(String[] args) throws Throwable {
		Vector v=new Vector();
		for (int i = 0; i <=10; i++)
		{
			v.add(i);
		}
		System.out.println(v);

		ListIterator ltr=v.listIterator();
		while(ltr.hasNext())
		{
			int a=(int)ltr.next();
			if(a==2)
				ltr.remove();
			else if(a==3)
				ltr.set(33);
			else if(a==10)
				ltr.add(45);
		}
		System.out.println(v);
		while(ltr.hasPrevious())
		{
			System.out.println(ltr.previous());
		}
		System.out.println(v);
	}
	
}
