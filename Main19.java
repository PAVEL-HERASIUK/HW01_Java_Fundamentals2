package by.htp.les01.main;

public class Main19 {

	public static void main(String[] args) {
		// 19. Подсчитать количество положительных среди чисел а, b, с.

		double a = -8, b = 6, c = -4;
		double[] abc = { a, b, c };
		int count = 0;
		for (int i = 0; i < abc.length; i++) {
			if (abc[i] > 0) {
				count++;
			}
		}
		System.out.println(" Положительных чисел: " + count);
	}
}
