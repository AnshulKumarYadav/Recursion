package recursionProblems;

import java.util.Scanner;

//<<----------------------------------------------------Question---------------------------------------------------------------->>

/*
 * Mr.Robot needs an encryption method, so Elliott was there to help him. 
 * At the same time, Richard wrote a paper on encryption. 
 * Elliott then started writing his algorithms with the help of paper from Richard but he needs your help in implementing. 
 * The algorithm is like this:
 * Given an input string, the encrypted string will start with the middle character of the string and will be formed henceforth 
 * with the middle characters of the left and right substrings (of the middle character of the word) and so on. 
 * Take a look at the explanation of the sample test case for better understanding.
 * */


//<<---------------------------------------------------Constraints------------------------------------------------->>
//1 <= T <= 10 -----------------------------Test Cases
//
//1 <= Length of the string <= 10000--------------------------Length


//<<------------------------------------------------Input/Output---------------------------------------------->>
//     T = 2
//
//      N=4
//    "abcd"
//
//    N=11
//    abcdefghijk




public class RobotElliot {
	
	static String robot(int si,int ei,String s,String newString)   // si---> Starting Index   |    ei----> Ending Index |   newString ----->Empty string which we will return
	{
		if(si>ei) return newString;
		int mid  = (si + ei)/2;             // middle index of string;
		 return newString += s.charAt(mid) +robot(si, mid-1, s,newString)+robot(mid+1, ei, s,newString);
	}
	
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter no of test cases: ");
		int tc = scanner.nextInt();
		for(int i=0;i<tc;i++)
		{
			System.out.println("Enter the size of string");
			int N = scanner.nextInt();
			System.out.println("Enter the string");
			String s = scanner.next();
			String ans =   robot(0,N-1,s,"");
			System.out.println(ans);
		}
	}
	
}





















