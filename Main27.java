package by.htp.les01.main;

public class Main27 {

	public static void main(String[] args) {
		// 27. Найти max{min(a, b), min(c, d)}.

		int a = 1;
		int b = 2;
		int c = 3;
		int d = 4;
		int z = Math.max(Math.min(a, b), Math.min(c, d));

		System.out.println("max = " + z);
	}
}
