package recursionProblems;

public class Keypad {
	
	public static String[] keyPad = {"./?@","abc","def","ghi","jkl","mno","pqrs","tuv","wxyz"};
	
	public static void combinationOfKeypad(String s,int i,String combination)
	{
		if(i==s.length())
		{
			System.out.println(combination);
			return;
		}
		String mappString = keyPad[s.charAt(i)-'0'];
		
		for(int j=0;j<mappString.length();j++)
		{
			combinationOfKeypad(s, i+1, combination+mappString.charAt(j));
		}
	}
	
	public static void main(String[] args) {
		combinationOfKeypad("23", 0, " ");
	}

}
