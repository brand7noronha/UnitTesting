package test1;

public class Arithmetic_test {

	int add(int a, int b) {
		return a + b;
	}

	int mul(int x, int y, int z) {
		return x * y * z;
	}

	double div(double i, double j) {
		return i / j;
	}

	int[] rev_arr(int[] arr) {
		int temp;
		for (int i = 0; i < arr.length / 2; i++) {
			temp = arr[arr.length - i - 1];
			arr[arr.length - i - 1] = arr[i];
			arr[i] = temp;
		}
		return arr;
	}
}
