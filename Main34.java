package by.htp.les01.main;

import java.util.Scanner;

public class Main34 {

	public static void main(String[] args) {
		// 34. Составить программу, реализующую эпизод применения компьютера в книжном
		// магазине. Компьютер запрашивает стоимость книг, сумму денег, внесенную
		// покупателем;если сдачи не требуется, печатает на экране «спасибо»; если денег внесено
		// больше, чем необходимо, то печатает «возьмите сдачу» и указывает сумму сдачи; если денег
		// недостаточно, то печатает сообщение об этом и указывает размер недостающей суммы.

		Scanner sc = new Scanner(System.in);
		System.out.print(" Введите цену книги:");

		double price = sc.nextDouble();
		System.out.print(" Введите сумму, внесенную покупателем:");

		double sum = sc.nextDouble();

		if (sum == price) {
			System.out.println(" Спасибо!");

		} else if (sum > price) {
			System.out.println(" Спасибо! Заберите сдачу:" + " - " + (sum - price));

		} else if (sum < price) {
			System.out.println(" Сумма недостаточна, добавьте: " + (price - sum));
		}
	}
}
