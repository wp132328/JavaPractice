package org.dimigo.basic;

public class Condition {

	public static void main(String[] args) {
		int Express_Bus_fee = 850;
		int Compact_Car_fee = 300;
		int Other_Car_fee = 600;
		int distance = 10;
		
		String Model = "고속버스";
		
		System.out.println("거리 : " + distance + "km");
		System.out.println("차종 : " + Model);
		
		switch(Model) {
		case "고속버스":
			if (distance >= 0 || distance <= 10) {
				System.out.println("통행료 : " + Express_Bus_fee + "원");
			} else if (distance <= 20) {
				System.out.println("통행료 : " + (Express_Bus_fee + 300) + "원");
			} else if (distance <= 30) {
				System.out.println("통행료 : " + (Express_Bus_fee + 600) + "원");
			}
			break;
		case "경차":
			if (distance >= 0 || distance <= 10) {
				System.out.println("통행료 : " + Compact_Car_fee + "원");
			} else if (distance <= 20) {
				System.out.println("통행료 : " + (Compact_Car_fee + 200) + "원");
			} else if (distance <= 30) {
				System.out.println("통행료 : " + (Compact_Car_fee + 400) + "원");
			}
			break;
		case "그 외":
			if (distance >= 0 || distance <= 10) {
				System.out.println("통행료 : " + Other_Car_fee + "원");
			} else if (distance <= 20) {
				System.out.println("통행료 : " + (Other_Car_fee + 200) + "원");
			} else if (distance <= 30) {
				System.out.println("통행료 : " + (Other_Car_fee + 400) + "원");
			}
			break;
		}

	}

}
