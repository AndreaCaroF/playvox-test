package test_pom;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LoginPage  extends BaseSeleniumDriver{
	
	By lbl_Home = By.xpath("//div/h1[text()='Space Advisor']");
	By btn_Login = By.xpath("//div/ul/li/button[text()='Log in']");
	By btn_SubmitLogin = By.xpath("//nav/button[text()='Log in']");
	By lbl_User = By.xpath("//div/button/span[text() = 'Hello, John']");
	By lbl_Option = By.xpath("//form/div/span[text()='Username']");
	By txt_OptionUser = By.xpath("//form/div/span[text()='Username']//preceding::input[@tabindex='1']");
	By txt_OptionPassword = By.xpath("//form/div/span[text()='Password']//preceding::input[@tabindex='2']");
		
	public LoginPage(WebDriver driver) {
		super(driver);
	}
	
	public void logIn() throws InterruptedException {
		assertTrue(getText(lbl_Home).equals("Space Advisor"));
		click(btn_Login);
		assertTrue(isDisplayed(btn_Login));
		setTxt("Lana", txt_OptionUser);
		setTxt("Test", txt_OptionPassword);
		findElement(btn_SubmitLogin).click();
		assertTrue(isDisplayed(lbl_User));
		assertEquals(findElement(lbl_User), findElement(lbl_User));
	}

}
