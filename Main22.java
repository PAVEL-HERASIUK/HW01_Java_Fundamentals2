package by.htp.les01.main;

public class Main22 {

	public static void main(String[] args) {
		// 22. Перераспределить значения переменных х и у так, чтобы в х оказалось
		// большее из этих значений, а в y - меньшее.

		int x = (int) (Math.random() * 100 + 1);
		int y = (int) (Math.random() * 100 + 1);
		while (x == y) {
			x = (int) (Math.random() * 100 + 1);
		}
		System.out.println(" x = " + x + ", y = " + y);
		if (x < y) {
			int min = x;
			int max = y;
			y = x;
			x = max;
			y = min;
		}
		System.out.println(" x = " + x + ", y = " + y);
	}
}
