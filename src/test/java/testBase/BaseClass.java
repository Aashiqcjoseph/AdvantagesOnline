package testBase;

import java.time.Duration;
import java.util.logging.LogManager;

import org.apache.commons.lang3.RandomStringUtils;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.apache.logging.log4j.Logger;
import org.testng.annotations.BeforeClass;

public class BaseClass {
	WebDriver driver;
	public Logger logger;
	@BeforeClass
	void setup() {
	
		driver= new ChromeDriver();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://www.advantageonlineshopping.com/#/");
		driver.manage().window().maximize();
	}
	@AfterClass
    void tearDown() {
    	driver.quit();
    }
	public String randomString() {
		String generatedString=RandomStringUtils.randomAlphabetic(5);
		return generatedString;
	}
	public String randomalphanum() {
		String generatedalphanum=RandomStringUtils.randomAlphanumeric(10,12);
		return generatedalphanum;
		
	}
	public String randomnumber() {
		String generatednum=RandomStringUtils.randomNumeric(2000000000, 999999999);
		return generatednum;
		
	}
	

}
