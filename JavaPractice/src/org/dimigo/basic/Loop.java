/**
 * 
 */
package org.dimigo.basic;

import java.util.Random;
import java.util.Scanner;
/**
 * <pre>
 * org.dimigo.basic
 *    |_ Loop
 *
 * 1. 개요 :
 * 2. 작성일 : 2017. 3. 16.
 * <pre>
 *
 * @author		: joo
 * @version		: 1.0
 */
public class Loop
{
	/**
	 * @param args
	 */
	public static void main(String[] args)
	{
		int choice = 0, pow = 100;
		String[] cha = {"마법사", "영주", "기사", "농민"};
		Scanner scanner = new Scanner(System.in); 			//[System. in] > sys에서 입력을 받는다는 뜻
		while(choice != 9)
		{  
			
			int rand = new Random().nextInt(4);
			System.out.println("--------------------");
			System.out.println("<< Game Menu >>");
			System.out.println("1. 공격력 증가");
			System.out.println("2. 공격력 감소");
			System.out.println("3. 캐릭터 설정");
			System.out.println("9. 종료");
			System.out.println("--------------------");
			System.out.printf("메뉴 입력 => ");
			choice = scanner.nextInt();
			switch(choice)
			{
				case 1:
					pow += 10;
					System.out.println("공격력이 증가되었습니다. 현재 공격력 : " + pow); break;
				case 2:
					pow -= 10;
					System.out.println("공격력이 감소되었습니다. 현재 공격력 : " + pow); break;
				case 3:
					System.out.println(cha[rand] + "(으)로 설정되었습니다."); break;
				case 9:
					System.out.println("이제 공부하세요!"); break;
				default:
					System.out.println("없는 메뉴입니다!!");
			}
		}
	}

}
