package test;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import page.DashboardPage;
import page.LoginPage;
import util.BrowserFactory;
import util.ReadExcel;

public class LoginTest {

WebDriver driver;

ReadExcel exlread = new ReadExcel("src\\main\\java\\data\\TF_TestData (2).xlsx");
String userName = exlread.getCellData("LoginInfo", "UserName", 2);
String password = exlread.getCellData("LoginInfo", "Password", 2);

@Test
public void  validUserShouldBeAbleToLogin() {
	
	driver = BrowserFactory.init();
		
	LoginPage loginPage = PageFactory.initElements(driver, LoginPage.class);
	loginPage.enterUserName( userName);
	loginPage.enterPassword( password);
	loginPage.clickSigninButton();
	
	DashboardPage dashboarPage = PageFactory.initElements(driver, DashboardPage.class);
	dashboarPage.verifyDashboarPage();
	
	BrowserFactory.tearDown();
	
}
}

