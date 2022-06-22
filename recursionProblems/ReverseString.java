package recursionProblems;

public class ReverseString {

	static void reverse(String s,int l)
	{
		if(l<0) return;
		System.out.println(s.charAt(l));
		reverse(s, l-1);
	}
	public static void main(String[] args) {
		String string = "mammal";
		int l = string.length()-1;
		reverse(string,l);
	}
}
