/**
 * 
 */
package org.dimigo.oop;

/**
 * <pre>
 * org.dimigo.oop
 * 	|_ SnackTest
 *
 * 1. 개요 :
 * 2. 작성일 : 2015. 5. 20.
 * </pre>
 *
 * @author		: Dummy (WP13 임재홍)
 * @version		: 1.0
 */
public class SnackTest {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Snack[] SnackArr = {
				new Snack("새우깡", "농심", 1100, 2),
				new Snack("콘칲", "크라운", 1200, 1),
				new Snack("허니버터칩", "해태", 1500, 4)
		};
		
		int sum = 0;
		
		for (Snack value : SnackArr) {
			sum += value.calcPrice();
			value.printSnack();
		}
		
		System.out.println("총 구매 가격 : " + sum);

	}

}
