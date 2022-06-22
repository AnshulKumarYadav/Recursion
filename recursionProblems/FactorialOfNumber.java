package recursionProblems;

public class FactorialOfNumber {

	public int fact(int n){
		
		if (n == 0)
			return 1;

		return n * fact(n - 1);
	}
	public static void main(String[] args) {
		FactorialOfNumber i = new FactorialOfNumber(); 
	 int a = i.fact(5);
	 System.out.println(a);
	}
}
