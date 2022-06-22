package recursionProblems;

public class SumOfNnaturalNumbers {

	static void sumOfNaturals(int n,int sum)
	{
		if(n==1) 
		{
		sum += n;
		System.out.println(sum);
		return;
		}
		sum+=n;
		sumOfNaturals(n-1, sum);
	}
	
	public static void main(String[] args) {
		sumOfNaturals(10,0);
	}
	
}
