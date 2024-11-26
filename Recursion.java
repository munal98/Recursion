import java.util.Iterator;

public class Recursion {
	public static void main(String[] args) {
		//recursive çözüm
		int result = factorial(5);
		System.out.println(result);
		
		//iteratif çözüm
		int sonuc = 1;
		for (int i = 1; i <= 5; i++) {
			sonuc *= i;
		}
		System.out.println(sonuc);
		
		int totalSum = addition(10);
		System.out.println(totalSum);
	}
	//i = 10
	private static int addition(int i) {
		if(i > 0)
			return i + addition(i - 1);
		else
			return 0;
	}


	//i = 4
	private static int factorial(int i) {
		if(i == 1)
			return 1;
		else
			return i * factorial(i - 1);
		//5 * 24 --> 4 * 6 --> 3 * 2 --> 2 * 1
		
	}

}
