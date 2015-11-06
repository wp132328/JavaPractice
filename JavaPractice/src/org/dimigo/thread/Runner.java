/**
 * 
 */
package org.dimigo.thread;

/**
 * <pre>
 * org.dimigo.thread
 * 	|_ Runner
 *
 * 1. 개요 :
 * 2. 작성일 : 2015. 11. 6.
 * </pre>
 *
 * @author		: Dummy (WP13 임재홍)
 * @version		: 1.0
 */
public class Runner extends Thread {
	
	private String name;

	public Runner() {
		
	}
	
	public Runner(String name) {
		this.name = name;
	}
	
	public void run() {
		System.out.println(name + " 출발");
		for (int i=100; i>0; i-=10) {
			System.out.println(name + i + " 미터");
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
		System.out.println(name + " 골인");
	}

}
