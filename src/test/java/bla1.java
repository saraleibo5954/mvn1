import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class bla1 {
  @Test
  public void f()
  
  {
	  System.setProperty("webdriver.chrome.driver", "C:\\Users\\sara\\Desktop\\1\\chromedriver.exe");
	  WebDriver driver = new ChromeDriver();
	  driver.get("http://google.com");
	  driver.quit();
  }
}
