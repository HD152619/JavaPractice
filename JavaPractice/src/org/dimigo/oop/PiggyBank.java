/**
 * 
 */
package org.dimigo.oop;

/**
 * <pre>
 * org.dimigo.oop
 *    |_ Piggybank
 *
 * 1. 개요 :
 * 2. 작성일 : 2017. 4. 18.
 * <pre>
 *
 * @author		: joo
 * @version		: 1.0
 */
public class PiggyBank
{
	private static int balance;
	public static void putMoney(FamilyMember member, int amount)
	{
		balance += amount;
		System.out.println(member.getMemberName()+" : "+amount + "원 넣음");
	}
	public static void printBalance()
	{
		System.out.println("돼지저금통 총 금액 : " + balance + "원");				// amount는 저금 금액이므로 balance사용.
	}
}