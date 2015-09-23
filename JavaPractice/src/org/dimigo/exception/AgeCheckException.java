/**
 * 
 */
package org.dimigo.exception;

/**
 * <pre>
 * org.dimigo.exception
 * 	|_ AgeCheckException
 *
 * 1. 개요 :
 * 2. 작성일 : 2015. 9. 23.
 * </pre>
 *
 * @author		: Dummy (WP13 임재홍)
 * @version		: 1.0
 */
public class AgeCheckException extends Exception {

	public AgeCheckException() {
		
	}
	
	public AgeCheckException(Movie movie) {
		super(movie.getTitle() + "는(은)" + movie.getLimitAge() + "이상 관람가입니다.");
	}

}
