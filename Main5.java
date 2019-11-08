package by.htp.les01.main;

public class Main5 {
	// 5. Составить программу: определения наименьшего из двух чисел а и b.
	public static void main(String[] args) {

		int a = (int) (Math.random() * 5);
		int b = (int) (Math.random() * 5);
		if (a < b) {
			System.out.println("Число a меньше b");
		} else {
			System.out.println("Число b меньше a");
		}
	}
}
