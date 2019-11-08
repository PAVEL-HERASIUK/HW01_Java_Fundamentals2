package by.htp.les01.main;

public class Main12 {

	public static void main(String[] args) {
		// 12. Даны три действительных числа. Возвести в квадрат те из них, значения
		// которых неотрицательны, и в четвертую степень — отрицательные.
		double number1 = 2;
		double number2 = 7;
		double number3 = -9;
		double[] numbers = { number1, number2, number3 };
		for (int i = 0; i < numbers.length; i++) {
			double number = numbers[i];
			if (number >= 0) {
				System.out.println(Math.pow(number, 2));
			} else {
				System.out.println(Math.pow(number, 4));
			}
		}
	}
}
