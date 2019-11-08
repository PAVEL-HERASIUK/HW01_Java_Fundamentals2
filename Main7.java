package by.htp.les01.main;

public class Main7 {
	// 7. Составить программу нахождения модуля выражения a*x*x + b*x + c при
	// заданных значениях a, b, c и х
	public static void main(String[] args) {
		double a = -2.9;
		double b = 3.4;
		double c = 4.5;
		double x = 5.1;
		double g;
		g = Math.abs(a * x * x + b * x + c);
		System.out.println("Ответ: " + (g));
	}
}
