package recursionProblems;

public class ShortedArray {
	
	// Check if the array is sorted (strictly increasing)
	
	public static boolean sortOrNot(int[]arr,int i)
	{
		if(i==arr.length-1) return true;
		if(arr[i]<arr[i+1])
		{
			return sortOrNot(arr, i+1);
		}
		return false;
	}
	
	public static void main(String[] args) {
		
		int[]arr= {3, 5, 7, 8, 9};
		System.out.println(sortOrNot(arr,0));
	}

}
