import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scn=new Scanner(System.in);
		int n=scn.nextInt();
		scn.close();
		System.out.println(Palindrome.checkPalindrome(n));
	}

}
