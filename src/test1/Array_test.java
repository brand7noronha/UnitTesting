package test1;

public class Array_test {

	static int[] rev_arr(int[] arr) {
		int temp;
		for (int i = 0; i < arr.length/2; i++) {
			temp = arr[arr.length - i - 1];
			arr[arr.length - i - 1] = arr[i];
			arr[i] = temp;
		}
		return arr;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		Array_test obj = new Array_test();
		int[] a = { 1, 2, 3, 4, 5 };
		int[] b = new int[a.length];
		b = rev_arr(a);
//		System.out.println(b);

//		int temp;
//		for (int i = 0; i < a.length / 2; i++) {
//			temp = a[a.length - i - 1];
//			a[a.length - i - 1] = a[i];
//			a[i] = temp;
//		}
//
		for (int i = 0; i < b.length; i++) {
			System.out.print(b[i] + ", ");
		}

	}

}
