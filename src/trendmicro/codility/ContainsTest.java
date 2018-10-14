package trendmicro.codility;

public class ContainsTest {

	public static boolean contains(int[] arr, int item) {
		for (int n : arr) {
			if (item == n) {
				return true;
			}
		}
		return false;
	}

	public static void main(String[] args) {
		int[] myArray = { 5, 2, 17, 13, 12, 19, 7, 3, 9, 15 };
		System.out.println(contains(myArray, 13));
		System.out.println(contains(myArray, 25));
	}

}
