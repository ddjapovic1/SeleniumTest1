package Tests;
// Generated by Selenium IDE
import org.junit.Test;
import org.junit.Before;
import org.junit.After;
import static org.junit.Assert.*;
import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.core.IsNot.not;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Alert;
import org.openqa.selenium.Keys;
import java.util.*;
import java.net.MalformedURLException;
import java.net.URL;
public class RemoveProductTest {
	private String
	exePath =
	"C:\\Users\\chromedriver.exe";
  private WebDriver driver;
  private Map<String, Object> vars;
  JavascriptExecutor js;
  @Before
  public void setUp() {
	 System.setProperty("webdriver.chrome.driver", exePath);
    driver = new ChromeDriver();
    js = (JavascriptExecutor) driver;
    vars = new HashMap<String, Object>();
  }
  @After
  public void tearDown() {
    driver.quit();
  }
  @Test
  public void removeProduct() {
    driver.get("https://www.sportivo.rs/decja-obuca/decje-zimske-cipele");
    driver.manage().window().setSize(new Dimension(1296, 688));
    driver.findElements(By.className("cookieinfo-close")).get(0).click();
    driver.findElements(By.className("owl-item")).get(0).click();
    driver.findElements(By.className("radio")).get(0).click();
    driver.findElement(By.id("addToCartMD")).click();
    try {
 		Thread.sleep(5000);
 	} catch (InterruptedException e) {
 		// TODO Auto-generated catch block
 		e.printStackTrace();
 	}
    driver.findElement(By.cssSelector(".showcart")).click();
    try {
 		Thread.sleep(5000);
 	} catch (InterruptedException e) {
 		// TODO Auto-generated catch block
 		e.printStackTrace();
 	}
  
    driver.findElement(By.id("removeproduct")).click();
    try {
 		Thread.sleep(5000);
 	} catch (InterruptedException e) {
 		// TODO Auto-generated catch block
 		e.printStackTrace();
 	}
    assertEquals(driver.findElements(By.className("product")).size(), 0);
  }
}
