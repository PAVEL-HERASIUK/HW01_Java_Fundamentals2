package by.htp.les01.main;

import java.util.Scanner;

public class Main9 {
	// 9. Составить программу, которая определит по трем введенным сторонам,
	// является ли данный треугольник равносторонним
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.print("Введите значение стороны a: ");
		int a = scan.nextInt();
		System.out.print("Введите значение стороны b: ");
		int b = scan.nextInt();
		System.out.print("Введите значение стороны c: ");
		int c = scan.nextInt();
		if (a == b && a == c && b == c) {
			System.out.println("Треугольник abc - равносторонний");
		} else {
			System.out.println("Треугольник abc - НЕ равносторонний");
		}
	}
}
