package com.calculator.entity;

import java.util.Scanner;

class Grade{
	public String grade(int avgp) {
		switch(avgp / 10){
		
		case 10:
			return "A+";
		case 9:
		    return "A";
		case 8:
			return "B+";
		case 7:
			return "B";
		case 6:
			return "c";
		case 5:
			return "D";
		default:
			return "F";
		}
		
	}
}

public class Calculator {

	public static void main(String[] args) {
		Grade g = new Grade();
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a no of Subject:- ");
		int tsub = sc.nextInt();
		int tmarks = 0;
		
		for(int i = 0; i < tsub; i++) {
			System.out.println("Enter a mark obtained from subject:-  " +(i+1));
			int marks = sc.nextInt();
			tmarks += marks;
		}
		
		int avgp = tmarks / tsub;
		
		String Grade = g.grade(avgp);
		System.out.println("");
		
		System.out.println("Total marks obtained :-  " +tmarks);
		System.out.println("Percentage obtained :-  " +avgp + "%");
		System.out.println("Grade obtained :-  " + Grade );
		
		sc.close();
		
	}

}
