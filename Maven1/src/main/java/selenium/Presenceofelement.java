package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Presenceofelement {

	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.get("https://selenium.qabible.in/simple-form-demo.php");
		driver.manage().window().maximize();
		WebElement showMessage=driver.findElement(By.id("button-one"));
		Boolean value=showMessage.isDisplayed();
		Boolean value1=showMessage.isEnabled();
		System.out.println(value);
		System.out.println(value1);
		
	}

}