package by.htp.les01.main;

public class Main26 {

	public static void main(String[] args) {
		// 26. Написать программу нахождения суммы большего и меньшего из трех чисел.

		byte a = 1;
		byte b = 2;
		byte c = 3;
		int max = a;
		int min = a;
		if (a >= b && a >= c) {
			max = a;
		}
		if (b >= a && b >= c) {
			max = b;
		}
		if (c >= b && c >= a) {
			max = c;
		}
		if (a <= b && a <= c) {
			min = a;
		}
		if (b <= a && b <= c) {
			min = b;
		}
		if (c <= b && c <= a) {
			min = c;
		}
		System.out.println(" max = " + max + " | min = " + min);
		System.out.println(" sum = " + (max + min));
	}
}
