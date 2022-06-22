package recursionProblems;

import java.util.HashSet;
import java.util.Set;

public class UniqueSubsequence {
	static void uniqueSubsequences(String s,int i,String newString,Set<String>set)
	{
		if(i==s.length())
		{
			if(set.contains(newString))
			{
				return;
			}
			else {
				System.out.println(newString);
				set.add(newString);
				return;
			}
		}
		uniqueSubsequences(s, i+1, newString+s.charAt(i), set);
		
		uniqueSubsequences(s, i+1, newString, set);

	}
	public static void main(String[] args) {
		Set<String> set = new HashSet<>();
		uniqueSubsequences("aaa", 0, "", set);
	}
}
