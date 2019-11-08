package by.htp.les01.main;

public class Main29 {

	public static void main(String[] args) {
		// 29. Даны три точки А(х1,у1), В(х2,у2) и С(х3,у3). Определить, будут ли они
		// расположены на одной прямой.
		int x1 = (int) (Math.random() * 10 - 10);
		int x2 = (int) (Math.random() * 10 - 10);
		int x3 = (int) (Math.random() * 10 - 10);
		int y1 = (int) (Math.random() * 10 - 10);
		int y2 = (int) (Math.random() * 10 - 10);
		int y3 = (int) (Math.random() * 10 - 10);
		if ((x1 - x3) * (y2 - y3) - (x2 - x3) * (y1 - y3) == 0) {
			System.out.println(" Точки расположены на одной прямой ");
		} else {
			System.out.println(" Точки не расположены на одной прямой ");
		}
	}
}
