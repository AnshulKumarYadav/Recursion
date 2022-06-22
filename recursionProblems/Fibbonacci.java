package recursionProblems;

import java.util.ArrayList;
import java.util.List;

public class Fibbonacci {
	
	// <<------------------iterate method------------------>>
//	static void fib(int n)
//	{
//		
//		int a = 0;
//		int b = 1;
//		
//		
//		List<Integer> list = new ArrayList<>();
//		list.add(a);
//		list.add(b);
//		while(b<n)
//		{
//			int sum = a+b;
//			list.add(sum);
//			a = b;
//			b = sum;
//		}
//		
//		for(Integer i: list)
//		{
//			System.out.println(i);
//		}
//		
//		
//	}
	
//	<<-----------------Recursive method for printing fibonacci--------------->>
	
	static void fib(int a,int b,int n)
	{
		if(n==0) return;
		int c = a+b;
		System.out.println(c);
		fib(b, c, n-1);
	}
	
	
	
//	<<-------------------Nth fibonacci number---------------------->>
//	static int fib(int n)
//	{
//		if(n==0 || n==1) return n;
//		return fib(n-1)+fib(n-2);
//	}
	public static void main(String[] args) {
		int a = 0;
		int b= 1;
		System.out.println(a);
		System.out.println(b);
	      fib(a,b,5);
		
	}
}
