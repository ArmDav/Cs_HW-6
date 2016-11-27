package utils;

public class Math {
	public static int factorial(int num) {
		if (num == 0) {
			return 1;
		}
		return num * factorial(num - 1);
	}

	public static int factorialLooped(int num) {
		int val = 1;
		while (num > 0) {
			val *= num;
			num--;
		}
		return val;
	}
}