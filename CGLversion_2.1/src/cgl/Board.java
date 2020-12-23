package cgl;

public class Board {
	NextGeneration c=new NextGeneration();
	public void printBoard(boolean[][] board)
	{
		int n2=board.length;
        for(int i=0;i<n2;i++)
        {
            for(int j=0;j<n2;j++)
            {
                if(board[i][j]==true)
                {
                System.out.print('*');
                }
                else
                {
               
                System.out.print('.');
                }
            }
            System.out.println();
        }
	}
	public boolean createboard(int size,int l[][])
	{
		System.out.println("board");
		System.out.println(size);
		if(size>=0)
		{
		if(l==null)
			return true;
		boolean s[][]=new boolean[size][size];
        for(int i=0;i<size;i++)
        {
            for(int j=0;j<size;j++)
            {
                s[i][j]=false;
            }
        }
        for(int i=0;i<l.length;i++)
        {
            int a=l[i][0],b=l[i][1];
            s[a][b]=true;
        }
        System.out.println("CurrentGenration");
        printBoard(s);
        System.out.println("NextGenration");
        printBoard(c.nextgen(s));
        
			return true;
		}
		else
			return false;
        
	}

}
