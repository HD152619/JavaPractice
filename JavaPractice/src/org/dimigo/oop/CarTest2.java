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
public class CarTest2
{

	/**
	 * @param args
	 */
	public static void main(String[] args)
	{
		Car2 car2 = new Car2();
		
		System.out.println("<< 자동차 목록 >>");
		System.out.println("제조사명 : " + car2.gettitle());
		System.out.println("모델명 : " + car2.getmodel());
		System.out.println("색상 : " + car2.getcolor());
		System.out.println("최대속도 : " + car2.getmaxspeed() + "km");
		System.out.printf("가격 : %,d원\n\n",car2.getprice());
		
		
		car2 = new Car2("기아자동차", "K7", "흰색", 246, 40000000);
		
		System.out.println("제조사명 : " + car2.gettitle());
		System.out.println("모델명 : " + car2.getmodel());
		System.out.println("색상 : " + car2.getcolor());
		System.out.println("최대속도 : " + car2.getmaxspeed() + "km");
		System.out.printf("가격 : %,d원\n\n",car2.getprice());
		
		
		car2 = new Car2("삼성자동차", "SM7", "회색", 200, 38000000);
		
		System.out.println("제조사명 : " + car2.gettitle());
		System.out.println("모델명 : " + car2.getmodel());
		System.out.println("색상 : " + car2.getcolor());
		System.out.println("최대속도 : " + car2.getmaxspeed() + "km");
		System.out.printf("가격 : %,d원",car2.getprice());
	}
}
