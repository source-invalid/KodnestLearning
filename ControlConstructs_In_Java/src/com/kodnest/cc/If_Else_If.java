package com.kodnest.cc;

public class If_Else_If {
	public static void getGrade(int score) {
		if(score>=90) {
			System.out.println("Grade : A+");
		}
		else if (score>=80 && score<90) {
			System.out.println("Grade : A");
		}
		else if (score>=70 && score<80) {
			System.out.println("Grade : B");
		}
		else if (score>=60 && score<70) {
			System.out.println("Grade : C");
		}
		else if (score>=50 && score<60) {
			System.out.println("Grade : D");
		}
		else {
			System.out.println("Fail");
		}
	}
	
}
