package TestNg_Suite;

import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class _4_FourthTest {
	@BeforeSuite
	@Test(groups= {"smoke"})
	 public void TriumphStreetTriple() {
		 System.out.println("Best bike from Triumph");
	 }
	@Test
	 public void TriumphBoneville() {
		 System.out.println("roadster bike from Triumph");
	 }
	@AfterSuite
	 public void TriumphTiger() {
		 System.out.println("Adventure bike from Triumph");
	 }
	@Parameters ({"Url"})
	@Test
	 public void TriumphRocker(String Name) {
		 System.out.println("One of the best cruiser from Triumph");
		 System.out.println("Fourth test "+Name);
	 }
	@Test
	 public void TriumphThunederBird() {
		 System.out.println("Power booster from Triumph");
	 }
	@Test
	 public void ProjectSe1() {
		 System.out.println("Massive E bike from Triumph");
	 }

}
