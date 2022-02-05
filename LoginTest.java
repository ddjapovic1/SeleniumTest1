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
public class LoginTest {
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
public void login() {
 driver.get("https://www.sportivo.rs/");
 driver.manage().window().setSize(new Dimension(1296, 688));
 driver.findElement(By.id("btl-panel-login")).click();
 driver.findElement(By.id("btl-input-username")).sendKeys("milos1998");
 driver.findElement(By.id("btl-input-password")).click();
 driver.findElement(By.id("btl-input-password")).sendKeys("milos.998");
 driver.findElement(By.cssSelector(".btl-buttonsubmit:nth-child(10) > .btl-buttonsubmit")).click();
 assertEquals(driver.getCurrentUrl(), "https://www.sportivo.rs/");
}
}
