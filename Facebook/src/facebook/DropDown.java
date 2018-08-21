package facebook;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class DropDown
{private static WebElement element = null;
	static String gender;
	static String male;
	static String female;
	
	public static void Dropdown(WebDriver driver)
	   {
		Select select = new Select(driver.findElement(By.xpath("//*[@id=\"day\"]")));
		select.selectByValue("8");
		Select select1 = new Select(driver.findElement(By.xpath("//*[@id=\"month\"]")));
		select1.selectByValue("2");
		Select select2 = new Select(driver.findElement(By.xpath("//*[@id=\"year\"]")));
		select2.selectByValue("1992");
		}
	
	
}


