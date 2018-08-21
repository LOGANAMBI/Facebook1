package facebook;
import org.openqa.selenium.WebDriver;
import capturescreenshot.*;
import org.openqa.selenium.firefox.FirefoxDriver;
public class SignUp {
	static String gender;
	static String male;
	static String female;
	private static WebDriver driver = null;
	public static void main(String[] args) throws Exception  {
		System.setProperty("webdriver.gecko.driver", "C:\\Users\\Balaji\\Downloads\\geckodriver-v0.21.0-win32\\geckodriver.exe");
	    WebDriver driver = new FirefoxDriver();
		driver.get("https://www.facebook.com/");
		FaceBook.Firstname(driver).click();
		FaceBook.Firstname(driver).sendKeys("logi");
		FaceBook.Lastname(driver).click();
		FaceBook.Lastname(driver).sendKeys("nambi");
		FaceBook.MobileEmail(driver).click();
		FaceBook.MobileEmail(driver).sendKeys("1223456790");
		FaceBook.Pwd(driver).click();
		FaceBook.Pwd(driver).sendKeys("himahowru");
		DropDown.Dropdown(driver);
        FaceBook.Female(driver).click();
        //FaceBook.Male(driver).click();
        FaceBook.Logon(driver).click();
        Screenshot.Screenshot(driver,"Logon");
        Thread.sleep(5000);
		driver.close();
	}

}

