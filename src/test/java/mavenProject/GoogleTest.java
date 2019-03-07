package mavenProject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class GoogleTest {
	WebDriver driver;
	
  @Test
  public void LaunchTest() {
     String Expected = "Google";
     String Actual = driver.getTitle();
     Assert.assertEquals(Expected, Actual);
  }
  
  @BeforeTest
  public void LaunchAppTest() {
	  System.setProperty("webdriver.chrome.driver", "C:\\IBM_SeleniumWD\\chromedriver_win32\\chromedriver.exe");
	  driver = new ChromeDriver();
	  driver.get("https://www.google.com");
  }
  
  @AfterTest
  public void BrowserCloseTest() {
	  driver.quit();
  }
  
}
