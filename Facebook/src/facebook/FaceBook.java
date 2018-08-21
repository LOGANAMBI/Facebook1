package facebook;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class FaceBook {
	private static WebElement element = null;
	/*public static void GetInto() 
   {
	System.setProperty("webdriver.gecko.driver", "C:\\Users\\Balaji\\Downloads\\geckodriver-v0.21.0-win32\\geckodriver.exe");
    WebDriver driver = new FirefoxDriver();
	driver.get("https://www.facebook.com/");
	//driver.manage().timeouts().wait();
	}*/
public static WebElement Firstname(WebDriver driver)
{
	WebElement Firstname = driver.findElement(By.xpath("//*[@id=\"u_0_j\"]"));
	return  Firstname;
}
public static WebElement Lastname(WebDriver driver)
{
	WebElement Lastname = driver.findElement(By.xpath("//*[@id=\"u_0_l\"]"));
	return Lastname;
}
public static WebElement MobileEmail(WebDriver driver)
{
	WebElement MobileEmail = driver.findElement(By.xpath("//*[@id=\"u_0_o\"]"));
	return MobileEmail;
}
public static WebElement Pwd(WebDriver driver)
{
	WebElement Pwd = driver.findElement(By.xpath("//*[@id=\"u_0_v\"]"));
	return Pwd;
}
public static WebElement Male(WebDriver driver)
{
	//WebElement Male = driver.findElement(By.xpath("//*[@id=\"u_0_7\"]"));
	WebElement Male = driver.findElement(By.id("u_0_7"));
	return Male;
}
public static WebElement Female(WebDriver driver)
{
	//WebElement Female = driver.findElement(By.xpath("//*[@id=\"u_0_6\"]"));
	WebElement Female = driver.findElement(By.id("u_0_9"));
	return Female;
}
public static WebElement Logon(WebDriver driver)
{
	WebElement Logon = driver.findElement(By.xpath("//*[@id=\"u_0_11\"]"));
	return Logon;
}
}