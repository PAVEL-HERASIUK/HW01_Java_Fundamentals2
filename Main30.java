package by.htp.les01.main;

public class Main30 {

	public static void main(String[] args) {
		// // 30. Даны действительные числа а,b,с. Удвоить эти числа, если а > b > с, и
		// заменить их абсолютными значениями, если это не так.
		int a = 5;
		int b = 4;
		int c = -3;
		if (a > b && b > c) {
			a = a * 2;
			b = b * 2;
			c = c * 2;
			System.out.println(" a = " + a + ", b = " + b + ", c = " + c);
		} else {
			System.out.println("a = " + Math.abs(a) + ", b = " + Math.abs(b) + ", c = " + Math.abs(c));
		}
	}
}
