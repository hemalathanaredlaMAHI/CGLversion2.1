package cgl;

public class NextGeneration {
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
	
	


