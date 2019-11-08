package by.htp.les01.main;

public class Main3 {
	public static void main(String[] args) {
		// 3. Составить программу сравнения введенного числа а и цифры 3. Вывести на
		// экран слово «yes», если число а меньше 3; если больше, то вывести слово «no».
		int a = (int) (Math.random() * 10);
		if (a < 3) {
			System.out.println("Задача 3. Ответ: YES");
		} else {
			System.out.println("Задача 3. Ответ: NO");
		}
	}
}
