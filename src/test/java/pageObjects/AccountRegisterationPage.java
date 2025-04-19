package pageObjects;

import org.apache.commons.lang3.RandomStringUtils;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.Select;

public class AccountRegisterationPage extends BasePage{

	public AccountRegisterationPage(WebDriver driver) {
		super(driver);
		// TODO Auto-generated constructor stub
	}
	@FindBy(xpath="//input[@name='usernameRegisterPage']")
	WebElement userName;
	@FindBy(xpath="//input[@name='emailRegisterPage']']")
	WebElement email;
	@FindBy(xpath="//input[@name='passwordRegisterPage']")
	WebElement passWord;
	@FindBy(xpath="//input[@name='confirm_passwordRegisterPage']")
	WebElement confirmPassword;
	@FindBy(xpath="//select[@name='countryListboxRegisterPage']")
	WebElement country;
	@FindBy(xpath= "//input[@name='i_agree']")
	WebElement termsCondition;
	@FindBy(xpath= "//button[@id='register_btn']")
	WebElement registerButton;
	
	public void enterUserName(String username) {
		userName.sendKeys(username);
	}
	public void enterEmailAddress(String emailAddress) {
		email.sendKeys(emailAddress);
	}
	public void enterPassword(String pass) {
		// TODO Auto-generated method stub
		passWord.sendKeys(pass);

	}
	public void enterConfirmPassword(String pass) {
		// TODO Auto-generated method stub
		confirmPassword.sendKeys(pass);

	}
	public void clickonRegisterbtn(String pass) {
		// TODO Auto-generated method stub
		registerButton.click();

	}
	public void selectCountry(String userCountry) {
		// TODO Auto-generated method stub
		Select selectcoutry= new Select(country);
	    selectcoutry.selectByVisibleText(userCountry);

	}
	public void checkTerms() {
		termsCondition.click();
	}
	
	
}
