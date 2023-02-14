package basePackage;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import utility.Timeutils;

public class BaseAmazonClass {

	public static Properties prop = new Properties();
	public static WebDriver Driver;

	public BaseAmazonClass() {

		try {

			FileInputStream file = new FileInputStream(
					"C:\\Users\\14373\\Desktop\\Eclipse Workspace\\ProjectAmazon\\src\\test\\java\\environmentvariables\\configAmazon.properties");
			prop.load(file);

		}

		catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException a) {
			a.printStackTrace();

		}
	}

	public static void initiate() {
		String browsername = prop.getProperty("browser");
		System.out.println("inside initiate method");
		if (browsername.equals("Firefox")) {
			System.setProperty("webdriver.geckodriver.driver", "geckodriver.exe");
			Driver = new FirefoxDriver();
		} else if (browsername.equals("chrome")) {
			System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
			Driver = new ChromeDriver();
			Driver.manage().window().maximize();
			Driver.manage().timeouts().pageLoadTimeout(Timeutils.timepage, TimeUnit.SECONDS);
			Driver.get(prop.getProperty("url"));
			System.out.println("chrome driver initiated");
			
			

		}

	}
}
