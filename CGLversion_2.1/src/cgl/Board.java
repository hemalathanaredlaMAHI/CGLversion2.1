package cgl;

public class Board { 
	NextGeneration c=new NextGeneration();
	public String printBoard(boolean[][] board) // in this method it prints the board if true it print (*), otherwise (.).
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
        return "Board is printed";
	}
	public boolean createboard(int size,int l[][]) // creating the board by declaring boolean 2D array with false. 
	{
		
		
		if(size>=0)
		{ 
		
		boolean s[][]=new boolean[size][size]; // empty boolean array.
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
        printBoard(s); // prints current generation.   
        
        for(int i=0;i<5;i++) // this loop is used to print five generations. 
        {
        	int count=0;
        	for(int k=0;k<size;k++) // checks whether the board is existed or not. 
        	{
        		for(int j=0;j<size;j++)
        			if(s[k][j]==true)
        				count=1;
        		}
        	if(count==0)
        		break;
        System.out.println("NextGenration");
        s=c.nextgen(s);
        printBoard(s); // prints next generation. 
        }
		return true;
		}
		else
			return false;
        
	}

}
