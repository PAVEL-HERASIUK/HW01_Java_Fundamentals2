package by.htp.les01.main;

import java.util.Scanner;

public class Main23 {

	public static void main(String[] args) {
		// 23. Определить правильность даты, введенной с клавиатуры (число — от 1 до 31,
		// месяц — от 1 до 12). Если введены некорректные данные, то сообщить об этом.

		Scanner sc = new Scanner(System.in);

		System.out.print(" Введите число: ");

		int d = sc.nextInt();

		System.out.print(" Введите месяц: ");

		int m = sc.nextInt();

		if (d < 1 || d > 31 || m < 1 || m > 12) {
			System.out.println(" Введены некорректные данные ");

		} else {
			System.out.println(" Введено: " + d + " число" + " . " + m + " месяц");
		}
	}
}
