package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class HomePage extends BasePage {

	public HomePage(WebDriver driver) {
		super(driver);
		// TODO Auto-generated constructor stub
	}
	
	@FindBy(xpath="//a[@id='hrefUserIcon']")
	WebElement userButton;
	@FindBy(xpath="//span[@class='hi-user containMiniTitle ng-binding']")
	WebElement username;
	public void clickonUserButton() {
		userButton.click();
	}
	public String getText() {
		String userName=username.getText();
		return userName;
	}


}
