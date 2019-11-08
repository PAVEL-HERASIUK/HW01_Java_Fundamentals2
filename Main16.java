package by.htp.les01.main;

public class Main16 {

	public static void main(String[] args) {
		// 16. На плоскости ХОY задана своими координатами точка А. Указать, где она
		// расположена (на какой оси или в каком координатном угле).

		int x = (int) (Math.random() * 10 - 5);
		int y = (int) (Math.random() * 10 - 5);

		System.out.println(" Точка А с координатами (" + x + " , " + y + " )");
		if (x == 0 & y == 0) {
			System.out.print(" Точка А с координатами (" + x + " , " + y + ") находится в нуле ");

		} else if (x > 0 & y > 0) {
			System.out.print(" Точка А с координатами (" + x + " , " + y + ") находится в I четверти ");

		} else if (x < 0 & y > 0) {
			System.out.print(" Точка А с координатами (" + x + " , " + y + ") находится во II четверти ");

		} else if (x < 0 & y < 0) {
			System.out.print(" Точка А с координатами (" + x + " , " + y + ") находится в III четверти ");

		} else if (x > 0 & y < 0) {
			System.out.print(" Точка А с координатами (" + x + " , " + y + ") находится в IV четверти ");

		} else if (x == 0) {
			System.out.println(" Точка А с координатами (" + x + " , " + y + ") лежит на оси y ");

		} else if (y == 0) {
			System.out.println(" Точка А с координатами (" + x + " , " + y + ") лежит на оси x ");
		}
	}
}
