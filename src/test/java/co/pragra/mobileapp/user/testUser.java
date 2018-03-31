/**
 * 
 */
/**
 * @author ramya
 *
 */
package co.pragra.mobileapp.user;
//import java.util.ArrayList;
//import java.util.List;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class testUser 
{
	@BeforeSuite
	public void setup()
	{
		System.out.println("Mobile app installed");
	}
	@Parameters({"username","password"})
	
	@BeforeTest
	public void logUser(String username, String password)
	{
		System.out.println("Logged in as username:"+username+ " and password:" +password);
	}
	@BeforeClass
	public void prepareTest()
	{
//		int [][]myArray = {{},{}};
//		List <Integer[]>myListArray = new ArrayList<>();
//		Integer []arr = {1,2};
//		myListArray.add(arr);
		System.out.println("Sample post done");
	}
	@DataProvider
	public Object[][] myDataProvider()
	{
		Object [][]myArray={{"Smitha","aimhigh"},
				    {"Poonam","abcd"},
				    {"Dhruv","xyz"}};
		return myArray;
	}

			
	@Test(groups = {"Regression","Smoke"})
	public void testComment()
	{
		System.out.println("Test Comment");
	}
	@Test(dataProvider = "myDataProvider", groups = {"Smoke"})
	public void testLike(String user, String pwd)
	{
		System.out.println("Test Like");
		System.out.println("User: "+user);
		System.out.println("Password: "+pwd);
	}


}
