package practiceprograms;

import java.util.Random;

public class rando {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Random rand=new Random();
		int value=rand.nextInt(10);
		System.out.println(value);
		double d=rand.nextDouble();
		System.out.println(d);
		System.out.println(Math.random());
	}

}
