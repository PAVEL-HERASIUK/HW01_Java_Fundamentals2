package by.htp.les01.main;

public class Main37 {

	public static void main(String[] args) {
		// 7. Вычислить значение функции:

		int x = 3;
		double y;

		if (x >= 3) {
			y = (-Math.pow(x, 2)) + 3 * x + 9;
			System.out.println(" y = " + y);

		} else {
			y = 1 / (Math.pow(x, 3) - 6);
			System.out.println(" y = " + y);
		}
	}
}
