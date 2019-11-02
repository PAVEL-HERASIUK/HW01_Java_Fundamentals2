package by.htp.les01.main;

public class Main10 {
	//10. Составить программу, которая определит площадь какого круга меньше.
	public static void main (String[] args) {
		double r1 = Math.random()*10;
		double r2 = Math.random()*10;
		double s1;
		double s2;
		s1 = Math.PI * Math.pow(r1, 2);
	    s2 = Math.PI * Math.pow(r2, 2);
	    System.out.println(s1);
		System.out.println(s2);
		if (s1 < s2) {
			System.out.println("Area circle s1 - меньше");
		} else if (s1 > s2) {
			System.out.println("Area circle s2 - меньше");
		}else {
			System.out.println("Площади равны");
		}
	}
}