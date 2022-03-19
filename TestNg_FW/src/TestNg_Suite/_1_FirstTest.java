package TestNg_Suite;

import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeGroups;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import com.beust.jcommander.Parameter;

public class _1_FirstTest {
	
    @BeforeGroups
	@Test(dataProvider = "getdata")
	public void setup(String username,String password) {
		System.out.println("First test from TestNg");
		System.out.println(username);
		System.out.println(password);
	}
	@DataProvider
	public Object[][] getdata(){
	Object[][] data = new Object[4][2];
	
	data[0][0] = "username";
	data[0][1] = "Password";
	
	data[1][0] = "username";
	data[1][1] = "Password";
	
	data[2][0] = "username";
	data[2][1] = "Password";
	
	data[3][0] = "username";
	data[3][1] = "Password";
	return data;
	}
	
}
