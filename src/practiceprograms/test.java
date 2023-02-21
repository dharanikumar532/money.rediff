package practiceprograms;

import java.util.Arrays;

public class test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	int a1[]= {12,25,45,65,78};
	int a2[]= {12,25,425,65,78,10};
	System.out.println(Arrays.equals(a1, a2));
	boolean status=true;
	if(a1.length==a2.length)
	{
		for(int i=0;i<a1.length;i++)
		{
			if(a1[i]!=a2[i])
				status=false;
			
		}
		if(status==true)
		{
			System.out.println("arrays are equal");
		}
		else
			System.out.println("arrays are not equal");
	}
	else
	{
		System.out.println("arrays are not equal");
	}
	}

}
