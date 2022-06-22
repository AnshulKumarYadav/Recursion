package recursionProblems;
import java.util.*;
public class Subsequences {
/*
 * 
 * 
 *                                                                  ------------------------
 *                                                                |                                |
 *                                                String a = "abc"                               | 
 *                                                             | |                                 |--------------
 *                                                             | |-----------                                     |
 *                                                          -----             |                               -------------------------
 *                                                          |     |         |       |      |                    |           |          |          |
 *                                                          a     _        ab      _b   __                  abc        ac       _bc        __c
 * 
 * 
 * */
	
	
	
	
	static void subsequence(String s,int i,String newString)
	{
		if(i==s.length())
		{
			System.out.println(newString);
			
			return;
		}
		
//		to be choice
		subsequence(s, i+1, newString+s.charAt(i));
		
//		not to be choice
		subsequence(s, i+1, newString);
	}
	public static void main(String[] args) {
		subsequence("aaa", 0, " ");
	}
	
	     
	
	
	
	
	
}
