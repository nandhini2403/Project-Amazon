package testlayerlogin;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import basePackage.BaseAmazonClass;
import pomAmazonpackage.pomLogin;

public class logintest extends BaseAmazonClass {

	pomLogin Log;

	public logintest() {

		super();
	}

	@BeforeMethod
	public void initsetup() {
		initiate();
		screenshots("Logintest");
		Log = new pomLogin();
        
	}

	@Test
	public void Title() {
		String actual = Log.provideTitle();
		System.out.println(actual);
		Assert.assertEquals(actual, "Amazon Registration");
	}

	@Test
	public void createuser() {
		Log.typeYourname("lilyrosy1");
		Log.typeMobilenumberoremail("lilyrosy1988@gmail.com");
		Log.typePassword("55yardley");
		Log.typePasswordagain("55yardley");
		Log.continuebtn();
		String actual = Log.provideTitle();
		System.out.println(actual);
		Assert.assertEquals(actual, "Authentication required");
	}

	@Test
	public void validateName() {
		Log.typeYourname("");
		Log.typeMobilenumberoremail("lilyrosy1978@gmail.com");
		Log.typePassword("22yardley");
		Log.typePasswordagain("22yardley");
		Log.continuebtn();
		String actual = Log.provideTitle();
		System.out.println(actual);
		Assert.assertEquals(actual, "Amazon Registration");
	}

	@AfterMethod
	public void close() {
		Driver.close();
	}

}
