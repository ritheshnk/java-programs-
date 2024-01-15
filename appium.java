package WebDriverCheck;

import java.net.URL;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.Test;

public class chromeTest {
	
	public static String username="ritheshnk_IHZnK2";
	public static String accessKey="wWpV5hpsvr9TyNNpXyfS";
	public static String URL = "http://ritheshnk_IHZnK2:wWpV5hpsvr9TyNNpXyfS@hub-cloud.browserstack.com/wd/hub";

	WebDriver driver;
  
@SuppressWarnings("deprecation")
@Test
  public void ChromeTest() throws Exception{
	  DesiredCapabilities cap=new DesiredCapabilities();
	  cap.setCapability("deviceName", "iPhone 13");
	  cap.setCapability("platformName", "iOS");
	  cap.setCapability("project", "IOS Project Chrome");
	  cap.setCapability("build", "iOS Chrome build");
	  
	  driver=new RemoteWebDriver(new URL(URL),cap);
	  
	  driver.get("https://www.saucedemo.com/");
	  WebElement username = driver.findElement(By.name("user-name"));
      username.sendKeys("standard_user");
      WebElement pass=driver.findElement(By.name("password")); 
      pass.sendKeys("secret_sauce");
      
      WebElement loginButton=driver.findElement(By.name("login-button"));
      loginButton.click();
      //element.submit();
      
      System.out.println(driver.getTitle());
	  
	  driver.quit();
	  
	  
  }
}
