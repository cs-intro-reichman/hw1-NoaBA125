// Generates three integer random numbers in a given range,
// and prints them in increasing order.

import java.util.Random;

public class Ascend {
	public static void main(String[] args) {
		Random random = new Random();

		int lim = Integer.parseInt(args[0]);

		int a = random.nextInt(lim);
		int b = random.nextInt(lim);
		int c = random.nextInt(lim);

		System.out.println(a + " " + b + " " + c);

		int min = Math.min(a, Math.min(c, b));
		int max = Math.max(a, Math.max(c, b));
		int mid = a + b + c - min - max ;

		System.out.println(min + " " + mid + " " + max);
	

		

	}
}
