package pages;

import org.openqa.selenium.By;

public class darazloginPage extends BasePage {

	public By EMAIL_PHONE_INPUT_FIELD = By.xpath("(//input[@placeholder='Please enter your Phone Number or Email'])[1]");
	public By PASSWORD_INPUT_FIELD = By.xpath("(//input[@placeholder='Please enter your Phone Number or Email'])[1]");
	public By BUTTON_FIELD = By.xpath("(//button[normalize-space()='LOGIN'])[1]");
	public By FACEBOOK_LOGIN = By.xpath("((//button[normalize-space()='Facebook'])[1]");
	public By GOOGLE_LOGIN = By.xpath("(//button[normalize-space()='Google'])[1]");
	
	
}
