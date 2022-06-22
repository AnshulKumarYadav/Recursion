package recursionProblems;
// Find the first and last occurrence of an element in a string
public class Occurance {
	
	public static int first = -1;
	public static int second = -1;
	
	public static void occurance(String s,int i,char el)
	{
		if(i==s.length())
		{
			System.out.println(first);
			System.out.println(second);
			return;
		}
		char curr = s.charAt(i);
		if(curr == el) {
		if(first==-1)
		{
			first = i;
		}
		else {
			second=i;
		}
		}
		occurance(s, i+1, el);
	}
	public static void main(String[] args) {
		String string = "adfasdssaaadd";
		int ind = 0;
		occurance(string,ind,'a');
	}
}
