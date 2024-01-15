package seleniumUdemy;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.Assert;
import org.testng.annotations.Test;

public class seleniumTut2 {
	
	static WebDriver driver;
	
	static {
		ChromeOptions options= new ChromeOptions();
		options.addArguments("--diable-popup-blocking");
		driver=new ChromeDriver(options);
		System.setProperty("webdriver.chrome.driver","C:\\Selenium\\chromedriver.exe");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	}
  @Test(priority=1)
  public void login() {
	  driver.get("https://rahulshettyacademy.com/loginpagePractise/");
	  driver.findElement(By.id("username")).sendKeys("rahulshettyacademy");
	  driver.findElement(By.id("password")).sendKeys("learning");
	  driver.findElement(By.xpath("//*[@id=\"login-form\"]/div[4]/div/label[1]/span[2]")).click();
	  driver.findElement(By.xpath("//*[@id=\"login-form\"]/div[5]/select/option[1]")).click();
	  driver.findElement(By.cssSelector("input[type='checkbox']")).click();
	  driver.findElement(By.id("signInBtn")).click();
  }
  
 @Test(priority=2)
 public void assertionTest() throws InterruptedException {
	 Thread.sleep(3000);
	 System.out.println(driver.findElement(By.className("navbar-brand")).getText());
	 Assert.assertEquals(driver.findElement(By.className("navbar-brand")).getText(), "ProtoCommerce");
 }
}
