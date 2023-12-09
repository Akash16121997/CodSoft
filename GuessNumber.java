package com.entity.com;

import java.util.Random;
import java.util.Scanner;

public class GuessNumber {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		Random ab = new Random();
		int count = 0;
		int compWins = 0;
		int UserWins = 0;
		System.out.println("Enter a name : ");
		String name = sc.nextLine();
		
		System.out.println("Welcome " +name);
		System.out.println("Game rule");
		System.out.println("--------------------");
		System.out.println("Rule No 1 : "+"Guess number under 100");
		System.out.println("Rule No 2 : "+ "There is 5 match series between ");
		System.out.println("Rule No 3 : "+ " if you win three games you will win the game ");
		System.out.println("Rule No 4 : "+ " if computer win three games than you will loss the game ");
		System.out.println("Rule No 5 : "+ " number must be equal to 100 either below to 100");
		System.out.println("--------------------------------------------------------------------------");
		
		for(int i = 0; i<5; i++) {
		System.out.println("Enter a number please");
		System.out.println("----------------------------------------------------------------------");
		int userinput = sc.nextInt();
		int compinput = 1+ab.nextInt(100);
		
		if(userinput < compinput) {
			System.out.println("Your number is less than computer input");
			System.out.println("Computer Wins");
			System.out.println("computer choice is " +compinput);
			compWins++;
			count++;
		}
		else if(userinput == compinput){
			System.out.println("Congrats you win the match ");
			count++;
			UserWins++;
		}
		else {
			System.out.println("Invalid Choice");
		}
		
		System.out.println("Total Match play" +count);
		System.out.println("Total Match wins by computer " +compWins);
		System.out.println("Total Match wins by User " +UserWins);
		}
	}
		

}
