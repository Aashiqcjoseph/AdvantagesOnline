package testCases;

import static org.testng.Assert.assertEquals;

import java.awt.Window;
import java.time.Duration;

import org.apache.commons.lang3.RandomStringUtils;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import testBase.*;

import pageObjects.AccountRegisterationPage;
import pageObjects.HomePage;
import pageObjects.LoginPage;
import testBase.BaseClass;

public class TC_AccountRegisterationTest extends BaseClass {
	WebDriver driver;

	@Test
    public void verify_account_registeration() throws InterruptedException {
    	HomePage hp= new HomePage(driver);
    	LoginPage lp=new LoginPage(driver);
    	AccountRegisterationPage arp= new AccountRegisterationPage(driver);
    	hp.clickonUserButton();
    	Thread.sleep(5000);
    	lp.clickOnAccountCreation();
    	Thread.sleep(5000);
    	arp.enterUserName(randomString());
    	arp.enterEmailAddress(randomString()+"@gmail.com");
    	String password=randomalphanum();
    	arp.enterPassword(password);
    	arp.enterConfirmPassword(password);
    	arp.selectCountry("India");
  
    	arp.checkTerms();
    	Assert.assertEquals(hp.getText(), "Shibu");
    	
    	
    	
    }
	

}
