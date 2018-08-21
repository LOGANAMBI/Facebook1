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
		System.setProperty(null, null);
	    WebDriver driver = new FirefoxDriver();
		driver.get(null);
		FaceBook.Firstname(driver).click();
		FaceBook.Firstname(driver).sendKeys(args);
		FaceBook.Lastname(driver).click();
		FaceBook.Lastname(driver).sendKeys(args);
		FaceBook.MobileEmail(driver).click();
		FaceBook.MobileEmail(driver).sendKeys(args);
		FaceBook.Pwd(driver).click();
		FaceBook.Pwd(driver).sendKeys(args);
		DropDown.Dropdown(driver);
        FaceBook.Female(driver).click();
        //FaceBook.Male(driver).click();
        FaceBook.Logon(driver).click();
        Screenshot.Screenshot(driver,"Logon");
        Thread.sleep(5000);
		driver.close();
	}

}

