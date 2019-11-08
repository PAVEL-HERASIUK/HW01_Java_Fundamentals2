package by.htp.les01.main;

public class Main38 {

	public static void main(String[] args) {
		// 38. Вычислить значение функции:

		int x = 5;
		double F;

		if (x >= 0 && x <= 3) {
			F = x * x;
			System.out.println(" Значение функции равно " + F);
		}
		if (x > 3 || x < 0) {
			F = 4;
			System.out.println(" Значение функции равно " + F);
		}
	}
}
