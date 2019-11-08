package by.htp.les01.main;

public class Main15 {

	public static void main(String[] args) {
		// 5. Даны действительные числа х и у, не равные друг другу. Меньшее из этих
		// двух чисел заменить половиной их суммы, а большее — их удвоенным
		// произведением.

		float var1 = 1;
		float var2 = 2;
		float temp1 = (var1 + var2) / 2;
		float temp2 = var1 * var2 * 2;
		if (var1 > var2) {
			var1 = temp1;
			var2 = temp2;
		} else {
			var1 = temp1;
			var2 = temp2;
		}
		System.out.println(var1);
		System.out.println(var2);
	}
}
