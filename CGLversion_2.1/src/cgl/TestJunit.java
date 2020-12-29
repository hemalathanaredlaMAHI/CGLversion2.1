package cgl;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class TestJunit { 
	@Test
	  public void testCGLOne() {
		  Board b = new Board();
		  System.out.println("======TEST ONE EXECUTED=======");
		  boolean [][]b1={{false,false,false,false,false},{false,true,false,false,false},{false,false,true,false,false},{false,false,false,true,false},{false,false,false,false,true}};
		  Assertions.assertEquals("Board is printed",b.printBoard(b1));
	} 
	 @Test
	  public void testCGLTwo() {
		  Board b = new Board();
		  System.out.println("======TEST TWO EXECUTED======="); 
		  Assertions.assertSame(false,b.createboard(-5,null));
	}  
	 @Test 
	  public void testCGLThree() { 
		  NextGeneration n=new NextGeneration ();
	      boolean [][]b={{false,false,false,false,false},{false,true,false,false,false},{false,false,true,false,false},{false,false,false,true,false},{false,false,false,false,true}};
	      boolean [][]s=n.nextgen(b);
	      System.out.println("======TEST THREE EXECUTED======="); 
	      Assertions.assertSame(true,s[2][2]);  
	  }  
	 @Test
	  public void testCGLFour() {
		  Board b = new Board();
		  System.out.println("======TEST FOUR EXECUTED=======");
		  int [][] l={{1,1},{2,2},{3,3},{4,4}};
		  Assertions.assertSame(true,b.createboard(5,l));
	 }  
	 @Test 
	  public void testCGLFive() {
		  System.out.println("======TEST FIVE EXECUTED=======");
		  ConwaysGameOfLife c=new ConwaysGameOfLife();
		  Assertions.assertEquals("Board and next generation is created",c.sample()); 
	}   
}
 