package recursionProblems;

public class etopower {
	static double etopower(int x,int n)
	{
		if(n==0) return 1;
		if(x==0) return 0;
		FactorialOfNumber i = new FactorialOfNumber(); 
		 int a = i.fact(n);
		 return Math.pow(x, n)/a + etopower(x, n-1);
	}
	public static void main(String[] args) {
		System.out.println(etopower(4,2));
	}
}
