package Tests;
//Generated by Selenium IDE
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
public class FacebookTest {
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
public String waitForWindow(int timeout) {
 try {
   Thread.sleep(timeout);
 } catch (InterruptedException e) {
   e.printStackTrace();
 }
 Set<String> whNow = driver.getWindowHandles();
 Set<String> whThen = (Set<String>) vars.get("window_handles");
 if (whNow.size() > whThen.size()) {
   whNow.removeAll(whThen);
 }
 return whNow.iterator().next();
}
@Test
public void facebook() {
 driver.get("https://www.sportivo.rs/");
 driver.manage().window().setSize(new Dimension(1296, 688));
 driver.findElements(By.className("cookieinfo-close")).get(0).click();
 {
   WebElement element = driver.findElement(By.cssSelector(".top-left a:nth-child(1) > img"));
   Actions builder = new Actions(driver);
   builder.moveToElement(element).perform();
 }
 vars.put("window_handles", driver.getWindowHandles());
 driver.findElement(By.cssSelector(".top-left a:nth-child(1) > img")).click();
 vars.put("win9709", waitForWindow(2000));
 {
   WebElement element = driver.findElement(By.tagName("body"));
   Actions builder = new Actions(driver);
   builder.moveToElement(element, 0, 0).perform();
 }
 driver.switchTo().window(vars.get("win9709").toString());
 {
   WebElement element = driver.findElement(By.cssSelector(".b3onmgus > .oajrlxb2 image"));
   Actions builder = new Actions(driver);
   builder.moveToElement(element).perform();
 }
 {
   WebElement element = driver.findElement(By.tagName("body"));
   Actions builder = new Actions(driver);
   builder.moveToElement(element, 0, 0).perform();
 }
 js.executeScript("window.scrollTo(0,512.6666870117188)");
 assertEquals(driver.getCurrentUrl(), "https://www.facebook.com/sportivo011/");
}
}
