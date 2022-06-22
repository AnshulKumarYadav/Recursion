package recursionProblems;

public class PrintNumbers {
//  Print Numbers in decreasing order
	static void printNumber(int n)
	{
		if(n==35) return ;    // Base Condition
		System.out.println(n);  // Body
		printNumber(n-1);   //Recursion call or Function call
	}
	
	public static void main(String[] args) {
		printNumber(100);
	}
	
}
