package by.htp.les01.main;

import java.util.Scanner;

public class Main21 {

	public static void main(String[] args) {
		// 21. Программа — льстец. На экране высвечивается вопрос «Кто ты: мальчик или
		// девочка?
		// Введи Д или М». В зависимости от ответа на экране должен появиться текст «Мне
		// нравятся
		// девочки!» или «Мне нравятся мальчики!».

		// Ошибка не работает

		Scanner sc = new Scanner(System.in);

		System.out.print(" Кто ты: мальчик или девочка? Введи Д или М: ");

		String str = sc.nextLine();

		if (str.equals(" Д ")) {
			System.out.println(" Мне нравятся девочки! ");
		}
		if (str.equals(" М ")) {
			System.out.println(" Мне нравятся мальчики! ");
		} else {
			System.out.println(" Вы ввели не Д и не  М  ");
		}
	}
}
