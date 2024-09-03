package selenium;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Seleniumprograms {

	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.qabible.in/payrollapp/site/login");
		driver.manage().window().maximize();
		WebElement userName=driver.findElement(By.id("loginform-username"));  //declaring WebElement
		userName.sendKeys("Anu123");
		userName.clear();
		String tagName=userName.getTagName();
		System.out.println(tagName);
		String attributeValue=userName.getAttribute("name");
		System.out.println(attributeValue);
		WebElement password=driver.findElement(By.name("LoginForm[password]"));
		password.sendKeys("an456#");
		WebElement loginButton=driver.findElement(By.name("login-button"));
		loginButton.click();
		String text=loginButton.getText();
		System.out.println(text);
		String fontsize=loginButton.getCssValue("font-size");
		System.out.println(fontsize);
		
	}

}
