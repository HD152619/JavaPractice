/**
 * 
 */
package org.dimigo.oop;

/**
 * <pre>
 * org.dimigo.oop
 *    |_ FamilyMember
 *
 * 1. 개요 :
 * 2. 작성일 : 2017. 4. 18.
 * <pre>
 *
 * @author		: joo
 * @version		: 1.0
 */
public class FamilyMember
{
	private static int memberCnt = 0;
	private String memberName;					// memverName은 다 다르므로 static이 아님.
	
	public FamilyMember(String memberName)
	{
		memberCnt++;
		this.memberName = memberName;					// memberName에 각각의 이름 저장.
		}
	
	public String getMemberName()
	{
		return memberName;
	}
	
	public static void printMemberCnt()
	{
		System.out.println("가족 총 인원 수 : " + memberCnt + "명");
	}
}
