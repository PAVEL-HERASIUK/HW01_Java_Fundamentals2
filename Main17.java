package by.htp.les01.main;

public class Main17 {

	public static void main(String[] args) {
		// 17. Даны целые числа m, n. Если числа не равны, то заменить каждое из них
		// одним и тем же числом, равным большему из исходных, а если равны, то заменить числа
		// нулями.

		int m = 4;
		int n = 8;
		if (n == m) {
			n = 0;
			m = 0;
			System.out.println(n);
			System.out.println(m);
		} else {
			if (n > m) {
				m = n;
			} else {
				n = m;
			}
		}
		System.out.println(n = m);
	}
}
