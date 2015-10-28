package LearningJava;

public class PrimeNumber {
	public static void main(String[] args) {

		for (int i = 1; i <= 100; i++) {
			int x = 1;
			int counter = 0;

			while (x <= i) {
				if (i % x == 0) {
					counter++;
				}
				x++;
			}
			if (counter == 2) {
				System.out.println(i);
			}

		}

	}
}
