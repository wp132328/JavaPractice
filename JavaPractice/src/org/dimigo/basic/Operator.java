package org.dimigo.basic;

public class Operator {

	public static void main(String[] args) {
		int trapezoid_length_a = 9;
		int trapezoid_length_b = 10;
		double trapezoid_height = 5.8;
		double trapezoid_width = (trapezoid_length_a + trapezoid_length_b) * trapezoid_height / 2;
		
		int parallelogram_base_line = 9;
		double parallelogram_height = 5.4;
		double parallelogram_width = parallelogram_base_line * parallelogram_height;
		
		double subtract = trapezoid_width - parallelogram_width;
		
		System.out.println("<< 도형 넓이 비교 >>");
		System.out.println("사다리꼴 넓이 : " + trapezoid_width);
		System.out.println("평행사변형 넓이 : " + parallelogram_width);
		System.out.println("\n");
		System.out.println("사다리꼴이 평행사변형 보다 " + subtract + " 더 큽니다.");
	}

}
