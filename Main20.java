package by.htp.les01.main;

public class Main20 {

	public static void main(String[] args) {
		// 20. Определить, делителем каких чисел а, b, с является число k.

		int a = (int) (Math.random() * 100 + 1);
		int b = (int) (Math.random() * 100 + 1);
		int c = (int) (Math.random() * 100 + 1);
		int k = (int) (Math.random() * 10 + 1);

		System.out.println(" a = " + a + ", b = " + b + "; c = " + c + "; k = " + k);

		if (a % k == 0 & b % k == 0 & c % k == 0) {
			System.out.println(" Число k является делителем всех чисел.");

		} else if (a % k == 0 & b % k != 0 & c % k != 0) {
			System.out.println(" Число k является делителем числа а.");

		} else if (a % k != 0 & b % k == 0 & c % k != 0) {
			System.out.println(" Число k является делителем числа b.");

		} else if (a % k != 0 & b % k != 0 & c % k == 0) {
			System.out.println(" Число k является делителем числа с.");

		} else if (a % k == 0 & b % k == 0 & c % k != 0) {
			System.out.println(" Число k является делителем чисел a и b.");

		} else if (a % k == 0 & b % k != 0 & c % k == 0) {
			System.out.println(" Число k является делителем чисел a и с.");

		} else if (a % k != 0 & b % k == 0 & c % k == 0) {
			System.out.println(" Число k является делителем чисел b и c.");

		} else if (a % k != 0 & b % k != 0 & c % k != 0) {
			System.out.println(" Число k не является делителем заданных чисел.");
		}
	}
}
