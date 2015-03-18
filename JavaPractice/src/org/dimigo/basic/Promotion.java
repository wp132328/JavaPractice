package org.dimigo.basic;

public class Promotion {

	public static void main(String[] args) {
		long Month_Average_Salary = 1700000l;
		int Clerk = 3;
		int Shop_amount = 1500;
		
		long Personal_Expenses = Month_Average_Salary*12 * Clerk * Shop_amount; 

		System.out.println("월 평균 급여 : " + String.format("%,d", Month_Average_Salary) + "원");
		System.out.println("점포 내 직원 수 : " + String.format("%,d", Clerk) + "명");
		System.out.println("점포 수 : " + String.format("%,d", Shop_amount) + "개");
		System.out.println("\n");
		System.out.println("연간 인건비 : " + String.format("%,d", Personal_Expenses) + "원");
	}

}
