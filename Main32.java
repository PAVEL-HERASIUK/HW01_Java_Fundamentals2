package by.htp.les01.main;

public class Main32 {

	public static void main(String[] args) {
		// 32. Написать программу, которая по заданным трем числам определяет, является
		// ли сумма каких-либо двух из них положительной.
		int a = (int) (Math.random() * 20 - 10);
		int b = (int) (Math.random() * 20 - 10);
		int c = (int) (Math.random() * 20 - 10);

		System.out.println(" a = " + a + "; b = " + b + "; c = " + c);

		if (a + b >= 0) {
			System.out.println(" Сумма чисел a и b положительная ");
		}
		if (a + c >= 0) {
			System.out.println(" Сумма чисел a и c положительная ");
		}
		if (b + c >= 0) {
			System.out.println(" Сумма чисел b и c положительная ");
		}
	}
}
