package trendmicro.codility;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;

public class CodilityTest {

	public static void main(String[] args) {
		// System.out.println("I'm about to take CodilityTest");

		
		
		// 
		String point1 = "Wed 04:25";
        String point2 = "Wed 15:14";
        
        // 找出兩個時間點的長度
        try {
			long timeSlotLength = timeSlotLength(point1,point2);
			System.out.println(timeSlotLength);
		} catch (ParseException e) {
			e.printStackTrace();
		}
        
        


    }

	// 找出兩個時間點的長度
	private static long timeSlotLength(String point1, String point2) throws ParseException {
		DateFormat format = new SimpleDateFormat("E HH:mm", Locale.ENGLISH);
		Date date1;
		Date date2;

		// String point1 = "Wed 04:25";
		// String point2 = "Wed 15:14";

		date1 = format.parse(point1);
		date2 = format.parse(point2);
		// System.out.println(date1); // Sat Jan 02 00:00:00 GMT 2010
		long difference = date2.getTime() - date1.getTime();

		return difference;
	}
		
	
	
	public static int solution(String S) {
		

		return 0;
	}
	
//	public static boolean contains(int[] arr, int item) {
//		for (int n : arr) {
//			if (item == n) {
//				return true;
//			}
//		}
//		return false;
//	}
	
//	public static boolean bGreaterThanA(Integer a, Integer b) {
////		Integer a = 8;
////		Integer b = 200;
//		    int compareValue = a.compareTo(b);
//		    if (compareValue > 0) {
//		        System.out.println("a is greater than b");
//		        return false;
//		    } else if (compareValue < 0) {
//		        System.out.println("b is greater than a");
//		        return true;
//		    } else {
//		        System.out.println("a and b are equal");
//		        return false;
//		    }
//	}
	

}
