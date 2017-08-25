package com.sqa.eiei;
/**
 * File Name: LoopsApp.java<br>
 * KHIN, EI EI<br>
 * Created: Aug 19, 2017
 */

import com.sqa.eiei.helpers.*;;

public class LoopsApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String name = AppBasics.greetUserAndGetName("Java Loops App");
		doloopsExercise();
		calcGradeValue();
		AppBasics.farewellUser(name);
	}

	/**
	 *
	 */
	private static void calcGradeValue() {

		int totalNumberGrade = AppBasics.requestInt("How many grades would you like to be calculator?,1,10," "You must enter a valid number of grade to be calculate within the range of 1- 10");
				double totalPoints = 0;
		int i = 1;
		do {
			totalPoints = totalPoints + AppBasics.requestInt("Can I get your grade entry #", +i);
			i++;
		}while (i<=totalNumberGrade);
		System.out.println("Your total grade for this course is ");
	}

	private static void doloopsExercise() {
		int count;
		System.out.print("1. Print from 1-100:!\n ");
		for (count = 1; count <= 100; count++) {
			System.out.print(count + ",");
		}
		System.out.print("\n2. Print from 200-100:!\n ");
		for (count = 200; count >= 100; count--) {
			System.out.print(count + " .");
		}
		System.out.print("\n3. Print 10-1000 divided by 10:!\n");
		for (count = 10; count <= 1000; count += 10) {
			System.out.print(count + ".");
		}
		System.out.print("\n4. Print 1-100 even number: !\n");
		for (count = 1; count <= 100; count++) {
			{
				while ((count % 2) == 0) {
					System.out.println(count + ".");
					count++;
				}
			}
		}
		System.out.print("\n5. Print odd number beteen 300-400: !\n");
		for (count = 300; count <= 400; count++) {
			{
				while ((count % 2) != 0) {
					System.out.println(count + ".");
					count++;
				}
			}
		}
		System.out.print("\n6. Print number beteen 30-333: !\n");
		for (count = 30; count <= 333; count++) {
			{
				while ((count % 3) == 0) {
					System.out.println(count + ".");
					count++;
				}
			}
		}
	}
}