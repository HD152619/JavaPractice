/**
 * 
 */
package org.dimigo.basic;

/**
 * <pre>
 * org.dimigo.basic
 *    |_ Operator
 *
 * 1. 개요 :
 * 2. 작성일 : 2017. 3. 13.
 * <pre>
 *
 * @author		: joo
 * @version		: 1.0
 */
public class Operator
{
	public static void main(String[] args)
	{
		int money = 1700000;
		int people = 3;
		int store = 1500;
		long yearmoney = (long)money*12*store*people;
		System.out.println("<<디미베네 연간 인건비>>");
		System.out.printf("월 평균 급여 : %,d원\n", money);
		System.out.printf("점포 내 직원 수 : %d명\n", people);
		System.out.printf("점포 수 : %,d개\n", store);
		System.out.println();
		System.out.println();
		System.out.printf("연간 인건비 : %,d원", yearmoney);
	}

}
