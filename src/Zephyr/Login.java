package Zephyr;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class Login {

	@Test

	public void login() throws Exception {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "D://SafetyFirst/chromedriver/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.google.co.in/");
		driver.manage().window().maximize();
		System.out.println("Welcome to Jenkins");
		Thread.sleep(2000);
		driver.quit();
	}
}