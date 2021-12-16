package generics;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Reporter;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;

public class BaseTest implements Autoconstant
{
 public WebDriver driver;
	
 @BeforeClass
 public void openbrowser()
 {
	 System.setProperty(chrome_key, chrome_value);
	 driver=new ChromeDriver();
	 driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
	 driver.manage().window().maximize();
	 driver.get(url); 
 }
 
 @BeforeMethod
 public void start()
 {
	 Reporter.log("start excecution");
 }
 
 @AfterClass
 public void closebrowser()
 {
	 //driver.close();
 }
}
