package by.htp.les01.main;

public class Main8 {
	// 8. Составить программу нахождения наименьшего из квадратов двух чисел а и b.
	public static void main(String[] args) {

		int a = (int) (Math.random() * 10);
		int b = (int) (Math.random() * 10);
		int a2 = (int) Math.pow(a, 2);
		int b2 = (int) Math.pow(b, 2);
		if (a2 < b2) {
			System.out.println("Квадрат числа a2 меньше");
		} else {
			System.out.println("Квадрат числа b2 меньше");
		}
	}
}
