import java.util.Scanner;

public class Main {
	
	public static void categorizeAge(int age)
	{
		if(age>=0 && age<=12) {
			System.out.println("Child");
		}
		else if(age>=13 && age<=19) {
			System.out.println("Teen");
		}
		else if(age>=20 && age<=59) {
			System.out.println("Adult");
		}
		else {
			System.out.println("Senior");
		}
	

	}

	public static void main(String[] args)

	{
		Scanner scn=new Scanner(System.in);
		System.out.println("Enter the Age : ");
		int age=scn.nextInt();
		categorizeAge(age);
		scn.close();
		}
}
