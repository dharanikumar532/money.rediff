package practiceprograms;

public class fibonacc {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n1=0,n2=1,sum=0;
		System.out.print(n1+"\t"+n2);
		for(int i=1;i<=6;i++)
		{
			sum=n1+n2;
			System.out.print("\t"+sum);
			n1=n2;
			n2=sum;
		}
	}

}
