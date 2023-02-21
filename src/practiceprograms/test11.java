package practiceprograms;

public class test11 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a=10,b=25,c=11;
		if(a>b&&a>c)
			 System.out.println(a+" "+"is big");
		else if(b>a&&b>c)
			System.out.println(b+" "+"is big");
		else
			System.out.println(c+" "+"is big");
		
		int lar=a>b?a:b;
		lar=c>lar?c:lar;
		System.out.println(lar+ " "+"is big");
	}

}
