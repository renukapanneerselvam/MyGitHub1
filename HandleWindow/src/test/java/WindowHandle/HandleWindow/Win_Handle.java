package WindowHandle.HandleWindow;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeTest;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;

public class Win_Handle {
	WebDriver driver;
  @Test
  public void f() {
	  driver.get("https://www.naukri.com");
	  driver.findElement(By.xpath("//*[text()='Recruiters']")).click();
	  String handle = driver.getWindowHandle();
	  System.out.println(handle);
	  for(String handle1 : driver.getWindowHandles()){
		  driver.switchTo().window(handle1);
	  }
	  
  }
  @BeforeTest
  public void beforeTest() {
	  System.setProperty("webdriver.chrome.driver", "C:\\Users\\training_c2a.04.28\\Downloads\\chromedriver_win32\\chromedriver.exe");
	  driver = new ChromeDriver();
	  driver.get("https://www.google.com");
	  
  }

  @AfterTest
  public void afterTest() {
  }

}
