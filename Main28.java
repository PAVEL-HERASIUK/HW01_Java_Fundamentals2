package by.htp.les01.main;

public class Main28 {

	public static void main(String[] args) {
		// 28. Даны три числа a, b, с. Определить, какое из них равно d. Если ни одно не
		// равно d, то найти max(d — a, d — b, d —c).
		int a = 1;
		int b = 2;
		int c = 3;
		int d = 4;
		if (a == d || b == d || c == d) {
			if (a == d) {
				System.out.println(" a = d ");
			}
			if (b == d) {
				System.out.println(" b = d ");
			}
			if (c == d) {
				System.out.println(" c = d ");
			}
		} else {
			int max1 = Math.max(d - a, d - b);
			int max2 = Math.max(max1, d - c);
			System.out.println(max2);
		}
	}
}