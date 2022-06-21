package test_project;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.WebDriver;

import test_pom.LoginPage;

public class Test_Login {
	
	private WebDriver driver;
	LoginPage loginPage;

	@Before
	public void setUp() throws Exception {
		loginPage = new LoginPage(driver);
		driver = loginPage.chromeDriverConnection();
		loginPage.launch("http://demo.testim.io/");
	}

	@After
	public void tearDown() throws Exception {
	}

	@Test
	public void test() throws InterruptedException {
		loginPage.logIn();
	}

}
