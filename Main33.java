package by.htp.les01.main;

import java.util.Scanner;

public class Main33 {

	public static void main(String[] args) {

		// 33. Написать программу, которая по паролю будет определять уровень доступа
		// сотрудника к секретной информации в базе данных. Доступ к базе имеют только шесть
		// человек, разбитых на три группы по степени доступа. Они имеют следующие пароли: 9583,
		// 1747 — доступны модули баз А, В, С; 3331, 7922 — доступны модули баз В, С; 9455,
		// 8997 — доступен модуль базы С.

		Scanner sc = new Scanner(System.in);
		System.out.print(" Введите пароль (9583, 1747, 3331, 7922, 9455, 8997):");
		int num = sc.nextInt();
		if (num == 9583 || num == 1747) {
			System.out.println(" Доступны модули баз А, В, С ");

		} else if (num == 3331 || num == 7922) {
			System.out.println(" Доступны модули баз В, С ");

		} else if (num == 9455 || num == 8997) {
			System.out.println(" Доступны модули баз С ");

		} else {
			System.out.println(" Вы ввели неверный пароль! ");
		}
	}
}
