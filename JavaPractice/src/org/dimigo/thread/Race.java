/**
 * 
 */
package org.dimigo.thread;

/**
 * <pre>
 * org.dimigo.thread
 * 	|_ Race
 *
 * 1. 개요 :
 * 2. 작성일 : 2015. 11. 6.
 * </pre>
 *
 * @author		: Dummy (WP13 임재홍)
 * @version		: 1.0
 */
public class Race {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		System.out.println("main thread start");
		
		Thread t1 = new Runner("조준희");
		Thread t2 = new Runner("성시철");
		
		// MAX_PRIORITY(10), NORM_PRIORITY(5), MIN_PRIORITY(5)
		// 우선순위가 높은 스레드가 실행 기회를 더 많이 가진다.
		t1.setPriority(Thread.MAX_PRIORITY);
		t2.setPriority(Thread.MIN_PRIORITY);
		
		t1.start();
		t2.start();
		
		System.out.println("main thread end");

	}

}
