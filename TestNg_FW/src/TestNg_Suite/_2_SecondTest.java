package TestNg_Suite;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class _2_SecondTest {
	@Parameters ({"Url"})
	@Test
	public void demo(String name)
	{
		System.out.println("this is with the help of xml file");
		System.out.println("second test "+name);
		Assert.assertTrue(false);
	}
	
	@Test(groups= {"smoke"})
	public void dems()
	{
		System.out.println("this must be ignored");
	}
	@BeforeMethod
	public void BeforeevryMethod()
	{
		System.out.println("i before it");
	}
	
	@AfterMethod
	public void AfterEveryMethod()
	{
		System.out.println("i am after it");
	}
	
	
}
