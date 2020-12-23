package cgl;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class TestJunit {
	@Test
	  public void testCGLOne() {
	  Board b = new Board();
	 
	      System.out.println("======TEST ONE EXECUTED=======");
	      Assertions.assertSame(true,b.createboard(5,null));
	  }
	 
	  @Test
	  public void testCGLTwo() {
	  Board b = new Board();
	  System.out.println("======TEST TWO EXECUTED=======");
	      Assertions.assertSame(false,b.createboard(-5,null));
	  }
	 
}
