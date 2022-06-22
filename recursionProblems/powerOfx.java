package recursionProblems;

public class powerOfx {

	static int xpower(int x,int n) {
		if(n==0) return 1;
		if(x==0) return 0;
		return x*xpower(x, n-1);
	}
	public static void main(String[] args) {
		System.out.println(xpower(10, 2));
	}
}
