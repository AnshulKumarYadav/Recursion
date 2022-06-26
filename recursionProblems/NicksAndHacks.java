package recursionProblems;

import java.util.Scanner;

//<<------------------------------------------------Question--------------------------------------------------->>

/*Tom and Nick are good friends.Once Tom asked Nick exactly N rupees, but Nick has only 1 rupee in his bank account.
 * Nick wants to help his friend so he wrote two hacks First hack can multiply the amount of money he owns by 10
 * ,while the second can multiply it by 20. These hacks can be used any number of times.Can Nick help Tom with his hacks?
 * 
*/

// <<---------------------------------------------Constraints----------------------------------------------------->>
/*
 * 
 * 1 <= T <= 100        -------------------------Test cases
 * 
 * 1 <= N <= 10^12   ----------------------------amount
*/



public class NicksAndHacks {
	static boolean nick(long amount,long balance) //---------------- To avoid can't convert long to int that's why we take balance in long
	{
		if(balance==amount) return true;
		if(balance>amount) return false;
		if(nick(amount ,10*balance)==true || nick(amount, 20*balance)==true) return true;
		else return false;
	}
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter the number of test cases: ");
		int N = scanner.nextInt();
		System.out.println("Enter the amount: ");
		for(int i=0;i<N;i++)
		{
			long amount = scanner.nextInt();     // --------------In the constraint amount can be 10^12 that why we have use long
			System.out.println(nick(amount,1)?"Yes":"No");
		}
		
		
		
	}
}
