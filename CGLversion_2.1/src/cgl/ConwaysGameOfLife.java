package cgl;
import java.util.Scanner;
public class ConwaysGameOfLife {
	
	public static void main(String args[])
	{
		System.out.println("");
		Board b=new Board();
        Scanner sc = new Scanner(System.in);
        
        // Reading size of the Board
        int n = sc.nextInt();
        
        // Reading no. of initial live cells
        int m = sc.nextInt();
        int[][] l = new int[m][2];
        
        
        // Reading Live cells
        for (int i = 0; i < m; i++) {
            l[i][0] = sc.nextInt();
            l[i][1] = sc.nextInt();
        }
      
        System.out.println( b.createboard(n, l));
   
        sc.close();
        
        
		
	}

}
