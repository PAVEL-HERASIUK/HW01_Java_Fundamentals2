package by.htp.les01.main;

public class Main40 {

	public static void main(String[] args) {
		// 40. Вычислить значение функции:

		int x = 5;
		double F;
		if (x <= 13) {
			F = -x * x * x + 9;
			System.out.println(" Значение функции равно " + F);
		}
		if (x > 13) {
			F = -(3 / (x + 1));
			System.out.println(" Значение функции равно " + F);
		}
	}
}
