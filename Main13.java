package by.htp.les01.main;

public class Main13 {

	public static void main(String[] args) {
		// 13. Даны две точки А(х1, у1) и В(х2, у2). Составить алгоритм, определяющий,
		// которая из точек находится ближе к началу координат.

		double x1 = 1, y1 = 2, x2 = 3, y2 = -4;
		double distanceA = Math.sqrt(x1 * x1 + y1 * y1);
		double distanceB = Math.sqrt(x2 * x2 + y2 * y2);
		if (distanceA < distanceB) {
			System.out.println("Точка А(x1, y1) находится ближе к началу координат ");
		} else {
			System.out.println("Точка B(x2, y2) находится ближе к началу координат ");
		}
	}
}
