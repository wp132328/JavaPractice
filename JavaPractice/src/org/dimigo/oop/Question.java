/**
 * 
 */
package org.dimigo.oop;

/**
 * <pre>
 * org.dimigo.oop
 * 	|_ Question
 *
 * 1. 개요 :
 * 2. 작성일 : 2015. 5. 12.
 * </pre>
 *
 * @author		: Dummy (WP13 임재홍)
 * @version		: 1.0
 */

import java.util.Scanner;

public class Question {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		String singer = "빅뱅";
		String actor = "조인성";
		String subject = "자바";
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("가장 좋아하는 가수는?");
		String answer = scanner.nextLine();
		if (singer.equals(answer)) {
			System.out.println("정답입니다!! ^^");
		} else {
			System.out.println("틀렸습니다!! ㅠ");
		}
		
		System.out.println("가장 좋아하는 배우는?");
		answer = scanner.nextLine();
		if (actor.equals(answer)) {
			System.out.println("정답입니다!! ^^");
		} else {
			System.out.println("틀렸습니다!! ㅠ");
		}
		
		System.out.println("가장 좋아하는 과목은?");
		answer = scanner.nextLine();
		if (subject.equals(answer)) {
			System.out.println("정답입니다!! ^^");
		} else {
			System.out.println("틀렸습니다!! ㅠ");
		}

	}

}
