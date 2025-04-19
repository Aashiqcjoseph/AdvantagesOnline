package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class LoginPage extends BasePage{

	public LoginPage(WebDriver driver) {
		super(driver);
		// TODO Auto-generated constructor stub
	}
@FindBy(xpath="//a[@class='create-new-account ng-scope']")
WebElement accountCreation;

public void clickOnAccountCreation() {
	accountCreation.click();
}
}
