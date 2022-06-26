package Sorts;

public class RecursiveBubbleSort {
	static void bubbleSort(int[] arr,int n,int i)
	{
		if(i==n-1) {
			for(int x:arr)
			{
				System.out.println(x);
			}
			return;
		}
		
		for(int j=0;j<n-i-1;j++)
		{
			if(arr[j]>arr[j+1])
			{
				int temp = arr[j];
				arr[j] = arr[j+1];
				arr[j+1] = temp;
			}
		}
		
		bubbleSort(arr, n, i+1);
	}
	public static void main(String[] args) {
		int[]arr = {4,3,2,6,7,1};
		int n = arr.length;
		bubbleSort(arr,n,0);
	}
}
