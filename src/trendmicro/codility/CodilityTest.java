package trendmicro.codility;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class CodilityTest {

	public static void main(String[] args) {
		// System.out.println("I'm about to take CodilityTest");

		// int[] A = {3,4,7,7,6,6}; // 6個糖果，分一半出去，求最大多樣性
		int[] A = {80, 80, 1000000000, 80, 80, 80, 80, 80, 80, 123456789};
		int result = solution(A);
		 System.out.println(result);

		
	}
	
	public static int solution(int[] A) {
		
		int totalCandyNumber = A.length;
		// System.out.println(totalCandyNumber); // 6
		
		// Mary的糖果盒，最多可以裝的糖果數量
		int marrysCandyBoxMaxNum = totalCandyNumber/2;
		// System.out.println(marrysCandyBoxMaxNum); // 3個 
		
		// Mary的糖果盒
		//int[] marrysCandyBox = new int[marrysCandyBoxMaxNum];
		List<Integer> list = new ArrayList<Integer>();
		list.add(A[0]);
		
		
		// 直接先取第一個糖果，放進來
		//marrysCandyBox[0] = A[0];
		//System.out.println(marrysCandyBox[0]);
		
		// 之後逐一比對，不含就放進來，放滿為止
		
		
		
		// go through all the candies
		for(int i = 1; i<totalCandyNumber; i++) {
			// System.out.println(A[i]);
			if(!list.contains(A[i])) {
				list.add(A[i]);
				if(list.size()==marrysCandyBoxMaxNum) {
					// 裝滿了就出去
					return list.size();
				}
			}
			
		}
		
		// loop跑完，裝多少是多少
		return list.size();
	}
	
	public static boolean contains(int[] arr, int item) {
		for (int n : arr) {
			if (item == n) {
				return true;
			}
		}
		return false;
	}
	
	
	
	
	public static boolean bGreaterThanA(Integer a, Integer b) {
//		Integer a = 8;
//		Integer b = 200;
		    int compareValue = a.compareTo(b);
		    if (compareValue > 0) {
		        System.out.println("a is greater than b");
		        return false;
		    } else if (compareValue < 0) {
		        System.out.println("b is greater than a");
		        return true;
		    } else {
		        System.out.println("a and b are equal");
		        return false;
		    }
	}
	

}
