package recursionProblems;

public class GeneratePermutation {
	
	static void permutation(String s,String permutations)
	{
		if(s.length()==0)
		{
			System.out.println(permutations);
//			char []arr = permutations.toCharArray();
//			String bag = "";
//			for(char x: arr)
//			{
//				bag += x+" ";
//			}
//			System.out.println(bag);
			
			return;
		}
		for(int i=0;i<s.length();i++)
		{
			String newString = s.substring(0, i) + s.substring(i+1);
			permutation(newString, permutations+s.charAt(i));
		}
	}
	public static void main(String[] args) {
		permutation("ab", " ");
	}
}
