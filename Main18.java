package by.htp.les01.main;

public class Main18 {

	public static void main(String[] args) {
		// 18. Подсчитать количество отрицательных среди чисел а, b, с.

		double a = -8, b = 1, c = -4;
		double[] abc = { a, b, c };
		int count = 0;
		for (int i = 0; i < abc.length; i++) {
			if (abc[i] < 0) {
				count++;
			}
		}
		System.out.println(" Отрицательных чисел: " + count);
	}
}
