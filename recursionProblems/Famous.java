package recursionProblems;

import java.util.Scanner;

// num  = 148;
// times = 3

// Solution :-  make 148 as string and multiply by 3 so our string is 148148148 then take the sum of them whenever single digit come;
// 1+4+8+1+4+8+1+4+8 = 39
// 3+9 = 12
//1+2 = 3  ---------------------Single Digit so ans is 3

public class Famous {
	static int famousSum(int n)
	{
		if(n==0) return 0;
		return n%9==0 ? 9: n%9;
	}
	
	static int repeatedNumber(int n,int m)
	{
		int sum = m * famousSum(n);
		return famousSum(sum);
	}
	
	public static void main(String[] args) {
		Scanner sc  = new Scanner(System.in);
		System.out.println("Enter the number :");
		int N = sc.nextInt();
		System.out.println("Enter the times number to be increase: ");
		int m = sc.nextInt();
		
	   System.out.println("The sum is: "+repeatedNumber(N,m));
		}

}
