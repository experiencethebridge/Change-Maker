//Determine the smallest number of coins needed to make an entered amount
//Sean O'Brien
// 11.27.2018

//Pseudocode:
//  int amount, originalAmount, quarters, dimes, nickels, pennies;
//  1. read amount into the variable amount
//  2. set the variable quarters to the maximum number of quarters in amount
//  3. reset amount to the change left after giving out that many quarters
//  4. set the variable dimes to the maximum number of dimes in amount
//  5. reset amount to the change left after giving out that many dimes
//  6. set the variable nickels to the maximum number of nickels in amount
//  7. reset amount to the change left after giving out that many nickels
//  8. pennies = amount
//  9. display originalAmount and the numbers of each coin
//  use operand %
//  Currently trying to make this work using dollars and cents, i.e., $1.22 instead of 122 
//  This is causing an input mismatch exception, type double does not help instead of int

import java.util.Scanner;
public class ChangeMaker {

	public static void main(String[] args) {
		int amount, originalAmount, quarters, dimes, nickels, pennies;
		System.out.println("Enter a dollar and change amount.");
		System.out.println("I will find a combination of coins");
		System.out.println("that equals that amount of change.");
		
		Scanner keyboard = new Scanner (System.in);
		amount = keyboard.nextInt();
		if 
			(amount < 1)
			{
		originalAmount = amount;
		quarters = amount / 25;
		amount = amount % 25;
		dimes = amount / 10;
		amount = amount % 10;
		nickels = amount / 5;
		amount = amount % 5;
		pennies = amount;
		}
		else
			amount = amount*100;
			{
		originalAmount = amount;
		quarters = amount / 25;
		amount = amount % 25;
		dimes = amount / 10;
		amount = amount % 10;
		nickels = amount / 5;
		amount = amount % 5;
		pennies = amount;
			}
		
		System.out.println(originalAmount +
				" cents in coins can be given as");
		System.out.println(quarters + " quarters");
		System.out.println(dimes + " dimes");
		System.out.println(nickels + " nickels");
		System.out.println(pennies + " pennies");	
	}
}
