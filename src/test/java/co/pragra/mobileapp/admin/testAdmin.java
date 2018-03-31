/**
 * 
 */
/**
 * @author ramya
 *
 */
package co.pragra.mobileapp.admin;

import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class testAdmin 
{
	@AfterSuite
	public void tearDown()
	{
		System.out.println("Mobile app uninstalled");
	}
	@BeforeTest
	public void logIn()
	{
		System.out.println("Logged in as Admin");
	}
	@AfterTest
	public void logOut()
	{
		System.out.println("Logged out as Admin");
	}
	@Test
	public void tc1()
	{
		System.out.println("Passed first testcase in Admin");
	}
	@Test
	public void tc2()
	{
		System.out.println("Passed second testcase in Admin");
	}

}