package by.htp.les01.main;

public class Main11 {

	public static void main(String[] args) {
		// 11. Составить программу, которая определит площадь какого треугольника
		// больше.

		double triangArea1 = 45.5;
		double triangArea2 = 98.12;
		if (triangArea1 > triangArea2) {
			System.out.println(" Площадь первого треугольника больше ");
		} else if (triangArea1 < triangArea2) {
			System.out.println(" Площадь второго треугольника больше ");
		} else {
			System.out.println(" Площади треугольников равны ");
		}
	}
}
