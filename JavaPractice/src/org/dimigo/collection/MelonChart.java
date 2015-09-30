			/**
 * 
 */
package org.dimigo.collection;

import java.util.ArrayList;
import java.util.List;

/**
 * <pre>
 * org.dimigo.collection
 * 	|_ MelonChart
 *
 * 1. 개요 :
 * 2. 작성일 : 2015. 9. 25.
 * </pre>
 *
 * @author		: Dummy (WP13 임재홍)
 * @version		: 1.0
 */
public class MelonChart {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		List<Music> list = new ArrayList<Music>();
		
		list.add(new Music("바람이나 좀 쐐", "개리"));
		list.add(new Music("보통연애", "박경"));
		list.add(new Music("취향저격", "iKon"));
		System.out.println("-- << 멜론 차트 >> --");
		printList(list);
		
		list.add(1, new Music("레옹", "이유갓지"));
		System.out.println("-- << 2위 곡 추가 >> --");
		printList(list);
		
		list.set(2, new Music("맙소사", "황태지"));
		System.out.println("-- << 3위 곡 변경 >> --");
		printList(list);
		
		list.remove(3);
		System.out.println("-- << 4위 곡 삭제 >> --");
		printList(list);
		
		list.clear();
		System.out.println("-- << 전체 리스트 삭제 >> --");
		printList(list);

	}
	
	public static void printList(List<Music> list) {
		for(Music value : list) {
			System.out.println(value);
		}
		System.out.println();
	}


}
