package by.htp.les01.main;

public class Main31 {

	public static void main(String[] args) {
		// 31. Заданы размеры А, В прямоугольного отверстия и размеры х, у, z кирпича.
		// Определить, пройдет ли кирпич через отверстие.

		int A = 3;
		int B = 4;
		int x = 3;
		int y = 4;
		int z = 5;
		if (((x <= A) && (y <= B)) || ((x <= B) && (y <= A)) || ((x <= A) && (z <= B)) || ((x <= B) && (z <= A))
				|| ((y <= A) && (z <= B)) || ((y <= B) && (z <= A))) {
			System.out.println(" Кирпич пройдет ");
		} else {
			System.out.println(" Кирпич не пройдет ");
		}
	}
}
