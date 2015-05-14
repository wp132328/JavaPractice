/**
 * 
 */
package org.dimigo.oop;

/**
 * <pre>
 * org.dimigo.oop
 * 	|_ Score
 *
 * 1. 개요 :
 * 2. 작성일 : 2015. 5. 13.
 * </pre>
 *
 * @author		: Dummy (WP13 임재홍)
 * @version		: 1.0
 */

import java.util.Scanner;

public class Score {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("국어 점수 입력 => ");
		int kor = scanner.nextInt();
		System.out.print("수학 점수 입력 => ");
		int mat = scanner.nextInt();
		System.out.print("영어 점수 입력 => ");
		int eng = scanner.nextInt();
		
		scanner.close();
		
		String sb = new StringBuilder()
					.append("<< 점수 출력 >>\n")
					.append("국어 점수 : ")
					.append(kor + "\n")
					.append("수학 점수 : ")
					.append(mat + "\n")
					.append("영어 점수 : ")
					.append(eng + "\n")
					.append("총점 : ")
					.append((kor+mat+eng) + "\n")
					.append("평균 : ")
					.append(String.format("%.1f", (kor+mat+eng)/3.0) + "\n").toString();
		
		System.out.println(sb);

	}

}
