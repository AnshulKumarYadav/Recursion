package recursionProblems;

public class MoveAtEnd {
// Move all given char into the end of the string
	public static void move(String s,char c,int i,int count,String newString)
	{
		if(i==s.length()) {
			for(int j=0;j<count;j++)
			{
				newString+=c;
			}
			System.out.println(newString);
			return;
		}
		if(s.charAt(i)==c)
		{
			count++;
			move(s, c, i+1,count,newString);
		}
		else {
			newString += s.charAt(i);
			move(s, c, i+1,count,newString);
		}
		
	}
	public static void main(String[] args) {
		move("axaxbsarxatxuax", 'a', 0,0,"");
	}
}
