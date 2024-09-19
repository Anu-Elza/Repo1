package testNGcommands;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class BasicCommands {
	@DataProvider (name = "data-provider")
	public Object[][] dpMethod(){
		return new Object[][] {{2, 3}, {7, 9},{10,15}};
	}
  @Test(priority = 1 )
  @Parameters({"para1","para2"})
  public void testcase1(int a, String b) {
	  System.out.println(a);
	  System.out.println(b);
	  System.out.println("Testcase1 executed");
  }
  @Test(priority = 500)
  public void testcase2()
  {
	  System.out.println("Testcase2 executed");
  }
  @Test(priority = 9)
  public void testcase3()
  {
	  System.out.println("Testcase3 executed");
  }
  @Test
  public void testcase4()
  {
	  System.out.println("Testcase4 executed");
  }
  @Test
  public void testcase5()
  {
	  System.out.println("Testcase5 executed");
  }
  
}
