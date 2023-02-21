package practiceprograms;

public class prime {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n=145;
		int i=1;
		int c=0;
		if(n>1)
		{
		while(i<=n)
		{
			if(n%2==0)
				c++;
		}

		}
		else
			System.out.println("given number is not prime number");
		if(c==2)	
			System.out.println("given number is a prime number");
		else
			System.out.println("given number is not prime number");
	}

}
