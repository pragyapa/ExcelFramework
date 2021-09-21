package page;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class LoginPage {
	WebDriver driver;
	
public LoginPage(WebDriver driver) {
	this.driver = driver;
		
	}
	
	
	//WebElement USERNAME_ELEMENT = driver.findElement(By.xpath("//input[@id ='username']"));
	//By USERNAME_FIELD_LOCATOR = (By.xpath("//input[@id ='username']"));
	
	@FindBy(how=How.XPATH, using="//input[@id ='username']") WebElement USER_NAME_ELEMENT;
	@FindBy(how=How.XPATH, using="//input[@id ='password']") WebElement PASSWORD_ELEMENT;
	@FindBy(how=How.XPATH, using="/html/body/div/div/div/form/div[3]/button") WebElement SIGNIN_ELEMENT;
	


	//Interactive Methods(preferrable as easier to detect failures)
	public void enterUserName(String username) {
		USER_NAME_ELEMENT.sendKeys(username);
		}
	public void enterPassword(String password) {
		PASSWORD_ELEMENT.sendKeys(password);
		}
	public void clickSigninButton() {
		SIGNIN_ELEMENT.click();
	}
	public void performLogin(String username, String password) {
		USER_NAME_ELEMENT.sendKeys(username);
		PASSWORD_ELEMENT.sendKeys(password);
		SIGNIN_ELEMENT.click();
	}

}

