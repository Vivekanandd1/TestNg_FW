package TestNg_Suite;

import org.testng.annotations.AfterTest;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class _3_ThirdTest {
	
	@Test(dependsOnMethods = {"meth2"})
	public void meth1() {
		System.out.println("Meth1 in Third Test ");
	}
	@Parameters ({"Url"})
	@Test(groups= {"smoke"})
	public void meth2(String name) {
		System.out.println("Meth2 in Third test and should be before the meth1");
		System.out.println("Third eTest "+name);
	}
	@Test(enabled = false)
	public void meth3() {
		System.out.println("Meth3 in Third test from smoke");
	}


}
