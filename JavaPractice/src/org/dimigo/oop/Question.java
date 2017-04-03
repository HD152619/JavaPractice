/**
 * 
 */
package org.dimigo.oop;

import java.util.Scanner;

/**
 * <pre>
 * org.dimigo.oop
 *    |_ Question
 *
 * 1. 개요 :
 * 2. 작성일 : 2017. 4. 3.
 * <pre>
 *
 * @author		: joo
 * @version		: 1.0
 */
public class Question
{
	public static void main(String[] args)
	{
		String[] questions = {"1. Who's ur favorite singer?", "2. Who's ur favorite actor?", "3. What's ur favorite subject?"};
		String[] answers = {"One Direction", "Aaron Johnson", "Programming"};
		Scanner scanner = new Scanner(System.in);
		StringBuilder case1 = new StringBuilder("Right!");
		StringBuilder case2 = new StringBuilder("Wrong!");
		
		for(int i = 0; i < 3; i++)
		{
			System.out.println(questions[i]);
			String answer = scanner.nextLine();

			if(answer.equals(answers[i]))
			{
				System.out.println(case1);
				System.out.println();
			}
			else
			{
				System.out.println(case2);
				System.out.println();
			}
		}	
	}
}
