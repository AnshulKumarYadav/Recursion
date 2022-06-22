package recursionProblems;

public class RemoveDuplicates {
// Remove Duplicates from a string 
// a-a=0; b-a = 1;c-b = 2;---z-a = 25;
	public static boolean[] arr =  new boolean[26];
	public static void remove(String s,int i,String newString) {
		if(i==s.length()) {
			System.out.println(newString);
			return;
		}
		if(arr[s.charAt(i)-'a']) {
			remove(s, i+1, newString);
		}
		else {
			newString += s.charAt(i);
			arr[s.charAt(i)-'a']=true;
			remove(s, i+1, newString);
		}
	}
	public static void main(String[] args) {
		remove("caaabbbaac", 0, "");
	}
}
