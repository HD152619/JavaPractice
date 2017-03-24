/**
 * 
 */
package org.dimigo.oop;

import org.dimigo.oop.Car;

/**
 * <pre>
 * org.dimigo.basic
 *    |_ CarTest
 *
 * 1. 개요 :
 * 2. 작성일 : 2017. 3. 23.
 * <pre>
 *
 * @author		: joo
 * @version		: 1.0
 */
public class CarTest
{

	/**
	 * @param args
	 */
	public static void main(String[] args)
	{
		Car car = new Car();
		
		System.out.println("<< 자동차 목록 >>");
		System.out.println("제조사명 : " + car.gettitle());
		System.out.println("모델명 : " + car.getmodel());
		System.out.println("색상 : " + car.getcolor());
		System.out.println("최대속도 : " + car.getmaxspeed() + "km");
		System.out.printf("가격 : %,d원\n\n",car.getprice());
		
		
		Car car1 = new Car();
		car1.settitle("기아자동차");
		car1.setmodel("K7");
		car1.setcolor("흰색");
		car1.setmaxspeed(246);
		car1.setprice(40000000);
		
		System.out.println("제조사명 : " + car1.gettitle());
		System.out.println("모델명 : " + car1.getmodel());
		System.out.println("색상 : " + car1.getcolor());
		System.out.println("최대속도 : " + car1.getmaxspeed() + "km");
		System.out.printf("가격 : %,d원\n\n",car1.getprice());
		
		
		Car car2 = new Car();
		car2.settitle("삼성자동차");
		car2.setmodel("SM7");
		car2.setcolor("회색");
		car2.setmaxspeed(200);
		car2.setprice(38000000);
		
		System.out.println("제조사명 : " + car2.gettitle());
		System.out.println("모델명 : " + car2.getmodel());
		System.out.println("색상 : " + car2.getcolor());
		System.out.println("최대속도 : " + car2.getmaxspeed() + "km");
		System.out.printf("가격 : %,d원\n",car2.getprice());
	}
}
