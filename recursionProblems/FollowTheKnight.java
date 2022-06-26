package recursionProblems;

import java.util.Scanner;

public class FollowTheKnight {
	static void followTheKnight(int board[][],int row,int col,int N)
	{
		if(row<0 || row>=board.length || col<0 ||col>=board.length) return ;
		if(N==0)
		{
			board[row][col] = 1;
			return  ;
		}
		
		followTheKnight(board, row-2, col+1, N-1);
		followTheKnight(board, row-2, col-1, N-1);
		followTheKnight(board, row+2, col+1, N-1);
		followTheKnight(board, row+2, col-1, N-1);
		followTheKnight(board, row-1, col+2, N-1);
		followTheKnight(board, row+1, col+2, N-1);
		followTheKnight(board, row-1, col-2, N-1);
		followTheKnight(board, row+1, col-2, N-1);
	     
		return ;
		
	}
	
	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter the row in which knight place");
		int row = scanner.nextInt();
		System.out.println("Enter the col in which knight place");
		int col = scanner.nextInt();
		System.out.println("Enter the number of moves which knight take");
		int moves = scanner.nextInt();
		
		int mat[][] = new int[10][10];		
		followTheKnight(mat, row, col, moves);
//		System.out.println(countPosition(mat, row, col,0,0));
		String bag;
		int count = 0;
		for(int i=0;i<10;i++)
		{
			bag = "";
			for(int j=0;j<10;j++)
			{
				bag+= mat[i][j] ;
				if(mat[i][j]==1)
				{
					count++;
				}
			}
			System.out.println(bag);

		}
		System.out.println(count);
		
	}
		
	
}
