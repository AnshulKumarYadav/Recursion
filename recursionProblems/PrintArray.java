package recursionProblems;

public class PrintArray {
	static void printArray(int[]arr,int i) {
		if(i==arr.length) return;
		System.out.println(arr[i]);
		printArray(arr, i+1);
	}
	public static void main(String[] args) {
		int[] arr = {3, 5, 6, 2, 8, 1, 3};
		printArray(arr,0);
	}
}
