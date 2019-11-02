package by.htp.les01.main;

public class Main4 {
	//4. Составить программу: равны ли два числа а и b?
	public static void main(String[] args ) {
		int a = (int)(Math.random()*10);
		int b = (int)(Math.random()*10);
		if (a == b) {
			System.out.println("Задача 4. Ответ: a and b равны");
		}
		else {
			System.out.println("Задача 4. Ответ: a and b не равны");
		}
	}
}
