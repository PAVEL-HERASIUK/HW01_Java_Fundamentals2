package by.htp.les01.main;

public class Main6 {
	// 6. Составить программу: определения наибольшего из двух чисел а и b.
	public static void main(String[] args) {
		
		int a = (int) (Math.random() * 5);
		int b = (int) (Math.random() * 5);
		if (a > b) {
			System.out.println("Число a больше b");
		} else {
			System.out.println("Число b больше a");
		}
	}
}
