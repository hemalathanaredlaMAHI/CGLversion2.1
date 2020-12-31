package cgl;



public class Board {

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
public boolean[][] createboard(int size,int l[][]) // creating the board by declaring boolean 2D array with false.
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
        return s; // prints current generation.  
       
        
        }

	public int countlivecells(int row,int col, boolean[][] board) // count live cells in a particular row, column position. 
	{
		  int aliveNeighbours = 0;
		
          for (int x = -1; x <= 1; x++){
              for (int y = -1; y <= 1; y++)
              {
                 if(board[row+x][col+y])
                 {
                  aliveNeighbours++;
                 }
              }
          }
          if(board[row][col])
          {
              aliveNeighbours--; 
          } 
		  
		return aliveNeighbours;
	}
	public boolean[][] nextgen(boolean[][] board) //return next generation board after changing the current board based on live cells. 
	{
		
		
		int n1 = board.length;
        boolean[][] ng = new boolean[n1][n1];
        for(int i=1;i<n1-1;i++){
            for(int j=1;j<n1-1;j++){
            	int z=countlivecells(i,j,board);
            	
            	// checking the rules for live cells. 
            	 if(!board[i][j]){ 
                     if(z==3){
                         ng[i][j] = true;
                     }
                 } 
                 else{
                     if(z<2){ 
                         ng[i][j]=false;
                     } else if(z>3){
                         ng[i][j]=false; 
                     }else if(z<=3){
                         ng[i][j]=true; 
                     }
                 }
            	
            }
		
	}
        
		return ng;
	
		
		
	}
}


	