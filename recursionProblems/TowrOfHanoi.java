package recursionProblems;


// 3 rod or towers and n disks at source tower and we have to transfer all the n disks at source to destination  and all road transfer in a sequence

public class TowrOfHanoi {

	static void tower(int n, String source,String helper, String destination)
	{
		if(n==1) 
		{
			System.out.println("Transfer disk "+n+" from "+source+" to "+destination);
			return;
		}
		tower(n-1, source, destination, helper);
		System.out.println("Transfer disk "+n+" from "+source+" to "+destination);
		tower(n-1, helper, source, destination);
	}
	public static void main(String[] args) {
		tower(2, "Source Tower", "Helper Tower", "Destination Tower");
	}
}
