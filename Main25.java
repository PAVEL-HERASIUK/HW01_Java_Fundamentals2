package by.htp.les01.main;

public class Main25 {

	public static void main(String[] args) {
		// 25. Написать программу — модель анализа пожарного датчика в помещении,
		// которая выводит сообщение «Пожароопасная ситуация », если температура в комнате
		// превысила 60°С.

		byte t = 62;
		if (t > 60) {
			System.out.println(" Пожароопасная ситуация ");
		} else {
			System.out.println(" Температура в норме ");
		}
	}
}
